package xolova.blued00r.divinerpg.misc;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityConstructor;

public class PlayerEventHandler
{
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onPlayerInteractEvent(PlayerInteractEvent var1)
    {
        if (var1.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK && var1.entityPlayer.inventory.getCurrentItem() != null && var1.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemBlock)
        {
            List var2 = var1.entityPlayer.worldObj.getLoadedEntityList();

            for (int var3 = 0; var3 < var2.size(); ++var3)
            {
                if (var2.get(var3) instanceof EntityConstructor)
                {
                    ((EntityConstructor)var2.get(var3)).teleportToEntity(var1.entityPlayer, var1.x, var1.y, var1.z);
                }
            }
        }
    }
}
