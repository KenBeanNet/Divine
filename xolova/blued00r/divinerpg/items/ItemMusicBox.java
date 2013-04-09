package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class ItemMusicBox extends Item
{
    private int firetick;
    private int firetick2;
    private int firetick3;
    private int firemax = 904;
    private int snowmax = 5860;
    private int mushroommax = 285;
    private int oceanmax = 705;
    private int junglemax = 6724;
    private int desertmax = 265;
    private int hellmax = 265;
    private int endmax = 383;
    private int swampmax = 382;
    private int dravitemax = 324;
    private int azuritemax = 406;
    private int uvitemax = 265;
    private int mythrilmax = 2882;
    private int augitemax = 3242;
    public boolean hasPlayedForest = false;

    public ItemMusicBox(int var1)
    {
        super(var1);
    }

    /**
     * Called when item is crafted/smelted. Used only by maps so far.
     */
    public void onCreated(ItemStack var1, World var2, EntityPlayer var3) {}

    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
    {
        BiomeGenBase var6 = var2.getBiomeGenForCoords(MathHelper.floor_double(var3.posX), MathHelper.floor_double(var3.posZ));

        if (this.firetick == this.firemax && this.firemax != 0)
        {
            if (var6 == BiomeGenBase.forest)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            if (var6 == BiomeGenBase.river)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            if (var6 == BiomeGenBase.extremeHills)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            if (var6 == BiomeGenBase.extremeHillsEdge)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            if (var6 == BiomeGenBase.plains)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            if (var6 == BiomeGenBase.forestHills)
            {
                var2.playSoundAtEntity(var3, "biomemusic.Grass", 0.4F, 1.0F);
            }

            this.firetick = 0;
        }
        else
        {
            ++this.firetick;
            ++this.firetick2;
            ++this.firetick3;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
