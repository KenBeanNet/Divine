package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityCondenser;

public class BlockCondenser extends BlockContainer
{
    public BlockCondenser(int var1, Material var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = 20;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return var1 == 1 ? this.blockIndexInTexture + 1 : (var1 == 0 ? this.blockIndexInTexture + 1 : (var1 == 3 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture));
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityCondenser();
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityCondenser var10 = (TileEntityCondenser)var1.getBlockTileEntity(var2, var3, var4);

            if (var10 != null)
            {
                var5.openGui(DivineRPG.instance, 13, var1, var2, var3, var4);
            }

            return true;
        }
    }
}
