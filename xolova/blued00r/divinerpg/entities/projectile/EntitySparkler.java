package xolova.blued00r.divinerpg.entities.projectile;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.particles.EntitySparklerFX;

public class EntitySparkler extends EntityThrowable
{
    public EntitySparkler(World var1)
    {
        super(var1);
    }

    public EntitySparkler(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntitySparkler(World var1, double var2, double var4, double var6)
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

        for (int var1 = 0; var1 < 8; ++var1)
        {
            EntitySparklerFX var2 = new EntitySparklerFX(this.worldObj, this.posX, this.posY, this.posZ, 0.25D * this.rand.nextGaussian(), 0.25D * this.rand.nextGaussian(), 0.25D * this.rand.nextGaussian());
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var2, var2);
        }
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 26;

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
