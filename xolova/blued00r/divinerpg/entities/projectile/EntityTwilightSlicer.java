package xolova.blued00r.divinerpg.entities.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityTwilightSlicer extends EntityThrowable
{
    public EntityTwilightSlicer(World var1)
    {
        super(var1);
    }

    public EntityTwilightSlicer(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityTwilightSlicer(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 48;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 48;
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
