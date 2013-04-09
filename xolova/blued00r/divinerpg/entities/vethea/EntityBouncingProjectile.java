package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityBouncingProjectile extends EntityThrowable
{
    public int damage;

    public EntityBouncingProjectile(World var1)
    {
        super(var1);
    }

    public EntityBouncingProjectile(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2);
        this.damage = var3;
    }

    public EntityBouncingProjectile(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
        this.setVelocity(this.motionX * 0.01D, this.motionY * 0.01D, this.motionZ * 0.01D);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null && var1.entityHit != this.thrower)
        {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), this.damage);

            if (!this.worldObj.isRemote)
            {
                this.setDead();
            }
        }
        else
        {
            if (var1.sideHit != 0 && var1.sideHit != 1)
            {
                if (var1.sideHit != 2 && var1.sideHit != 3)
                {
                    if (var1.sideHit == 4 || var1.sideHit == 5)
                    {
                        this.motionX *= -1.0D;
                    }
                }
                else
                {
                    this.motionZ *= -1.0D;
                }
            }
            else
            {
                this.motionY *= -1.0D;
            }
        }
    }
}
