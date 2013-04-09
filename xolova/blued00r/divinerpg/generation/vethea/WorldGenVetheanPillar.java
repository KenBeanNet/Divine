package xolova.blued00r.divinerpg.generation.vethea;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class WorldGenVetheanPillar extends WorldGenerator
{
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = this.getSize(var1, var3, var4, var5);
        int var7 = var2.nextInt(4) + 3;

        for (int var8 = 0; var8 < var6; ++var8)
        {
            this.placeBlockCircle(var1, var3, var8 + var4, var5, Math.abs(var6 / 2 - var8) / 5 + var7);
        }

        return true;
    }

    int getSize(World var1, int var2, int var3, int var4)
    {
        int var5 = var3;
        int var6 = 0;

        if (!var1.isAirBlock(var2, var3, var4))
        {
            while (!var1.isAirBlock(var2, var5, var4))
            {
                ++var5;
            }
        }
        else
        {
            while (var1.isAirBlock(var2, var5, var4) && var1.isAirBlock(var2, var5 - 1, var4))
            {
                --var5;
            }
        }

        while (var1.isAirBlock(var2, var5, var4))
        {
            ++var5;
            ++var6;
        }

        return var6;
    }

    void placeBlockCircle(World var1, int var2, int var3, int var4, int var5)
    {
        for (float var6 = 0.0F; var6 < (float)var5; var6 = (float)((double)var6 + 0.5D))
        {
            for (float var7 = 0.0F; (double)var7 < (Math.PI * 2D) * (double)var6; var7 = (float)((double)var7 + 0.5D))
            {
                this.setBlock(var1, (int)Math.floor((double)var2 + Math.sin((double)var7) * (double)var6), var3, (int)Math.floor((double)var4 + Math.cos((double)var7) * (double)var6), DivineRPG.dreamstone.blockID);
            }
        }
    }
}
