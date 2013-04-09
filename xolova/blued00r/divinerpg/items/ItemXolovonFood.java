package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemXolovonFood extends ItemFood
{
    public ItemXolovonFood(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Replenishes " + ((ItemFood)var1.getItem()).getHealAmount() + " Hunger");
        var3.add(((ItemFood)var1.getItem()).getSaturationModifier() + " Saturation");
        var3.add("Pet Food: " + ((ItemFood)var1.getItem()).isWolfsFavoriteMeat());
    }
}
