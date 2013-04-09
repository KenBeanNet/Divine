package xolova.blued00r.divinerpg.generation.twilight;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCavesHell;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.structure.MapGenNetherBridge;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import xolova.blued00r.divinerpg.DivineRPG;

public class ChunkProviderDense implements IChunkProvider
{
    private Random hellRNG;
    private NoiseGeneratorOctaves netherNoiseGen1;
    private NoiseGeneratorOctaves netherNoiseGen2;
    private NoiseGeneratorOctaves netherNoiseGen3;
    private NoiseGeneratorOctaves slowsandGravelNoiseGen;
    private NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
    public NoiseGeneratorOctaves netherNoiseGen6;
    public NoiseGeneratorOctaves netherNoiseGen7;
    private World worldObj;
    private double[] noiseField;
    public MapGenNetherBridge genNetherBridge = new MapGenNetherBridge();
    private double[] slowsandNoise = new double[256];
    private double[] gravelNoise = new double[256];
    private double[] netherrackExclusivityNoise = new double[256];
    private MapGenBase netherCaveGenerator = new MapGenCavesHell();
    double[] noiseData1;
    double[] noiseData2;
    double[] noiseData3;
    double[] noiseData4;
    double[] noiseData5;

    public ChunkProviderDense(World var1, long var2)
    {
        this.genNetherBridge = (MapGenNetherBridge)TerrainGen.getModdedMapGen(this.genNetherBridge, EventType.NETHER_BRIDGE);
        this.netherCaveGenerator = TerrainGen.getModdedMapGen(this.netherCaveGenerator, EventType.NETHER_CAVE);
        this.worldObj = var1;
        this.hellRNG = new Random(var2);
        this.netherNoiseGen1 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen2 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen3 = new NoiseGeneratorOctaves(this.hellRNG, 8);
        this.slowsandGravelNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, 4);
        this.netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, 4);
        this.netherNoiseGen6 = new NoiseGeneratorOctaves(this.hellRNG, 10);
        this.netherNoiseGen7 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        NoiseGeneratorOctaves[] var4 = new NoiseGeneratorOctaves[] {this.netherNoiseGen1, this.netherNoiseGen2, this.netherNoiseGen3, this.slowsandGravelNoiseGen, this.netherrackExculsivityNoiseGen, this.netherNoiseGen6, this.netherNoiseGen7};
        var4 = TerrainGen.getModdedNoiseGenerators(var1, this.hellRNG, var4);
        this.netherNoiseGen1 = var4[0];
        this.netherNoiseGen2 = var4[1];
        this.netherNoiseGen3 = var4[2];
        this.slowsandGravelNoiseGen = var4[3];
        this.netherrackExculsivityNoiseGen = var4[4];
        this.netherNoiseGen6 = var4[5];
        this.netherNoiseGen7 = var4[6];
    }

    public void generateNetherTerrain(int var1, int var2, byte[] var3)
    {
        byte var4 = 4;
        byte var5 = 32;
        int var6 = var4 + 1;
        byte var7 = 17;
        int var8 = var4 + 1;
        this.noiseField = this.initializeNoiseField(this.noiseField, var1 * var4, 0, var2 * var4, var6, var7, var8);

        for (int var9 = 0; var9 < var4; ++var9)
        {
            for (int var10 = 0; var10 < var4; ++var10)
            {
                for (int var11 = 0; var11 < 16; ++var11)
                {
                    double var12 = 0.125D;
                    double var14 = this.noiseField[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
                    double var16 = this.noiseField[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
                    double var18 = this.noiseField[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
                    double var20 = this.noiseField[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
                    double var22 = (this.noiseField[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
                    double var24 = (this.noiseField[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
                    double var26 = (this.noiseField[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
                    double var28 = (this.noiseField[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

                    for (int var30 = 0; var30 < 8; ++var30)
                    {
                        double var31 = 0.25D;
                        double var33 = var14;
                        double var35 = var16;
                        double var37 = (var18 - var14) * var31;
                        double var39 = (var20 - var16) * var31;

                        for (int var41 = 0; var41 < 4; ++var41)
                        {
                            int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                            short var43 = 128;
                            double var44 = 0.25D;
                            double var46 = var33;
                            double var48 = (var35 - var33) * var44;

                            for (int var50 = 0; var50 < 4; ++var50)
                            {
                                int var51 = 0;

                                if (var11 * 8 + var30 < var5)
                                {
                                    var51 = 0;
                                }

                                if (var46 > 0.0D)
                                {
                                    var51 = DivineRPG.denseGrass.blockID;
                                }

                                var3[var42] = (byte)var51;
                                var42 += var43;
                                var46 += var48;
                            }

                            var33 += var37;
                            var35 += var39;
                        }

                        var14 += var22;
                        var16 += var24;
                        var18 += var26;
                        var20 += var28;
                    }
                }
            }
        }
    }

    public void replaceBlocksForBiome(int var1, int var2, byte[] var3)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks var4 = new ChunkProviderEvent.ReplaceBiomeBlocks(this, var1, var2, var3, (BiomeGenBase[])null);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.getResult() != Event.Result.DENY)
        {
            byte var5 = 64;
            double var6 = 0.03125D;
            this.slowsandNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.slowsandNoise, var1 * 16, var2 * 16, 0, 16, 16, 1, var6, var6, 1.0D);
            this.gravelNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.gravelNoise, var1 * 16, 109, var2 * 16, 16, 1, 16, var6, 1.0D, var6);
            this.netherrackExclusivityNoise = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(this.netherrackExclusivityNoise, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

            for (int var8 = 0; var8 < 16; ++var8)
            {
                for (int var9 = 0; var9 < 16; ++var9)
                {
                    boolean var10 = this.slowsandNoise[var8 + var9 * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
                    boolean var11 = this.gravelNoise[var8 + var9 * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
                    int var12 = (int)(this.netherrackExclusivityNoise[var8 + var9 * 16] / 3.0D + 3.0D + this.hellRNG.nextDouble() * 0.25D);
                    int var13 = -1;
                    byte var14 = (byte)DivineRPG.denseGrass.blockID;
                    byte var15 = (byte)DivineRPG.denseGrass.blockID;

                    for (int var16 = 127; var16 >= 0; --var16)
                    {
                        int var17 = (var9 * 16 + var8) * 128 + var16;

                        if (var16 < 127 - this.hellRNG.nextInt(5) && var16 > 0 + this.hellRNG.nextInt(5))
                        {
                            byte var18 = var3[var17];

                            if (var18 == 0)
                            {
                                var13 = -1;
                            }
                            else if (var18 == DivineRPG.denseGrass.blockID)
                            {
                                if (var13 == -1)
                                {
                                    if (var12 <= 0)
                                    {
                                        var14 = 0;
                                        var15 = (byte)DivineRPG.denseGrass.blockID;
                                    }
                                    else if (var16 >= var5 - 4 && var16 <= var5 + 1)
                                    {
                                        var14 = (byte)DivineRPG.denseGrass.blockID;
                                        var15 = (byte)DivineRPG.denseGrass.blockID;

                                        if (var11)
                                        {
                                            var14 = (byte)DivineRPG.twilightStone.blockID;
                                        }

                                        if (var11)
                                        {
                                            var15 = (byte)DivineRPG.twilightStone.blockID;
                                        }

                                        if (var10)
                                        {
                                            var14 = (byte)DivineRPG.twilightStone.blockID;
                                        }

                                        if (var10)
                                        {
                                            var15 = (byte)DivineRPG.twilightStone.blockID;
                                        }
                                    }

                                    if (var16 < var5 && var14 == 0)
                                    {
                                        var14 = 0;
                                    }

                                    var13 = var12;

                                    if (var16 >= var5 - 1)
                                    {
                                        var3[var17] = var14;
                                    }
                                    else
                                    {
                                        var3[var17] = var15;
                                    }
                                }
                                else if (var13 > 0)
                                {
                                    --var13;
                                    var3[var17] = var15;
                                }
                            }
                        }
                        else
                        {
                            var3[var17] = (byte)Block.bedrock.blockID;
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
        this.hellRNG.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
        byte[] var3 = new byte[32768];
        this.generateNetherTerrain(var1, var2, var3);
        this.replaceBlocksForBiome(var1, var2, var3);
        this.netherCaveGenerator.generate(this, this.worldObj, var1, var2, var3);
        this.genNetherBridge.generate(this, this.worldObj, var1, var2, var3);
        Chunk var4 = new Chunk(this.worldObj, var3, var1, var2);
        BiomeGenBase[] var5 = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, var1 * 16, var2 * 16, 16, 16);
        byte[] var6 = var4.getBiomeArray();

        for (int var7 = 0; var7 < var6.length; ++var7)
        {
            var6[var7] = (byte)var5[var7].biomeID;
        }

        var4.resetRelightChecks();
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

            double var9 = 684.412D;
            double var11 = 2053.236D;
            this.noiseData4 = this.netherNoiseGen6.generateNoiseOctaves(this.noiseData4, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
            this.noiseData5 = this.netherNoiseGen7.generateNoiseOctaves(this.noiseData5, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
            this.noiseData1 = this.netherNoiseGen3.generateNoiseOctaves(this.noiseData1, var2, var3, var4, var5, var6, var7, var9 / 80.0D, var11 / 60.0D, var9 / 80.0D);
            this.noiseData2 = this.netherNoiseGen1.generateNoiseOctaves(this.noiseData2, var2, var3, var4, var5, var6, var7, var9, var11, var9);
            this.noiseData3 = this.netherNoiseGen2.generateNoiseOctaves(this.noiseData3, var2, var3, var4, var5, var6, var7, var9, var11, var9);
            int var13 = 0;
            int var14 = 0;
            double[] var15 = new double[var6];
            int var16;

            for (var16 = 0; var16 < var6; ++var16)
            {
                var15[var16] = Math.cos((double)var16 * Math.PI * 6.0D / (double)var6) * 2.0D;
                double var17 = (double)var16;

                if (var16 > var6 / 2)
                {
                    var17 = (double)(var6 - 1 - var16);
                }

                if (var17 < 4.0D)
                {
                    var17 = 4.0D - var17;
                    var15[var16] -= var17 * var17 * var17 * 10.0D;
                }
            }

            for (var16 = 0; var16 < var5; ++var16)
            {
                for (int var37 = 0; var37 < var7; ++var37)
                {
                    double var18 = (this.noiseData4[var14] + 256.0D) / 512.0D;

                    if (var18 > 1.0D)
                    {
                        var18 = 1.0D;
                    }

                    double var20 = 0.0D;
                    double var22 = this.noiseData5[var14] / 8000.0D;

                    if (var22 < 0.0D)
                    {
                        var22 = -var22;
                    }

                    var22 = var22 * 3.0D - 3.0D;

                    if (var22 < 0.0D)
                    {
                        var22 /= 2.0D;

                        if (var22 < -1.0D)
                        {
                            var22 = -1.0D;
                        }

                        var22 /= 1.4D;
                        var22 /= 2.0D;
                        var18 = 0.0D;
                    }
                    else
                    {
                        if (var22 > 1.0D)
                        {
                            var22 = 1.0D;
                        }

                        var22 /= 6.0D;
                    }

                    var18 += 0.5D;
                    var22 = var22 * (double)var6 / 16.0D;
                    ++var14;

                    for (int var24 = 0; var24 < var6; ++var24)
                    {
                        double var25 = 0.0D;
                        double var27 = var15[var24];
                        double var29 = this.noiseData2[var13] / 512.0D;
                        double var31 = this.noiseData3[var13] / 512.0D;
                        double var33 = (this.noiseData1[var13] / 10.0D + 1.0D) / 2.0D;

                        if (var33 < 0.0D)
                        {
                            var25 = var29;
                        }
                        else if (var33 > 1.0D)
                        {
                            var25 = var31;
                        }
                        else
                        {
                            var25 = var29 + (var31 - var29) * var33;
                        }

                        var25 -= var27;
                        double var35;

                        if (var24 > var6 - 4)
                        {
                            var35 = (double)((float)(var24 - (var6 - 4)) / 3.0F);
                            var25 = var25 * (1.0D - var35) + -10.0D * var35;
                        }

                        if ((double)var24 < var20)
                        {
                            var35 = (var20 - (double)var24) / 4.0D;

                            if (var35 < 0.0D)
                            {
                                var35 = 0.0D;
                            }

                            if (var35 > 1.0D)
                            {
                                var35 = 1.0D;
                            }

                            var25 = var25 * (1.0D - var35) + -10.0D * var35;
                        }

                        var1[var13] = var25;
                        ++var13;
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
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(var1, this.worldObj, this.hellRNG, var2, var3, false));
        int var4 = var2 * 16;
        int var5 = var3 * 16;

        for (int var6 = 0; var6 < 2; ++var6)
        {
            int var7 = var4 + this.hellRNG.nextInt(16);
            int var8 = this.hellRNG.nextInt(128);
            int var9 = var5 + this.hellRNG.nextInt(16);
            (new WorldGenAugiteStone(50)).generate(this.worldObj, this.hellRNG, var7, var8, var9);
            (new WorldGenTwilightMineable(DivineRPG.denseOre.blockID, 8)).generate(this.worldObj, this.hellRNG, var7, var8, var9);
        }

        WorldGenDenseTrees var10 = new WorldGenDenseTrees(false);

        for (int var12 = 0; var12 < 15; ++var12)
        {
            int var11 = var4 + this.hellRNG.nextInt(16);
            int var14 = var5 + this.hellRNG.nextInt(16);
            int var13 = this.hellRNG.nextInt(128);
            var10.generate(this.worldObj, this.hellRNG, var11, var13, var14);
        }

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(this.worldObj, this.hellRNG, var4, var5));
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(var1, this.worldObj, this.hellRNG, var2, var3, false));
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
        return "HellRandomLevelSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType var1, int var2, int var3, int var4)
    {
        if (var1 == EnumCreatureType.monster && this.genNetherBridge.hasStructureAt(var2, var3, var4))
        {
            return this.genNetherBridge.getSpawnList();
        }
        else
        {
            BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(var2, var4);
            return var5 == null ? null : var5.getSpawnableList(var1);
        }
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World var1, String var2, int var3, int var4, int var5)
    {
        return null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void recreateStructures(int var1, int var2)
    {
        this.genNetherBridge.generate(this, this.worldObj, var1, var2, (byte[])null);
    }
}
