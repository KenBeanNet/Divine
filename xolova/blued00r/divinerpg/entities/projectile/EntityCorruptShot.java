package xolova.blued00r.divinerpg.entities.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCorruptShot extends EntityThrowable
{
    public EntityCorruptShot(World var1)
    {
        super(var1);
    }

    public EntityCorruptShot(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2);
        this.posZ += (double)(var3 / 2);
        this.posY += (double)(var3 / 4);
    }

    public EntityCorruptShot(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 14;

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
