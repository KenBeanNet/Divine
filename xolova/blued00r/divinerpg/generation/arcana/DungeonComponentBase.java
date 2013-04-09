package xolova.blued00r.divinerpg.generation.arcana;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public abstract class DungeonComponentBase
{
    private final boolean doBlockNotify;
    private int field_82631_b = 1;

    public DungeonComponentBase()
    {
        this.doBlockNotify = false;
    }

    public DungeonComponentBase(boolean var1)
    {
        this.doBlockNotify = var1;
    }

    public abstract boolean generate(Chunk var1, Random var2, int var3, int var4, int var5);

    public void setScale(double var1, double var3, double var5) {}

    protected void setBlock(World var1, int var2, int var3, int var4, int var5)
    {
        this.setBlockAndMetadata(var1, var2, var3, var4, var5, 0);
    }

    protected void setBlockAndMetadata(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        if (this.doBlockNotify)
        {
            var1.setBlockAndMetadataWithNotify(var2, var3, var4, var5, var6);
        }
        else
        {
            var1.setBlockAndMetadata(var2, var3, var4, var5, var6);
        }
    }
}
