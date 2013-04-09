package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelExtractor;
import xolova.blued00r.divinerpg.client.render.blocks.RenderItemExtractor$1;

public class RenderItemExtractor implements IItemRenderer
{
    private ModelExtractor dramixAltar = new ModelExtractor(0.0625F);

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
        switch (RenderItemExtractor$1.$SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[var1.ordinal()])
        {
            case 1:
                this.renderCalcinator(-0.5F, 0.0F, -0.5F);
                break;

            case 2:
                this.renderCalcinator(0.0F, 0.4F, 0.0F);
                break;

            case 3:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
        }
    }

    private void renderCalcinator(float var1, float var2, float var3)
    {
        ForgeHooksClient.bindTexture("/DivineRPG/Extractor.png", 0);
        GL11.glPushMatrix();
        GL11.glTranslatef(var1, var2 - 0.7F, var3);
        this.dramixAltar.render(0.0275F);
        GL11.glPopMatrix();
    }
}
