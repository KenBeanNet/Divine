package xolova.blued00r.divinerpg.generation.arcana;

import java.util.Random;
import net.minecraft.world.chunk.Chunk;
import xolova.blued00r.divinerpg.DivineRPG;

public class DungeonCeiling extends DungeonComponentBase
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[] {0};
    }

    public boolean LocationIsValidSpawn(Chunk var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockID(var2, var3, var4);
        int[] var6 = this.GetValidSpawnBlocks();
        int var7 = var6.length;

        for (int var8 = 0; var8 < var7; ++var8)
        {
            int var10000 = var6[var8];

            if (var5 == 0)
            {
                return true;
            }
        }

        return false;
    }

    public boolean generate(Chunk var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = var3 % 16;
        int var7 = var5 % 16;

        if (this.LocationIsValidSpawn(var1, var6, var4, var7) && this.LocationIsValidSpawn(var1, var6 + 15, var4, var7) && this.LocationIsValidSpawn(var1, var6 + 15, var4, var7 + 15) && this.LocationIsValidSpawn(var1, var6, var4, var7 + 15))
        {
            int var8 = DivineRPG.dungeonBricks.blockID;
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 0, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 1, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 2, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 3, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 4, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 5, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 6, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 7, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 8, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 9, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 10, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 11, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 12, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 13, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 14, var4 + 0, var7 + 15, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 0, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 1, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 2, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 3, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 4, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 5, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 6, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 7, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 8, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 9, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 10, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 11, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 12, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 13, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 14, var8);
            var1.setBlockID(var6 + 15, var4 + 0, var7 + 15, var8);
            return true;
        }
        else
        {
            return false;
        }
    }
}
