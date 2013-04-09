package xolova.blued00r.divinerpg.generation.iceika;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopMerchant;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopTickerer;

public class SnowyVillage6 extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[] {DivineRPG.iceikaGrass.blockID};
    }

    public boolean LocationIsValidSpawn(World var1, int var2, int var3, int var4)
    {
        int var5 = 0;

        for (int var6 = var1.getBlockId(var2, var3, var4); var6 != 0; var6 = var1.getBlockId(var2, var3 + var5, var4))
        {
            ++var5;
        }

        if (var5 > 3)
        {
            return false;
        }
        else
        {
            var3 += var5 - 1;
            int var7 = var1.getBlockId(var2, var3, var4);
            int var8 = var1.getBlockId(var2, var3 + 1, var4);
            int var9 = var1.getBlockId(var2, var3 - 1, var4);
            int[] var10 = this.GetValidSpawnBlocks();
            int var11 = var10.length;

            for (int var12 = 0; var12 < var11; ++var12)
            {
                int var13 = var10[var12];

                if (var8 != 0)
                {
                    return false;
                }

                if (var7 == var13)
                {
                    return true;
                }

                if (var7 == Block.snow.blockID && var9 == var13)
                {
                    return true;
                }
            }

            return false;
        }
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        if (this.LocationIsValidSpawn(var1, var3, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 13, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 13, var4, var5 + 10) && this.LocationIsValidSpawn(var1, var3, var4, var5 + 10))
        {
            var1.setBlock(var3 + 0, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 3, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 5, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 7, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 0, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 1, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 2, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 1, var4 + 3, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 4, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 6, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 2, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 1, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 2, var4 + 1, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 2, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 2, var5 + 2, DivineRPG.workshopLamp.blockID);
            var1.setBlock(var3 + 2, var4 + 2, var5 + 8, DivineRPG.workshopLamp.blockID);
            var1.setBlock(var3 + 2, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 2, DivineRPG.workshopLamp.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 8, DivineRPG.workshopLamp.blockID);
            var1.setBlock(var3 + 2, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 3, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 4, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 5, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 6, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 7, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 5, var5 + 4, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 5, var5 + 5, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 5, var5 + 6, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 2, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 2, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 5, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 3, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 3, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 3, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 4, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 1, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 2, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 4, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 4, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 5, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 1, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 2, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 5, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 5, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 6, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 1, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 2, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 6, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 6, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 7, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 1, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 2, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 7, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 7, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 8, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 1, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 2, var5 + 5, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 8, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 8, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 4, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 5, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 6, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 9, var4 + 1, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 1, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 1, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 1, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 2, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 2, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 2, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 2, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 3, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 3, var5 + 2, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 3, var5 + 8, DivineRPG.iceikaBookself.blockID);
            var1.setBlock(var3 + 9, var4 + 3, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 3, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 4, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 5, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 6, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 7, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 4, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 5, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 5, var5 + 4, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 5, var5 + 5, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 5, var5 + 6, DivineRPG.iceikaGlass.blockID);
            var1.setBlock(var3 + 9, var4 + 5, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 6, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 6, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 9, var4 + 6, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 1, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 4, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 6, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 9, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 1, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 1, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 1, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 1, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 2, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 2, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 2, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 2, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 10, var4 + 3, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 0, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 3, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 4, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 5, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 6, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 7, DivineRPG.workshopCarpet.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 11, var4 + 0, var5 + 10, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 11, var4 + 1, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 1, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 2, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 2, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 11, var4 + 3, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 2, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 8, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 0, var5 + 9, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 1, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 1, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlockAndMetadata(var3 + 12, var4 + 1, var5 + 4, DivineRPG.iceikaDoor.blockID, 2);
            var1.setBlock(var3 + 12, var4 + 1, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlockAndMetadata(var3 + 12, var4 + 1, var5 + 6, DivineRPG.iceikaDoor.blockID, 2);
            var1.setBlock(var3 + 12, var4 + 1, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 1, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 2, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 2, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlockAndMetadata(var3 + 12, var4 + 2, var5 + 4, DivineRPG.iceikaDoor.blockID, 8);
            var1.setBlock(var3 + 12, var4 + 2, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlockAndMetadata(var3 + 12, var4 + 2, var5 + 6, DivineRPG.iceikaDoor.blockID, 8);
            var1.setBlock(var3 + 12, var4 + 2, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 2, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 3, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 7, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 12, var4 + 3, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 1, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 2, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 3, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 4, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 5, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 6, DivineRPG.iceikaSnowyBrick.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 7, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 8, DivineRPG.coalStone.blockID);
            var1.setBlock(var3 + 13, var4 + 0, var5 + 9, DivineRPG.coalStone.blockID);
            EntityWorkshopTickerer var6 = new EntityWorkshopTickerer(var1);
            var6.setLocationAndAngles((double)var3 + 3.0D, (double)var4 + 1.0D, (double)var5 + 3.0D, 0.0F, 0.0F);
            var1.spawnEntityInWorld(var6);
            EntityWorkshopMerchant var7 = new EntityWorkshopMerchant(var1);
            var7.setLocationAndAngles((double)var3 + 3.0D, (double)var4 + 1.0D, (double)var5 + 3.0D, 0.0F, 0.0F);
            var1.spawnEntityInWorld(var7);
            return true;
        }
        else
        {
            return false;
        }
    }
}
