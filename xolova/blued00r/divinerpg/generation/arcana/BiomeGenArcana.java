package xolova.blued00r.divinerpg.generation.arcana;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArcana extends BiomeGenBase
{
    public BiomeGenArcana(int var1)
    {
        super(var1);
        this.setBiomeName("Arcana");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = 0;
        this.fillerBlock = 0;
        this.waterColorMultiplier = 2368548;
    }
}
