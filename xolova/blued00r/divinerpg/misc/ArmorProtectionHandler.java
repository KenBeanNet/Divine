package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class ArmorProtectionHandler
{
    @ForgeSubscribe
    public void onLivingHurtEvent(LivingHurtEvent var1)
    {
        if (var1.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer var2 = (EntityPlayer)var1.entityLiving;
            ItemStack var3 = var2.inventory.armorInventory[0];
            ItemStack var4 = var2.inventory.armorInventory[1];
            ItemStack var5 = var2.inventory.armorInventory[2];
            ItemStack var6 = var2.inventory.armorInventory[3];
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;

            if (var3 != null)
            {
                var7 = var3.itemID;
            }

            if (var5 != null)
            {
                var8 = var5.itemID;
            }

            if (var4 != null)
            {
                var9 = var4.itemID;
            }

            if (var6 != null)
            {
                var10 = var6.itemID;
            }

            DamageSource var11 = var1.source;

            if (var7 == DivineRPG.netheriteBoots.itemID && var9 == DivineRPG.netheriteLegs.itemID && var8 == DivineRPG.netheriteBody.itemID && var10 == DivineRPG.netheriteHead.itemID)
            {
                if (var11.equals(DamageSource.inFire) || var11.equals(DamageSource.onFire))
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.infernoBoots.itemID && var9 == DivineRPG.infernoLegs.itemID && var8 == DivineRPG.infernoBody.itemID && var10 == DivineRPG.infernoHead.itemID)
            {
                if (var11 == DamageSource.inFire || var11 == DamageSource.onFire || var11 == DamageSource.lava)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.grimReaperBoots.itemID && var9 == DivineRPG.grimReaperLegs.itemID && var8 == DivineRPG.grimReaperBody.itemID && var10 == DivineRPG.grimReaperHead.itemID)
            {
                if (var11 == DamageSource.wither)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBoots.itemID && var9 == DivineRPG.enderLegs.itemID && var8 == DivineRPG.enderBody.itemID && var10 == DivineRPG.enderHead.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBootsRed.itemID && var9 == DivineRPG.enderLegsRed.itemID && var8 == DivineRPG.enderBodyRed.itemID && var10 == DivineRPG.enderHeadRed.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBootsBlue.itemID && var9 == DivineRPG.enderLegsBlue.itemID && var8 == DivineRPG.enderBodyBlue.itemID && var10 == DivineRPG.enderHeadBlue.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBootsGreen.itemID && var9 == DivineRPG.enderLegsGreen.itemID && var8 == DivineRPG.enderBodyGreen.itemID && var10 == DivineRPG.enderHeadGreen.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBootsYellow.itemID && var9 == DivineRPG.enderLegsYellow.itemID && var8 == DivineRPG.enderBodyYellow.itemID && var10 == DivineRPG.enderHeadYellow.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.enderBootsBlack.itemID && var9 == DivineRPG.enderLegsBlack.itemID && var8 == DivineRPG.enderBodyBlack.itemID && var10 == DivineRPG.enderHeadBlack.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.bedrockBoots.itemID && var9 == DivineRPG.bedrockLegs.itemID && var8 == DivineRPG.bedrockBody.itemID && var10 == DivineRPG.bedrockHead.itemID)
            {
                if (var11 == DamageSource.explosion || var11 == DamageSource.explosion2 || var11 == DamageSource.lava || var11 == DamageSource.inFire || var11 == DamageSource.onFire)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.eliteRealmiteBoots.itemID && var9 == DivineRPG.eliteRealmiteLegs.itemID && var8 == DivineRPG.eliteRealmiteBody.itemID && var10 == DivineRPG.eliteRealmiteHead.itemID)
            {
                if (var11 == DamageSource.fall)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.crystonalBoots.itemID && var9 == DivineRPG.crystonalLegs.itemID && var8 == DivineRPG.crystonalBody.itemID && var10 == DivineRPG.crystonalHead.itemID)
            {
                if (var11.isProjectile() || var11.damageType.equals("thrown"))
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBoots.itemID && var9 == DivineRPG.plasmaLegs.itemID && var8 == DivineRPG.plasmaBody.itemID && var10 == DivineRPG.plasmaHead.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBootsRed.itemID && var9 == DivineRPG.plasmaLegsRed.itemID && var8 == DivineRPG.plasmaBodyRed.itemID && var10 == DivineRPG.plasmaHeadRed.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBootsGreen.itemID && var9 == DivineRPG.plasmaLegsGreen.itemID && var8 == DivineRPG.plasmaBodyGreen.itemID && var10 == DivineRPG.plasmaHeadGreen.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBootsYellow.itemID && var9 == DivineRPG.plasmaLegsYellow.itemID && var8 == DivineRPG.plasmaBodyYellow.itemID && var10 == DivineRPG.plasmaHeadYellow.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBootsBlue.itemID && var9 == DivineRPG.plasmaLegsBlue.itemID && var8 == DivineRPG.plasmaBodyBlue.itemID && var10 == DivineRPG.plasmaHeadBlue.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.plasmaBootsBlack.itemID && var9 == DivineRPG.plasmaLegsBlack.itemID && var8 == DivineRPG.plasmaBodyBlack.itemID && var10 == DivineRPG.plasmaHeadBlack.itemID)
            {
                if (var11 == DamageSource.generic || var11.damageType.equals("mob") && !var11.isProjectile())
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.santaBoots.itemID && var9 == DivineRPG.santaLegs.itemID && var8 == DivineRPG.santaBody.itemID && var10 == DivineRPG.santaHead.itemID)
            {
                if (var1.entityLiving.worldObj.provider.dimensionId == DivineRPG.iceikaID)
                {
                    var1.ammount = (int)((double)var1.ammount * 0.2D);
                }
            }
            else if (var7 == DivineRPG.divineBoots.itemID && var9 == DivineRPG.divineLegs.itemID && var8 == DivineRPG.divineBody.itemID && var10 == DivineRPG.divineHead.itemID)
            {
                if (var11 == DamageSource.fall)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.mythrilBoots.itemID && var9 == DivineRPG.mythrilLegs.itemID && var8 == DivineRPG.mythrilBody.itemID && var10 == DivineRPG.mythrilHead.itemID)
            {
                if (var11 == DamageSource.fall)
                {
                    var1.setCanceled(true);
                }
            }
            else if (var7 == DivineRPG.energyCrystalBoots.itemID && var9 == DivineRPG.energyCrystalLegs.itemID && var8 == DivineRPG.energyCrystalBody.itemID && var10 == DivineRPG.energyCrystalHead.itemID)
            {
                if (var11 == DamageSource.cactus || var11 == DamageSource.fallingBlock || var11 == DamageSource.anvil || var11 == DamageSource.inWall)
                {
                    var1.setCanceled(true);
                }
            }
            else
            {
                double var12;

                if (var10 == DivineRPG.degradedHelmetMelee.itemID)
                {
                    if (this.isMelee(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.degradedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.degradedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.degradedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.degradedHelmetRanged.itemID)
                {
                    if (this.isRanged(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.degradedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.degradedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.degradedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.degradedHelmetArcana.itemID)
                {
                    if (this.isArcana(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.degradedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.degradedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.degradedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.glisteningHelmetMelee.itemID)
                {
                    if (this.isMelee(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.glisteningChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.glisteningLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.glisteningBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.glisteningHelmetRanged.itemID)
                {
                    if (this.isRanged(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.glisteningChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.glisteningLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.glisteningBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.glisteningHelmetArcana.itemID)
                {
                    if (this.isArcana(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.glisteningChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.glisteningLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.glisteningBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.finishedHelmetMelee.itemID)
                {
                    if (this.isMelee(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.finishedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.finishedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.finishedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.finishedHelmetRanged.itemID)
                {
                    if (this.isRanged(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.finishedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.finishedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.finishedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.finishedHelmetArcana.itemID)
                {
                    if (this.isArcana(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.finishedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.finishedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.finishedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.demonizedHelmetMelee.itemID)
                {
                    if (this.isMelee(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.demonizedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.demonizedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.demonizedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.demonizedHelmetRanged.itemID)
                {
                    if (this.isRanged(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.demonizedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.demonizedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.demonizedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.demonizedHelmetArcana.itemID)
                {
                    if (this.isArcana(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.demonizedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.demonizedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.demonizedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.tormentedHelmetMelee.itemID)
                {
                    if (this.isMelee(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.tormentedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.tormentedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.tormentedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.tormentedHelmetRanged.itemID)
                {
                    if (this.isRanged(var11))
                    {
                        var12 = 0.03D;

                        if (var8 == DivineRPG.tormentedChest.itemID)
                        {
                            var12 += 0.06D;
                        }

                        if (var9 == DivineRPG.tormentedLegs.itemID)
                        {
                            var12 += 0.045D;
                        }

                        if (var7 == DivineRPG.tormentedBoots.itemID)
                        {
                            var12 += 0.015D;
                        }

                        var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                    }
                }
                else if (var10 == DivineRPG.tormentedHelmetArcana.itemID && this.isArcana(var11))
                {
                    var12 = 0.03D;

                    if (var8 == DivineRPG.tormentedChest.itemID)
                    {
                        var12 += 0.06D;
                    }

                    if (var9 == DivineRPG.tormentedLegs.itemID)
                    {
                        var12 += 0.045D;
                    }

                    if (var7 == DivineRPG.tormentedBoots.itemID)
                    {
                        var12 += 0.015D;
                    }

                    var1.ammount = (int)((double)var1.ammount * (1.0D - var12));
                }
            }
        }
    }

    @ForgeSubscribe
    public void onLivingJumpEvent(LivingEvent.LivingJumpEvent var1)
    {
        if (var1.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer var2 = (EntityPlayer)var1.entityLiving;
            ItemStack var3 = var2.inventory.armorInventory[0];
            ItemStack var4 = var2.inventory.armorInventory[1];
            ItemStack var5 = var2.inventory.armorInventory[2];
            ItemStack var6 = var2.inventory.armorInventory[3];
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;

            if (var3 != null)
            {
                var7 = var3.itemID;
            }

            if (var5 != null)
            {
                var8 = var5.itemID;
            }

            if (var4 != null)
            {
                var9 = var4.itemID;
            }

            if (var6 != null)
            {
                var10 = var6.itemID;
            }

            if (var7 == DivineRPG.mythrilBoots.itemID && var9 == DivineRPG.mythrilLegs.itemID && var8 == DivineRPG.mythrilBody.itemID && var10 == DivineRPG.mythrilHead.itemID)
            {
                var2.addVelocity(0.0D, 0.5D, 0.0D);
            }
            else if (var7 == DivineRPG.divineBoots.itemID && var9 == DivineRPG.divineLegs.itemID && var8 == DivineRPG.divineBody.itemID && var10 == DivineRPG.divineHead.itemID)
            {
                var2.addVelocity(0.0D, 0.2D, 0.0D);
            }
            else if (var10 == DivineRPG.glisteningHelmetArcana.itemID && var9 == DivineRPG.glisteningLegs.itemID && var8 == DivineRPG.glisteningChest.itemID && var7 == DivineRPG.glisteningBoots.itemID)
            {
                var2.addVelocity(0.0D, 0.2D, 0.0D);
            }
            else if (var10 == DivineRPG.demonizedHelmetArcana.itemID && var9 == DivineRPG.demonizedLegs.itemID && var8 == DivineRPG.demonizedChest.itemID && var7 == DivineRPG.demonizedBoots.itemID)
            {
                var2.addVelocity(0.0D, 0.3D, 0.0D);
            }
            else if (var10 == DivineRPG.tormentedHelmetArcana.itemID && var9 == DivineRPG.tormentedLegs.itemID && var8 == DivineRPG.tormentedChest.itemID && var7 == DivineRPG.tormentedBoots.itemID)
            {
                var2.addVelocity(0.0D, 0.4D, 0.0D);
            }
        }
    }

    private boolean isRanged(DamageSource var1)
    {
        return var1.isProjectile() || var1.damageType.equals("thrown");
    }

    private boolean isArcana(DamageSource var1)
    {
        return var1.isMagicDamage();
    }

    private boolean isMelee(DamageSource var1)
    {
        return !var1.isProjectile() && !var1.isFireDamage() && !var1.isMagicDamage() && !this.isExplosion(var1) && var1 != DamageSource.fall && var1 != DamageSource.cactus && var1 != DamageSource.wither && var1 != DamageSource.starve;
    }

    private boolean isExplosion(DamageSource var1)
    {
        return var1 == DamageSource.explosion || var1 == DamageSource.explosion2;
    }
}
