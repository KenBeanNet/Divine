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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySpinebackWorm extends EntityMob
{
    public boolean attack;

    public EntitySpinebackWorm(World var1)
    {
        super(var1);
        this.texture = "/mob/Alicanto.png";
        this.moveSpeed = 0.15F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 128.0F, 0, false));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
        this.noClip = true;
        this.attack = false;
        System.out.println(this.entityId);
        EntitySpinebackWormBody var2 = new EntitySpinebackWormBody(this.worldObj, this, 0);
        var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        this.worldObj.spawnEntityInWorld(var2);
    }

    /**
     * Checks if this entity is inside of an opaque block
     */
    public boolean isEntityInsideOpaqueBlock()
    {
        return false;
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
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        this.motionY *= 0.2D;
    }

    protected void updateAITasks()
    {
        super.updateAITasks();

        if (this.getAttackTarget() != null)
        {
            if (!this.attack)
            {
                this.defaultMovement();

                if (this.rand.nextInt(250) == 0)
                {
                    this.attack = true;
                }
            }
            else
            {
                this.moveTwrdTarget();
            }

            float var1 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
            float var2 = MathHelper.wrapAngleTo180_float(var1 - this.rotationYaw);
            float var3 = (float)(Math.asin(this.motionY) * 180.0D / Math.PI) - 90.0F;
            float var4 = MathHelper.wrapAngleTo180_float(var3 - this.rotationPitch);
            this.moveForward = 0.5F;
            this.rotationYaw += var2;
            this.rotationPitch += var4;
        }
    }

    private void defaultMovement()
    {
        double var1 = this.posX - this.getAttackTarget().posX;
        double var3 = this.posY - this.getAttackTarget().posY;
        double var5 = this.posZ - this.getAttackTarget().posZ;

        if (Math.sqrt(var1 * var1 + var5 * var5) > 15.0D)
        {
            if (var1 > 0.0D && var5 > 0.0D)
            {
                this.motionX = -0.35D;
                this.motionZ = 0.35D;
            }
            else if (var1 < 0.0D && var5 > 0.0D)
            {
                this.motionX = -0.35D;
                this.motionZ = -0.35D;
            }
            else if (var1 < 0.0D && var5 < 0.0D)
            {
                this.motionX = 0.35D;
                this.motionZ = -0.35D;
            }
            else if (var1 > 0.0D && var5 < 0.0D)
            {
                this.motionX = 0.35D;
                this.motionZ = 0.35D;
            }
        }
        else if (Math.sqrt(var1 * var1 + var5 * var5) < 13.0D)
        {
            if (var1 > 0.0D && var5 > 0.0D)
            {
                this.motionX = 0.35D;
                this.motionZ = 0.35D;
            }
            else if (var1 < 0.0D && var5 > 0.0D)
            {
                this.motionX = -0.35D;
                this.motionZ = 0.35D;
            }
            else if (var1 < 0.0D && var5 < 0.0D)
            {
                this.motionX = -0.35D;
                this.motionZ = -0.35D;
            }
            else if (var1 > 0.0D && var5 < 0.0D)
            {
                this.motionX = 0.35D;
                this.motionZ = -0.35D;
            }
        }

        if (var3 < 5.0D && this.motionY > 0.0D)
        {
            this.motionY = 0.3D;
        }
        else if (var3 > -5.0D && this.motionY < 0.0D)
        {
            this.motionY = -0.3D;
        }
        else if (var3 < -5.0D && this.motionY < 0.0D)
        {
            this.motionY = 0.3D;
        }
        else if (var3 > 5.0D && this.motionY > 0.0D)
        {
            this.motionY = -0.3D;
        }
    }

    private void moveTwrdTarget()
    {
        double var1 = this.posX - this.getAttackTarget().posX;
        double var3 = this.posY - this.getAttackTarget().posY;
        double var5 = this.posZ - this.getAttackTarget().posZ;

        if (Math.sqrt(var1 * var1 + var5 * var5) > 5.0D)
        {
            if (var1 > 0.0D && var5 > 0.0D)
            {
                if (this.motionX > -0.25D)
                {
                    this.motionX -= 0.1D;
                }

                if (this.motionZ > -0.25D)
                {
                    this.motionZ -= 0.1D;
                }
            }
            else if (var1 < 0.0D && var5 > 0.0D)
            {
                if (this.motionX < 0.25D)
                {
                    this.motionX += 0.1D;
                }

                if (this.motionZ > -0.25D)
                {
                    this.motionZ -= 0.1D;
                }
            }
            else if (var1 < 0.0D && var5 < 0.0D)
            {
                if (this.motionX < 0.25D)
                {
                    this.motionX += 0.1D;
                }

                if (this.motionZ < 0.25D)
                {
                    this.motionZ += 0.1D;
                }
            }
            else if (var1 > 0.0D && var5 < 0.0D)
            {
                if (this.motionX > -0.25D)
                {
                    this.motionX -= 0.1D;
                }

                if (this.motionZ < 0.25D)
                {
                    this.motionZ += 0.1D;
                }
            }

            if (this.motionY < 0.0D && this.motionY > -0.4D)
            {
                this.motionY -= 0.1D;
            }
            else if (this.motionY > 0.0D && this.motionY < 0.4D)
            {
                this.motionY += 0.1D;
            }
        }
        else
        {
            this.motionX = -0.25D * Math.signum(var1);
            this.motionZ = -0.25D * Math.signum(var5);

            if (Math.abs(var1) < 0.25D)
            {
                this.motionX = 0.0D;
            }

            if (Math.abs(var5) < 0.25D)
            {
                this.motionZ = 0.0D;
            }

            if (var3 < 0.0D)
            {
                this.motionY = 1.25D;
            }
            else if (var3 > 0.0D)
            {
                this.motionY = -1.25D;
            }
        }

        if (this.getDistanceToEntity(this.getAttackTarget()) < 1.0F)
        {
            this.attackEntityAsMob(this.getAttackTarget());
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

    public boolean attackEntityAsMob(Entity var1)
    {
        this.attack = false;
        return super.attackEntityAsMob(var1);
    }
}
