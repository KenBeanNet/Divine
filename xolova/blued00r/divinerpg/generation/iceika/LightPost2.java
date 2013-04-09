package xolova.blued00r.divinerpg.generation.iceika;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class LightPost2 extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[0];
    }

    public boolean LocationIsValidSpawn(World var1, int var2, int var3, int var4)
    {
        int var5 = 0;

        for (int var6 = var1.getBlockId(var2, var3, var4); var6 != 0; var6 = var1.getBlockId(var2, var3 + var5, var4))
        {
            ++var5;
        }

        if (var5 > 3)
        {
            return false;
        }
        else
        {
            var3 += var5 - 1;
            int var7 = var1.getBlockId(var2, var3, var4);
            int var8 = var1.getBlockId(var2, var3 + 1, var4);
            int var9 = var1.getBlockId(var2, var3 - 1, var4);
            int[] var10 = this.GetValidSpawnBlocks();
            int var11 = var10.length;

            for (int var12 = 0; var12 < var11; ++var12)
            {
                int var13 = var10[var12];

                if (var8 != 0)
                {
                    return false;
                }

                if (var7 == var13)
                {
                    return true;
                }

                if (var7 == Block.snow.blockID && var9 == var13)
                {
                    return true;
                }
            }

            return false;
        }
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        if (this.LocationIsValidSpawn(var1, var3, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 0, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 0, var4, var5 + 2) && this.LocationIsValidSpawn(var1, var3, var4, var5 + 2))
        {
            var1.setBlock(var3 + 0, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 1, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 2, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 3, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 4, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 4, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 4, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 5, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 5, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 6, var5 + 0, DivineRPG.workshopLamp.blockID);
            var1.setBlock(var3 + 0, var4 + 6, var5 + 2, DivineRPG.workshopLamp.blockID);
            return true;
        }
        else
        {
            return false;
        }
    }
}
