package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelJungleSpider extends ModelBase
{
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RearEnd;
    ModelRenderer Leg8;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
    ModelRenderer Headp1;
    ModelRenderer Headp2;
    ModelRenderer Headp3;
    ModelRenderer Headp4;
    ModelRenderer Headp5;
    ModelRenderer Headp6;
    ModelRenderer RearBump2;
    ModelRenderer RearBump1;

    public ModelJungleSpider()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 32, 16);
        this.Head.addBox(4.0F, 1.0F, -7.0F, 1, 4, 2);
        this.Head.setRotationPoint(0.0F, 14.0F, -3.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
        this.Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0F, 0.0F, 0.0F);
        this.RearEnd = new ModelRenderer(this, 14, 12);
        this.RearEnd.addBox(-5.0F, -6.0F, -6.0F, 4, 2, 4);
        this.RearEnd.setRotationPoint(3.0F, 16.0F, 15.0F);
        this.RearEnd.setTextureSize(64, 32);
        this.RearEnd.mirror = true;
        this.setRotation(this.RearEnd, 0.0F, 0.0F, 0.0F);
        this.Leg8 = new ModelRenderer(this, 18, 0);
        this.Leg8.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg8.setRotationPoint(4.0F, 16.0F, -1.0F);
        this.Leg8.setTextureSize(64, 32);
        this.Leg8.mirror = true;
        this.setRotation(this.Leg8, 0.0F, 0.5759587F, 0.1919862F);
        this.Leg6 = new ModelRenderer(this, 18, 0);
        this.Leg6.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg6.setRotationPoint(4.0F, 16.0F, 0.0F);
        this.Leg6.setTextureSize(64, 32);
        this.Leg6.mirror = true;
        this.setRotation(this.Leg6, 0.0F, 0.2792527F, 0.1919862F);
        this.Leg4 = new ModelRenderer(this, 18, 0);
        this.Leg4.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg4.setRotationPoint(4.0F, 16.0F, 1.0F);
        this.Leg4.setTextureSize(64, 32);
        this.Leg4.mirror = true;
        this.setRotation(this.Leg4, 0.0F, -0.2792527F, 0.1919862F);
        this.Leg2 = new ModelRenderer(this, 18, 0);
        this.Leg2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg2.setRotationPoint(4.0F, 16.0F, 2.0F);
        this.Leg2.setTextureSize(64, 32);
        this.Leg2.mirror = true;
        this.setRotation(this.Leg2, 0.0F, -0.5759587F, 0.1919862F);
        this.Leg7 = new ModelRenderer(this, 18, 0);
        this.Leg7.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg7.setRotationPoint(-4.0F, 16.0F, -1.0F);
        this.Leg7.setTextureSize(64, 32);
        this.Leg7.mirror = true;
        this.setRotation(this.Leg7, 0.0F, -0.5759587F, -0.1919862F);
        this.Leg5 = new ModelRenderer(this, 18, 0);
        this.Leg5.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg5.setRotationPoint(-4.0F, 16.0F, 0.0F);
        this.Leg5.setTextureSize(64, 32);
        this.Leg5.mirror = true;
        this.setRotation(this.Leg5, 0.0F, -0.2792527F, -0.1919862F);
        this.Leg3 = new ModelRenderer(this, 18, 0);
        this.Leg3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg3.setRotationPoint(-4.0F, 16.0F, 1.0F);
        this.Leg3.setTextureSize(64, 32);
        this.Leg3.mirror = true;
        this.setRotation(this.Leg3, 0.0F, 0.2792527F, -0.1919862F);
        this.Leg1 = new ModelRenderer(this, 18, 0);
        this.Leg1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2);
        this.Leg1.setRotationPoint(-4.0F, 16.0F, 2.0F);
        this.Leg1.setTextureSize(64, 32);
        this.Leg1.mirror = true;
        this.setRotation(this.Leg1, 0.0F, 0.5759587F, -0.1919862F);
        this.Headp1 = new ModelRenderer(this, 32, 4);
        this.Headp1.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
        this.Headp1.setRotationPoint(0.0F, 16.0F, -3.0F);
        this.Headp1.setTextureSize(64, 32);
        this.Headp1.mirror = true;
        this.setRotation(this.Headp1, 0.0F, 0.0F, 0.0F);
        this.Headp2 = new ModelRenderer(this, 25, 19);
        this.Headp2.addBox(2.0F, 5.0F, -5.0F, 1, 2, 5);
        this.Headp2.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.Headp2.setTextureSize(64, 32);
        this.Headp2.mirror = true;
        this.setRotation(this.Headp2, 0.0F, 0.0F, 0.0F);
        this.Headp3 = new ModelRenderer(this, 32, 16);
        this.Headp3.addBox(-5.0F, 1.0F, -7.0F, 1, 4, 2);
        this.Headp3.setRotationPoint(0.0F, 14.0F, -3.0F);
        this.Headp3.setTextureSize(64, 32);
        this.Headp3.mirror = true;
        this.setRotation(this.Headp3, 0.0F, 0.0F, 0.0F);
        this.Headp4 = new ModelRenderer(this, 25, 19);
        this.Headp4.addBox(-3.0F, 5.0F, -5.0F, 1, 2, 5);
        this.Headp4.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.Headp4.setTextureSize(64, 32);
        this.Headp4.mirror = true;
        this.setRotation(this.Headp4, 0.0F, 0.0F, 0.0F);
        this.Headp5 = new ModelRenderer(this, 25, 19);
        this.Headp5.addBox(4.0F, 5.0F, -5.0F, 1, 2, 5);
        this.Headp5.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.Headp5.setTextureSize(64, 32);
        this.Headp5.mirror = true;
        this.setRotation(this.Headp5, 0.0F, 0.0F, 0.0F);
        this.Headp6 = new ModelRenderer(this, 25, 19);
        this.Headp6.addBox(-5.0F, 5.0F, -5.0F, 1, 2, 5);
        this.Headp6.setRotationPoint(0.0F, 12.0F, -10.0F);
        this.Headp6.setTextureSize(64, 32);
        this.Headp6.mirror = true;
        this.setRotation(this.Headp6, 0.0F, 0.0F, 0.0F);
        this.RearBump2 = new ModelRenderer(this, 0, 12);
        this.RearBump2.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12);
        this.RearBump2.setRotationPoint(0.0F, 16.0F, 9.0F);
        this.RearBump2.setTextureSize(64, 32);
        this.RearBump2.mirror = true;
        this.setRotation(this.RearBump2, 0.0F, 0.0F, 0.0F);
        this.RearBump1 = new ModelRenderer(this, 14, 12);
        this.RearBump1.addBox(-5.0F, -6.0F, -6.0F, 4, 2, 4);
        this.RearBump1.setRotationPoint(3.0F, 16.0F, 9.0F);
        this.RearBump1.setTextureSize(64, 32);
        this.RearBump1.mirror = true;
        this.setRotation(this.RearBump1, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.Head.render(var7);
        this.Body.render(var7);
        this.RearEnd.render(var7);
        this.Leg8.render(var7);
        this.Leg6.render(var7);
        this.Leg4.render(var7);
        this.Leg2.render(var7);
        this.Leg7.render(var7);
        this.Leg5.render(var7);
        this.Leg3.render(var7);
        this.Leg1.render(var7);
        this.Headp1.render(var7);
        this.Headp2.render(var7);
        this.Headp3.render(var7);
        this.Headp4.render(var7);
        this.Headp5.render(var7);
        this.Headp6.render(var7);
        this.RearBump2.render(var7);
        this.RearBump1.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.Head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp1.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp1.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp3.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp3.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp4.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp4.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp5.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp5.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Headp6.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Headp6.rotateAngleX = var5 / (180F / (float)Math.PI);
        float var7 = ((float)Math.PI / 4F);
        this.Leg1.rotateAngleZ = -var7;
        this.Leg2.rotateAngleZ = var7;
        this.Leg3.rotateAngleZ = -var7 * 0.74F;
        this.Leg4.rotateAngleZ = var7 * 0.74F;
        this.Leg5.rotateAngleZ = -var7 * 0.74F;
        this.Leg6.rotateAngleZ = var7 * 0.74F;
        this.Leg7.rotateAngleZ = -var7;
        this.Leg8.rotateAngleZ = var7;
        float var8 = -0.0F;
        float var9 = 0.3926991F;
        this.Leg1.rotateAngleY = var9 * 2.0F + var8;
        this.Leg2.rotateAngleY = -var9 * 2.0F - var8;
        this.Leg3.rotateAngleY = var9 * 1.0F + var8;
        this.Leg4.rotateAngleY = -var9 * 1.0F - var8;
        this.Leg5.rotateAngleY = -var9 * 1.0F + var8;
        this.Leg6.rotateAngleY = var9 * 1.0F - var8;
        this.Leg7.rotateAngleY = -var9 * 2.0F + var8;
        this.Leg8.rotateAngleY = var9 * 2.0F - var8;
        float var10 = -(MathHelper.cos(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
        float var11 = -(MathHelper.cos(var1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * var2;
        float var12 = -(MathHelper.cos(var1 * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * var2;
        float var13 = -(MathHelper.cos(var1 * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * var2;
        float var14 = Math.abs(MathHelper.sin(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
        float var15 = Math.abs(MathHelper.sin(var1 * 0.6662F + (float)Math.PI) * 0.4F) * var2;
        float var16 = Math.abs(MathHelper.sin(var1 * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * var2;
        float var17 = Math.abs(MathHelper.sin(var1 * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * var2;
        this.Leg1.rotateAngleY += var10;
        this.Leg2.rotateAngleY += -var10;
        this.Leg3.rotateAngleY += var11;
        this.Leg4.rotateAngleY += -var11;
        this.Leg5.rotateAngleY += var12;
        this.Leg6.rotateAngleY += -var12;
        this.Leg7.rotateAngleY += var13;
        this.Leg8.rotateAngleY += -var13;
        this.Leg1.rotateAngleZ += var14;
        this.Leg2.rotateAngleZ += -var14;
        this.Leg3.rotateAngleZ += var15;
        this.Leg4.rotateAngleZ += -var15;
        this.Leg5.rotateAngleZ += var16;
        this.Leg6.rotateAngleZ += -var16;
        this.Leg7.rotateAngleZ += var17;
        this.Leg8.rotateAngleZ += -var17;
    }
}
