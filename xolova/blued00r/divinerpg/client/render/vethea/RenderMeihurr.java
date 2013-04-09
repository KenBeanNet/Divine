package xolova.blued00r.divinerpg.client.render.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderMeihurr extends Render
{
    protected ModelBase modelBoat;

    public RenderMeihurr()
    {
        this.shadowSize = 0.5F;
        this.modelBoat = new ModelBoat();
    }

    public void renderBoat(EntityBoat var1, double var2, double var4, double var6, float var8, float var9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6);
        GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
        float var10 = (float)var1.getTimeSinceHit() - var9;
        float var11 = (float)var1.getDamageTaken() - var9;

        if (var11 < 0.0F)
        {
            var11 = 0.0F;
        }

        if (var10 > 0.0F)
        {
            GL11.glRotatef(MathHelper.sin(var10) * var10 * var11 / 10.0F * (float)var1.getForwardDirection(), 1.0F, 0.0F, 0.0F);
        }

        this.loadTexture("/terrain.png");
        float var12 = 0.75F;
        GL11.glScalef(var12, var12, var12);
        GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
        this.loadTexture("/item/boat.png");
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        this.modelBoat.render(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderBoat((EntityBoat)var1, var2, var4, var6, var8, var9);
    }
}
