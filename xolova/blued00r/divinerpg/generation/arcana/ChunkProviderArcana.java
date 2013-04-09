package xolova.blued00r.divinerpg.generation.arcana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.world.gen.FlatLayerInfo;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenStructure;

public class ChunkProviderArcana implements IChunkProvider
{
    private World worldObj;
    private Random random;
    private final byte[] field_82700_c = new byte[256];
    private final byte[] field_82698_d = new byte[256];
    private final FlatGeneratorInfo field_82699_e;
    private final List structureGenerators = new ArrayList();
    private final boolean field_82697_g;
    private final boolean field_82702_h;
    private WorldGenLakes waterLakeGenerator;
    private WorldGenLakes lavaLakeGenerator;
    private ArrayList rooms;
    private DungeonCeiling ceiling;

    public ChunkProviderArcana(World var1, long var2, boolean var4, String var5)
    {
        this.worldObj = var1;
        this.random = new Random(var2);
        this.field_82699_e = FlatGeneratorInfo.createFlatGeneratorFromString(var5);
        this.field_82697_g = this.field_82699_e.getWorldFeatures().containsKey("decoration");

        if (this.field_82699_e.getWorldFeatures().containsKey("lake"))
        {
            this.waterLakeGenerator = new WorldGenLakes(Block.waterStill.blockID);
        }

        if (this.field_82699_e.getWorldFeatures().containsKey("lava_lake"))
        {
            this.lavaLakeGenerator = new WorldGenLakes(Block.lavaStill.blockID);
        }

        this.field_82702_h = this.field_82699_e.getWorldFeatures().containsKey("dungeon");
        Iterator var6 = this.field_82699_e.getFlatLayers().iterator();

        while (var6.hasNext())
        {
            FlatLayerInfo var7 = (FlatLayerInfo)var6.next();

            for (int var8 = var7.getMinY(); var8 < var7.getMinY() + var7.getLayerCount(); ++var8)
            {
                this.field_82700_c[var8] = (byte)(var7.getFillBlock() & 255);
                this.field_82698_d[var8] = (byte)var7.getFillBlockMeta();
            }
        }

        this.rooms = new ArrayList(22);
        this.rooms.add(new DungeonComponent());
        this.rooms.add(new DungeonComponent1());
        this.rooms.add(new DungeonComponent2());
        this.rooms.add(new DungeonComponent3());
        this.rooms.add(new DungeonComponent4());
        this.rooms.add(new DungeonComponent5());
        this.rooms.add(new DungeonComponent6());
        this.rooms.add(new DungeonComponent7());
        this.rooms.add(new DungeonComponent9());
        this.rooms.add(new DungeonComponent10());
        this.rooms.add(new DungeonComponent11());
        this.rooms.add(new DungeonComponent12());
        this.rooms.add(new DungeonComponent13());
        this.rooms.add(new DungeonComponent14());
        this.rooms.add(new DungeonComponent15());
        this.rooms.add(new DungeonComponent16());
        this.rooms.add(new DungeonComponent17());
        this.rooms.add(new DungeonComponent22());
        this.rooms.add(new DungeonComponenet18());
        this.rooms.add(new DungeonComponenet19());
        this.rooms.add(new DungeonComponent8());
        this.rooms.add(new DungeonComponent20());
        this.rooms.add(new DungeonComponent21());
        this.ceiling = new DungeonCeiling();
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
        this.random.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
        byte[] var3 = new byte[32768];
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
        int var4 = var2 * 16;
        int var5 = var3 * 16;
        this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        boolean var7 = false;
        this.random.setSeed(this.worldObj.getSeed());
        long var8 = this.random.nextLong() / 2L * 2L + 1L;
        long var10 = this.random.nextLong() / 2L * 2L + 1L;
        this.random.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.worldObj.getSeed());
        Iterator var12 = this.structureGenerators.iterator();
        Random var15 = this.random;
        Chunk var16 = this.worldObj.getChunkFromChunkCoords(var2, var3);
        ArrayList var17 = this.rooms;

        for (int var18 = 1; var18 < 5; ++var18)
        {
            int var13 = var15.nextInt(23);
            int var14 = var15.nextInt(5);

            if (var13 > 19 && var14 != 0 || var18 > 3)
            {
                var13 = var15.nextInt(20);
            }

            if (var13 < 21)
            {
                ((DungeonComponentBase)((DungeonComponentBase)var17.get(var13))).generate(var16, var15, var4, var18 * 8, var5);
            }
            else
            {
                ((WorldGenerator)((WorldGenerator)var17.get(var13))).generate(this.worldObj, var15, var4, var18 * 8, var5);
            }
        }

        DungeonCeiling var19 = this.ceiling;
        var19.generate(var16, var15, var4, 40, var5);
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
        return "ArcanaDungeonSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType var1, int var2, int var3, int var4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(var2, var4);
        return var5 == null ? null : var5.getSpawnableList(var1);
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World var1, String var2, int var3, int var4, int var5)
    {
        if ("Stronghold".equals(var2))
        {
            Iterator var6 = this.structureGenerators.iterator();

            while (var6.hasNext())
            {
                MapGenStructure var7 = (MapGenStructure)var6.next();

                if (var7 instanceof MapGenStronghold)
                {
                    return var7.getNearestInstance(var1, var3, var4, var5);
                }
            }
        }

        return null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void recreateStructures(int param1, int param2)
    {
    }

}
