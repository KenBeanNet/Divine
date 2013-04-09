package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.world.World;

public abstract class EntityAmbientCreature extends EntityLiving implements IAnimals
{
    public EntityAmbientCreature(World var1)
    {
        super(var1);
    }

    public float getBlockPathWeight(int var1, int var2, int var3)
    {
        return 0.0F;
    }
}
