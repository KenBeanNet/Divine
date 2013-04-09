package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemDreamPowder extends Item
{
    public ItemDreamPowder(int var1)
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
        if (var7 != 1)
        {
            return false;
        }
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            int var12 = DivineRPG.denseBlock.blockID;

            if (var11 == var12 && var3.isAirBlock(var4, var5 + 1, var6))
            {
                if (var3.getBlockId(var4, var5, var6) == var12 && var3.getBlockId(var4, var5 + 4, var6) == var12 && var3.getBlockId(var4, var5 + 3, var6 - 1) == var12 && var3.getBlockId(var4, var5 + 3, var6 + 1) == var12 && var3.getBlockId(var4, var5 + 2, var6 - 2) == var12 && var3.getBlockId(var4, var5 + 2, var6 + 2) == var12 && var3.getBlockId(var4, var5 + 1, var6 - 1) == var12 && var3.getBlockId(var4, var5 + 1, var6 + 1) == var12)
                {
                    var3.setBlock(var4, var5 + 1, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 2, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 3, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 2, var6 + 1, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 2, var6 - 1, DivineRPG.vetheaPortal.blockID);
                    return true;
                }
                else if (var3.getBlockId(var4, var5, var6) == var12 && var3.getBlockId(var4, var5 + 4, var6) == var12 && var3.getBlockId(var4 - 1, var5 + 3, var6) == var12 && var3.getBlockId(var4 + 1, var5 + 3, var6) == var12 && var3.getBlockId(var4 - 2, var5 + 2, var6) == var12 && var3.getBlockId(var4 + 2, var5 + 2, var6) == var12 && var3.getBlockId(var4 - 1, var5 + 1, var6) == var12 && var3.getBlockId(var4 + 1, var5 + 1, var6) == var12)
                {
                    var3.setBlock(var4, var5 + 1, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 2, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4, var5 + 3, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4 + 1, var5 + 2, var6, DivineRPG.vetheaPortal.blockID);
                    var3.setBlock(var4 - 1, var5 + 2, var6, DivineRPG.vetheaPortal.blockID);
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
