package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public abstract class EntityDuo extends EntityMob
{
    private static final double spawnLayer = 1.0D;
    public static int ability;
    private final int SLOW = 0;
    private final int FAST = 1;
    private int waitTick;
    private int abilityCoolDown;
    private EntityAIBase meleeAI;

    public EntityDuo(World var1)
    {
        super(var1);
        this.texture = "/mob/Duo.png";
        this.moveSpeed = 0.25F;
        this.meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, this.meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        ability = 0;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * 1.0D && this.posY > 64.0D * (1.0D - 1.0D) && super.getCanSpawnHere();
    }

    protected void updateAITasks()
    {
        this.manageAbilities();
        super.updateAITasks();
    }

    public void manageAbilities()
    {
        EntityPlayerMP var1 = (EntityPlayerMP)this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

        if (ability == 0 && this.abilityCoolDown == 0)
        {
            ability = 1;
            this.abilityCoolDown = 350;
            this.setAIMoveSpeed(this.moveSpeed * 3.0F);
        }
        else if (ability == 0 && this.abilityCoolDown > 0)
        {
            --this.abilityCoolDown;
        }
        else if (ability != 0 && this.abilityCoolDown == 0)
        {
            this.abilityCoolDown = 350;
        }
        else
        {
            ability = 0;
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        byte var2 = 5;

        if (ability == 0)
        {
            var2 = 7;
        }

        return var2;
    }

    public int getMaxHealth()
    {
        return 20;
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
        return "mob.RPG.Duo";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.DuoHit";
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
        this.dropItem(DivineRPG.dirtyPearls.itemID, 1);
    }
}
