package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRaglokAltar extends Block
{
    public BlockRaglokAltar(int var1)
    {
        super(var1, Material.rock);
        this.blockIndexInTexture = 121;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return var1 == 0 ? 122 : 121;
    }
}
