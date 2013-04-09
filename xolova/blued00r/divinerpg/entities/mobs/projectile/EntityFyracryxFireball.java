package xolova.blued00r.divinerpg.entities.mobs.projectile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFyracryxFireball extends EntitySmallFireball
{
    public EntityFyracryxFireball(World var1)
    {
        super(var1);
    }

    public EntityFyracryxFireball(World var1, EntityLiving var2, double var3, double var5, double var7)
    {
        super(var1, var2, var3, var5, var7);
    }

    @SideOnly(Side.CLIENT)
    public EntityFyracryxFireball(World var1, double var2, double var4, double var6, double var8, double var10, double var12)
    {
        super(var1, var2, var4, var6, var8, var10, var12);
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
                var1.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 6);
            }

            this.worldObj.newExplosion((Entity)null, this.posX, this.posY, this.posZ, 1.0F, true, false);
            this.setDead();
        }
    }
}
