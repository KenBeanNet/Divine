package xolova.blued00r.divinerpg.entities.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITarget;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityParatiku;

public class EntityAIParatikuOwnerHurtByTarget extends EntityAITarget
{
    EntityParatiku theDefendingTameable;
    EntityLiving theOwnerAttacker;

    public EntityAIParatikuOwnerHurtByTarget(EntityParatiku var1)
    {
        super(var1, 32.0F, false);
        this.theDefendingTameable = var1;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theDefendingTameable.isTamed())
        {
            return false;
        }
        else
        {
            EntityLiving var1 = this.theDefendingTameable.getOwner();

            if (var1 == null)
            {
                return false;
            }
            else
            {
                this.theOwnerAttacker = var1.getAITarget();
                return this.isSuitableTarget(this.theOwnerAttacker, false);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.theOwnerAttacker);
        super.startExecuting();
    }
}
