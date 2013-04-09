package xolova.blued00r.divinerpg.entities.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.misc.RecipesInfusionTable;

public class TileEntityInfusionTable extends TileEntity implements IInventory
{
    private ItemStack[] inventory = new ItemStack[3];
    private boolean decreaseable = false;
    private Item item0;
    private Item item1;
    private Item item2;

    /** the Block type that this TileEntity is contained within */
    private ContainerInfusionTable blockType;

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.inventory.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int var1)
    {
        return this.inventory[var1];
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        if (this.inventory[2] == null && this.inventory[0] != null && this.inventory[1] != null)
        {
            int var1 = this.inventory[0].getItem().itemID;
            int var2 = this.inventory[1].getItem().itemID;

            if (var1 != 0 && var2 != 0)
            {
                RecipesInfusionTable var3 = new RecipesInfusionTable();
                ItemStack var4 = RecipesInfusionTable.getResult(var1, var2);

                if (var4 != null && RecipesInfusionTable.getStackSize(var1, var2) <= this.inventory[0].stackSize)
                {
                    this.inventory[2] = var4;
                    this.decrStackSize(0, RecipesInfusionTable.getStackSize(var1, var2));
                    this.decrStackSize(1, 1);
                }
            }
        }

        super.updateEntity();
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (this.inventory[var1] != null)
        {
            ItemStack var3;

            if (this.inventory[var1].stackSize <= var2)
            {
                var3 = this.inventory[var1];
                this.inventory[var1] = null;
                return var3;
            }
            else
            {
                var3 = this.inventory[var1].splitStack(var2);

                if (this.inventory[var1].stackSize == 0)
                {
                    this.inventory[var1] = null;
                }

                return var3;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int var1)
    {
        return null;
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int var1, ItemStack var2)
    {
        this.inventory[var1] = var2;

        if (var2 != null && var2.stackSize > this.getInventoryStackLimit())
        {
            var2.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "TeInfusionTable";
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && var1.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) < 64.0D;
    }

    public Item getItem()
    {
        return this.item2;
    }

    public void openChest() {}

    public void closeChest() {}
}
