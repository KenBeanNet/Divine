package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockJungleSpiderPumpkin extends Block
{
    public BlockJungleSpiderPumpkin(int var1)
    {
        super(var1, Material.rock);
        this.blockIndexInTexture = 245;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);
        this.setDefaultDirection(var1, var2, var3, var4);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (var5 == 1)
        {
            return 244;
        }
        else if (var5 == 0)
        {
            return 244;
        }
        else
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            return var5 != var6 ? this.blockIndexInTexture : this.blockIndexInTexture + 2;
        }
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return var1 == 1 ? 244 : (var1 == 0 ? 244 : (var1 == 3 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture));
    }

    private void setDefaultDirection(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            int var5 = var1.getBlockId(var2, var3, var4 - 1);
            int var6 = var1.getBlockId(var2, var3, var4 + 1);
            int var7 = var1.getBlockId(var2 - 1, var3, var4);
            int var8 = var1.getBlockId(var2 + 1, var3, var4);
            byte var9 = 3;

            if (Block.opaqueCubeLookup[var5] && !Block.opaqueCubeLookup[var6])
            {
                var9 = 3;
            }

            if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var5])
            {
                var9 = 2;
            }

            if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var8])
            {
                var9 = 5;
            }

            if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var7])
            {
                var9 = 4;
            }

            var1.setBlockMetadataWithNotify(var2, var3, var4, var9);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        byte var6 = 0;
        int var7 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (var7 == 0)
        {
            var6 = 2;
        }

        if (var7 == 1)
        {
            var6 = 5;
        }

        if (var7 == 2)
        {
            var6 = 3;
        }

        if (var7 == 3)
        {
            var6 = 4;
        }

        var1.setBlockMetadataWithNotify(var2, var3, var4, var6);
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
