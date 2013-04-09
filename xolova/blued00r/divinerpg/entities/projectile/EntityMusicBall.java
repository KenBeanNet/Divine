package xolova.blued00r.divinerpg.entities.projectile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMusicBall extends EntityThrowable
{
    public EntityMusicBall(World var1)
    {
        super(var1);
    }

    public EntityMusicBall(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityMusicBall(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        float var1 = 0.25F;
        this.worldObj.spawnParticle("note", this.posX - this.motionX * (double)var1 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * (double)var1 - 0.5D, this.posZ - this.motionZ * (double)var1 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 10;

            if (var1.entityHit instanceof EntityLiving)
            {
                var2 = 10;
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
