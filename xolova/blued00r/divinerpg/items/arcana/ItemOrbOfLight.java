package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemOrbOfLight extends Item
{
    public ItemOrbOfLight(int var1)
    {
        super(var1);
    }

    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack var1, World var2, Entity var3, int var4, boolean var5)
    {
        if (var3 instanceof EntityPlayerMP && (var2.getBlockMaterial((int)var3.posX, (int)var3.posY, (int)var3.posZ) == Material.air || var2.getBlockId((int)var3.posX, (int)var3.posY, (int)var3.posZ) == DivineRPG.blockOfLight.blockID))
        {
            var2.setBlock((int)var3.posX, (int)var3.posY, (int)var3.posZ, DivineRPG.blockOfLight.blockID);
        }
    }
}
