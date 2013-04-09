package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelDemonFurnace;
import xolova.blued00r.divinerpg.client.render.blocks.RenderItemDemonFurnace$1;

public class RenderItemDemonFurnace implements IItemRenderer
{
    private ModelDemonFurnace dramixAltar = new ModelDemonFurnace(0.0625F);

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
        switch (RenderItemDemonFurnace$1.$SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[var1.ordinal()])
        {
            case 1:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
                break;

            case 2:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
                break;

            case 3:
                this.renderCalcinator(1.0F, 0.65F, 1.0F);
        }
    }

    private void renderCalcinator(float var1, float var2, float var3)
    {
        ForgeHooksClient.bindTexture("/DivineRPG/DemonFurnace.png", 0);
        GL11.glPushMatrix();
        GL11.glTranslatef(var1, var2, var3);
        this.dramixAltar.render(0.0275F);
        GL11.glPopMatrix();
    }
}
