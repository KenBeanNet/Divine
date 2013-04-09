package xolova.blued00r.divinerpg.blocks.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockDreamgrass extends Block
{
    public BlockDreamgrass(int var1)
    {
        super(var1, Material.grass);
        this.blockIndexInTexture = 10;
        this.setTickRandomly(true);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 == 1 ? 12 : (var1 == 0 ? 11 : 10);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return var5 == 1 ? 12 : (var5 == 0 ? 11 : 10);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            if (var1.getBlockLightValue(var2, var3 + 1, var4) < 4 && var1.getBlockLightOpacity(var2, var3 + 1, var4) > 2)
            {
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.dreamdirt.blockID);
            }
            else if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = var2 + var5.nextInt(3) - 1;
                    int var8 = var3 + var5.nextInt(5) - 3;
                    int var9 = var4 + var5.nextInt(3) - 1;
                    var1.getBlockId(var7, var8 + 1, var9);

                    if (var1.getBlockId(var7, var8, var9) == DivineRPG.dreamdirt.blockID && var1.getBlockLightValue(var7, var8 + 1, var9) >= 4 && var1.getBlockLightOpacity(var7, var8 + 1, var9) <= 2)
                    {
                        var1.setBlockWithNotify(var7, var8, var9, DivineRPG.dreamgrass.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.dreamdirt.idDropped(0, var2, var3);
    }
}
