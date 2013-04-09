package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.generation.vethea.All.Bow;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree4;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree5;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree6;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree7;
import xolova.blued00r.divinerpg.generation.vethea.All.Hook;
import xolova.blued00r.divinerpg.generation.vethea.All.InfusionOutpost;
import xolova.blued00r.divinerpg.generation.vethea.All.Lamp1;
import xolova.blued00r.divinerpg.generation.vethea.All.Lamp2;
import xolova.blued00r.divinerpg.generation.vethea.All.Mushroom;
import xolova.blued00r.divinerpg.generation.vethea.All.Pickaxe;
import xolova.blued00r.divinerpg.generation.vethea.All.Pointedsquare;
import xolova.blued00r.divinerpg.generation.vethea.All.Ring;
import xolova.blued00r.divinerpg.generation.vethea.All.Sword;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating1;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating2;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating3;
import xolova.blued00r.divinerpg.generation.vethea.All.Trident;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Crypt1;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Crypt2;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree4;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree5;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree6;

public class WorldGenLayer1 extends WorldGenerator
{
    private final ArrayList items = new ArrayList(7);
    private final ArrayList lamps;
    private final ArrayList floatingTrees;
    private final ArrayList l1Trees;
    private final ArrayList crypts;
    private final WorldGenerator infusion;

    public WorldGenLayer1()
    {
        this.items.add(new Bow());
        this.items.add(new Hook());
        this.items.add(new Mushroom());
        this.items.add(new Pickaxe());
        this.items.add(new Pointedsquare());
        this.items.add(new Ring());
        this.items.add(new Sword());
        this.items.add(new Trident());
        this.lamps = new ArrayList(1);
        this.lamps.add(new Lamp1());
        this.lamps.add(new Lamp2());
        this.floatingTrees = new ArrayList(7);
        this.floatingTrees.add(new TreeFloating1());
        this.floatingTrees.add(new TreeFloating2());
        this.floatingTrees.add(new TreeFloating3());
        this.floatingTrees.add(new FloatingTree4());
        this.floatingTrees.add(new FloatingTree5());
        this.floatingTrees.add(new FloatingTree6());
        this.floatingTrees.add(new FloatingTree7());
        this.l1Trees = new ArrayList(3);
        this.l1Trees.add(new Tree4());
        this.l1Trees.add(new Tree5());
        this.l1Trees.add(new Tree6());
        this.crypts = new ArrayList(2);
        this.crypts.add(new Crypt1());
        this.crypts.add(new Crypt2());
        this.infusion = new InfusionOutpost();
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6;
        byte var7;
        int var8;
        int var9;

        for (var9 = 0; var9 < 3; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 64;
            var8 = var5 + var2.nextInt(16) + 8;
            (new WorldGenConeUp(0, 4.0F)).generate(var1, var2, var6, var7, var8);
        }

        int var10;

        if (var2.nextInt(16) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 20 - var2.nextInt(2);
            var8 = var5 + var2.nextInt(16) + 8;
            (new WorldGenVetheanPillar()).generate(var1, var2, var6, var10, var8);
        }

        if (var2.nextInt(32) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 20 - var2.nextInt(2);
            var8 = var5 + var2.nextInt(16) + 8;
            ((WorldGenerator)this.items.get(var2.nextInt(7))).generate(var1, var2, var6, var10, var8);
        }

        if (var2.nextInt(32) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 20;

            for (var8 = var5 + var2.nextInt(16) + 8; var1.isAirBlock(var6, var10, var8); --var10)
            {
                ;
            }

            this.infusion.generate(var1, var2, var6, var10, var8);
        }

        for (var9 = 0; var9 < 1; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 30 + var2.nextInt(25);
            var8 = var5 + var2.nextInt(16) + 8;
            ((WorldGenerator)this.floatingTrees.get(var2.nextInt(7))).generate(var1, var2, var6, var10, var8);
        }

        if (var2.nextInt(2) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 20;
            var8 = var5 + var2.nextInt(16) + 8;
            ((WorldGenerator)this.lamps.get(var2.nextInt(2))).generate(var1, var2, var6, var7 - 2, var8);
        }

        if (var2.nextInt(500) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 40;
            var8 = var5 + var2.nextInt(16) + 8;
            (new WorldGenVillageIsland()).generate(var1, var2, var6, var7, var8);
        }

        for (var9 = 0; var9 < 1; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 20;
            var8 = var5 + var2.nextInt(16) + 8;
            (new WorldGenLayer1Forest(false)).generate(var1, var2, var6, var7, var8);
        }

        if (var2.nextInt(250) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 15;
            var8 = var5 + var2.nextInt(16) + 8;
            ((WorldGenerator)this.crypts.get(var2.nextInt(2))).generate(var1, var2, var6, var7, var8);
        }

        return true;
    }
}
