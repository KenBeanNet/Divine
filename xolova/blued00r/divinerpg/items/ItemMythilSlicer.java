package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityMythrilSlicer;

public class ItemMythilSlicer extends Item
{
    public ItemMythilSlicer(int var1)
    {
        super(var1);
        this.maxStackSize = 64;
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
            var2.spawnEntityInWorld(new EntityMythrilSlicer(var2, var3));
        }

        return var1;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("28 Ranged Damage");
    }
}
