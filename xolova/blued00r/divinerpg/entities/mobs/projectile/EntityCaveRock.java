package xolova.blued00r.divinerpg.entities.mobs.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityCaveRock extends EntityThrowable
{
    public EntityCaveRock(World var1)
    {
        super(var1);
    }

    public EntityCaveRock(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityCaveRock(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 0;

            if (var1.entityHit instanceof EntityLiving)
            {
                var2 = 12;
            }

            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
