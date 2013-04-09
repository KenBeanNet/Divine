package xolova.blued00r.divinerpg.entities.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.blocks.BlockDreamLamp;
import xolova.blued00r.divinerpg.client.gui.GuiDreamLamp;

public class TileEntityDreamLamp extends TileEntity implements IInventory
{
    private ItemStack[] inventory = new ItemStack[1];
    private BlockDreamLamp dreamlamp;
    private GuiDreamLamp gui;
    public int coalDuration;
    private int ingredientID;

    public TileEntityDreamLamp(BlockDreamLamp var1)
    {
        this.dreamlamp = var1;
    }

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
        if (this.coalDuration > 0)
        {
            --this.coalDuration;
            BlockDreamLamp var10000 = this.dreamlamp;
            BlockDreamLamp.updateFurnaceBlockState(this.coalDuration > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);

            if (this.coalDuration == 0)
            {
                this.dreamlamp.setLightValue(0.0F);
                this.onInventoryChanged();
            }
        }
        else if (this.shouldLight())
        {
            this.coalDuration = 6000;
        }

        super.updateEntity();
    }

    public boolean shouldLight()
    {
        if (this.inventory[0] != null && this.inventory[0].stackSize > 0)
        {
            ItemStack var1 = this.inventory[0];

            if (Item.itemsList[var1.itemID] != DivineRPG.acidfire)
            {
                return false;
            }
            else
            {
                this.decrStackSize(0, 1);
                return true;
            }
        }
        else
        {
            return false;
        }
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

    public boolean isBurning()
    {
        return this.coalDuration > 0;
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
        return "DreamLamp";
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

    public void openChest() {}

    public void closeChest() {}
}
