package xolova.blued00r.divinerpg.items;

import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemTeleporter extends Item
{
    protected Random rand = new Random();
    public double lastX;
    public double lastY;
    public double lastZ;

    public ItemTeleporter(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var3.isRemote)
        {
            ;
        }

        return true;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
