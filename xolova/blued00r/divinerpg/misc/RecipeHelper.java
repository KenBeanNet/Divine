package xolova.blued00r.divinerpg.misc;

import java.util.ArrayList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;

public class RecipeHelper
{
    public static void addRecipes() {}

    public static void removeRecipes()
    {
        ItemStack var0 = null;
        ArrayList var1 = (ArrayList)CraftingManager.getInstance().getRecipeList();

        for (int var2 = 0; var2 < var1.size(); ++var2)
        {
            IRecipe var3 = (IRecipe)var1.get(var2);

            if (var3 instanceof ShapedRecipes)
            {
                ShapedRecipes var4 = (ShapedRecipes)var3;
                var0 = var4.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.helmetDiamond), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.plateDiamond), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.legsDiamond), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.bootsDiamond), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.helmetSteel), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.plateSteel), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.legsSteel), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.bootsSteel), var0))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + var1.get(var2) + " -> " + var0);
                var1.remove(var2);
            }
        }
    }
}
