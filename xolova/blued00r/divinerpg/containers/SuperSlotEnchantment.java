package xolova.blued00r.divinerpg.containers;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SuperSlotEnchantment extends Slot
{
    final ContainerSuperEnchant container;

    public SuperSlotEnchantment(ContainerSuperEnchant var1, IInventory var2, int var3, int var4, int var5)
    {
        super(var2, var3, var4, var5);
        this.container = var1;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack var1)
    {
        return true;
    }
}
