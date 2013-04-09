package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityMandragora;

public class EntityMandragoraProjectile extends EntityThrowable
{
    private EntityLiving thrower;

    public EntityMandragoraProjectile(World var1)
    {
        super(var1);
    }

    public EntityMandragoraProjectile(World var1, EntityLiving var2)
    {
        super(var1, var2);
        this.thrower = var2;
    }

    public EntityMandragoraProjectile(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit == null || !(var1.entityHit instanceof EntityMandragora))
        {
            if (var1.entityHit != null)
            {
                var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), 8);
                this.setDead();
            }

            if (!this.worldObj.isRemote)
            {
                this.setDead();
            }
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.2F;
    }
}
