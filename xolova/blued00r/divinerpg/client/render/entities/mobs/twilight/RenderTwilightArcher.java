package xolova.blued00r.divinerpg.client.render.entities.mobs.twilight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.models.ModelTwilightArcher;

@SideOnly(Side.CLIENT)
public class RenderTwilightArcher extends RenderLiving
{
    protected ModelTwilightArcher modelBipedMain;
    protected float field_77070_b;

    public RenderTwilightArcher(ModelTwilightArcher var1, float var2)
    {
        this(var1, var2, 1.0F);
        this.modelBipedMain = var1;
    }

    public RenderTwilightArcher(ModelTwilightArcher var1, float var2, float var3)
    {
        super(var1, var2);
        this.modelBipedMain = var1;
        this.field_77070_b = var3;
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();

        if (var3 != null)
        {
            GL11.glPushMatrix();
            this.modelBipedMain.rightarm.postRender(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            IItemRenderer var4 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean var5 = var4 != null && var4.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            float var6;

            if (var3.getItem() instanceof ItemBlock && (var5 || RenderBlocks.renderItemIn3d(Block.blocksList[var3.itemID].getRenderType())))
            {
                var6 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                var6 *= 0.75F;
                GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
            }
            else if (var3.itemID == DivineRPG.energyBow.itemID)
            {
                var6 = 1.0F;
                GL11.glTranslatef(-0.6F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else if (var3.itemID == DivineRPG.mythrilBow.itemID)
            {
                var6 = 1.0F;
                GL11.glTranslatef(-0.6F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else if (var3.itemID == DivineRPG.twilightBow.itemID)
            {
                var6 = 1.0F;
                GL11.glTranslatef(-0.6F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else if (Item.itemsList[var3.itemID].isFull3D())
            {
                var6 = 0.625F;
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else
            {
                var6 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(var6, var6, var6);
                GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
            }

            this.renderManager.itemRenderer.renderItem(var1, var3, 0);

            if (var3.getItem().requiresMultipleRenderPasses())
            {
                for (int var7 = 1; var7 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var7)
                {
                    this.renderManager.itemRenderer.renderItem(var1, var3, var7);
                }
            }

            GL11.glPopMatrix();
        }
    }
}
