package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySpinebackWormBody extends EntityMob
{
    public EntityLiving head;
    public int spawnTick;
    public int moveMod;
    public int peiceNum;

    public EntitySpinebackWormBody(World var1)
    {
        super(var1);
        this.texture = "/mob/vamacheron.png";
        this.moveSpeed = 0.15F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.noClip = true;
    }

    public EntitySpinebackWormBody(World var1, EntityLiving var2, int var3)
    {
        this(var1);
        this.head = var2;
        //System.out.print(this.entityId);
        //System.out.println(var3);
        this.setAttackTarget(var2);
        this.peiceNum = var3;

        if (this.peiceNum < 2)
        {
            EntitySpinebackWormBody var4 = new EntitySpinebackWormBody(this.worldObj, this, this.peiceNum + 1);
            var4.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(var4);
        }

        this.spawnTick = 20;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 1;
    }

    public int getMaxHealth()
    {
        return 1;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    protected float getSoundPitch()
    {
        return super.getSoundPitch() * 0.95F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return this.rand.nextInt(4) != 0 ? null : "mob.RPG.AlicantoHit";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.AlicantoHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.AlicantoHit";
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.head == null || this.head.isDead)
        {
            this.setDead();
        }

        this.motionY *= 0.2D;

        if (this.spawnTick == 0)
        {
            this.moveMod = 1;
        }
        else if (this.spawnTick > 0)
        {
            --this.spawnTick;
            //this.setVelocity(0.0D, 0.0D, 0.0D);
            this.moveMod = 0;
        }

        this.moveFlying((float)this.motionX * (float)this.moveMod, (float)this.motionY * (float)this.moveMod, (float)this.motionZ * (float)this.moveMod);
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

    public boolean attackEntityAsMob(Entity var1)
    {
        return var1 != this.head ? this.head.attackEntityAsMob(var1) : false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        return var1 != DamageSource.cactus && var1 != DamageSource.inWall ? this.head.attackEntityFrom(var1, var2) : false;
    }
}
