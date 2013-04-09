package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityEvernightProjectile extends EntityVetheanCannonShot
{
    public EntityEvernightProjectile(World var1)
    {
        super(var1);
    }

    public EntityEvernightProjectile(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2, var3);
    }

    public EntityEvernightProjectile(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            var1.entityHit.attackEntityFrom((new EntityDamageSourceIndirect("arcana", this, this.thrower)).setMagicDamage(), this.damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
