package xolova.blued00r.divinerpg.containers;

import net.minecraft.inventory.InventoryBasic;

public class SuperSlotEnchantmentTable extends InventoryBasic
{
    final ContainerSuperEnchant container;

    public SuperSlotEnchantmentTable(ContainerSuperEnchant var1, String var2, int var3)
    {
        super(var2, var3);
        this.container = var1;
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 1;
    }

    /**
     * Called when an the contents of an Inventory change, usually
     */
    public void onInventoryChanged()
    {
        super.onInventoryChanged();
        this.container.onCraftMatrixChanged(this);
    }
}
