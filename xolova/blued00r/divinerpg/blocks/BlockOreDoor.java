package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockOreDoor extends BlockDoor
{
    public BlockOreDoor(int var1, Material var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = 145;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (var5 != 0 && var5 != 1)
        {
            int var6 = this.getFullMetadata(var1, var2, var3, var4);
            int var7 = this.blockIndexInTexture;

            if ((var6 & 8) != 0)
            {
                --var7;
            }

            int var8 = var6 & 3;
            boolean var9 = (var6 & 4) != 0;

            if (var9)
            {
                if (var8 == 0 && var5 == 2)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && var5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && var5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && var5 == 4)
                {
                    var7 = -var7;
                }
            }
            else
            {
                if (var8 == 0 && var5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && var5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && var5 == 4)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && var5 == 2)
                {
                    var7 = -var7;
                }

                if ((var6 & 16) != 0)
                {
                    var7 = -var7;
                }
            }

            return var7;
        }
        else
        {
            return this.blockIndexInTexture;
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else if (this.blockMaterial == Material.wood)
        {
            ItemStack var10 = var5.inventory.getCurrentItem();

            if (var10 == null)
            {
                return true;
            }
            else if (var10.itemID == DivineRPG.key2.itemID)
            {
                if (!var5.capabilities.isCreativeMode && --var10.stackSize <= 0)
                {
                    var5.inventory.setInventorySlotContents(var5.inventory.currentItem, (ItemStack)null);
                }

                int var11 = this.getFullMetadata(var1, var2, var3, var4);
                int var12 = var11 & 7;
                var12 ^= 4;

                if ((var11 & 8) == 0)
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, var12);
                    var1.markBlockRangeForRenderUpdate(var2, var3, var4, var2, var3, var4);
                }
                else
                {
                    var1.setBlockMetadataWithNotify(var2, var3 - 1, var4, var12);
                    var1.markBlockRangeForRenderUpdate(var2, var3 - 1, var4, var2, var3, var4);
                }

                var1.playAuxSFXAtEntity(var5, 1003, var2, var3, var4, 0);
                return true;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * A function to open a door.
     */
    public void onPoweredBlockChange(World var1, int var2, int var3, int var4, boolean var5)
    {
        int var6 = this.getFullMetadata(var1, var2, var3, var4);
        boolean var7 = (var6 & 4) != 0;

        if (var7 != var5)
        {
            ;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
