package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVetheanHealingFood extends ItemFood
{
    private int healthGain;

    public ItemVetheanHealingFood(int var1, int var2, float var3, boolean var4, int var5)
    {
        super(var1, var2, var3, var4);
        this.healthGain = var5;
        this.setAlwaysEdible();
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 16;
    }

    public ItemStack onFoodEaten(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setEntityHealth(var3.getHealth() + this.healthGain);
        return var1;
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Replenishes " + this.healthGain + " Health");
        var3.add(((ItemFood)var1.getItem()).getSaturationModifier() + " Saturation");
        var3.add("Pet Food: " + ((ItemFood)var1.getItem()).isWolfsFavoriteMeat());
        var3.add("\u00a72Vethean");
    }
}
