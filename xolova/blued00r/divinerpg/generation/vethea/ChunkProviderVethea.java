package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.MapGenScatteredFeature;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import xolova.blued00r.divinerpg.DivineRPG;
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
import xolova.blued00r.divinerpg.generation.vethea.layer2.HiveNest;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid1;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid2;
import xolova.blued00r.divinerpg.generation.vethea.layer3.KarosMadhouse;
import xolova.blued00r.divinerpg.generation.vethea.layer3.QuadroticPost;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree7;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree8;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Evergarden;
import xolova.blued00r.divinerpg.generation.vethea.layer4.RaglokChamber;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree1;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree2;
import xolova.blued00r.divinerpg.generation.vethea.layer4.WreckHall;

public class ChunkProviderVethea implements IChunkProvider
{
    private Random rand;
    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    private NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;
    private World worldObj;
    private final boolean mapFeaturesEnabled;
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenFloorCrystals();
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
    private MapGenVillage villageGenerator = new MapGenVillage();
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();
    private BiomeGenBase[] biomesForGeneration;
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
    private final WorldGenerator greenGemTops;
    private final WorldGenerator purpleGemTops;
    private final WorldGenerator yellowDulahs;
    private final WorldGenerator greenDulahs;
    private final WorldGenerator layer3TreeBig;
    private final WorldGenerator infusion;
    double[] noise3;
    double[] noise1;
    double[] noise2;
    double[] noise5;
    double[] noise6;
    float[] parabolicField;
    int[][] field_73219_j = new int[32][32];

    public ChunkProviderVethea(World var1, long var2, boolean var4)
    {
        this.caveGenerator = TerrainGen.getModdedMapGen(this.caveGenerator, InitMapGenEvent.EventType.CAVE);
        this.strongholdGenerator = (MapGenStronghold)TerrainGen.getModdedMapGen(this.strongholdGenerator, InitMapGenEvent.EventType.STRONGHOLD);
        this.villageGenerator = (MapGenVillage)TerrainGen.getModdedMapGen(this.villageGenerator, InitMapGenEvent.EventType.VILLAGE);
        this.mineshaftGenerator = (MapGenMineshaft)TerrainGen.getModdedMapGen(this.mineshaftGenerator, InitMapGenEvent.EventType.MINESHAFT);
        this.scatteredFeatureGenerator = (MapGenScatteredFeature)TerrainGen.getModdedMapGen(this.scatteredFeatureGenerator, InitMapGenEvent.EventType.SCATTERED_FEATURE);
        this.ravineGenerator = TerrainGen.getModdedMapGen(this.ravineGenerator, InitMapGenEvent.EventType.RAVINE);
        this.worldObj = var1;
        this.mapFeaturesEnabled = var4;
        this.rand = new Random(var2);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        NoiseGeneratorOctaves[] var5 = new NoiseGeneratorOctaves[] {this.noiseGen1, this.noiseGen2, this.noiseGen3, this.noiseGen4, this.noiseGen5, this.noiseGen6, this.mobSpawnerNoise};
        var5 = TerrainGen.getModdedNoiseGenerators(var1, this.rand, var5);
        this.noiseGen1 = var5[0];
        this.noiseGen2 = var5[1];
        this.noiseGen3 = var5[2];
        this.noiseGen4 = var5[3];
        this.noiseGen5 = var5[4];
        this.noiseGen6 = var5[5];
        this.mobSpawnerNoise = var5[6];
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
        this.l3Altars.add(new KarosMadhouse());
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
        this.infusion = new InfusionOutpost();
        this.cracklespikes = new WorldGenVetheanFlower(DivineRPG.cracklespike.blockID);
        this.fernites = new WorldGenVetheanFlower(DivineRPG.fernite.blockID);
        this.bulatobes = new WorldGenVetheanFlower(DivineRPG.bulatobe.blockID);
        this.shinegrass = new WorldGenVetheanFlower(DivineRPG.shineGrass.blockID);
        this.shimmers = new WorldGenVetheanFlower(DivineRPG.shimmer.blockID);
        this.dreamglows = new WorldGenVetheanFlower(DivineRPG.dreamglow.blockID);
        this.greenGemTops = new WorldGenVetheanFlower(DivineRPG.gemtopGreen.blockID);
        this.purpleGemTops = new WorldGenVetheanFlower(DivineRPG.gemtopPurple.blockID);
        this.yellowDulahs = new WorldGenVetheanFlower(DivineRPG.yellowDulah.blockID);
        this.greenDulahs = new WorldGenVetheanFlower(DivineRPG.greenDulah.blockID);
    }

    public void generateTerrain(int var1, int var2, byte[] var3)
    {
        byte var4 = 8;
        byte var5 = 4;
        byte var6 = 63;
        int var7 = var4 + 1;
        byte var8 = 17;
        int var9 = var4 + 1;
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
        this.noiseArray = this.initializeNoiseField(this.noiseArray, var1 * var4, 0, var2 * var4, var7, var8, var9);

        for (int var10 = 0; var10 < var4; ++var10)
        {
            for (int var11 = 0; var11 < var4; ++var11)
            {
                for (int var12 = 0; var12 < var5; ++var12)
                {
                    double var13 = 0.25D;
                    double var15 = this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var17 = this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var19 = this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var21 = this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var23 = (this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                    double var25 = (this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                    double var27 = (this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                    double var29 = (this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

                    for (int var31 = 0; var31 < 8; ++var31)
                    {
                        double var32 = 0.25D;
                        double var34 = var15;
                        double var36 = var17;
                        double var38 = (var19 - var15) * var32;
                        double var40 = (var21 - var17) * var32;

                        for (int var42 = 0; var42 < 4; ++var42)
                        {
                            int var43 = var42 + var10 * 2 << 11 | 0 + var11 * 2 << 7 | var12 * 4 + var31;
                            byte var44 = 64;
                            var43 -= var44;
                            double var45 = 0.25D;
                            double var47 = (var36 - var34) * var45;
                            double var49 = var34 - var47;

                            for (int var51 = 0; var51 < 4; ++var51)
                            {
                                if ((var49 += var47) > 0.0D)
                                {
                                    var3[var43 += var44] = (byte)Block.stone.blockID;
                                }
                                else if (var12 * 8 + var31 < var6)
                                {
                                    var3[var43 += var44] = 0;
                                }
                                else
                                {
                                    var3[var43 += var44] = 0;
                                }
                            }

                            var34 += var38;
                            var36 += var40;
                        }

                        var15 += var23;
                        var17 += var25;
                        var19 += var27;
                        var21 += var29;
                    }
                }
            }
        }
    }

    public void replaceBlocksForBiome(int var1, int var2, byte[] var3, BiomeGenBase[] var4)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks var5 = new ChunkProviderEvent.ReplaceBiomeBlocks(this, var1, var2, var3, var4);
        MinecraftForge.EVENT_BUS.post(var5);

        if (var5.getResult() != Event.Result.DENY)
        {
            double var6 = 0.03125D;
            this.stoneNoise = this.noiseGen4.generateNoiseOctaves(this.stoneNoise, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

            for (int var8 = 0; var8 < 16; ++var8)
            {
                for (int var9 = 0; var9 < 16; ++var9)
                {
                    BiomeGenBase var10 = var4[var9 + var8 * 16];
                    float var11 = var10.getFloatTemperature();
                    int var12 = (int)(this.stoneNoise[var8 + var9 * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
                    int var13 = -1;
                    byte var14 = var10.topBlock;
                    byte var15 = var10.fillerBlock;

                    for (int var16 = 0; var16 < 4; ++var16)
                    {
                        int var17 = 64 * var16;

                        for (int var18 = 63 + var17; var18 >= 0 + var17; --var18)
                        {
                            int var19 = (var9 * 16 + var8) * 256 + var18;

                            if (var18 <= var17 + 15)
                            {
                                var3[var19] = (byte)DivineRPG.dreamstone.blockID;
                            }
                            else
                            {
                                byte var20 = var3[var19];

                                if (var20 == 0)
                                {
                                    var13 = -1;
                                }
                                else if (var20 == Block.stone.blockID)
                                {
                                    if (var13 == -1)
                                    {
                                        if (var12 <= 0)
                                        {
                                            var14 = 0;
                                            var15 = (byte)DivineRPG.dreamstone.blockID;
                                        }
                                        else if (var18 >= var17 - 4 && var18 <= var17 + 1)
                                        {
                                            var14 = var10.topBlock;
                                            var15 = var10.fillerBlock;
                                        }

                                        if (var18 < var17 && var14 == 0)
                                        {
                                            if (var11 < 0.15F)
                                            {
                                                var14 = (byte)Block.ice.blockID;
                                            }
                                            else
                                            {
                                                var14 = (byte)Block.waterStill.blockID;
                                            }
                                        }

                                        var13 = var12;

                                        if (var18 >= var17 - 1)
                                        {
                                            var3[var19] = var14;
                                        }
                                        else
                                        {
                                            var3[var19] = var15;
                                        }
                                    }
                                    else if (var13 > 0)
                                    {
                                        --var13;
                                        var3[var19] = var15;

                                        if (var13 == 0 && var15 == Block.sand.blockID)
                                        {
                                            var13 = this.rand.nextInt(4);
                                            var15 = (byte)Block.sandStone.blockID;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    public Chunk loadChunk(int var1, int var2)
    {
        return this.provideChunk(var1, var2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    public Chunk provideChunk(int var1, int var2)
    {
        this.rand.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
        byte[] var3 = new byte[65536];
        this.generateTerrain(var1, var2, var3);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, var1 * 16, var2 * 16, 16, 16);
        this.replaceBlocksForBiome(var1, var2, var3, this.biomesForGeneration);
        this.caveGenerator.generate(this, this.worldObj, var1, var2, var3);
        Chunk var4 = new Chunk(this.worldObj, var3, var1, var2);
        byte[] var5 = var4.getBiomeArray();

        for (int var6 = 0; var6 < var5.length; ++var6)
        {
            var5[var6] = (byte)this.biomesForGeneration[var6].biomeID;
        }

        var4.generateSkylightMap();
        return var4;
    }

    private double[] initializeNoiseField(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7)
    {
        ChunkProviderEvent.InitNoiseField var8 = new ChunkProviderEvent.InitNoiseField(this, var1, var2, var3, var4, var5, var6, var7);
        MinecraftForge.EVENT_BUS.post(var8);

        if (var8.getResult() == Event.Result.DENY)
        {
            return var8.noisefield;
        }
        else
        {
            if (var1 == null)
            {
                var1 = new double[var5 * var6 * var7];
            }

            if (this.parabolicField == null)
            {
                this.parabolicField = new float[25];

                for (int var9 = -2; var9 <= 2; ++var9)
                {
                    for (int var10 = -2; var10 <= 2; ++var10)
                    {
                        float var11 = 10.0F / MathHelper.sqrt_float((float)(var9 * var9 + var10 * var10) + 0.2F);
                        this.parabolicField[var9 + 2 + (var10 + 2) * 5] = var11;
                    }
                }
            }

            double var45 = 684.412D;
            double var46 = 684.412D;
            this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
            this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
            this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, var2, var3, var4, var5, var6, var7, var45 / 80.0D, var46 / 160.0D, var45 / 80.0D);
            this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, var2, var3, var4, var5, var6, var7, var45, var46, var45);
            this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, var2, var3, var4, var5, var6, var7, var45, var46, var45);
            boolean var13 = false;
            boolean var14 = false;
            int var15 = 0;
            int var16 = 0;

            for (int var17 = 0; var17 < var5; ++var17)
            {
                for (int var18 = 0; var18 < var7; ++var18)
                {
                    float var19 = 0.0F;
                    float var20 = 0.0F;
                    float var21 = 0.0F;
                    byte var22 = 2;
                    BiomeGenBase var23 = this.biomesForGeneration[var17 + 2 + (var18 + 2) * (var5 + 5)];

                    for (int var24 = -var22; var24 <= var22; ++var24)
                    {
                        for (int var25 = -var22; var25 <= var22; ++var25)
                        {
                            BiomeGenBase var26 = this.biomesForGeneration[var17 + var24 + 2 + (var18 + var25 + 2) * (var5 + 5)];
                            float var27 = this.parabolicField[var24 + 2 + (var25 + 2) * 5] / (var26.minHeight + 2.0F);

                            if (var26.minHeight > var23.minHeight)
                            {
                                var27 /= 2.0F;
                            }

                            var19 += var26.maxHeight * var27;
                            var20 += var26.minHeight * var27;
                            var21 += var27;
                        }
                    }

                    var19 /= var21;
                    var20 /= var21;
                    var19 = var19 * 0.9F + 0.1F;
                    var20 = (var20 * 4.0F - 1.0F) / 8.0F;
                    double var47 = this.noise6[var16] / 8000.0D;

                    if (var47 < 0.0D)
                    {
                        var47 = -var47 * 0.3D;
                    }

                    var47 = var47 * 3.0D - 2.0D;

                    if (var47 < 0.0D)
                    {
                        var47 /= 2.0D;

                        if (var47 < -1.0D)
                        {
                            var47 = -1.0D;
                        }

                        var47 /= 1.4D;
                        var47 /= 2.0D;
                    }
                    else
                    {
                        if (var47 > 1.0D)
                        {
                            var47 = 1.0D;
                        }

                        var47 /= 8.0D;
                    }

                    ++var16;

                    for (int var49 = 0; var49 < var6; ++var49)
                    {
                        double var48 = (double)var20;
                        double var29 = (double)var19;
                        var48 += var47 * 0.2D;
                        var48 = var48 * (double)var6 / 16.0D;
                        double var31 = (double)var6 / 2.0D + var48 * 4.0D;
                        double var33 = 0.0D;
                        double var35 = ((double)var49 - var31) * 12.0D * 128.0D / 128.0D / var29;

                        if (var35 < 0.0D)
                        {
                            var35 *= 4.0D;
                        }

                        double var37 = this.noise1[var15] / 512.0D;
                        double var39 = this.noise2[var15] / 512.0D;
                        double var41 = (this.noise3[var15] / 10.0D + 1.0D) / 2.0D;

                        if (var41 < 0.0D)
                        {
                            var33 = var37;
                        }
                        else if (var41 > 1.0D)
                        {
                            var33 = var39;
                        }
                        else
                        {
                            var33 = var37 + (var39 - var37) * var41;
                        }

                        var33 -= var35;

                        if (var49 > var6 - 4)
                        {
                            double var43 = (double)((float)(var49 - (var6 - 4)) / 3.0F);
                            var33 = var33 * (1.0D - var43) + -10.0D * var43;
                        }

                        var1[var15] = var33;
                        ++var15;
                    }
                }
            }

            return var1;
        }
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    public boolean chunkExists(int var1, int var2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider var1, int var2, int var3)
    {
        BlockSand.fallInstantly = true;
        int var4 = var2 * 16;
        int var5 = var3 * 16;
        this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long var7 = this.rand.nextLong() / 2L * 2L + 1L;
        long var9 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.worldObj.getSeed());
        boolean var11 = false;
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(var1, this.worldObj, this.rand, var2, var3, var11));

        if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generateStructuresInChunk(this.worldObj, this.rand, var2, var3);
            var11 = this.villageGenerator.generateStructuresInChunk(this.worldObj, this.rand, var2, var3);
            this.strongholdGenerator.generateStructuresInChunk(this.worldObj, this.rand, var2, var3);
            this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, this.rand, var2, var3);
        }

        this.layer1Gen.generate(this.worldObj, this.rand, var4, 0, var5);
        int var12;
        short var13;
        int var14;
        int var15;

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.ceilingTexture.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        int var17;

        if (this.rand.nextInt(16) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 84 - this.rand.nextInt(2);
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.pillar.generate(this.worldObj, this.rand, var12, var17, var14);
        }

        byte var16;

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var16 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer2Forest(false)).generate(this.worldObj, this.rand, var12, var16, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 85;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            for (var15 = 0; var15 < this.rand.nextInt(2) + 2; ++var15)
            {
                --var17;
            }

            ((WorldGenerator)this.items.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 85;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            this.infusion.generate(this.worldObj, this.rand, var12, var17, var14);
        }

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 90 + this.rand.nextInt(25);
            var14 = var5 + this.rand.nextInt(16) + 8;
            ((WorldGenerator)this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 80;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.lamps.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var17 - 2, var14);
        }

        if (this.rand.nextInt(250) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 80;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.pyramids.get(this.rand.nextInt(3))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var16 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.fernites.generate(this.worldObj, this.rand, var12, var16, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var16 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.dreamglows.generate(this.worldObj, this.rand, var12, var16, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var16 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.shimmers.generate(this.worldObj, this.rand, var12, var16, var14);
        }

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 192;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.ceilingTexture.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(16) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.pillar.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer1Forest(false)).generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 148;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            for (var15 = 0; var15 < this.rand.nextInt(2) + 2; ++var15)
            {
                --var17;
            }

            ((WorldGenerator)this.items.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 148;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            this.infusion.generate(this.worldObj, this.rand, var12, var17, var14);
        }

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 158 + this.rand.nextInt(25);
            var14 = var5 + this.rand.nextInt(16) + 8;
            ((WorldGenerator)this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 147;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.lamps.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var17 - 2, var14);
        }

        if (this.rand.nextInt(250) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 144;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.l3Altars.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.shinegrass.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.cracklespikes.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.bulatobes.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 212;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            for (var15 = 0; var15 < this.rand.nextInt(2) + 2; ++var15)
            {
                --var17;
            }

            ((WorldGenerator)this.items.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 212;

            for (var14 = var5 + this.rand.nextInt(16) + 8; this.worldObj.isAirBlock(var12, var17, var14); --var17)
            {
                ;
            }

            this.infusion.generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 210;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.lamps.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var17 - 2, var14);
        }

        for (var15 = 0; var15 < 5; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer2Forest(false)).generate(this.worldObj, this.rand, var12, var13, var14);
        }

        for (var15 = 0; var15 < 3; ++var15)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 222 + this.rand.nextInt(23);
            var14 = var5 + this.rand.nextInt(16) + 8;
            ((WorldGenerator)this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(150) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var17 = 210;

            for (var14 = var5 + this.rand.nextInt(16) + 8; !this.worldObj.isAirBlock(var12, var17, var14); ++var17)
            {
                ;
            }

            ((WorldGenerator)this.l4Altars.get(this.rand.nextInt(3))).generate(this.worldObj, this.rand, var12, var17, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.shimmers.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.shinegrass.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            this.dreamglows.generate(this.worldObj, this.rand, var12, var13, var14);
        }

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(var1, this.worldObj, this.rand, var2, var3, var11));
        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    public boolean saveChunks(boolean var1, IProgressUpdate var2)
    {
        return true;
    }

    /**
     * Unloads the 100 oldest chunks from memory, due to a bug with chunkSet.add() never being called it thinks the list
     * is always empty and will not remove any chunks.
     */
    public boolean unload100OldestChunks()
    {
        return false;
    }

    /**
     * Returns if the IChunkProvider supports saving.
     */
    public boolean canSave()
    {
        return true;
    }

    /**
     * Converts the instance data to a readable string.
     */
    public String makeString()
    {
        return "RandomLevelSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType var1, int var2, int var3, int var4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(var2, var4);
        return var5 == null ? null : (var5 == BiomeGenBase.swampland && var1 == EnumCreatureType.monster && this.scatteredFeatureGenerator.hasStructureAt(var2, var3, var4) ? this.scatteredFeatureGenerator.getScatteredFeatureSpawnList() : var5.getSpawnableList(var1));
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World var1, String var2, int var3, int var4, int var5)
    {
        return "Stronghold".equals(var2) && this.strongholdGenerator != null ? this.strongholdGenerator.getNearestInstance(var1, var3, var4, var5) : null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void recreateStructures(int var1, int var2)
    {
        if (this.mapFeaturesEnabled)
        {
            ;
        }
    }
}
