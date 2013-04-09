package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

public class EntityVetheanArrow extends EntityArrow
{
    public EntityVetheanArrow(World var1)
    {
        super(var1);
    }

    public EntityVetheanArrow(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    public EntityVetheanArrow(World var1, EntityLiving var2, EntityLiving var3, float var4, float var5)
    {
        super(var1, var2, var3, var4, var5);
    }

    public EntityVetheanArrow(World var1, EntityLiving var2, float var3)
    {
        super(var1, var2, var3);
    }
}
