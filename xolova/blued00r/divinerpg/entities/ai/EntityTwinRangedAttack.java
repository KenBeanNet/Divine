package xolova.blued00r.divinerpg.entities.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;

public class EntityTwinRangedAttack extends EntityAIBase
{
    private final EntityLiving entityHost;
    private final IRangedAttackMob rangedAttackEntityHost;
    private EntityLiving attackTarget;
    private int rangedAttackTime = 0;
    private float entityMoveSpeed;
    private int field_75318_f = 0;
    private int maxRangedAttackTime;
    private float field_82642_h;

    public EntityTwinRangedAttack(IRangedAttackMob var1, float var2, int var3, float var4)
    {
        if (!(var1 instanceof EntityLiving))
        {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        else
        {
            this.rangedAttackEntityHost = var1;
            this.entityHost = (EntityLiving)var1;
            this.entityMoveSpeed = var2;
            this.maxRangedAttackTime = var3;
            this.field_82642_h = var4 * var4;
            this.rangedAttackTime = var3 / 2;
            this.setMutexBits(3);
        }
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        EntityLiving var1 = this.entityHost.getAttackTarget();

        if (var1 == null)
        {
            return false;
        }
        else
        {
            this.attackTarget = var1;
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return this.shouldExecute() || !this.entityHost.getNavigator().noPath();
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.attackTarget = null;
        this.field_75318_f = 0;
        this.rangedAttackTime = this.maxRangedAttackTime / 2;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        double var1 = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.boundingBox.minY, this.attackTarget.posZ);
        boolean var3 = this.entityHost.getEntitySenses().canSee(this.attackTarget);

        if (!var3)
        {
            ++this.field_75318_f;
        }
        else
        {
            this.field_75318_f = 0;
        }

        if (var1 <= (double)this.field_82642_h && this.field_75318_f >= 20)
        {
            this.entityHost.getNavigator().clearPathEntity();
        }
        else
        {
            this.entityHost.setVelocity(-this.entityHost.motionX, this.entityHost.motionY, -this.entityHost.motionZ);
            float var4 = (float)(Math.atan2(this.entityHost.motionZ, this.entityHost.motionX) * 180.0D / Math.PI) - 90.0F;
            float var5 = MathHelper.wrapAngleTo180_float(var4 - this.entityHost.rotationYaw);
            float var6 = (float)(Math.asin(this.entityHost.motionY) * 180.0D / Math.PI) - 90.0F;
            float var7 = MathHelper.wrapAngleTo180_float(var6 - this.entityHost.rotationPitch);
            this.entityHost.rotationYaw += var5;
            this.entityHost.rotationPitch += var7;
        }

        this.entityHost.getLookHelper().setLookPosition(this.attackTarget.posX + (this.entityHost.posX - this.attackTarget.posX) * 2.0D, this.attackTarget.posY + (this.entityHost.posY - this.attackTarget.posY) * 2.0D, this.attackTarget.posZ + (this.entityHost.posZ - this.attackTarget.posZ) * 2.0D, 150.0F, 150.0F);
        this.rangedAttackTime = Math.max(this.rangedAttackTime - 1, 0);

        if (this.rangedAttackTime <= 0 && var1 <= (double)this.field_82642_h && var3)
        {
            this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget);
            this.rangedAttackTime = this.maxRangedAttackTime;
        }
    }
}
