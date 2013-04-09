package xolova.blued00r.divinerpg.client.gui;

import java.awt.Color;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;

public class GuiInfusionTable extends GuiContainer
{
    private TileEntityInfusionTable TeInfusionTable;

    public GuiInfusionTable(InventoryPlayer var1, TileEntityInfusionTable var2)
    {
        super(new ContainerInfusionTable(var1, var2));
        this.TeInfusionTable = var2;
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        int var4 = this.mc.renderEngine.getTexture("/gui/InfusionTable.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int var1, int var2, float var3)
    {
        super.drawScreen(var1, var2, var3);
        ItemStack var4 = null;
        String var5 = null;
        var4 = this.TeInfusionTable.getStackInSlot(2);

        if (var4 != null)
        {
            var5 = var4.getDisplayName();
            this.drawString(this.fontRenderer, var5, this.width / 2 - 20, 62, Color.blue.getRGB());
        }
    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in single-player
     */
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char var1, int var2)
    {
        if (var2 == 1 || var2 == this.mc.gameSettings.keyBindInventory.keyCode)
        {
            this.mc.thePlayer.closeScreen();
        }
    }
}
