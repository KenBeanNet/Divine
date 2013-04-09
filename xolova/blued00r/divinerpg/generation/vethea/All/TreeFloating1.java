package xolova.blued00r.divinerpg.generation.vethea.All;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class TreeFloating1 extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[0];
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        var1.setBlock(var3 + 0, var4 + 1, var5 + 1, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 0, var4 + 1, var5 + 2, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 0, var4 + 2, var5 + 1, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 0, var4 + 2, var5 + 2, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 1, var4 + 1, var5 + 1, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 1, var4 + 1, var5 + 2, DivineRPG.dreamstone.blockID);
        var1.setBlockAndMetadata(var3 + 1, var4 + 1, var5 + 3, DivineRPG.firewood.blockID, 8);
        var1.setBlockAndMetadata(var3 + 1, var4 + 1, var5 + 4, DivineRPG.firewood.blockID, 8);
        var1.setBlockAndMetadata(var3 + 1, var4 + 1, var5 + 5, DivineRPG.firewood.blockID, 8);
        var1.setBlockAndMetadata(var3 + 1, var4 + 1, var5 + 6, DivineRPG.firewood.blockID, 8);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 1, DivineRPG.dreamstone.blockID);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 2, DivineRPG.dreamstone.blockID);
        var1.setBlockAndMetadata(var3 + 2, var4 + 1, var5 + 6, DivineRPG.firewood.blockID, 4);
        var1.setBlockAndMetadata(var3 + 2, var4 + 2, var5 + 1, DivineRPG.firewood.blockID, 4);
        var1.setBlockAndMetadata(var3 + 3, var4 + 1, var5 + 6, DivineRPG.firewood.blockID, 4);
        var1.setBlockAndMetadata(var3 + 3, var4 + 2, var5 + 1, DivineRPG.firewood.blockID, 4);
        var1.setBlock(var3 + 4, var4 + 0, var5 + 6, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 4, var4 + 1, var5 + 1, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 4, var4 + 1, var5 + 5, DivineRPG.firewoodLeaves.blockID);
        var1.setBlockAndMetadata(var3 + 4, var4 + 1, var5 + 6, DivineRPG.firewood.blockID, 4);
        var1.setBlock(var3 + 4, var4 + 1, var5 + 7, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 4, var4 + 2, var5 + 0, DivineRPG.firewoodLeaves.blockID);
        var1.setBlockAndMetadata(var3 + 4, var4 + 2, var5 + 1, DivineRPG.firewood.blockID, 4);
        var1.setBlock(var3 + 4, var4 + 2, var5 + 2, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 4, var4 + 2, var5 + 6, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 5, var4 + 1, var5 + 6, DivineRPG.firewoodLeaves.blockID);
        var1.setBlock(var3 + 5, var4 + 2, var5 + 1, DivineRPG.firewoodLeaves.blockID);
        return true;
    }
}
