package xolova.blued00r.divinerpg.entities.projectile.icieka;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityFrostClaw extends EntityThrowable
{
    public EntityFrostClaw(World var1)
    {
        super(var1);
    }

    public EntityFrostClaw(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityFrostClaw(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 21;

            if (var1.entityHit instanceof EntityLiving)
            {
                var2 = 21;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), var2))
            {
                boolean var3 = true;
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
