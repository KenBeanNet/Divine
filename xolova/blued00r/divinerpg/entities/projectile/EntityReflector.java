package xolova.blued00r.divinerpg.entities.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityReflector extends EntityThrowable
{
    public EntityReflector(World var1)
    {
        super(var1);
    }

    public EntityReflector(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityReflector(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return null;
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            boolean var2 = false;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = false;
            }

            var1.entityHit.addVelocity(this.motionX * 3.0D, 0.1D, this.motionZ * 3.0D);
            boolean var3 = true;
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
