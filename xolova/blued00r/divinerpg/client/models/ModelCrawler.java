package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrawler extends ModelBase
{
    ModelRenderer earL;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer body;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer head;
    ModelRenderer earR;
    ModelRenderer earL2;
    ModelRenderer earR2;

    public ModelCrawler()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.earL = new ModelRenderer(this, 36, 2);
        this.earL.addBox(5.0F, 1.0F, -8.0F, 1, 2, 5);
        this.earL.setRotationPoint(-1.0F, 6.0F, -8.0F);
        this.earL.setTextureSize(64, 32);
        this.earL.mirror = true;
        this.setRotation(this.earL, 0.0F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 28, 16);
        this.rightfoot.addBox(-4.0F, 7.0F, -4.0F, 6, 4, 6);
        this.rightfoot.setRotationPoint(-3.0F, 13.0F, -5.0F);
        this.rightfoot.setTextureSize(64, 32);
        this.rightfoot.mirror = true;
        this.setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 28, 16);
        this.leftfoot.addBox(-2.0F, 7.0F, -4.0F, 6, 4, 6);
        this.leftfoot.setRotationPoint(3.0F, 13.0F, -5.0F);
        this.leftfoot.setTextureSize(64, 32);
        this.leftfoot.mirror = true;
        this.setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-1.0F, 0.0F, -3.0F, 4, 7, 4);
        this.leftleg.setRotationPoint(3.0F, 13.0F, -5.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-3.0F, 0.0F, -3.0F, 4, 7, 4);
        this.rightleg.setRotationPoint(-3.0F, 13.0F, -5.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 19, 16);
        this.body.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 10);
        this.body.setRotationPoint(7.0F, 15.0F, -6.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, -0.4363323F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 19, 0);
        this.body2.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 10);
        this.body2.setRotationPoint(0.0F, 15.0F, -6.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, -0.4363323F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 24, 19);
        this.body3.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 2);
        this.body3.setRotationPoint(0.0F, 27.0F, 2.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 19, 19);
        this.body4.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 2);
        this.body4.setRotationPoint(7.0F, 27.0F, 2.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 24, 19);
        this.body5.addBox(-7.0F, -6.0F, -5.0F, 6, 5, 4);
        this.body5.setRotationPoint(1.0F, 24.0F, 3.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, -1.308997F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 19, 19);
        this.body6.addBox(-7.0F, -6.0F, -5.0F, 6, 5, 4);
        this.body6.setRotationPoint(7.0F, 24.0F, 3.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, -1.308997F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 24, 19);
        this.body7.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 7);
        this.body7.setRotationPoint(0.0F, 20.0F, 1.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 19, 19);
        this.body8.addBox(-7.0F, -6.0F, -5.0F, 7, 5, 7);
        this.body8.setRotationPoint(7.0F, 20.0F, 1.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(0.0F, 6.0F, -8.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.earR = new ModelRenderer(this, 36, 2);
        this.earR.addBox(-4.0F, 1.0F, -8.0F, 1, 2, 5);
        this.earR.setRotationPoint(-1.0F, 6.0F, -8.0F);
        this.earR.setTextureSize(64, 32);
        this.earR.mirror = true;
        this.setRotation(this.earR, 0.0F, 0.0F, 0.0F);
        this.earL2 = new ModelRenderer(this, 36, 2);
        this.earL2.addBox(5.0F, -7.0F, -3.0F, 1, 5, 2);
        this.earL2.setRotationPoint(-1.0F, 6.0F, -8.0F);
        this.earL2.setTextureSize(64, 32);
        this.earL2.mirror = true;
        this.setRotation(this.earL2, 0.0F, 0.0F, 0.0F);
        this.earR2 = new ModelRenderer(this, 36, 2);
        this.earR2.addBox(-4.0F, -7.0F, -3.0F, 1, 5, 2);
        this.earR2.setRotationPoint(-1.0F, 6.0F, -8.0F);
        this.earR2.setTextureSize(64, 32);
        this.earR2.mirror = true;
        this.setRotation(this.earR2, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.earL.render(var7);
        this.rightfoot.render(var7);
        this.leftfoot.render(var7);
        this.leftleg.render(var7);
        this.rightleg.render(var7);
        this.body.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
        this.head.render(var7);
        this.earR.render(var7);
        this.earL2.render(var7);
        this.earR2.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.earL.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.earL.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.earR.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.earR.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.earL2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.earL2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.earR2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.earR2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.rightfoot.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.leftfoot.rotateAngleY = 0.0F;
    }
}
