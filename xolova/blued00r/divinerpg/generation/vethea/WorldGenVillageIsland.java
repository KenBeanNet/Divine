package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseDown1;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseDown2;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseDown3;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseUp1;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseUp2;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseUp3;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseUp4;
import xolova.blued00r.divinerpg.generation.vethea.village.HouseUp5;
import xolova.blued00r.divinerpg.generation.vethea.village.LightDown1;
import xolova.blued00r.divinerpg.generation.vethea.village.LightDown2;
import xolova.blued00r.divinerpg.generation.vethea.village.LightDown3;
import xolova.blued00r.divinerpg.generation.vethea.village.LightDown4;
import xolova.blued00r.divinerpg.generation.vethea.village.LightUp1;
import xolova.blued00r.divinerpg.generation.vethea.village.LightUp2;
import xolova.blued00r.divinerpg.generation.vethea.village.LightUp3;
import xolova.blued00r.divinerpg.generation.vethea.village.LightUp4;

public class WorldGenVillageIsland extends WorldGenerator
{
    public final WorldGenConeUp spike;
    public final ArrayList housesDown;
    public final ArrayList housesUp;
    public final ArrayList lampsDown;
    public final ArrayList lampsUp;

    public WorldGenVillageIsland()
    {
        this.spike = new WorldGenConeUp(DivineRPG.dreamstone.blockID, 1.0F);
        this.housesDown = new ArrayList(3);
        this.housesDown.add(new HouseDown1());
        this.housesDown.add(new HouseDown2());
        this.housesDown.add(new HouseDown3());
        this.housesUp = new ArrayList(5);
        this.housesUp.add(new HouseUp1());
        this.housesUp.add(new HouseUp2());
        this.housesUp.add(new HouseUp3());
        this.housesUp.add(new HouseUp4());
        this.housesUp.add(new HouseUp5());
        this.lampsDown = new ArrayList(4);
        this.lampsDown.add(new LightDown1());
        this.lampsDown.add(new LightDown2());
        this.lampsDown.add(new LightDown3());
        this.lampsDown.add(new LightDown4());
        this.lampsUp = new ArrayList(5);
        this.lampsUp.add(new LightUp1());
        this.lampsUp.add(new LightUp2());
        this.lampsUp.add(new LightUp3());
        this.lampsUp.add(new LightUp4());
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = var2.nextInt(15) + 25;
        this.placeSpikeIteration(var1, var2, var3, var4, var5, var6);
        return true;
    }

    void placeSpikeIteration(World var1, Random var2, int var3, int var4, int var5, int var6)
    {
        for (float var7 = 0.0F; var7 < (float)var6; var7 += 5.0F)
        {
            for (float var8 = 0.0F; (double)var8 < (Math.PI * 2D) * (double)var7; var8 += 4.0F)
            {
                this.spike.generate(var1, var2, (int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var4 - (int)(var7 / 10.0F), (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2))), (int)((float)var6 - var7) / 2);
                int var9;

                if (var8 % 8.0F == 0.0F)
                {
                    var9 = var2.nextInt(5);

                    if (var9 == 0)
                    {
                        ((WorldGenerator)this.lampsDown.get(var2.nextInt(4))).generate(var1, var2, (int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var4 - (int)(var7 / 10.0F) - 5, (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2))));
                    }
                    else if (var9 == 1)
                    {
                        ((WorldGenerator)this.housesDown.get(var2.nextInt(3))).generate(var1, var2, (int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var4 - (int)(var7 / 10.0F) - 5, (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2))));
                    }
                }
                else if (var2.nextInt(5) == 0 && var8 % 8.0F == 4.0F)
                {
                    var9 = var2.nextInt(5);
                    int var10;

                    for (var10 = var4 + (int)((float)var6 - var7) / 2 + 1; !var1.isAirBlock((int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var10, (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2)))); ++var10)
                    {
                        ;
                    }

                    if (var9 == 0)
                    {
                        ((WorldGenerator)this.lampsUp.get(var2.nextInt(4))).generate(var1, var2, (int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var10, (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2))));
                    }
                    else if (var9 == 1)
                    {
                        ((WorldGenerator)this.housesUp.get(var2.nextInt(5))).generate(var1, var2, (int)Math.round((double)var3 + Math.sin((double)var8) * (double)(var7 - (float)var2.nextInt(2))), var10, (int)Math.round((double)var5 + Math.cos((double)var8) * (double)(var7 - (float)var2.nextInt(2))));
                    }
                }
            }
        }
    }
}
