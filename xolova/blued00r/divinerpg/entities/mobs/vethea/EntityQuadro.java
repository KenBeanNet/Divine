package xolova.blued00r.divinerpg.entities.mobs.vethea;

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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanArrow;

public class EntityQuadro extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
    public static int ability;
    private final int SLOW = 0;
    private final int FAST = 1;
    private final int MSLOW = 2;
    private final int MFAST = 3;
    private int waitTick;
    private int abilityCoolDown;
    private EntityAIBase rangedAI;
    private EntityAIBase meleeAI;
    private int rangedAttackCounter;
    public boolean dir;

    public EntityQuadro(World var1)
    {
        super(var1);
        this.texture = "/mob/Quadro.png";
        this.moveSpeed = 0.25F;
        this.health = this.getMaxHealth();
        this.rangedAI = new EntityAIArrowAttack(this, 0.25F, 10, 64.0F);
        this.meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.rangedAI.setMutexBits(2);
        this.meleeAI.setMutexBits(2);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, this.rangedAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        ability = 0;
        this.setSize(4.0F, 7.9F);
    }

    protected void updateAITasks()
    {
        this.manageAbilities();
        super.updateAITasks();
    }

    public void manageAbilities()
    {
        if (this.abilityCoolDown == 0)
        {
            ability = this.rand.nextInt(4);
            this.abilityCoolDown = 500;
            this.rangedAttackCounter = 0;
            this.dir = true;
            this.message();
        }
        else if (this.abilityCoolDown == 480)
        {
            --this.abilityCoolDown;
            this.dir = false;
        }
        else if (this.abilityCoolDown > 0)
        {
            --this.abilityCoolDown;
        }

        if (ability == 2)
        {
            this.moveSpeed = 0.25F;
            this.setAIMoveSpeed(0.25F);
        }
        else if (ability == 3)
        {
            this.moveSpeed = 0.5F;
            this.setAIMoveSpeed(0.5F);
        }
    }

    public void message()
    {
        switch (this.rand.nextInt(9))
        {
            case 0:
                this.playSound("mob.RPG.Quadro.QuadroDieBefore", 1.0F, 1.0F);
                break;

            case 1:
                this.playSound("mob.RPG.Quadro.QuadroEnough", 1.0F, 1.0F);
                break;

            case 2:
                this.playSound("mob.RPG.Quadro.QuadroIncomingPunch", 1.0F, 1.0F);
                break;

            case 3:
                this.playSound("mob.RPG.Quadro.QuadroIsNext", 1.0F, 1.0F);
                break;

            case 4:
                this.playSound("mob.RPG.Quadro.QuadroKillMine", 1.0F, 1.0F);
                break;

            case 5:
                this.playSound("mob.RPG.Quadro.QuadroMyKill", 1.0F, 1.0F);
                break;

            case 6:
                this.playSound("mob.RPG.Quadro.QuadroNoDie", 1.0F, 1.0F);
                break;

            case 7:
                this.playSound("mob.RPG.Quadro.QuadroSitDown", 1.0F, 1.0F);
                break;

            default:
                this.playSound("mob.RPG.Quadro.QuadroTasteFist", 1.0F, 1.0F);
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        byte var2 = 1;

        if (ability == 2)
        {
            var2 = 3;
        }

        return var2;
    }

    public int getMaxHealth()
    {
        return 4000;
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
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.quadroticLump.itemID, 25);
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
                if ((this.rangedAttackCounter & 8) == 0)
                {
                    EntityVetheanArrow var3 = new EntityVetheanArrow(this.worldObj, this, var1, 1.6F, 12.0F);
                    this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
                    var3.setDamage(2.0D);
                    this.worldObj.spawnEntityInWorld(var3);
                }

                ++this.rangedAttackCounter;
                break;

            case 1:
                EntityVetheanArrow var2 = new EntityVetheanArrow(this.worldObj, this, var1, 1.6F, 12.0F);
                var2.setDamage(1.0D);
                this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
                this.worldObj.spawnEntityInWorld(var2);
        }
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }
}
