package xolova.blued00r.divinerpg.generation.vethea.village;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class LightDown1 extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[0];
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        var1.setBlock(var3 + 0, var4 + 0, var5 + 1, DivineRPG.firelight.blockID);
        var1.setBlock(var3 + 0, var4 + 1, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 0, var4 + 2, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 0, var4 + 6, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 0, var5 + 5, DivineRPG.firelight.blockID);
        var1.setBlock(var3 + 1, var4 + 1, var5 + 5, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 1, var5 + 6, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 0, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 6, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 3, var5 + 0, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 3, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 3, var5 + 4, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 3, var5 + 5, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 3, var5 + 6, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 4, var5 + 0, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 4, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 4, var5 + 2, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 4, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 5, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 6, var5 + 2, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 6, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 6, var5 + 4, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 2, var4 + 2, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 2, var4 + 3, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 2, var4 + 6, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 3, var4 + 2, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 4, var4 + 0, var5 + 4, DivineRPG.firelight.blockID);
        var1.setBlock(var3 + 4, var4 + 1, var5 + 4, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 4, var4 + 2, var5 + 3, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 4, var4 + 2, var5 + 4, DivineRPG.darkEverstone.blockID);
        return true;
    }
}
