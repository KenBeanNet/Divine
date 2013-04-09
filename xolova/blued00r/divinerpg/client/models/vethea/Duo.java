package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityDuo;

public class Duo extends ModelBase
{
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer rotates1;
    ModelRenderer rotates2;
    ModelRenderer rotates3;
    ModelRenderer rotates4;
    ModelRenderer rotates5;
    ModelRenderer rotates6;
    ModelRenderer rotates7;
    ModelRenderer rotates8;
    ModelRenderer rotates9;
    ModelRenderer rotates10;
    ModelRenderer rotates11;
    ModelRenderer rotates12;
    ModelRenderer rotates13;
    ModelRenderer rotates14;
    ModelRenderer rotates15;
    ModelRenderer rotates17;
    ModelRenderer rotates16;
    ModelRenderer rotates18;
    ModelRenderer rotates19;
    ModelRenderer rotates20;
    ModelRenderer rightleg2;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer leftleg4;
    ModelRenderer rightleg4;

    public Duo()
    {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.rightleg = new ModelRenderer(this, 101, 16);
        this.rightleg.addBox(-4.0F, -4.0F, -3.0F, 6, 4, 6);
        this.rightleg.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(128, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 101, 16);
        this.leftleg.addBox(-3.0F, -4.0F, -3.0F, 6, 4, 6);
        this.leftleg.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(128, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rotates1 = new ModelRenderer(this, 82, 16);
        this.rotates1.addBox(4.0F, -16.0F, -12.0F, 4, 12, 4);
        this.rotates1.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotates1.setTextureSize(128, 32);
        this.rotates1.mirror = true;
        this.setRotation(this.rotates1, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotates2 = new ModelRenderer(this, 82, 16);
        this.rotates2.addBox(-8.0F, -15.0F, -12.0F, 4, 12, 4);
        this.rotates2.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates2.setTextureSize(128, 32);
        this.rotates2.mirror = true;
        this.setRotation(this.rotates2, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotates3 = new ModelRenderer(this, 54, 20);
        this.rotates3.addBox(-7.0F, -8.0F, -22.0F, 2, 2, 10);
        this.rotates3.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates3.setTextureSize(128, 32);
        this.rotates3.mirror = true;
        this.setRotation(this.rotates3, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotates4 = new ModelRenderer(this, 34, 0);
        this.rotates4.addBox(-3.0F, -18.0F, -6.0F, 6, 12, 4);
        this.rotates4.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates4.setTextureSize(128, 32);
        this.rotates4.mirror = true;
        this.setRotation(this.rotates4, 0.2617994F, -(float)Math.PI, 0.0F);
        this.rotates5 = new ModelRenderer(this, 40, 16);
        this.rotates5.addBox(-6.0F, -15.0F, -9.0F, 4, 2, 2);
        this.rotates5.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates5.setTextureSize(128, 32);
        this.rotates5.mirror = true;
        this.setRotation(this.rotates5, 0.0F, -(float)Math.PI, 0.0F);
        this.rotates6 = new ModelRenderer(this, 40, 16);
        this.rotates6.addBox(2.0F, -16.0F, -9.0F, 4, 2, 2);
        this.rotates6.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotates6.setTextureSize(128, 32);
        this.rotates6.mirror = true;
        this.setRotation(this.rotates6, 0.0F, -(float)Math.PI, 0.0F);
        this.rotates7 = new ModelRenderer(this, 56, 1);
        this.rotates7.addBox(-4.0F, -10.0F, -7.0F, 8, 7, 6);
        this.rotates7.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates7.setTextureSize(128, 32);
        this.rotates7.mirror = true;
        this.setRotation(this.rotates7, 0.2617994F, -(float)Math.PI, 0.0F);
        this.rotates8 = new ModelRenderer(this, 0, 0);
        this.rotates8.addBox(-4.0F, -25.0F, -9.0F, 8, 8, 8);
        this.rotates8.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates8.setTextureSize(128, 32);
        this.rotates8.mirror = true;
        this.setRotation(this.rotates8, 0.1745329F, -(float)Math.PI, 0.0F);
        this.rotates9 = new ModelRenderer(this, 0, 0);
        this.rotates9.addBox(-4.0F, -25.0F, -10.0F, 8, 8, 8);
        this.rotates9.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates9.setTextureSize(128, 32);
        this.rotates9.mirror = true;
        this.setRotation(this.rotates9, 0.1745329F, 0.0F, 0.0F);
        this.rotates10 = new ModelRenderer(this, 82, 16);
        this.rotates10.addBox(4.0F, -16.0F, -13.0F, 4, 12, 4);
        this.rotates10.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotates10.setTextureSize(128, 32);
        this.rotates10.mirror = true;
        this.setRotation(this.rotates10, -0.1745329F, 0.0F, 0.0F);
        this.rotates11 = new ModelRenderer(this, 40, 16);
        this.rotates11.addBox(-6.0F, -15.0F, -10.0F, 4, 2, 2);
        this.rotates11.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates11.setTextureSize(128, 32);
        this.rotates11.mirror = true;
        this.setRotation(this.rotates11, 0.0F, 0.0F, 0.0F);
        this.rotates12 = new ModelRenderer(this, 40, 16);
        this.rotates12.addBox(2.0F, -16.0F, -10.0F, 4, 2, 2);
        this.rotates12.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotates12.setTextureSize(128, 32);
        this.rotates12.mirror = true;
        this.setRotation(this.rotates12, 0.0F, 0.0F, 0.0F);
        this.rotates13 = new ModelRenderer(this, 55, 22);
        this.rotates13.addBox(5.0F, -7.0F, -21.0F, 2, 2, 8);
        this.rotates13.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotates13.setTextureSize(128, 32);
        this.rotates13.mirror = true;
        this.setRotation(this.rotates13, -0.1745329F, 0.0F, 0.0F);
        this.rotates14 = new ModelRenderer(this, 55, 22);
        this.rotates14.addBox(-7.0F, -6.0F, -21.0F, 2, 2, 8);
        this.rotates14.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates14.setTextureSize(128, 32);
        this.rotates14.mirror = true;
        this.setRotation(this.rotates14, -0.1745329F, 0.0F, 0.0F);
        this.rotates15 = new ModelRenderer(this, 86, 2);
        this.rotates15.addBox(-5.0F, -4.0F, 0.0F, 10, 4, 8);
        this.rotates15.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates15.setTextureSize(128, 32);
        this.rotates15.mirror = true;
        this.setRotation(this.rotates15, 0.0F, 0.0F, 0.0F);
        this.rotates17 = new ModelRenderer(this, 82, 16);
        this.rotates17.addBox(-8.0F, -15.0F, -13.0F, 4, 12, 4);
        this.rotates17.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates17.setTextureSize(128, 32);
        this.rotates17.mirror = true;
        this.setRotation(this.rotates17, -0.1745329F, 0.0F, 0.0F);
        this.rotates16 = new ModelRenderer(this, 34, 0);
        this.rotates16.addBox(-3.0F, -18.0F, -7.0F, 6, 12, 4);
        this.rotates16.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates16.setTextureSize(128, 32);
        this.rotates16.mirror = true;
        this.setRotation(this.rotates16, 0.2617994F, 0.0F, 0.0F);
        this.rotates18 = new ModelRenderer(this, 50, 16);
        this.rotates18.addBox(-7.0F, -6.0F, -25.0F, 2, 2, 14);
        this.rotates18.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotates18.setTextureSize(128, 32);
        this.rotates18.mirror = true;
        this.setRotation(this.rotates18, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotates19 = new ModelRenderer(this, 56, 1);
        this.rotates19.addBox(-4.0F, -10.0F, -8.0F, 8, 7, 6);
        this.rotates19.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates19.setTextureSize(128, 32);
        this.rotates19.mirror = true;
        this.setRotation(this.rotates19, 0.2617994F, 0.0F, 0.0F);
        this.rotates20 = new ModelRenderer(this, 86, 2);
        this.rotates20.addBox(-5.0F, -4.0F, -8.0F, 10, 4, 8);
        this.rotates20.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotates20.setTextureSize(128, 32);
        this.rotates20.mirror = true;
        this.setRotation(this.rotates20, 0.0F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 19, 17);
        this.rightleg2.addBox(1.0F, 9.0F, -10.0F, 2, 3, 12);
        this.rightleg2.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightleg2.setTextureSize(128, 32);
        this.rightleg2.mirror = true;
        this.setRotation(this.rightleg2, 0.0F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 19, 17);
        this.leftleg2.addBox(2.0F, 9.0F, -10.0F, 2, 3, 12);
        this.leftleg2.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftleg2.setTextureSize(128, 32);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, 0.0F, 0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 0, 16);
        this.leftleg3.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg3.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftleg3.setTextureSize(128, 32);
        this.leftleg3.mirror = true;
        this.setRotation(this.leftleg3, 0.0F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 0, 16);
        this.rightleg3.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg3.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightleg3.setTextureSize(128, 32);
        this.rightleg3.mirror = true;
        this.setRotation(this.rightleg3, 0.0F, 0.0F, 0.0F);
        this.leftleg4 = new ModelRenderer(this, 19, 17);
        this.leftleg4.addBox(-4.0F, 9.0F, -10.0F, 2, 3, 12);
        this.leftleg4.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftleg4.setTextureSize(128, 32);
        this.leftleg4.mirror = true;
        this.setRotation(this.leftleg4, 0.0F, 0.0F, 0.0F);
        this.rightleg4 = new ModelRenderer(this, 19, 17);
        this.rightleg4.addBox(-5.0F, 9.0F, -10.0F, 2, 3, 12);
        this.rightleg4.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightleg4.setTextureSize(128, 32);
        this.rightleg4.mirror = true;
        this.setRotation(this.rightleg4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles((EntityDuo)var1, var2, var3, var4, var5, var6, var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.rotates1.render(var7);
        this.rotates2.render(var7);
        this.rotates3.render(var7);
        this.rotates4.render(var7);
        this.rotates5.render(var7);
        this.rotates6.render(var7);
        this.rotates7.render(var7);
        this.rotates8.render(var7);
        this.rotates9.render(var7);
        this.rotates10.render(var7);
        this.rotates11.render(var7);
        this.rotates12.render(var7);
        this.rotates13.render(var7);
        this.rotates14.render(var7);
        this.rotates15.render(var7);
        this.rotates17.render(var7);
        this.rotates16.render(var7);
        this.rotates18.render(var7);
        this.rotates19.render(var7);
        this.rotates20.render(var7);
        this.rightleg2.render(var7);
        this.leftleg2.render(var7);
        this.leftleg3.render(var7);
        this.rightleg3.render(var7);
        this.leftleg4.render(var7);
        this.rightleg4.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(EntityDuo var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        this.leftleg.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.leftleg2.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.leftleg3.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.leftleg4.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.rightleg.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.rightleg2.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.rightleg3.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.rightleg4.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;

        if (EntityDuo.ability == 1 && (double)this.rotates1.rotateAngleY < Math.PI)
        {
            this.rotates1.rotateAngleY = (float)((double)this.rotates1.rotateAngleY + 0.15D);
            this.rotates2.rotateAngleY = (float)((double)this.rotates2.rotateAngleY + 0.15D);
            this.rotates3.rotateAngleY = (float)((double)this.rotates3.rotateAngleY + 0.15D);
            this.rotates4.rotateAngleY = (float)((double)this.rotates4.rotateAngleY + 0.15D);
            this.rotates5.rotateAngleY = (float)((double)this.rotates5.rotateAngleY + 0.15D);
            this.rotates6.rotateAngleY = (float)((double)this.rotates6.rotateAngleY + 0.15D);
            this.rotates7.rotateAngleY = (float)((double)this.rotates7.rotateAngleY + 0.15D);
            this.rotates8.rotateAngleY = (float)((double)this.rotates8.rotateAngleY + 0.15D);
            this.rotates9.rotateAngleY = (float)((double)this.rotates9.rotateAngleY + 0.15D);
            this.rotates10.rotateAngleY = (float)((double)this.rotates10.rotateAngleY + 0.15D);
            this.rotates11.rotateAngleY = (float)((double)this.rotates11.rotateAngleY + 0.15D);
            this.rotates12.rotateAngleY = (float)((double)this.rotates12.rotateAngleY + 0.15D);
            this.rotates13.rotateAngleY = (float)((double)this.rotates13.rotateAngleY + 0.15D);
            this.rotates14.rotateAngleY = (float)((double)this.rotates14.rotateAngleY + 0.15D);
            this.rotates15.rotateAngleY = (float)((double)this.rotates15.rotateAngleY + 0.15D);
            this.rotates16.rotateAngleY = (float)((double)this.rotates16.rotateAngleY + 0.15D);
            this.rotates17.rotateAngleY = (float)((double)this.rotates17.rotateAngleY + 0.15D);
            this.rotates18.rotateAngleY = (float)((double)this.rotates18.rotateAngleY + 0.15D);
            this.rotates19.rotateAngleY = (float)((double)this.rotates19.rotateAngleY + 0.15D);
            this.rotates20.rotateAngleY = (float)((double)this.rotates20.rotateAngleY + 0.15D);
        }
        else if (EntityDuo.ability == 0 && this.rotates1.rotateAngleY > 0.0F)
        {
            this.rotates1.rotateAngleY = (float)((double)this.rotates1.rotateAngleY - 0.15D);
            this.rotates2.rotateAngleY = (float)((double)this.rotates2.rotateAngleY - 0.15D);
            this.rotates3.rotateAngleY = (float)((double)this.rotates3.rotateAngleY - 0.15D);
            this.rotates4.rotateAngleY = (float)((double)this.rotates4.rotateAngleY - 0.15D);
            this.rotates5.rotateAngleY = (float)((double)this.rotates5.rotateAngleY - 0.15D);
            this.rotates6.rotateAngleY = (float)((double)this.rotates6.rotateAngleY - 0.15D);
            this.rotates7.rotateAngleY = (float)((double)this.rotates7.rotateAngleY - 0.15D);
            this.rotates8.rotateAngleY = (float)((double)this.rotates8.rotateAngleY - 0.15D);
            this.rotates9.rotateAngleY = (float)((double)this.rotates9.rotateAngleY - 0.15D);
            this.rotates10.rotateAngleY = (float)((double)this.rotates10.rotateAngleY - 0.15D);
            this.rotates11.rotateAngleY = (float)((double)this.rotates11.rotateAngleY - 0.15D);
            this.rotates12.rotateAngleY = (float)((double)this.rotates12.rotateAngleY - 0.15D);
            this.rotates13.rotateAngleY = (float)((double)this.rotates13.rotateAngleY - 0.15D);
            this.rotates14.rotateAngleY = (float)((double)this.rotates14.rotateAngleY - 0.15D);
            this.rotates15.rotateAngleY = (float)((double)this.rotates15.rotateAngleY - 0.15D);
            this.rotates16.rotateAngleY = (float)((double)this.rotates16.rotateAngleY - 0.15D);
            this.rotates17.rotateAngleY = (float)((double)this.rotates17.rotateAngleY - 0.15D);
            this.rotates18.rotateAngleY = (float)((double)this.rotates18.rotateAngleY - 0.15D);
            this.rotates19.rotateAngleY = (float)((double)this.rotates19.rotateAngleY - 0.15D);
            this.rotates20.rotateAngleY = (float)((double)this.rotates20.rotateAngleY - 0.15D);
        }
    }
}
