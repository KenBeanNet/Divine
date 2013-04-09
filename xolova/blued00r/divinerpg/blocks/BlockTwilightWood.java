package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockTwilightWood extends Block
{
    public BlockTwilightWood(int var1)
    {
        super(var1, 4, Material.wood);
        this.setCreativeTab(DivineRPG.tabBlocks);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
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

    public boolean canSustainLeaves(World var1, int var2, int var3, int var4)
    {
        return true;
    }

    public boolean isWood(World var1, int var2, int var3, int var4)
    {
        return true;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        int var3 = var2 & 12;
        int var4 = var2 & 3;
        return this.blockID == DivineRPG.yellowWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 166 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 166 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 166 : 165))) : (this.blockID == DivineRPG.redWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 168 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 168 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 168 : 167))) : (this.blockID == DivineRPG.purpleWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 182 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 182 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 182 : 181))) : (this.blockID == DivineRPG.blueWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 184 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 184 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 184 : 183))) : (this.blockID == DivineRPG.greenWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 186 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 186 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 186 : 185))) : (this.blockID == DivineRPG.whiteWood.blockID ? (var3 == 0 && (var1 == 1 || var1 == 0) ? 188 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 188 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 188 : 187))) : (var3 == 0 && (var1 == 1 || var1 == 0) ? 21 : (var3 == 4 && (var1 == 5 || var1 == 4) ? 21 : (var3 == 8 && (var1 == 2 || var1 == 3) ? 21 : (var4 == 1 ? 116 : (var4 == 2 ? 117 : (var4 == 3 ? 153 : 20)))))))))));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
