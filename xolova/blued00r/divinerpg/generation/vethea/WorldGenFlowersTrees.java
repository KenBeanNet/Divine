package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.generation.vethea.All.Bow;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree4;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree5;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree6;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree7;
import xolova.blued00r.divinerpg.generation.vethea.All.Hook;
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
import xolova.blued00r.divinerpg.generation.vethea.layer2.HiveNest;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid1;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid2;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Tree3;
import xolova.blued00r.divinerpg.generation.vethea.layer3.QuadroticPost;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree7;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree8;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Evergarden;
import xolova.blued00r.divinerpg.generation.vethea.layer4.RaglokChamber;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree1;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree2;
import xolova.blued00r.divinerpg.generation.vethea.layer4.WreckHall;

public class WorldGenFlowersTrees extends WorldGenerator
{
    private final ArrayList items = new ArrayList(7);
    private final ArrayList lamps;
    private final ArrayList floatingTrees;
    private final ArrayList pyramids;
    private final ArrayList l1Trees;
    private final ArrayList l3Trees;
    private final ArrayList l4Trees;
    private final ArrayList crypts;
    private final ArrayList l3Altars;
    private final ArrayList l4Altars;
    private final WorldGenerator layer1Gen;
    private final WorldGenerator ceilingTexture;
    private final WorldGenerator pillar;
    private final WorldGenerator cracklespikes;
    private final WorldGenerator fernites;
    private final WorldGenerator bulatobes;
    private final WorldGenerator shinegrass;
    private final WorldGenerator shimmers;
    private final WorldGenerator dreamglows;
    private final WorldGenerator layer3TreeBig;

    public WorldGenFlowersTrees()
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
        this.pyramids = new ArrayList(3);
        this.pyramids.add(new Pyramid1());
        this.pyramids.add(new Pyramid2());
        this.pyramids.add(new HiveNest());
        this.l1Trees = new ArrayList(3);
        this.l1Trees.add(new Tree4());
        this.l1Trees.add(new Tree5());
        this.l1Trees.add(new Tree6());
        this.l3Trees = new ArrayList(3);
        this.l3Trees.add(new Tree7());
        this.l3Trees.add(new Tree8());
        this.l3Trees.add(new WorldGenLayer3SmallTree(false));
        this.l4Trees = new ArrayList(2);
        this.l4Trees.add(new Tree1());
        this.l4Trees.add(new Tree2());
        this.l3Altars = new ArrayList(2);
        this.l3Altars.add(new QuadroticPost());
        this.l4Altars = new ArrayList(3);
        this.l4Altars.add(new Evergarden());
        this.l4Altars.add(new RaglokChamber());
        this.l4Altars.add(new WreckHall());
        this.crypts = new ArrayList(2);
        this.crypts.add(new Crypt1());
        this.crypts.add(new Crypt2());
        this.layer1Gen = new WorldGenLayer1();
        this.ceilingTexture = new WorldGenConeUp(0, 4.0F);
        this.pillar = new WorldGenVetheanPillar();
        this.layer3TreeBig = new WorldGenLayer3BigTree(false);
        this.cracklespikes = new WorldGenFlowers(DivineRPG.cracklespike.blockID);
        this.fernites = new WorldGenFlowers(DivineRPG.fernite.blockID);
        this.bulatobes = new WorldGenFlowers(DivineRPG.bulatobe.blockID);
        this.shinegrass = new WorldGenFlowers(DivineRPG.shineGrass.blockID);
        this.shimmers = new WorldGenFlowers(DivineRPG.shimmer.blockID);
        this.dreamglows = new WorldGenFlowers(DivineRPG.dreamglow.blockID);
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6;
        int var7;
        int var8;
        int var9;

        for (var9 = 0; var9 < 2; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 80;

            for (var8 = var5 + var2.nextInt(16) + 8; !var1.isAirBlock(var6, var7, var8); ++var7)
            {
                ;
            }

            (new Tree3()).generate(var1, var2, var6, var7, var8);
        }

        for (var9 = 0; var9 < 2; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 145;

            for (var8 = var5 + var2.nextInt(16) + 8; !var1.isAirBlock(var6, var7, var8); ++var7)
            {
                ;
            }

            ((WorldGenerator)this.l3Trees.get(var2.nextInt(this.l3Trees.size()))).generate(var1, var2, var6, var7, var8);
        }

        byte var10;

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 84;
            var8 = var5 + var2.nextInt(16) + 8;
            this.fernites.generate(var1, var2, var6, var10, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 84;
            var8 = var5 + var2.nextInt(16) + 8;
            this.dreamglows.generate(var1, var2, var6, var10, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var10 = 84;
            var8 = var5 + var2.nextInt(16) + 8;
            this.shimmers.generate(var1, var2, var6, var10, var8);
        }

        short var11;

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 148;
            var8 = var5 + var2.nextInt(16) + 8;
            this.shinegrass.generate(var1, var2, var6, var11, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 148;
            var8 = var5 + var2.nextInt(16) + 8;
            this.cracklespikes.generate(var1, var2, var6, var11, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 148;
            var8 = var5 + var2.nextInt(16) + 8;
            this.bulatobes.generate(var1, var2, var6, var11, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 216;
            var8 = var5 + var2.nextInt(16) + 8;
            this.shimmers.generate(var1, var2, var6, var11, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 216;
            var8 = var5 + var2.nextInt(16) + 8;
            this.shinegrass.generate(var1, var2, var6, var11, var8);
        }

        if (var2.nextInt(3) == 0)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var11 = 216;
            var8 = var5 + var2.nextInt(16) + 8;
            this.dreamglows.generate(var1, var2, var6, var11, var8);
        }

        for (var9 = 0; var9 < 2; ++var9)
        {
            var6 = var3 + var2.nextInt(16) + 8;
            var7 = 215;

            for (var8 = var5 + var2.nextInt(16) + 8; !var1.isAirBlock(var6, var7, var8); ++var7)
            {
                ;
            }

            ((WorldGenerator)this.l4Trees.get(var2.nextInt(this.l4Trees.size()))).generate(var1, var2, var6, var7, var8);
        }

        return true;
    }
}
