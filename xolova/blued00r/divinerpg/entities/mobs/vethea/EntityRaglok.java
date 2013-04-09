package xolova.blued00r.divinerpg.entities.mobs.vethea;

import java.util.List;
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
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityRaglokBomb;

public class EntityRaglok extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
    private static int ability;
    private final int DEFAULT = 0;
    private final int LIGHTNING = 1;
    private final int BLIND = 2;
    private final int BOMBS = 3;
    private final int SLOW = 4;
    private int waitTick;
    private int abilityCoolDown;
    private EntityAIBase meleeAI;
    private EntityAIBase rangedAISpeed = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
    private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 20, 64.0F);
    private EntityAIBase rangedAIOnce = new EntityAIArrowAttack(this, 0.25F, 1, 64.0F);
    private int rangedAttackCounter;
    private int deathTicks;

    public EntityRaglok(World var1)
    {
        super(var1);
        this.texture = "/mob/RaglokGogdure.png";
        this.moveSpeed = 0.25F;
        this.meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.meleeAI.setMutexBits(2);
        this.rangedAI.setMutexBits(2);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, this.meleeAI);
        this.tasks.addTask(2, this.rangedAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
        ability = 0;
        this.setSize(1.5F, 4.0F);
        this.playSound("mob.RPG.Raglok.RaglokAwaken", 1.0F, 1.0F);
    }

    protected void updateAITasks()
    {
        this.manageAbilities();
        super.updateAITasks();
    }

    public void manageAbilities()
    {
        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }

        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

        if (ability == 0 && this.abilityCoolDown == 0)
        {
            this.abilityCoolDown = 40;

            switch (this.rand.nextInt(4))
            {
                case 0:
                    ability = 1;
                    this.rangedAttackCounter = 100;
                    this.moveSpeed = 0.0F;
                    break;

                case 1:
                    ability = 2;
                    this.rangedAttackCounter = -1;
                    break;

                case 2:
                    ability = 3;
                    this.rangedAttackCounter = 100;
                    break;

                case 3:
                    ability = 4;
                    this.rangedAttackCounter = -1;
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

        if (ability == 2)
        {
            if (var1 != null)
            {
                var1.addPotionEffect(new PotionEffect(Potion.blindness.id, 1, 0));
                --this.rangedAttackCounter;
            }

            if (this.rangedAttackCounter == -200)
            {
                ability = 0;
                this.rangedAttackCounter = -1;
            }
        }

        if (ability == 4)
        {
            if (var1 != null)
            {
                var1.addPotionEffect(new PotionEffect(Potion.blindness.id, 1, 0));
                --this.rangedAttackCounter;
            }

            if (this.rangedAttackCounter == -100)
            {
                ability = 0;
                this.rangedAttackCounter = -1;
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
                        this.playSound("mob.RPG.Raglok.RaglokHelio", 1.0F, 1.0F);
                        var3.sendChatToPlayer("You think you can fight me? I am the great guardian of Heliosis!");
                        break;

                    case 2:
                        this.playSound("mob.RPG.Raglok.RaglokDark", 1.0F, 1.0F);
                        break;

                    case 3:
                        this.playSound("mob.RPG.Raglok.RaglokRain", 1.0F, 1.0F);
                        break;

                    case 4:
                        this.playSound("mob.RPG.Raglok.Raglok", 1.0F, 1.0F);
                }
            }
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 30;
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
        return "mob.RPG.RaglokAvenge";
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
            if (ability == 4)
            {
                var3 = 5;
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
            case 1:
                this.worldObj.spawnEntityInWorld(new EntityLightningBolt(this.worldObj, var1.lastTickPosX, var1.lastTickPosY, var1.lastTickPosZ));
                ++this.rangedAttackCounter;

                if (this.rangedAttackCounter == 10)
                {
                    ability = 0;
                }

                break;

            case 3:
                EntityRaglokBomb var2 = new EntityRaglokBomb(this.worldObj);
                var2.setPosition(var1.posX, var1.posY + 5.0D, var1.posZ);
                var2.setVelocity(0.0D, -2.0D, 0.0D);
                this.worldObj.spawnEntityInWorld(var2);
                ++this.rangedAttackCounter;

                if (this.rangedAttackCounter == 5)
                {
                    ability = 0;
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
        this.dropItem(DivineRPG.heliosisLump.itemID, 25);
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
                this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D).attackEntityFrom(DamageSource.magic, 16);
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
