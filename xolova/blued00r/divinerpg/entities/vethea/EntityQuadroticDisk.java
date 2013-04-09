package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityQuadroticDisk extends EntityDisk
{
    public EntityQuadroticDisk(World var1)
    {
        super(var1);
    }

    public EntityQuadroticDisk(World var1, EntityLiving var2, int var3, Item var4)
    {
        super(var1, var2, var3, var4);
    }

    public EntityQuadroticDisk(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }
}
