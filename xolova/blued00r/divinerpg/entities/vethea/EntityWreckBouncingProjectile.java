package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityWreckBouncingProjectile extends EntityBouncingProjectile
{
    public int damage;

    public EntityWreckBouncingProjectile(World var1)
    {
        super(var1);
    }

    public EntityWreckBouncingProjectile(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2, var3);
    }

    public EntityWreckBouncingProjectile(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }
}
