package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemPinFly extends ItemFood
{
    public ItemPinFly(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
        this.setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F);
    }
}
