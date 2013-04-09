package xolova.blued00r.divinerpg.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotBrewingStandPotion extends Slot
{
    private EntityPlayer player;

    public SlotBrewingStandPotion(EntityPlayer var1, IInventory var2, int var3, int var4, int var5)
    {
        super(var2, var3, var4, var5);
        this.player = var1;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack var1)
    {
        return canHoldPotion(var1);
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    public int getSlotStackLimit()
    {
        return 1;
    }

    public void onPickupFromSlot(EntityPlayer var1, ItemStack var2)
    {
        super.onPickupFromSlot(var1, var2);
    }

    public static boolean canHoldPotion(ItemStack var0)
    {
        return var0 != null && var0.itemID == Item.glassBottle.itemID;
    }
}
