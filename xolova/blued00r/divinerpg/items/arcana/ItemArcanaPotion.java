package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemArcanaPotion extends Item
{
    public ItemArcanaPotion(int var1)
    {
        super(var1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (ArcanaList.get(var3.username).getBarValue() < 200.0F && var1.itemID == DivineRPG.weakArcanaPotion.itemID)
        {
            ArcanaList.get(var3.username).arcanaAdd(100);
            var3.addStat(AchievementPageDivineRPG.yuk, 1);
            --var1.stackSize;
        }

        if (ArcanaList.get(var3.username).getBarValue() < 200.0F && var1.itemID == DivineRPG.strongArcanaPotion.itemID)
        {
            ArcanaList.get(var3.username).arcanaAdd(200);
            var3.addStat(AchievementPageDivineRPG.yuk, 1);
            --var1.stackSize;
        }

        return var1;
    }
}
