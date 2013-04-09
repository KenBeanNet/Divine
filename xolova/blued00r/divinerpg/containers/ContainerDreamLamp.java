package xolova.blued00r.divinerpg.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;

public class ContainerDreamLamp extends Container
{
    private TileEntityDreamLamp tile_entity;

    public ContainerDreamLamp(InventoryPlayer var1, TileEntityDreamLamp var2)
    {
        this.tile_entity = var2;
        this.addSlotToContainer(new Slot(this.tile_entity, 0, 80, 47));
        this.bindPlayerInventory(var1);
    }

    public void bindPlayerInventory(InventoryPlayer var1)
    {
        int var2;

        for (var2 = 0; var2 < 3; ++var2)
        {
            for (int var3 = 0; var3 < 9; ++var3)
            {
                this.addSlotToContainer(new Slot(var1, var3 + var2 * 9 + 9, 8 + var3 * 18, 84 + var2 * 18));
            }
        }

        for (var2 = 0; var2 < 9; ++var2)
        {
            this.addSlotToContainer(new Slot(var1, var2, 8 + var2 * 18, 142));
        }
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer var1, int var2)
    {
        ItemStack var3 = null;
        Slot var4 = (Slot)this.inventorySlots.get(var2);

        if (var4 != null && var4.getHasStack())
        {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();

            if (var2 != 0 && var2 != 1)
            {
                if (!this.mergeItemStack(var5, 0, 1, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(var5, 1, this.inventorySlots.size(), true))
            {
                return null;
            }

            if (var2 == 2)
            {
                return null;
            }

            if (var5.stackSize == 0)
            {
                var4.putStack((ItemStack)null);
            }
            else
            {
                var4.onSlotChanged();
            }
        }

        return var3;
    }

    public boolean canInteractWith(EntityPlayer var1)
    {
        return true;
    }
}
