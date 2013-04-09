package xolova.blued00r.divinerpg.generation.vethea;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenConeUp extends WorldGenerator
{
    private final int block;
    private final float width;
    private int height;

    public WorldGenConeUp(int var1, float var2)
    {
        this.block = var1;
        this.width = var2;
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = var2.nextInt(4) + this.height;

        for (int var7 = 0; var7 < var6; ++var7)
        {
            this.placeBlockCircle(var1, var3, var4 + var7, var5, var6 - var7);
        }

        return true;
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5, int var6)
    {
        this.height = var6;
        return this.generate(var1, var2, var3, var4, var5);
    }

    void placeBlockCircle(World var1, int var2, int var3, int var4, int var5)
    {
        for (float var6 = 0.0F; var6 < (float)var5 * this.width; var6 = (float)((double)var6 + 0.5D))
        {
            for (float var7 = 0.0F; (double)var7 < (Math.PI * 2D) * (double)var6; var7 = (float)((double)var7 + 0.5D))
            {
                this.setBlock(var1, (int)Math.round((double)var2 + Math.sin((double)var7) * (double)var6), var3, (int)Math.round((double)var4 + Math.cos((double)var7) * (double)var6), this.block);
            }
        }
    }
}
