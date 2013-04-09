package xolova.blued00r.divinerpg.entities.mobs.projectile;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.particles.EntityAzuritePortalFX;

public class EntityFractiteProjectile extends EntityFireball
{
    public EntityFractiteProjectile(World var1)
    {
        super(var1);
        this.isImmuneToFire = true;
    }

    @SideOnly(Side.CLIENT)
    public EntityFractiteProjectile(World var1, double var2, double var4, double var6, double var8, double var10, double var12)
    {
        super(var1, var2, var4, var6, var8, var10, var12);
    }

    public EntityFractiteProjectile(World var1, EntityLiving var2, double var3, double var5, double var7)
    {
        super(var1, var2, var3, var5, var7);
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (!this.worldObj.isRemote)
        {
            if (var1.entityHit != null)
            {
                var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 20);
            }

            float var2 = 0.25F;
            this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 3.0F, false);
            this.setDead();
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        EntityAzuritePortalFX var1 = new EntityAzuritePortalFX(this.worldObj, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
        FMLClientHandler.instance().getClient().effectRenderer.addEffect(var1, var1);
    }
}
