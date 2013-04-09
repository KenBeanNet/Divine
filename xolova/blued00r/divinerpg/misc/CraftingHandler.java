package xolova.blued00r.divinerpg.misc;

import cpw.mods.fml.common.ICraftingHandler;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class CraftingHandler implements ICraftingHandler
{
    public void onCrafting(EntityPlayer var1, ItemStack var2, IInventory var3)
    {
        if (var3 != null && var2.itemID == DivineRPG.draviteLamp.blockID)
        {
            var1.addStat(AchievementPageDivineRPG.oneLamp, 1);
        }
    }

    private static void RemoveRecipe(ItemStack var0)
    {
        ItemStack var1 = null;
        ArrayList var2 = (ArrayList)CraftingManager.getInstance().getRecipeList();

        for (int var3 = 0; var3 < var2.size(); ++var3)
        {
            IRecipe var4 = (IRecipe)var2.get(var3);

            if (var4 instanceof ShapedRecipes)
            {
                ShapedRecipes var5 = (ShapedRecipes)var4;
                var1 = var5.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.helmetDiamond), var1))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var2.get(var3) + " -> " + var1);
                var2.remove(var3);
            }
        }
    }

    public void onSmelting(EntityPlayer var1, ItemStack var2) {}
}
