package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntitySpinebackDisc;

public class ItemSpinebackDisc extends ItemVetheanDisk
{
    public ItemSpinebackDisc(int var1, int var2)
    {
        super(var1, var2);
        this.setMaxStackSize(5);
    }

    public void shoot(World var1, EntityPlayer var2)
    {
        var1.spawnEntityInWorld(new EntitySpinebackDisc(var1, var2, this.damage, this));
    }
}
