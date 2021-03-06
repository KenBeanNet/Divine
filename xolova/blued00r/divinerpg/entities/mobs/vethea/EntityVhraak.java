package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityVhraak extends EntityMob
{
    private static final double spawnLayer = 4.0D;
    private ChunkCoordinates chargeTarget;
    private int waitTick;
    private int lifeTick;
    private boolean spawned;
    private int spawnTick;

    public EntityVhraak(World var1)
    {
        super(var1);
        this.texture = "/mob/Vhraak.png";
        this.moveSpeed = 0.4F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.lifeTick = -1;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * 4.0D && this.posY > 64.0D * (4.0D - 1.0D) && super.getCanSpawnHere();
    }

    public EntityVhraak(World var1, int var2)
    {
        this(var1);
        this.lifeTick = var2;
    }

    protected void updateAITasks()
    {
        if (this.getAttackTarget() != null && (double)this.getDistanceToEntity(this.getAttackTarget()) < 0.5D)
        {
            this.waitTick = 30;
            this.hasAttacked = false;
        }
        else if (this.waitTick == 0)
        {
            if (this.spawnTick == 0 && this.lifeTick == -1)
            {
                EntityVhraak var1 = new EntityVhraak(this.worldObj, 30);
                var1.setLocationAndAngles(this.posX + 1.0D, this.posY, this.posZ + 1.0D, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var1);
                var1 = new EntityVhraak(this.worldObj, 30);
                var1.setLocationAndAngles(this.posX - 1.0D, this.posY, this.posZ + 1.0D, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var1);
                var1 = new EntityVhraak(this.worldObj, 30);
                var1.setLocationAndAngles(this.posX + 1.0D, this.posY, this.posZ - 1.0D, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var1);
                var1 = new EntityVhraak(this.worldObj, 30);
                var1.setLocationAndAngles(this.posX - 1.0D, this.posY, this.posZ - 1.0D, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var1);
                this.spawnTick = 50;
            }
            else if (this.spawnTick > 0)
            {
                --this.spawnTick;
            }

            super.updateAITasks();
        }
        else
        {
            --this.waitTick;
        }
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.lifeTick > 0)
        {
            --this.lifeTick;
        }
        else if (this.lifeTick == 0 && !this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 30;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 100;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Vhraak";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.VhraakHit";
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
        return DivineRPG.fyrossom.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.shinyPearls.itemID, 1);
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    public void onCollideWithPlayer(EntityPlayer var1)
    {
        this.attackEntityAsMob(var1);
    }
}
