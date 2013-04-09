package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityVetheanCannonShot extends EntityThrowable
{
    public int damage;

    public EntityVetheanCannonShot(World var1)
    {
        super(var1);
    }

    public EntityVetheanCannonShot(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2);
        this.damage = var3;
    }

    public EntityVetheanCannonShot(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), this.damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
