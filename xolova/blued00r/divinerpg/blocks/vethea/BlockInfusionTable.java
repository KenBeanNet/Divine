package xolova.blued00r.divinerpg.blocks.vethea;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;

public class BlockInfusionTable extends BlockContainer
{
    public BlockInfusionTable(int var1)
    {
        super(var1, Material.rock);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 != 1 && var1 != 0 ? 47 : 46;
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityInfusionTable();
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        TileEntityInfusionTable var10 = (TileEntityInfusionTable)var1.getBlockTileEntity(var2, var3, var4);

        if (var10 != null && !var5.isSneaking())
        {
            var5.openGui(DivineRPG.instance, 18, var1, var2, var3, var4);
            return true;
        }
        else
        {
            return false;
        }
    }
}
