package xolova.blued00r.divinerpg.containers;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

class SlotBrewingStandIngredient extends Slot
{
    final ContainerCondenser brewingStand;

    public SlotBrewingStandIngredient(ContainerCondenser var1, IInventory var2, int var3, int var4, int var5)
    {
        super(var2, var3, var4, var5);
        this.brewingStand = var1;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack var1)
    {
        return var1 != null ? var1.itemID == DivineRPG.veiloItem.itemID : false;
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    public int getSlotStackLimit()
    {
        return 64;
    }
}
