package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemCostumeSanta extends ItemCostume
{
    public ItemCostumeSanta(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Full set: Massive Buff in Iceika");
        var3.add("Iceika: Speeds up player");
        var3.add("Iceika: Adds 6 Melee Damage");
        var3.add("Iceika: Refils Hunger");
        var3.add("Iceika: 80% Damage Reduction");
    }
}
