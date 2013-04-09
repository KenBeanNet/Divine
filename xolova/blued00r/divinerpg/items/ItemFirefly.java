package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityFirefly;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemFirefly extends Item
{
    public ItemFirefly(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && ArcanaList.get(var3.username).arcanaUse(5))
        {
            var2.playSoundAtEntity(var3, "xolovon.Firefly", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            var2.spawnEntityInWorld(new EntityFirefly(var2, var3));
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("5 Arcana");
        var3.add("Homing Shots");
        var3.add("10 Ranged Damage");
    }
}
