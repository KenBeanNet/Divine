package xolova.blued00r.divinerpg.entities.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITarget;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityParatiku;

public class EntityAIParatikuOwnerHurtTarget extends EntityAITarget
{
    EntityParatiku theEntityTameable;
    EntityLiving theTarget;

    public EntityAIParatikuOwnerHurtTarget(EntityParatiku var1)
    {
        super(var1, 32.0F, false);
        this.theEntityTameable = var1;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theEntityTameable.isTamed())
        {
            return false;
        }
        else
        {
            EntityLiving var1 = this.theEntityTameable.getOwner();

            if (var1 == null)
            {
                return false;
            }
            else
            {
                this.theTarget = var1.getLastAttackingEntity();
                return this.isSuitableTarget(this.theTarget, false);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.theTarget);
        super.startExecuting();
    }
}
