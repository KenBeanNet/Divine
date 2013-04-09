package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelVamacheronStatue;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityVamacheronStatue;

public class RenderVamacheronStatue extends TileEntitySpecialRenderer
{
    private ModelVamacheronStatue modelAltar = new ModelVamacheronStatue();

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderAModelAt((TileEntityVamacheronStatue)var1, var2, var4, var6, var8);
    }

    public void renderAModelAt(TileEntityVamacheronStatue var1, double var2, double var4, double var6, float var8)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6 + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        this.bindTextureByName("/DivineRPG/StatueVamacheron.png");
        GL11.glPushMatrix();
        this.modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
