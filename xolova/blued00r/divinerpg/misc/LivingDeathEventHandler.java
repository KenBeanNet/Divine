package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class LivingDeathEventHandler
{
    public void onLivingDeathEvent(LivingDeathEvent var1)
    {
        if (var1.entityLiving.worldObj.getWorldInfo().getDimension() == DivineRPG.arcanaID && var1.source.getEntity() instanceof EntityPlayer)
        {
            InventoryPlayer var2 = ((EntityPlayer)var1.source.getEntity()).inventory;

            if (var2.hasItem(DivineRPG.collector.itemID))
            {
                for (int var3 = 0; var3 < 64; ++var3)
                {
                    if (var2.getStackInSlot(var3).itemID == DivineRPG.collector.itemID)
                    {
                        var2.getStackInSlot(var3).damageItem(1, (EntityLiving)var1.source.getEntity());
                    }
                }
            }
        }
    }
}
