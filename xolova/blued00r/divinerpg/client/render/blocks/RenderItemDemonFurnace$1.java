package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraftforge.client.IItemRenderer;

class RenderItemDemonFurnace$1
{
    static final int[] $SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType = new int[IItemRenderer.ItemRenderType.values().length];

    static
    {
        try
        {
            $SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[IItemRenderer.ItemRenderType.ENTITY.ordinal()] = 1;
        }
        catch (NoSuchFieldError var3)
        {
            ;
        }

        try
        {
            $SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[IItemRenderer.ItemRenderType.EQUIPPED.ordinal()] = 2;
        }
        catch (NoSuchFieldError var2)
        {
            ;
        }

        try
        {
            $SwitchMap$net$minecraftforge$client$IItemRenderer$ItemRenderType[IItemRenderer.ItemRenderType.INVENTORY.ordinal()] = 3;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
