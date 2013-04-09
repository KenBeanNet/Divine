package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;
import net.minecraft.world.World;

public class BlockDreamglow extends BlockVetheaPlant
{
    public BlockDreamglow(int var1, int var2)
    {
        super(var1, var2);
        float var3 = 0.2F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
        this.setTickRandomly(true);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (var5.nextInt(25) == 0)
        {
            byte var6 = 4;
            int var7 = 5;
            int var8;
            int var9;
            int var10;

            for (var8 = var2 - var6; var8 <= var2 + var6; ++var8)
            {
                for (var9 = var4 - var6; var9 <= var4 + var6; ++var9)
                {
                    for (var10 = var3 - 1; var10 <= var3 + 1; ++var10)
                    {
                        if (var1.getBlockId(var8, var10, var9) == this.blockID)
                        {
                            --var7;

                            if (var7 <= 0)
                            {
                                return;
                            }
                        }
                    }
                }
            }

            var8 = var2 + var5.nextInt(3) - 1;
            var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var10 = var4 + var5.nextInt(3) - 1;

            for (int var11 = 0; var11 < 4; ++var11)
            {
                if (var1.isAirBlock(var8, var9, var10) && this.canBlockStay(var1, var8, var9, var10))
                {
                    var2 = var8;
                    var3 = var9;
                    var4 = var10;
                }

                var8 = var2 + var5.nextInt(3) - 1;
                var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
                var10 = var4 + var5.nextInt(3) - 1;
            }

            if (var1.isAirBlock(var8, var9, var10) && this.canBlockStay(var1, var8, var9, var10))
            {
                var1.setBlockWithNotify(var8, var9, var10, this.blockID);
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return super.canPlaceBlockAt(var1, var2, var3, var4) && this.canBlockStay(var1, var2, var3, var4);
    }

    protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return false;
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World var1, int var2, int var3, int var4)
    {
        return true;
    }
}
