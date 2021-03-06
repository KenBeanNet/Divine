package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityLorgaFlight extends EntityMob
{
    private static final double spawnLayer = 3.0D;
    private ChunkCoordinates currentFlightTarget;
    private int flyTimer;
    private int waitTick;
    private int lifeTick;
    private int spawnTick;
    public boolean canSpawnMinions;

    public EntityLorgaFlight(World var1)
    {
    	this (var1, true);
    }
    
    public EntityLorgaFlight(World var1, boolean var2)
    {
        super(var1);
        this.texture = "/mob/LorgaFlight.png";
        this.moveSpeed = 0.15F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.canSpawnMinions = var2;
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 32.0F, 0, true));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.flyTimer = 0;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * 3.0D && this.posY > 64.0D * (3.0D - 1.0D) && super.getCanSpawnHere();
    }

    public EntityLorgaFlight(World var1, int var2, boolean var3)
    {
        this(var1, var3);
        this.lifeTick = var2;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 7;
    }

    public int getMaxHealth()
    {
        return 40;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.LorgaFlightHit";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.LorgaFlightHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.lifeTick == -1 && this.spawnTick == 0 && this.canSpawnMinions)
        {
            this.spawnTick = 120;
            EntityLorgaFlight var1 = new EntityLorgaFlight(this.worldObj, 10, false);
            var1.setLocationAndAngles(this.posX + 1.0D, this.posY, this.posZ + 1.0D, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(var1);
        }
        else if (this.spawnTick > 0)
        {
            --this.spawnTick;
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        this.motionY *= 0.6000000238418579D;
    }

    protected void updateAITasks()
    {
        super.updateAITasks();

        if (this.getAttackTarget() != null)
        {
            int var1 = (int)this.getAttackTarget().posX;
            int var2 = (int)this.getAttackTarget().posY;
            int var3 = (int)this.getAttackTarget().posZ;
            this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
        }
        else if (this.flyTimer != 0)
        {
            this.flyTimer = 120;
            this.currentFlightTarget = new ChunkCoordinates((int)(this.posX + (double)this.rand.nextInt(16)) - 8, (int)(this.posY + (double)this.rand.nextInt(32)) - 16, (int)(this.posZ + (double)this.rand.nextInt(16)) - 8);
        }

        if (this.currentFlightTarget != null)
        {
            double var9 = (double)this.currentFlightTarget.posX - this.posX;
            double var10 = (double)this.currentFlightTarget.posY - this.posY;
            double var5 = (double)this.currentFlightTarget.posZ - this.posZ;

            if (Math.signum(var9) != 0.0D || Math.signum(var10) != 0.0D || Math.signum(var5) != 0.0D)
            {
                this.motionX += (Math.signum(var9) * 0.15D - this.motionX) * 0.10000000149011612D;
                this.motionY += (Math.signum(var10) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
                this.motionZ += (Math.signum(var5) * 0.15D - this.motionZ) * 0.10000000149011612D;
                float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
                this.moveForward = 0.5F;
                this.rotationYaw += var8;
            }

            --this.flyTimer;
        }
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double var1, boolean var3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.polishedPearls.itemID, 1);
    }
}
