package xolova.blued00r.divinerpg.entities.mobs.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.entities.vethea.EntityWreckExplosiveShot;
import xolova.blued00r.divinerpg.entities.vethea.EntityWreckStrengthShot;

public class EntityWreck extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
    public static int stage;
    private final int MELEE = 0;
    private final int ARCANA = 1;
    private final int RANGED = 2;
    private static int ability;
    private final int DEFAULT = 0;
    private final int CHARGE = 1;
    private final int PULL = 2;
    private final int FIRE = 3;
    private final int BOUNCE = 4;
    private final int FREEZE = 5;
    private final int SPEED = 6;
    private final int EXPLOSIONS = 7;
    private final int STRENGTH = 8;
    private int waitTick;
    private int abilityCoolDown;
    private EntityAIBase meleeAI;
    private EntityAIBase rangedAISpeed = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
    private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
    private EntityAIBase rangedAIOnce = new EntityAIArrowAttack(this, 0.25F, 1, 64.0F);
    private int rangedAttackCounter;
    private int deathTicks;

    public EntityWreck(World var1)
    {
        super(var1);
        this.texture = "/mob/Wreck.png";
        this.moveSpeed = 0.25F;
        this.meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.meleeAI.setMutexBits(2);
        this.rangedAI.setMutexBits(2);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, this.meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
        ability = 0;
        this.playSound("mob.RPG.Wreck.Intro", 1.0F, 1.0F);
        stage = 0;
    }

    protected void updateAITasks()
    {
        if (ability != 1 && this.waitTick <= 0)
        {
            if (this.waitTick <= 0)
            {
                this.manageAbilities();
                super.updateAITasks();
            }
        }
        else
        {
            if (this.getAttackTarget() != null && this.waitTick <= 0)
            {
                this.waitTick = 30;
            }
            else if (this.waitTick == 1)
            {
                --this.waitTick;
                ability = 0;
            }
            else if (this.waitTick == 5)
            {
                this.setAIMoveSpeed(0.0F);
                --this.waitTick;
            }
            else
            {
                --this.waitTick;
                this.moveEntityWithHeading(0.0F, this.getAIMoveSpeed());
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return stage == 0 ? "/mob/WreckForm1.png" : (stage == 1 ? "/mob/WreckForm2.png" : (stage == 2 ? "/mob/WreckForm3.png" : super.getTexture()));
    }

    public void manageAbilities()
    {
        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }

        EntityPlayerMP var1 = (EntityPlayerMP)this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

        if (this.health < this.getMaxHealth() / 3 && ability == 0)
        {
            stage = 2;
            this.tasks.func_85156_a(this.meleeAI);
        }
        else if (this.health < this.getMaxHealth() * 2 / 3 && ability == 0)
        {
            stage = 1;
            this.tasks.addTask(2, this.rangedAI);
            this.rangedAttackCounter = 1;
        }

        if (ability == 0 && this.abilityCoolDown == 0)
        {
            this.abilityCoolDown = 40;
            label64:

            switch (stage)
            {
                case 0:
                    switch (this.rand.nextInt(2))
                    {
                        case 0:
                            ability = 2;
                            this.setAIMoveSpeed(0.0F);
                            this.moveSpeed = 0.0F;
                            break label64;

                        case 1:
                            ability = 1;
                            this.setAIMoveSpeed(1.4F);

                        default:
                            break label64;
                    }

                case 1:
                    switch (this.rand.nextInt(3))
                    {
                        case 0:
                            ability = 3;
                            break label64;

                        case 1:
                            ability = 4;
                            this.rangedAttackCounter = 0;
                            break label64;

                        case 2:
                            ability = 5;

                        default:
                            break label64;
                    }

                case 2:
                    this.rangedAttackCounter = 0;

                    switch (this.rand.nextInt(3))
                    {
                        case 0:
                            ability = 6;
                            break;

                        case 1:
                            ability = 7;
                            break;

                        case 2:
                            ability = 8;
                    }
            }

            this.message();
        }
        else if (ability == 0 && this.abilityCoolDown > 0)
        {
            --this.abilityCoolDown;
        }
        else if (ability != 0 && this.abilityCoolDown == 0)
        {
            this.abilityCoolDown = 40;
        }

        if (ability == 3 && var1 != null)
        {
            for (int var2 = 0; var2 < 5; ++var2)
            {
                int var3 = (int)((this.posX - var1.posX) / 5.0D) * var2;
                int var4 = (int)((this.posZ - var1.posZ) / 5.0D) * var2;
                this.worldObj.setBlockWithNotify((int)this.posX - var3, (int)this.posY, (int)this.posZ - var4, Block.fire.blockID);
            }

            ability = 0;
        }

        if (ability == 5)
        {
            if (var1 != null)
            {
                var1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 5));
                ++this.rangedAttackCounter;
            }

            if (this.rangedAttackCounter == 100)
            {
                ability = 0;
                this.rangedAttackCounter = 0;
            }
        }
    }

    private void message()
    {
        List var1 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(64.0D, 64.0D, 64.0D));

        for (int var2 = 0; var2 < var1.size(); ++var2)
        {
            if (var1.get(var2) instanceof EntityPlayer)
            {
                EntityPlayer var3 = (EntityPlayer)var1.get(var2);

                switch (ability)
                {
                    case 1:
                        var3.sendChatToPlayer("CHARRGEE!");
                        break;

                    case 2:
                        this.playSound("mob.RPG.Wreck.FeelSoulArksiane", 1.0F, 1.0F);
                        var3.sendChatToPlayer("Come Feel the Soul of Arksiane.");
                        break;

                    case 3:
                        var3.sendChatToPlayer("Arksiane, give me fire!");

                    case 4:
                    default:
                        break;

                    case 5:
                        this.playSound("mob.RPG.Wreck.StopAtOnce", 1.0F, 1.0F);
                        var3.sendChatToPlayer("Stop at once in the name of the great Arksiane!");
                        break;

                    case 6:
                        this.playSound("mob.RPG.Wreck.Speed", 1.0F, 1.0F);
                        var3.sendChatToPlayer("Speed!");
                        break;

                    case 7:
                        this.playSound("mob.RPG.Wreck.Explosions", 1.0F, 1.0F);
                        var3.sendChatToPlayer("Explosions!");
                        break;

                    case 8:
                        this.playSound("mob.RPG.Wreck.Strength", 1.0F, 1.0F);
                        var3.sendChatToPlayer("Strength!");
                }
            }
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        byte var2 = 30;

        if (ability == 2)
        {
            var2 = 35;
        }

        return var2;
    }

    public int getMaxHealth()
    {
        return 5000;
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (ability == 2)
        {
            EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

            if (var1 == null || var1.getDistanceToEntity(this) > 64.0F)
            {
                return;
            }

            var1.addVelocity(Math.signum(this.posX - var1.posX) * 0.069D, 0.0D, Math.signum(this.posZ - var1.posZ) * 0.069D);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.7F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "";
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        return super.attackEntityFrom(var1, var2);
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        int var2 = this.getAttackStrength(var1);

        if (this.isPotionActive(Potion.damageBoost))
        {
            var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }

        if (this.isPotionActive(Potion.weakness))
        {
            var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }

        int var3 = 0;

        if (var1 instanceof EntityLiving)
        {
            var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLiving)var1);
            var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLiving)var1);
        }

        boolean var4 = var1.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
            if (ability == 2)
            {
                ability = 0;
                this.moveSpeed = 0.25F;
                this.setAIMoveSpeed(this.moveSpeed);
                var3 = 2;
            }

            if (var3 > 0)
            {
                var1.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                var1.setFire(var5 * 4);
            }
        }

        return var4;
    }

    /**
     * Attack the specified entity using a ranged attack.
     */
    public void attackEntityWithRangedAttack(EntityLiving var1)
    {
        switch (ability)
        {
            case 4:
                if (this.rangedAttackCounter == 0)
                {
                    EntityBouncingProjectile var4 = new EntityBouncingProjectile(this.worldObj, this, 30);
                    this.worldObj.spawnEntityInWorld(var4);
                    ability = 0;
                    ++this.rangedAttackCounter;
                }

            case 5:
            default:
                break;

            case 6:
                EntityWreckStrengthShot var2 = new EntityWreckStrengthShot(this.worldObj, this, 15);
                this.worldObj.spawnEntityInWorld(var2);
                ++this.rangedAttackCounter;

                if (this.rangedAttackCounter == 20)
                {
                    ability = 0;
                }

                break;

            case 7:
                if (this.rangedAttackCounter % 4 == 0)
                {
                    EntityWreckExplosiveShot var5 = new EntityWreckExplosiveShot(this.worldObj, this);
                    this.worldObj.spawnEntityInWorld(var5);
                    ++this.rangedAttackCounter;
                }
                else if (this.rangedAttackCounter >= 24)
                {
                    ability = 0;
                }
                else
                {
                    ++this.rangedAttackCounter;
                }

                break;

            case 8:
                if ((this.rangedAttackCounter & 4) == 0)
                {
                    EntityWreckStrengthShot var3 = new EntityWreckStrengthShot(this.worldObj, this, 40);
                    this.worldObj.spawnEntityInWorld(var3);
                    ++this.rangedAttackCounter;
                }
                else if (this.rangedAttackCounter >= 12)
                {
                    ability = 0;
                }
                else
                {
                    ++this.rangedAttackCounter;
                }
        }
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    public void onCollideWithPlayer(EntityPlayer var1)
    {
        this.attackEntityAsMob(var1);
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.arksianeLump.itemID, 25);
    }

    /**
     * handles entity death timer, experience orb and particle creation
     */
    protected void onDeathUpdate()
    {
        ++this.deathTicks;

        if (this.deathTicks >= 180 && this.deathTicks <= 200)
        {
            float var1 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float var2 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float var3 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("hugeexplosion", this.posX + (double)var1, this.posY + 2.0D + (double)var2, this.posZ + (double)var3, 0.0D, 0.0D, 0.0D);
        }

        int var4;
        int var5;

        if (!this.worldObj.isRemote)
        {
            if (this.deathTicks > 150 && this.deathTicks % 5 == 0)
            {
                var4 = 1000;

                while (var4 > 0)
                {
                    var5 = EntityXPOrb.getXPSplit(var4);
                    var4 -= var5;
                    this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
                }
            }

            if (this.deathTicks == 1)
            {
                this.worldObj.func_82739_e(1018, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
            }
        }

        this.moveEntity(0.0D, 0.10000000149011612D, 0.0D);
        this.renderYawOffset = this.rotationYaw += 20.0F;

        if (this.deathTicks == 200 && !this.worldObj.isRemote)
        {
            var4 = 2000;

            while (var4 > 0)
            {
                var5 = EntityXPOrb.getXPSplit(var4);
                var4 -= var5;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
            }

            this.setDead();
        }
    }
}
