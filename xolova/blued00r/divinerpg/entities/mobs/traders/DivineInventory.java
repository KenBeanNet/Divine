package xolova.blued00r.divinerpg.entities.mobs.traders;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryMerchant;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class DivineInventory extends InventoryMerchant implements IInventory
{
    private final IMerchant theMerchant;
    private final EntityPlayer thePlayer;
    private ItemStack[] theInventory;
    private MerchantRecipe currentRecipe;
    private int currentRecipeIndex;

    public DivineInventory(EntityPlayer var1, IMerchant var2, int var3)
    {
        super(var1, var2);
        this.theInventory = new ItemStack[var3];
        this.thePlayer = var1;
        this.theMerchant = var2;
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.theInventory.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int var1)
    {
        return this.theInventory[var1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (this.theInventory[var1] != null)
        {
            ItemStack var3;

            if (var1 == 2)
            {
                var3 = this.theInventory[var1];
                this.theInventory[var1] = null;
                return var3;
            }
            else if (this.theInventory[var1].stackSize <= var2)
            {
                var3 = this.theInventory[var1];
                this.theInventory[var1] = null;

                if (this.inventoryResetNeededOnSlotChange(var1))
                {
                    this.resetRecipeAndSlots();
                }

                return var3;
            }
            else
            {
                var3 = this.theInventory[var1].splitStack(var2);

                if (this.theInventory[var1].stackSize == 0)
                {
                    this.theInventory[var1] = null;
                }

                if (this.inventoryResetNeededOnSlotChange(var1))
                {
                    this.resetRecipeAndSlots();
                }

                return var3;
            }
        }
        else
        {
            return null;
        }
    }

    private boolean inventoryResetNeededOnSlotChange(int var1)
    {
        return var1 == 0 || var1 == 1;
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int var1)
    {
        if (this.theInventory[var1] != null)
        {
            ItemStack var2 = this.theInventory[var1];
            this.theInventory[var1] = null;
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
        this.theInventory[var1] = var2;

        if (var2 != null && var2.stackSize > this.getInventoryStackLimit())
        {
            var2.stackSize = this.getInventoryStackLimit();
        }

        if (this.inventoryResetNeededOnSlotChange(var1))
        {
            this.resetRecipeAndSlots();
        }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "mob.villager";
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
        return this.theMerchant.getCustomer() == var1;
    }

    public void openChest() {}

    public void closeChest() {}

    /**
     * Called when an the contents of an Inventory change, usually
     */
    public void onInventoryChanged()
    {
        this.resetRecipeAndSlots();
    }

    public void resetRecipeAndSlots()
    {
        this.currentRecipe = null;
        ItemStack var1 = this.theInventory[0];
        ItemStack var2 = this.theInventory[1];

        if (var1 == null)
        {
            var1 = var2;
            var2 = null;
        }

        if (var1 == null)
        {
            this.setInventorySlotContents(2, (ItemStack)null);
        }
        else
        {
            MerchantRecipeList var3 = this.theMerchant.getRecipes(this.thePlayer);

            if (var3 != null)
            {
                MerchantRecipe var4 = var3.canRecipeBeUsed(var1, var2, this.currentRecipeIndex);

                if (var4 != null && !var4.func_82784_g())
                {
                    this.currentRecipe = var4;
                    this.setInventorySlotContents(2, var4.getItemToSell().copy());
                }
                else if (var2 != null)
                {
                    var4 = var3.canRecipeBeUsed(var2, var1, this.currentRecipeIndex);

                    if (var4 != null && !var4.func_82784_g())
                    {
                        this.currentRecipe = var4;
                        this.setInventorySlotContents(2, var4.getItemToSell().copy());
                    }
                    else
                    {
                        this.setInventorySlotContents(2, (ItemStack)null);
                    }
                }
                else
                {
                    this.setInventorySlotContents(2, (ItemStack)null);
                }
            }
        }
    }

    public MerchantRecipe getCurrentRecipe()
    {
        return this.currentRecipe;
    }

    public void setCurrentRecipeIndex(int var1)
    {
        this.currentRecipeIndex = var1;
        this.resetRecipeAndSlots();
    }
}
