package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityAcidHag extends EntityMob
{
    private double spawnLayer = 1.0D;

    public EntityAcidHag(World var1)
    {
        super(var1);
        this.texture = "/mob/AcidHag.png";
        this.moveSpeed = 0.3F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.posZ);

        for (var1 = 0; var1 < 4; ++var1)
        {
            var2 = MathHelper.floor_double(this.posX + (double)((float)(var1 % 2 * 2 - 1) * 0.25F));
            int var3 = MathHelper.floor_double(this.posY);
            int var4 = MathHelper.floor_double(this.posZ + (double)((float)(var1 / 2 % 2 * 2 - 1) * 0.25F));

            if (this.worldObj.getBlockId(var2, var3, var4) == 0 && Block.snow.canPlaceBlockAt(this.worldObj, var2, var3, var4))
            {
                this.worldObj.setBlockWithNotify(var2, var3, var4, DivineRPG.blockAcid.blockID);
            }
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 5;
    }

    public int getMaxHealth()
    {
        return 25;
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
        return "mob.RPG.AcidHag";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.AcidHagHit";
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
            ((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.poison.id, 80, 1));
        }

        boolean var4 = var1.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
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
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * this.spawnLayer && this.posY > 64.0D * (this.spawnLayer - 1.0D) && super.getCanSpawnHere();
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.dirtyPearls.itemID, 1);
        this.dropItem(DivineRPG.acidfire.itemID, var2 * 2);
    }
}
