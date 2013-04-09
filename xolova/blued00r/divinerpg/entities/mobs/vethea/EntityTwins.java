package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanArrow;

public class EntityTwins extends EntityMob implements IRangedAttackMob
{
    private static final double spawnLayer = 2.0D;
    public static int ability;
    private final int SLOW = 0;
    private final int FAST = 1;
    private int waitTick;
    private int abilityCoolDown;
    private EntityAIBase rangedAI;
    private int rangedAttackCounter;

    public EntityTwins(World var1)
    {
        super(var1);
        this.texture = "/mob/Twins.png";
        this.moveSpeed = 0.25F;
        this.health = this.getMaxHealth();
        this.rangedAI = new EntityAIArrowAttack(this, 0.25F, 10, 64.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, this.rangedAI);
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
        return this.posY < 64.0D * 2.0D && this.posY > 64.0D * (2.0D - 1.0D) && super.getCanSpawnHere();
    }

    protected void updateAITasks()
    {
        this.manageAbilities();
        super.updateAITasks();
    }

    public void manageAbilities()
    {
        if (ability == 0 && this.abilityCoolDown == 0)
        {
            ability = 1;
            this.abilityCoolDown = 50;
            this.rangedAttackCounter = 0;
        }
        else if (ability == 1 && this.abilityCoolDown == 0)
        {
            ability = 0;
            this.abilityCoolDown = 60;
            this.rangedAttackCounter = 0;
        }
        else if (this.abilityCoolDown > 0)
        {
            --this.abilityCoolDown;
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        byte var2 = 1;
        return var2;
    }

    public int getMaxHealth()
    {
        return 1;
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
        return "mob.RPG.Twins";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.TwinsHit";
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
     * Attack the specified entity using a ranged attack.
     */
    public void attackEntityWithRangedAttack(EntityLiving var1)
    {
        switch (ability)
        {
            case 0:
                ++this.rangedAttackCounter;

                if ((this.rangedAttackCounter & 4) == 0)
                {
                    EntityVetheanArrow var3 = new EntityVetheanArrow(this.worldObj, this, var1, 1.6F, 12.0F);
                    var3.setDamage(4.0D);
                    this.worldObj.spawnEntityInWorld(var3);
                }

                break;

            case 1:
                EntityVetheanArrow var2 = new EntityVetheanArrow(this.worldObj, this, var1, 1.6F, 12.0F);
                var2.setDamage(2.0D);
                this.worldObj.spawnEntityInWorld(var2);
        }
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.cleanPearls.itemID, 1);
    }
}
