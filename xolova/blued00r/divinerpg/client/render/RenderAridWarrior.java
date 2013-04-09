package xolova.blued00r.divinerpg.client.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.client.models.ModelAridWarrior;
import xolova.blued00r.divinerpg.entities.mobs.EntityAridWarrior;

@SideOnly(Side.CLIENT)
public class RenderAridWarrior extends RenderLiving
{
    protected ModelAridWarrior modelBipedMain;
    protected float field_77070_b;

    public RenderAridWarrior(ModelAridWarrior var1, float var2)
    {
        this(var1, var2, 1.0F);
        this.modelBipedMain = var1;
    }

    public RenderAridWarrior(ModelAridWarrior var1, float var2, float var3)
    {
        super(var1, var2);
        this.modelBipedMain = var1;
        this.field_77070_b = var3;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityAridWarrior)var1, var2, var4, var6, var8, var9);
    }

    public void func_48421_a(EntityAridWarrior var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityAridWarrior var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a(var1, var2, var4, var6, var8, var9);
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();

        if (var3 != null)
        {
            GL11.glPushMatrix();
            this.modelBipedMain.rightarmBS2.postRender(0.0625F);
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
            else if (var3.itemID == Item.bow.itemID)
            {
                var6 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
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
