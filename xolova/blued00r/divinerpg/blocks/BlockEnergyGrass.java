package xolova.blued00r.divinerpg.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockEnergyGrass extends Block
{
    public BlockEnergyGrass(int var1)
    {
        super(var1, Material.grass);
        this.blockIndexInTexture = 135;
        this.setTickRandomly(true);
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        switch (var1)
        {
            case 0:
                return 134;

            case 1:
                return 118;

            default:
                return 135;
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            if (var1.getBlockLightValue(var2, var3 + 1, var4) < 4 && Block.lightOpacity[var1.getBlockId(var2, var3 + 1, var4)] > 2)
            {
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.energyDirt.blockID);
            }
            else if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = var2 + var5.nextInt(3) - 1;
                    int var8 = var3 + var5.nextInt(5) - 3;
                    int var9 = var4 + var5.nextInt(3) - 1;
                    int var10 = var1.getBlockId(var7, var8 + 1, var9);

                    if (var1.getBlockId(var7, var8, var9) == DivineRPG.energyDirt.blockID && var1.getBlockLightValue(var7, var8 + 1, var9) >= 4 && Block.lightOpacity[var10] <= 2)
                    {
                        var1.setBlockWithNotify(var7, var8, var9, DivineRPG.energyGrass.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.energyDirt.blockID;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    public int idDropped(int var1)
    {
        return DivineRPG.energyDirt.blockID;
    }
}
