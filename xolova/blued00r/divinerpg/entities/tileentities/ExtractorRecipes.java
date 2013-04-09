package xolova.blued00r.divinerpg.entities.tileentities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class ExtractorRecipes
{
    private static final ExtractorRecipes smeltingBase = new ExtractorRecipes();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap metaSmeltingList = new HashMap();
    private HashMap metaExperience = new HashMap();

    public static final ExtractorRecipes smelting()
    {
        return smeltingBase;
    }

    private ExtractorRecipes()
    {
        this.addSmelting(DivineRPG.arcanaOre.blockID, new ItemStack(DivineRPG.arcanium), 0.0F);
    }

    public void addSmelting(int var1, ItemStack var2, float var3)
    {
        this.smeltingList.put(Integer.valueOf(var1), var2);
        this.experienceList.put(Integer.valueOf(var2.itemID), Float.valueOf(var3));
    }

    @Deprecated
    public ItemStack getSmeltingResult(int var1)
    {
        return (ItemStack)this.smeltingList.get(Integer.valueOf(var1));
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    @Deprecated
    public float getExperience(int var1)
    {
        return this.experienceList.containsKey(Integer.valueOf(var1)) ? ((Float)this.experienceList.get(Integer.valueOf(var1))).floatValue() : 0.0F;
    }

    public void addSmelting(int var1, int var2, ItemStack var3, float var4)
    {
        this.metaSmeltingList.put(Arrays.asList(new Integer[] {Integer.valueOf(var1), Integer.valueOf(var2)}), var3);
        this.metaExperience.put(Arrays.asList(new Integer[] {Integer.valueOf(var1), Integer.valueOf(var2)}), Float.valueOf(var4));
    }

    public ItemStack getSmeltingResult(ItemStack var1)
    {
        if (var1 == null)
        {
            return null;
        }
        else
        {
            ItemStack var2 = (ItemStack)this.metaSmeltingList.get(Arrays.asList(new Integer[] {Integer.valueOf(var1.itemID), Integer.valueOf(var1.getItemDamage())}));
            return var2 != null ? var2 : (ItemStack)this.smeltingList.get(Integer.valueOf(var1.itemID));
        }
    }

    public float getExperience(ItemStack var1)
    {
        if (var1 != null && var1.getItem() != null)
        {
            float var2 = var1.getItem().getSmeltingExperience(var1);

            if (var2 < 0.0F && this.metaExperience.containsKey(Arrays.asList(new Integer[] {Integer.valueOf(var1.itemID), Integer.valueOf(var1.getItemDamage())})))
            {
                var2 = ((Float)this.metaExperience.get(Arrays.asList(new Integer[] {Integer.valueOf(var1.itemID), Integer.valueOf(var1.getItemDamage())}))).floatValue();
            }

            if (var2 < 0.0F && this.experienceList.containsKey(Integer.valueOf(var1.itemID)))
            {
                var2 = ((Float)this.experienceList.get(Integer.valueOf(var1.itemID))).floatValue();
            }

            return var2 < 0.0F ? 0.0F : var2;
        }
        else
        {
            return 0.0F;
        }
    }
}
