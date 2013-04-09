package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class ItemPickUp
{
    @ForgeSubscribe
    public void onItemPickUp(EntityItemPickupEvent var1)
    {
        if (var1.entityPlayer != null && var1.item instanceof EntityItem)
        {
            ;
        }
    }
}
