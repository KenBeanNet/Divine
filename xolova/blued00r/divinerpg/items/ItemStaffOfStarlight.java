package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityStarfall;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemStaffOfStarlight extends Item
{
    private Random rand;

    public ItemStaffOfStarlight(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.rand = new Random();
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        double var4 = var3.posX;
        double var6 = var3.posY + 1.62D - (double)var3.yOffset;
        double var8 = var3.posZ;

        if (!var2.isRemote && ArcanaList.get(var3.username).arcanaUse(40))
        {
            var2.playSoundAtEntity(var3, "xolovon.Starlight", 1.0F, 1.0F);
            var2.playSoundAtEntity(var3, "xolovon.Starlight", -1.0F, 1.0F);
            var2.playSoundAtEntity(var3, "xolovon.Starlight", 1.0F, -1.0F);
            var2.playSoundAtEntity(var3, "xolovon.Starlight", -1.0F, -1.0F);
            var3.getLook(1.0F);

            for (int var10 = 0; var10 < 10 + this.rand.nextInt(6); ++var10)
            {
                var2.spawnEntityInWorld(new EntityStarfall(var2, var4, var6 + 25.0D, var8));
            }
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("40 Arcana");
        var3.add("Drops several stars from the sky");
        var3.add("40 Ranged Damage Each");
    }
}
