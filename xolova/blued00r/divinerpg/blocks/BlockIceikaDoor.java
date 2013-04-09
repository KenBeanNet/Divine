package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockIceikaDoor extends BlockDoor
{
    public BlockIceikaDoor(int var1, Material var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = 219;
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

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
