package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelPhoenixAltar;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityPheonixAltar;

public class RenderPheonixAltar extends TileEntitySpecialRenderer
{
    static final float scale = 0.0625F;
    private ModelPhoenixAltar modelAltar = new ModelPhoenixAltar(0.0625F);

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderAModelAt((TileEntityPheonixAltar)var1, var2, var4, var6, var8);
    }

    public void renderAModelAt(TileEntityPheonixAltar var1, double var2, double var4, double var6, float var8)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((double)((float)var2 + 0.5F), (double)((float)var4 - 0.6F), (double)((float)var6 + 0.5F));
        this.bindTextureByName("/DivineRPG/PhoenixSpawn.png");
        GL11.glPushMatrix();
        this.modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
