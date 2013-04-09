package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
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
import xolova.blued00r.divinerpg.generation.vethea.layer3.QuadroticPost;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree7;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree8;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Evergarden;
import xolova.blued00r.divinerpg.generation.vethea.layer4.RaglokChamber;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree1;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree2;
import xolova.blued00r.divinerpg.generation.vethea.layer4.WreckHall;

public class BiomeDecoratorArksiane extends BiomeDecorator
{
    /** The world the BiomeDecorator is currently decorating */
    public World currentWorld;

    /** The Biome Decorator's random number generator. */
    public Random randomGenerator;

    /** The X-coordinate of the chunk currently being decorated */
    public int chunk_X;

    /** The Z-coordinate of the chunk currently being decorated */
    public int chunk_Z;

    /** The biome generator object. */
    public BiomeGenBase biome;
    private final ArrayList items;
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

    public BiomeDecoratorArksiane(BiomeGenBase var1)
    {
        super(var1);
        this.biome = var1;
        this.items = new ArrayList(7);
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

    /**
     * Decorates the world. Calls code that was formerly (pre-1.8) in ChunkProviderGenerate.populate
     */
    public void decorate(World var1, Random var2, int var3, int var4)
    {
        if (this.currentWorld != null)
        {
            throw new RuntimeException("Already decorating!!");
        }
        else
        {
            this.currentWorld = var1;
            this.randomGenerator = var2;
            this.chunk_X = var3;
            this.chunk_Z = var4;
            this.decorate();
            this.currentWorld = null;
            this.randomGenerator = null;
        }
    }

    /**
     * The method that does the work of actually decorating chunks
     */
    protected void decorate()
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.currentWorld, this.randomGenerator, this.chunk_X, this.chunk_Z));
    }
}
