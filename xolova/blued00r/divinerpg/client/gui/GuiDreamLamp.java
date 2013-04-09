package xolova.blued00r.divinerpg.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.containers.ContainerDreamLamp;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;

public class GuiDreamLamp extends GuiContainer
{
    TileEntityDreamLamp TeDreamLamp;

    public GuiDreamLamp(InventoryPlayer var1, TileEntityDreamLamp var2)
    {
        super(new ContainerDreamLamp(var1, var2));
        this.TeDreamLamp = var2;
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        int var4 = this.mc.renderEngine.getTexture("/gui/Lamp.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);

        if (this.TeDreamLamp.isBurning())
        {
            byte var7 = 12;
            this.drawTexturedModalRect(var5 + 81, var6 + 31 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
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
