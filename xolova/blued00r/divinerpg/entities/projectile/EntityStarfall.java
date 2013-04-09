package xolova.blued00r.divinerpg.entities.projectile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.Color;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStarfall extends EntityThrowable
{
    Color color;

    public EntityStarfall(World var1)
    {
        super(var1);
        this.motionX = this.rand.nextGaussian() * 0.05D;
        this.motionZ = this.rand.nextGaussian() * 0.05D;
        this.motionY = -0.5D;
        this.color = new Color(this.rand.nextInt(255), this.rand.nextInt(255), this.rand.nextInt(255));
    }

    public EntityStarfall(World var1, EntityLiving var2)
    {
        super(var1, var2);
        this.motionX = this.rand.nextGaussian() * 0.05D;
        this.motionZ = this.rand.nextGaussian() * 0.05D;
        this.motionY = -0.5D;
        this.color = new Color(this.rand.nextInt(255), this.rand.nextInt(255), this.rand.nextInt(255));
    }

    public EntityStarfall(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
        this.motionX = this.rand.nextGaussian() * 0.05D;
        this.motionZ = this.rand.nextGaussian() * 0.05D;
        this.motionY = -0.5D;
        this.color = new Color(this.rand.nextInt(255), this.rand.nextInt(255), this.rand.nextInt(255));
    }

    public Color getColor()
    {
        return this.color;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int var1)
    {
        return this.rand.nextInt(255);
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 40;
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
