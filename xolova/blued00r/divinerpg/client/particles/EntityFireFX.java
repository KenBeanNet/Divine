package xolova.blued00r.divinerpg.client.particles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class EntityFireFX extends EntityFX
{
    float smokeParticleScale;

    public EntityFireFX(World var1, double var2, double var4, double var6, double var8, double var10, double var12)
    {
        this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
    }

    public EntityFireFX(World var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14)
    {
        super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
        this.motionX *= 0.10000000149011612D;
        this.motionY *= 0.10000000149011612D;
        this.motionZ *= 0.10000000149011612D;
        this.motionX += var8;
        this.motionY += var10;
        this.motionZ += var12;
        this.particleRed = (float)(Math.random() * 0.6D + 0.4D);
        this.particleGreen = (float)(Math.random() * 0.6D);
        this.particleBlue = 0.0F;
        this.particleScale *= 0.75F;
        this.particleScale *= var14;
        this.smokeParticleScale = this.particleScale;
        this.particleMaxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
        this.particleMaxAge = (int)((float)this.particleMaxAge * var14);
        this.noClip = false;
    }

    public void renderParticle(Tessellator var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        float var8 = ((float)this.particleAge + var2) / (float)this.particleMaxAge * 32.0F;

        if (var8 < 0.0F)
        {
            var8 = 0.0F;
        }

        if (var8 > 1.0F)
        {
            var8 = 1.0F;
        }

        this.particleScale = this.smokeParticleScale * var8;
        super.renderParticle(var1, var2, var3, var4, var5, var6, var7);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float var1 = (float)this.particleAge / (float)this.particleMaxAge;
        var1 = -var1 + var1 * var1 * 2.0F;
        var1 = 1.0F - var1;
        this.posX += this.motionX;
        this.posY += this.motionX;
        this.posZ += this.motionX;

        if (this.particleAge++ >= this.particleMaxAge)
        {
            this.setDead();
        }

        this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
    }
}
