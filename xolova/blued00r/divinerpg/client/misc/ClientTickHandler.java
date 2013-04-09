package xolova.blued00r.divinerpg.client.misc;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import java.util.EnumSet;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ClientTickHandler implements ITickHandler
{
    protected float zLevel = 0.0F;
    private static boolean initialized = false;
    private static boolean playedMusic = false;
    private Random rand;

    public void tickStart(EnumSet var1, Object ... var2)
    {
        this.onTickInGame();
    }

    public void tickEnd(EnumSet var1, Object ... var2)
    {
        if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized)
        {
            initialized = true;
            FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("\u00a71[DivineRPG] " + VersionHelper.getResultMessage());
        }
        else if (var1.equals(EnumSet.of(TickType.RENDER)))
        {
            this.onRenderTick();
        }
    }

    public EnumSet ticks()
    {
        return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER);
    }

    public String getLabel()
    {
        return "DivineRPG Client Ticks";
    }

    public void onRenderTick()
    {
        Minecraft var1 = Minecraft.getMinecraft();
        GuiIngame var2 = var1.ingameGUI;
        EntityClientPlayerMP var3 = Minecraft.getMinecraft().thePlayer;
        WorldClient var4 = FMLClientHandler.instance().getClient().theWorld;

        if (var1.currentScreen == null)
        {
            ScaledResolution var11 = new ScaledResolution(var1.gameSettings, var1.displayWidth, var1.displayHeight);
            int var12 = var11.getScaledWidth();
            int var13 = var11.getScaledHeight();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, var1.renderEngine.getTexture("/DivineRPG/arcanabartexturesheet.png"));
            int var7 = var13 - 18 + DivineRPG.ArcanaBarYoffset;
            int var5 = var12 - 110 + DivineRPG.ArcanaBarXoffset;
            var2.drawTexturedModalRect(var5, var7, 0, 0, 100, 9);
            var2.drawTexturedModalRect(var5, var7, 0, 9, (int)(12.5D * (double)(ArcanaList.get(var1.thePlayer.username).getBarValue() / 25.0F)), 18);
        }
    }

    public void onTickInGUI(GuiScreen var1) {}

    public void onTickInGame()
    {
        Minecraft var1 = Minecraft.getMinecraft();
        EntityClientPlayerMP var2 = Minecraft.getMinecraft().thePlayer;
        WorldClient var3 = var1.theWorld;

        if (var2 != null)
        {
            ItemStack var4 = var2.inventory.armorInventory[0];
            ItemStack var5 = var2.inventory.armorInventory[1];
            ItemStack var6 = var2.inventory.armorInventory[2];
            ItemStack var7 = var2.inventory.armorInventory[3];

            if (var4 != null && var5 != null && var6 != null && var7 != null)
            {
                if (var4.itemID == DivineRPG.angelicBoots.itemID && var5.itemID == DivineRPG.angelicLegs.itemID && var6.itemID == DivineRPG.angelicBody.itemID && var7.itemID == DivineRPG.angelicHead.itemID)
                {
                    var2.capabilities.allowFlying = true;
                    var2.addStat(AchievementPageDivineRPG.whenPigsFly, 1);
                }
                else if (var4.itemID == DivineRPG.shadowBoots.itemID && var5.itemID == DivineRPG.shadowLegs.itemID && var6.itemID == DivineRPG.shadowBody.itemID && var7.itemID == DivineRPG.shadowHead.itemID)
                {
                    var2.capabilities.func_82877_b(0.2F);
                }
                else if (var4.itemID == DivineRPG.santaBoots.itemID && var5.itemID == DivineRPG.santaLegs.itemID && var6.itemID == DivineRPG.santaBody.itemID && var7.itemID == DivineRPG.santaHead.itemID)
                {
                    var2.capabilities.func_82877_b(0.2F);
                }
                else if (var4.itemID == DivineRPG.glisteningBoots.itemID && var5.itemID == DivineRPG.glisteningLegs.itemID && var6.itemID == DivineRPG.glisteningChest.itemID && var7.itemID == DivineRPG.glisteningHelmetRanged.itemID)
                {
                    var2.capabilities.func_82877_b(0.14F);
                }
                else if (var4.itemID == DivineRPG.demonizedBoots.itemID && var5.itemID == DivineRPG.demonizedLegs.itemID && var6.itemID == DivineRPG.demonizedChest.itemID && var7.itemID == DivineRPG.demonizedHelmetRanged.itemID)
                {
                    var2.capabilities.func_82877_b(0.18F);
                }
                else if (var4.itemID == DivineRPG.tormentedBoots.itemID && var5.itemID == DivineRPG.tormentedLegs.itemID && var6.itemID == DivineRPG.tormentedChest.itemID && var7.itemID == DivineRPG.tormentedHelmetRanged.itemID)
                {
                    var2.capabilities.func_82877_b(0.2F);
                }
                else if (var4.itemID == DivineRPG.aquastriveBoots.itemID && var5.itemID == DivineRPG.aquastriveLegs.itemID && var6.itemID == DivineRPG.aquastriveBody.itemID && var7.itemID == DivineRPG.aquastriveHead.itemID)
                {
                    int var8 = MathHelper.floor_double(var2.posX);
                    int var9 = MathHelper.floor_double(var2.posY - 2.0D);
                    int var10 = MathHelper.floor_double(var2.posZ);

                    if (var3.getBlockId(var8, var9, var10) != Block.ice.blockID)
                    {
                        if (var2.isInWater())
                        {
                            var2.motionX *= 1.045D;
                            var2.motionZ *= 1.045D;
                        }

                        if (var2.motionX > 1.045D || var2.motionZ > 1.045D)
                        {
                            var2.motionX = 1.045D;
                            var2.motionZ = 1.045D;
                        }

                        if (var2.motionX < -1.045D || var2.motionX < -1.045D)
                        {
                            var2.motionX = -1.045D;
                            var2.motionZ = -1.045D;
                        }
                    }
                }
                else
                {
                    var2.capabilities.func_82877_b(0.1F);
                }
            }
            else
            {
                if (var2.capabilities.isCreativeMode)
                {
                    var2.capabilities.allowFlying = true;
                }
                else
                {
                    var2.capabilities.allowFlying = false;
                }

                var2.capabilities.func_82877_b(0.1F);
            }
        }
    }
}
