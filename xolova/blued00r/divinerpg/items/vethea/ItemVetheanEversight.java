package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityEversightProjectile;

public class ItemVetheanEversight extends ItemVetheanCannon
{
    public ItemVetheanEversight(int var1, int var2, String var3)
    {
        super(var1, var2, var3);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && (var3.capabilities.isCreativeMode || var3.inventory.consumeInventoryItem(DivineRPG.acidfire.itemID)))
        {
            var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityEversightProjectile(var2, var3, this.damage));
        }

        return var1;
    }
}
