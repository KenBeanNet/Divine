package xolova.blued00r.divinerpg.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockArcaniteDirt extends Block
{
    public BlockArcaniteDirt(int var1)
    {
        super(var1, Material.ground);
        this.blockIndexInTexture = 54;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.arcaniteDirt.blockID;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
