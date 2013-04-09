package xolova.blued00r.divinerpg.misc;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import xolova.blued00r.divinerpg.DivineRPG;

public class ServerTickHandler implements ITickHandler
{
    private static final int var6 = 0;
    private int healTimer;

    public void tickStart(EnumSet var1, Object ... var2) {}

    public void tickEnd(EnumSet var1, Object ... var2)
    {
        this.onTickInGame();
        this.arcanaRegen();
    }

    public EnumSet ticks()
    {
        return EnumSet.of(TickType.SERVER);
    }

    public String getLabel()
    {
        return "DivineRPG Server Ticks";
    }

    public void onRenderTick() {}

    public void onTickInGUI(GuiScreen var1) {}

    public void arcanaRegen()
    {
        ArcanaList.updateAllBars(MinecraftServer.getServer().getConfigurationManager().playerEntityList);
    }

    public void onTickInGame()
    {
        ArrayList var1 = (ArrayList)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        Iterator var2 = var1.iterator();

        while (var2.hasNext())
        {
            EntityPlayerMP var3 = (EntityPlayerMP)var2.next();
            ItemStack var4 = var3.inventory.armorInventory[0];
            ItemStack var5 = var3.inventory.armorInventory[1];
            ItemStack var6x = var3.inventory.armorInventory[2];
            ItemStack var7 = var3.inventory.armorInventory[3];
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;

            if (var4 != null)
            {
                var8 = var4.itemID;
            }

            if (var6x != null)
            {
                var9 = var6x.itemID;
            }

            if (var5 != null)
            {
                var10 = var5.itemID;
            }

            if (var7 != null)
            {
                var11 = var7.itemID;
            }

            if (var3.capabilities.isCreativeMode)
            {
                var3.capabilities.allowFlying = true;
            }
            else
            {
                var3.capabilities.allowFlying = false;
            }

            if (var8 == DivineRPG.krakenBoots.itemID && var10 == DivineRPG.krakenLegs.itemID && var9 == DivineRPG.krakenBody.itemID && var11 == DivineRPG.krakenHead.itemID)
            {
                var3.setAir(300);
            }
            else if (var8 == DivineRPG.aquastriveBoots.itemID && var10 == DivineRPG.aquastriveLegs.itemID && var9 == DivineRPG.aquastriveBody.itemID && var11 == DivineRPG.aquastriveHead.itemID)
            {
                var3.setAir(300);
            }
            else if (var8 != DivineRPG.shadowBoots.itemID || var10 != DivineRPG.shadowLegs.itemID || var9 != DivineRPG.shadowBody.itemID || var11 != DivineRPG.shadowHead.itemID)
            {
                if (var8 == DivineRPG.kormaBoots.itemID && var10 == DivineRPG.kormaLegs.itemID && var9 == DivineRPG.kormaBody.itemID && var11 == DivineRPG.kormaHead.itemID)
                {
                    if (ArcanaList.get(var3.username).getBarValue() < 200.0F)
                    {
                        ArcanaList.get(var3.username).arcanaAdd(1);
                    }
                }
                else if (var8 == DivineRPG.vemosBoots.itemID && var10 == DivineRPG.vemosLegs.itemID && var9 == DivineRPG.vemosBody.itemID && var11 == DivineRPG.vemosHead.itemID)
                {
                    if (this.healTimer == 4)
                    {
                        var3.heal(1);
                        this.healTimer = 0;
                    }
                    else
                    {
                        ++this.healTimer;
                    }
                }
                else if (var8 == DivineRPG.angelicBoots.itemID && var10 == DivineRPG.angelicLegs.itemID && var9 == DivineRPG.angelicBody.itemID && var11 == DivineRPG.angelicHead.itemID)
                {
                    var3.fallDistance = 0.0F;
                }
                else if (var8 == DivineRPG.bedrockBoots.itemID && var10 == DivineRPG.bedrockLegs.itemID && var9 == DivineRPG.bedrockBody.itemID && var11 == DivineRPG.bedrockHead.itemID)
                {
                    var3.fallDistance = 0.0F;
                }
                else if (var8 == DivineRPG.skeleManBoots.itemID && var10 == DivineRPG.skeleManLegs.itemID && var9 == DivineRPG.skeleManBody.itemID && var11 == DivineRPG.skeleManHead.itemID && var3.getFoodStats().getFoodLevel() < 20)
                {
                    var3.getFoodStats().addStats(1, 0.0F);
                }
                else if (var8 == DivineRPG.santaBoots.itemID && var10 == DivineRPG.santaLegs.itemID && var9 == DivineRPG.santaBody.itemID && var11 == DivineRPG.santaHead.itemID && var3.worldObj.provider.dimensionId == DivineRPG.iceikaID)
                {
                    var3.fallDistance = 0.0F;

                    if (var3.getFoodStats().getFoodLevel() < 20)
                    {
                        var3.getFoodStats().addStats(1, 0.0F);
                    }

                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
                }
                else if (var8 == DivineRPG.denseBoots.itemID && var10 == DivineRPG.denseLegs.itemID && var9 == DivineRPG.denseBody.itemID && var11 == DivineRPG.denseHead.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 1));
                }
                else if (var8 == DivineRPG.divineBoots.itemID && var10 == DivineRPG.divineLegs.itemID && var9 == DivineRPG.divineBody.itemID && var11 == DivineRPG.divineHead.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
                }
                else if (var8 == DivineRPG.ultimaBoots.itemID && var10 == DivineRPG.ultimaLegs.itemID && var9 == DivineRPG.ultimaBody.itemID && var11 == DivineRPG.ultimaHead.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 3));
                }
                else if (var8 == DivineRPG.azuriteBoots.itemID && var10 == DivineRPG.azuriteLegs.itemID && var9 == DivineRPG.azuriteBody.itemID && var11 == DivineRPG.azuriteHead.itemID && var3.getAir() < 300 && var3.getHealth() < 20)
                {
                    var3.heal(1);
                }
                else if (var8 == DivineRPG.glisteningBoots.itemID && var10 == DivineRPG.glisteningLegs.itemID && var9 == DivineRPG.glisteningChest.itemID && var11 == DivineRPG.glisteningHelmetMelee.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 0));
                }
                else if (var8 == DivineRPG.demonizedBoots.itemID && var10 == DivineRPG.demonizedLegs.itemID && var9 == DivineRPG.demonizedChest.itemID && var11 == DivineRPG.demonizedHelmetMelee.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 1));
                }
                else if (var8 == DivineRPG.tormentedBoots.itemID && var10 == DivineRPG.tormentedLegs.itemID && var9 == DivineRPG.tormentedChest.itemID && var11 == DivineRPG.tormentedHelmetMelee.itemID)
                {
                    var3.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
                }
                else if (var8 == DivineRPG.glisteningBoots.itemID && var10 == DivineRPG.glisteningLegs.itemID && var9 == DivineRPG.glisteningChest.itemID && var11 == DivineRPG.glisteningHelmetArcana.itemID)
                {
                    var3.fallDistance = 0.0F;
                }
                else if (var8 == DivineRPG.demonizedBoots.itemID && var10 == DivineRPG.demonizedLegs.itemID && var9 == DivineRPG.demonizedChest.itemID && var11 == DivineRPG.demonizedHelmetArcana.itemID)
                {
                    var3.fallDistance = 0.0F;
                }
                else if (var8 == DivineRPG.tormentedBoots.itemID && var10 == DivineRPG.tormentedLegs.itemID && var9 == DivineRPG.tormentedChest.itemID && var11 == DivineRPG.tormentedHelmetArcana.itemID)
                {
                    var3.fallDistance = 0.0F;
                }
            }
        }
    }
}
