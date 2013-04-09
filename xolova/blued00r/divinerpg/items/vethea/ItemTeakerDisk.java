package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityTeakerDisk;

public class ItemTeakerDisk extends ItemVetheanDisk
{
    public ItemTeakerDisk(int var1, int var2)
    {
        super(var1, var2);
    }

    public void shoot(World var1, EntityPlayer var2)
    {
        var1.spawnEntityInWorld(new EntityTeakerDisk(var1, var2, this.damage, this));
    }
}
