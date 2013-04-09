package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelWatcherStatue;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityWatcherStatue;

public class RenderWatcherStatue extends TileEntitySpecialRenderer
{
    private ModelWatcherStatue modelAltar = new ModelWatcherStatue();

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderAModelAt((TileEntityWatcherStatue)var1, var2, var4, var6, var8);
    }

    public void renderAModelAt(TileEntityWatcherStatue var1, double var2, double var4, double var6, float var8)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4 + 0.5F, (float)var6 + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        this.bindTextureByName("/DivineRPG/StatueWatcher.png");
        GL11.glPushMatrix();
        this.modelAltar.render(0.0425F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
