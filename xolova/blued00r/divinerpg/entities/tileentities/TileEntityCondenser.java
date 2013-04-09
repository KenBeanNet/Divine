package xolova.blued00r.divinerpg.entities.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ISidedInventory;
import xolova.blued00r.divinerpg.DivineRPG;

public class TileEntityCondenser extends TileEntity implements IInventory, ISidedInventory
{
    private ItemStack[] brewingItemStacks = new ItemStack[3];
    private int brewTime;
    private int filledSlots;
    private int ingredientID;

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "container.brewing";
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.brewingItemStacks.length;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        if (this.brewTime > 0)
        {
            --this.brewTime;

            if (this.brewTime == 0)
            {
                this.smeltItem();
                this.onInventoryChanged();
            }
            else if (!this.canSmelt())
            {
                this.brewTime = 0;
                this.onInventoryChanged();
            }
            else if (this.ingredientID != this.brewingItemStacks[3].itemID)
            {
                this.brewTime = 0;
                this.onInventoryChanged();
            }
        }
        else if (this.canSmelt())
        {
            this.brewTime = 400;
            this.ingredientID = this.brewingItemStacks[3].itemID;
        }

        int var1 = this.getFilledSlots();

        if (var1 != this.filledSlots)
        {
            this.filledSlots = var1;
            this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, var1);
        }

        super.updateEntity();
    }

    public int getBrewTime()
    {
        return this.brewTime;
    }

    private boolean canSmelt()
    {
        if (this.brewingItemStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.brewingItemStacks[0]);

            if (var1 == null)
            {
                return false;
            }
            else if (this.brewingItemStacks[2] == null)
            {
                return true;
            }
            else if (!this.brewingItemStacks[2].isItemEqual(var1))
            {
                return false;
            }
            else
            {
                int var2 = this.brewingItemStacks[2].stackSize + var1.stackSize;
                return var2 <= this.getInventoryStackLimit() && var2 <= var1.getMaxStackSize();
            }
        }
    }

    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.brewingItemStacks[0]);

            if (this.brewingItemStacks[2] == null)
            {
                this.brewingItemStacks[2] = var1.copy();
            }
            else if (this.brewingItemStacks[2].isItemEqual(var1))
            {
                this.brewingItemStacks[2].stackSize += var1.stackSize;
            }

            --this.brewingItemStacks[0].stackSize;

            if (this.brewingItemStacks[0].stackSize <= 0)
            {
                this.brewingItemStacks[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack var0)
    {
        if (var0 == null)
        {
            return 0;
        }
        else
        {
            int var1 = var0.getItem().itemID;
            Item var2 = var0.getItem();
            return var1 == DivineRPG.veiloItem.itemID ? 40 : GameRegistry.getFuelValue(var0);
        }
    }

    public static boolean isItemFuel(ItemStack var0)
    {
        return getItemBurnTime(var0) > 0;
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        NBTTagList var2 = var1.getTagList("Items");
        this.brewingItemStacks = new ItemStack[this.getSizeInventory()];

        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
            byte var5 = var4.getByte("Slot");

            if (var5 >= 0 && var5 < this.brewingItemStacks.length)
            {
                this.brewingItemStacks[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }

        this.brewTime = var1.getShort("BrewTime");
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
        var1.setShort("BrewTime", (short)this.brewTime);
        NBTTagList var2 = new NBTTagList();

        for (int var3 = 0; var3 < this.brewingItemStacks.length; ++var3)
        {
            if (this.brewingItemStacks[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.brewingItemStacks[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }

        var1.setTag("Items", var2);
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int var1)
    {
        return var1 >= 0 && var1 < this.brewingItemStacks.length ? this.brewingItemStacks[var1] : null;
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (var1 >= 0 && var1 < this.brewingItemStacks.length)
        {
            ItemStack var3 = this.brewingItemStacks[var1];
            this.brewingItemStacks[var1] = null;
            return var3;
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
        if (var1 >= 0 && var1 < this.brewingItemStacks.length)
        {
            ItemStack var2 = this.brewingItemStacks[var1];
            this.brewingItemStacks[var1] = null;
            return var2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int var1, ItemStack var2)
    {
        if (var1 >= 0 && var1 < this.brewingItemStacks.length)
        {
            this.brewingItemStacks[var1] = var2;
        }
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
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : var1.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    @SideOnly(Side.CLIENT)
    public void setBrewTime(int var1)
    {
        this.brewTime = var1;
    }

    public int getFilledSlots()
    {
        int var1 = 0;

        for (int var2 = 0; var2 < 3; ++var2)
        {
            if (this.brewingItemStacks[var2] != null)
            {
                var1 |= 1 << var2;
            }
        }

        return var1;
    }

    public int getStartInventorySide(ForgeDirection var1)
    {
        return var1 == ForgeDirection.UP ? 3 : 0;
    }

    public int getSizeInventorySide(ForgeDirection var1)
    {
        return var1 == ForgeDirection.UP ? 1 : 3;
    }
}
