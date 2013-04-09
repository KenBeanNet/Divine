package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelDensosStatue;
import xolova.blued00r.divinerpg.client.render.blocks.RenderItemDensosStatue$1;

public class RenderItemDensosStatue implements IItemRenderer
{
    private ModelDensosStatue dramixAltar = new ModelDensosStatue();

    public boolean handleRenderType(ItemStack var1, IItemRenderer.ItemRenderType var2)
    {
        return true;
    }

    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType var1, ItemStack var2, IItemRenderer.ItemRendererHelper var3)
    {
        return true;
    }

    public void renderItem(IItemRenderer.ItemRenderType var1, ItemStack var2, Object ... var3)
    {
        switch (RenderItemDensosStatue$1.$SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[var1.ordinal()])
        {
            case 1:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
                break;

            case 2:
                this.renderCalcinator(1.0F, 0.65F, 0.0F);
                break;

            case 3:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
        }
    }

    private void renderCalcinator(float var1, float var2, float var3)
    {
        ForgeHooksClient.bindTexture("/DivineRPG/StatueDensos.png", 0);
        GL11.glPushMatrix();
        GL11.glTranslatef(var1, var2, var3 + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        GL11.glPushMatrix();
        this.dramixAltar.render(0.0275F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
