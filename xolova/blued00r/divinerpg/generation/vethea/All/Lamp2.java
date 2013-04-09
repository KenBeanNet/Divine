package xolova.blued00r.divinerpg.generation.vethea.All;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class Lamp2 extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[0];
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        var1.setBlock(var3 + 0, var4 + 0, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 0, var5 + 0, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 0, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 0, var5 + 2, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 1, var5 + 1, DivineRPG.darkEverstone.blockID);
        var1.setBlock(var3 + 1, var4 + 2, var5 + 1, DivineRPG.dreamlamp.blockID);
        var1.setBlock(var3 + 2, var4 + 0, var5 + 1, DivineRPG.darkEverstone.blockID);
        return true;
    }
}
