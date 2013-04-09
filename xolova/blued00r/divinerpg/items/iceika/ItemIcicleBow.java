package xolova.blued00r.divinerpg.items.iceika;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemIcicleBow extends ItemBow
{
    public ItemIcicleBow(int var1)
    {
        super(var1);
        this.setMaxDamage(10000);
        this.setCreativeTab(DivineRPG.tabRanged);
    }

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if ((float)var6 >= 20.0F)
            {
                return this.iconIndex + 3;
            }

            if ((float)var6 >= 15.0F)
            {
                return this.iconIndex + 2;
            }

            if ((float)var6 > 10.0F)
            {
                return this.iconIndex + 1;
            }

            if (var6 > 0)
            {
                return this.iconIndex;
            }
        }

        return this.iconIndex;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 24000;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("2 Ranged Damage");
        var3.add("3 Times Faster");

        if (var1.getMaxDamage() != -1)
        {
            var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
        }
        else
        {
            var3.add("Infinite Uses");
        }
    }
}
