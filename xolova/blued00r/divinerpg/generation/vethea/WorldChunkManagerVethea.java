package xolova.blued00r.divinerpg.generation.vethea;

import java.util.List;
import net.minecraft.world.biome.WorldChunkManager;
import xolova.blued00r.divinerpg.DivineRPG;

public class WorldChunkManagerVethea extends WorldChunkManager
{
    private List spawnBiomes;

    public WorldChunkManagerVethea()
    {
        allowedBiomes.clear();
        allowedBiomes.add(DivineRPG.arksianeBiome);
        allowedBiomes.add(DivineRPG.heliosisBiome);
    }
}
