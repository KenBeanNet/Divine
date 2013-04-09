package xolova.blued00r.divinerpg.blocks;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.gui.GuiDreamLamp;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;

public class BlockDreamLamp extends BlockContainer
{
    private GuiDreamLamp gui;
    private TileEntityDreamLamp te;
    private static boolean keepFurnaceInventory = false;

    public BlockDreamLamp(int var1, int var2, Material var3, boolean var4)
    {
        super(var1, var3);
        this.blockIndexInTexture = var2;

        if (var4)
        {
            this.setLightValue(1.0F);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityDreamLamp(this);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        TileEntityDreamLamp var10 = (TileEntityDreamLamp)var1.getBlockTileEntity(var2, var3, var4);

        if (var10 != null && !var5.isSneaking())
        {
            var5.openGui(DivineRPG.instance, 19, var1, var2, var3, var4);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.dreamlamp.blockID;
    }

    public static void updateFurnaceBlockState(boolean var0, World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        TileEntity var6 = var1.getBlockTileEntity(var2, var3, var4);
        keepFurnaceInventory = true;

        if (var0)
        {
            var1.setBlockWithNotify(var2, var3, var4, DivineRPG.dreamlampOn.blockID);
        }
        else
        {
            var1.setBlockWithNotify(var2, var3, var4, DivineRPG.dreamlamp.blockID);
        }

        keepFurnaceInventory = false;
        var1.setBlockMetadataWithNotify(var2, var3, var4, var5);

        if (var6 != null)
        {
            var6.validate();
            var1.setBlockTileEntity(var2, var3, var4, var6);
        }
    }
}
