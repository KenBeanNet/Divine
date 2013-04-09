package xolova.blued00r.divinerpg.blocks.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockDreambricks extends Block
{
    public BlockDreambricks(int var1)
    {
        super(var1, 25, Material.rock);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        switch (var2)
        {
            case 1:
                return 26;

            case 2:
                return 91;

            case 3:
                return 92;

            case 4:
                return 93;

            case 5:
                return 94;

            case 6:
                return 95;

            case 7:
                return 106;

            case 8:
                return 107;

            case 9:
                return 109;

            case 10:
                return 127;

            default:
                return 25;
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int var1, CreativeTabs var2, List var3)
    {
        for (int var4 = 0; var4 < 9; ++var4)
        {
            var3.add(new ItemStack(var1, 1, var4));
        }
    }
}
