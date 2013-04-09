package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemArcanaMusicBox extends Item
{
    private int firetick;
    private int firetick2;
    private int firetick3;
    private int firemax;
    private int arcanamax = 1260;
    public boolean hasPlayedForest = false;

    public ItemArcanaMusicBox(int var1)
    {
        super(var1);
    }

    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
    {
        BiomeGenBase var6 = var2.getBiomeGenForCoords(MathHelper.floor_double(var3.posX), MathHelper.floor_double(var3.posZ));

        if (this.firetick == this.arcanamax && this.arcanamax != 0)
        {
            if (var6 == DivineRPG.arcanaBiome)
            {
                var2.playSoundAtEntity(var3, "ambient.Arcana", 0.4F, 1.0F);
            }

            this.firetick = 0;
        }
        else
        {
            ++this.firetick;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
