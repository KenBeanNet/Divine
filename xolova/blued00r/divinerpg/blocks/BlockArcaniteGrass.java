package xolova.blued00r.divinerpg.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockArcaniteGrass extends Block
{
    public BlockArcaniteGrass(int var1)
    {
        super(var1, Material.grass);
        this.blockIndexInTexture = 54;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.arcaniteDirt.blockID;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 == 1 ? 53 : (var1 == 0 ? 54 : 55);
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        switch (var5)
        {
            case 0:
                return 54;

            case 1:
                return 53;

            default:
                return 55;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }

    private boolean isCropsNearby(World var1, int var2, int var3, int var4)
    {
        byte var5 = 0;

        for (int var6 = var2 - var5; var6 <= var2 + var5; ++var6)
        {
            for (int var7 = var4 - var5; var7 <= var4 + var5; ++var7)
            {
                int var8 = var1.getBlockId(var6, var3 + 1, var7);
                Block var9 = blocksList[var8];

                if (var9 instanceof IPlantable && this.canSustainPlant(var1, var2, var3, var4, ForgeDirection.UP, (IPlantable)var9))
                {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isWaterNearby(World var1, int var2, int var3, int var4)
    {
        for (int var5 = var2 - 4; var5 <= var2 + 4; ++var5)
        {
            for (int var6 = var3; var6 <= var3 + 1; ++var6)
            {
                for (int var7 = var4 - 4; var7 <= var4 + 4; ++var7)
                {
                    if (var1.getBlockId(var5, var6, var7) == DivineRPG.tarStill.blockID)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean canSustainPlant(World var1, int var2, int var3, int var4, ForgeDirection var5, IPlantable var6)
    {
        return true;
    }
}
