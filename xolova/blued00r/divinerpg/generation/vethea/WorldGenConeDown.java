package xolova.blued00r.divinerpg.generation.vethea;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenConeDown extends WorldGenerator
{
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = var2.nextInt(4) + 3;

        for (int var7 = 0; var7 < var6; ++var7)
        {
            this.placeBlockCircle(var1, var3, var4 - var7, var5, var6 - var7);
        }

        return true;
    }

    void placeBlockCircle(World var1, int var2, int var3, int var4, int var5)
    {
        for (int var6 = 0; var6 < var5; ++var6)
        {
            for (float var7 = 0.0F; (double)var7 < (Math.PI * 2D) * (double)var6; var7 = (float)((double)var7 + 0.5D))
            {
                this.setBlock(var1, (int)Math.floor((double)var2 + Math.sin((double)var7) * (double)var6), var3, (int)Math.floor((double)var4 + Math.cos((double)var7) * (double)var6), Block.obsidian.blockID);
            }
        }
    }
}
