package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelDAZStatue;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDAZStatue;

public class RenderDAZStatue extends TileEntitySpecialRenderer
{
    private ModelDAZStatue modelAltar = new ModelDAZStatue();

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderAModelAt((TileEntityDAZStatue)var1, var2, var4, var6, var8);
    }

    public void renderAModelAt(TileEntityDAZStatue var1, double var2, double var4, double var6, float var8)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6 + 1.2F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.8F, 0.5F);
        this.bindTextureByName("/DivineRPG/StatueDex.png");
        GL11.glPushMatrix();
        this.modelAltar.render(0.0325F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
