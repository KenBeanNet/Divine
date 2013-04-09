package xolova.blued00r.divinerpg.client.render.entities.projectiles;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.Color;
import java.util.Random;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import xolova.blued00r.divinerpg.entities.projectile.EntityStarfall;

@SideOnly(Side.CLIENT)
public class RenderStarfall extends Render
{
    private int itemIconIndex;
    private String texture;
    private Random rand = new Random();

    public RenderStarfall(int var1, String var2)
    {
        this.itemIconIndex = var1;
        this.texture = var2;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        this.loadTexture(this.texture);
        Tessellator var10 = Tessellator.instance;
        this.func_40265_a(var10, this.itemIconIndex, ((EntityStarfall)var1).getColor());
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }

    private void func_40265_a(Tessellator var1, int var2, Color var3)
    {
        float var4 = (float)(var2 % 16 * 16 + 0) / 256.0F;
        float var5 = (float)(var2 % 16 * 16 + 16) / 256.0F;
        float var6 = (float)(var2 / 16 * 16 + 0) / 256.0F;
        float var7 = (float)(var2 / 16 * 16 + 16) / 256.0F;
        float var8 = 1.0F;
        float var9 = 0.5F;
        float var10 = 0.25F;
        GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        var1.startDrawingQuads();
        var1.setColorRGBA(var3.getRed(), var3.getBlue(), var3.getGreen(), 255);
        var1.setNormal(0.0F, 1.0F, 0.0F);
        var1.addVertexWithUV((double)(0.0F - var9), (double)(0.0F - var10), 0.0D, (double)var4, (double)var7);
        var1.addVertexWithUV((double)(var8 - var9), (double)(0.0F - var10), 0.0D, (double)var5, (double)var7);
        var1.addVertexWithUV((double)(var8 - var9), (double)(var8 - var10), 0.0D, (double)var5, (double)var6);
        var1.addVertexWithUV((double)(0.0F - var9), (double)(var8 - var10), 0.0D, (double)var4, (double)var6);
        var1.draw();
    }
}
