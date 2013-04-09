package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAquaMarine extends Item
{
    public ItemAquaMarine(int var1)
    {
        super(var1);
        this.setMaxDamage(10);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var3.isRemote && var3.isAirBlock(var4, var5 + 1, var6))
        {
            var3.setBlockWithNotify(var4, var5 + 1, var6, Block.waterStill.blockID);
            var1.damageItem(1, var2);
            return true;
        }
        else
        {
            return false;
        }
    }
}
