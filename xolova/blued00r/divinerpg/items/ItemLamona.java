package xolova.blued00r.divinerpg.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityLamona;

public class ItemLamona extends Item
{
    public ItemLamona(int var1)
    {
        super(var1);
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setIconCoord(6, 7);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var3.capabilities.isCreativeMode)
        {
            --var1.stackSize;
        }

        var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!var2.isRemote)
        {
            var2.spawnEntityInWorld(new EntityLamona(var2, var3));
        }

        return var1;
    }
}
