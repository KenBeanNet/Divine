package xolova.blued00r.divinerpg.entities.projectile.icieka;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityFrostyShuriken extends EntityThrowable
{
    public EntityFrostyShuriken(World var1)
    {
        super(var1);
    }

    public EntityFrostyShuriken(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityFrostyShuriken(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        Vec3 var1 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
        Vec3 var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        this.worldObj.rayTraceBlocks(var1, var2);
        var1 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
        var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (!this.worldObj.isRemote)
        {
            Object var4 = null;
            List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double var6 = 0.0D;
            EntityLiving var8 = this.getThrower();

            for (int var9 = 0; var9 < var5.size(); ++var9)
            {
                Entity var10 = (Entity)var5.get(var9);

                if (var10.canBeCollidedWith() && var10 != var8)
                {
                    float var11 = 0.3F;
                    AxisAlignedBB var12 = var10.boundingBox.expand((double)var11, (double)var11, (double)var11);
                    MovingObjectPosition var13 = var12.calculateIntercept(var1, var2);

                    if (var13 != null && var10 != this.thrower && var10 instanceof EntityLiving && (var10.posX < this.thrower.posX + 5.0D || var10.posX > this.thrower.posX - 5.0D || var10.posZ < this.thrower.posZ + 5.0D || var10.posZ > this.thrower.posZ - 5.0D))
                    {
                        var8.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 3));
                        this.setDead();
                    }
                }
            }
        }
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 7;

            if (var1.entityHit instanceof EntityLiving)
            {
                var2 = 7;
                ((EntityLiving)var1.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 3));
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
