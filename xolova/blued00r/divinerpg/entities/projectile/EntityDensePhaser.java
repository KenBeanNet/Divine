package xolova.blued00r.divinerpg.entities.projectile;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.particles.EntityAugitePortalFX;

public class EntityDensePhaser extends EntityThrowable
{
    public EntityDensePhaser(World var1)
    {
        super(var1);
    }

    public EntityDensePhaser(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityDensePhaser(World var1, double var2, double var4, double var6)
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
            EntityAugitePortalFX var2 = new EntityAugitePortalFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var2, var2);
        }
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 46;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 46;
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
