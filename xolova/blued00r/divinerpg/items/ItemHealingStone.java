package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemHealingStone extends Item
{
    public ItemHealingStone(int var1)
    {
        super(var1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (var3.getHealth() + 20 > 20)
        {
            var2.playSoundAtEntity(var3, "xolovon.HealingStone", 1.0F, 1.0F);
            var3.setEntityHealth(20);
            var3.inventory.consumeInventoryItem(DivineRPG.healingStone.itemID);
        }
        else
        {
            var3.setEntityHealth(var3.getHealth() + 20);
        }

        return var1;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }
}
