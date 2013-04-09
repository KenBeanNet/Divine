package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityZoragonBomb;

public class BlockHelioticBeam extends Block
{
    public BlockHelioticBeam(int var1)
    {
        super(var1, Material.rock);
        this.blockIndexInTexture = 77;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        byte var7 = 4;
        int var8 = var7 + 1;

        if (var1.checkChunksExist(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8))
        {
            for (int var9 = -var7; var9 <= var7; ++var9)
            {
                for (int var10 = -var7; var10 <= var7; ++var10)
                {
                    for (int var11 = -var7; var11 <= var7; ++var11)
                    {
                        int var12 = var1.getBlockId(var2 + var9, var3 + var10, var4 + var11);

                        if (Block.blocksList[var12] != null)
                        {
                            Block.blocksList[var12].beginLeavesDecay(var1, var2 + var9, var3 + var10, var4 + var11);
                        }
                    }
                }
            }
        }
    }

    public void dispense(World var1, int var2, int var3, int var4)
    {
        double var5 = (double)var2;
        double var7 = (double)var3;
        double var9 = (double)var4;
        EntityZoragonBomb var11 = new EntityZoragonBomb(var1, var5 + 0.5D, var7 - 0.5D, var9 + 0.5D);
        var11.motionX = 0.0D;
        var11.motionY = -0.1D;
        var11.motionZ = 0.0D;
        var1.spawnEntityInWorld(var11);
    }

    /**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9)
    {
        int var10 = var9 & 3;
        byte var11 = 0;

        switch (var5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;

            case 2:
            case 3:
                var11 = 8;
                break;

            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        int var3 = var2 & 12;
        int var4 = var2 & 3;
        return var3 == 0 && (var1 == 1 || var1 == 0) ? 78 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 78 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 78 : 77));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1 & 3;
    }

    public boolean canSustainLeaves(World var1, int var2, int var3, int var4)
    {
        return true;
    }

    public boolean isWood(World var1, int var2, int var3, int var4)
    {
        return true;
    }
}
