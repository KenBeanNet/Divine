package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDAZStatue extends ModelBase
{
    ModelRenderer p1;
    ModelRenderer p2;
    ModelRenderer p3;
    ModelRenderer p4;
    ModelRenderer p5;
    ModelRenderer p18;
    ModelRenderer p6;
    ModelRenderer p7;
    ModelRenderer p8;
    ModelRenderer p9;
    ModelRenderer p10;
    ModelRenderer p11;
    ModelRenderer p12;
    ModelRenderer p13;
    ModelRenderer p14;
    ModelRenderer p15;
    ModelRenderer p16;
    ModelRenderer p17;

    public ModelDAZStatue()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.p1 = new ModelRenderer(this, 0, 0);
        this.p1.addBox(0.0F, 0.0F, 0.0F, 10, 6, 10);
        this.p1.setRotationPoint(-6.0F, 11.0F, 4.0F);
        this.p1.setTextureSize(64, 32);
        this.p1.mirror = true;
        this.setRotation(this.p1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p2 = new ModelRenderer(this, 39, 20);
        this.p2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.p2.setRotationPoint(-4.0F, 14.0F, 2.0F);
        this.p2.setTextureSize(64, 32);
        this.p2.mirror = true;
        this.setRotation(this.p2, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p3 = new ModelRenderer(this, 43, 9);
        this.p3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
        this.p3.setRotationPoint(2.0F, 18.0F, 0.0F);
        this.p3.setTextureSize(64, 32);
        this.p3.mirror = true;
        this.setRotation(this.p3, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p4 = new ModelRenderer(this, 27, 1);
        this.p4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
        this.p4.setRotationPoint(-11.0F, 18.0F, 0.0F);
        this.p4.setTextureSize(64, 32);
        this.p4.mirror = true;
        this.setRotation(this.p4, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p5 = new ModelRenderer(this, 39, 4);
        this.p5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p5.setRotationPoint(-11.0F, 14.0F, 0.0F);
        this.p5.setTextureSize(64, 32);
        this.p5.mirror = true;
        this.setRotation(this.p5, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p18 = new ModelRenderer(this, 39, 4);
        this.p18.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p18.setRotationPoint(11.0F, 14.0F, 0.0F);
        this.p18.setTextureSize(64, 32);
        this.p18.mirror = true;
        this.setRotation(this.p18, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p6 = new ModelRenderer(this, 39, 4);
        this.p6.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p6.setRotationPoint(15.0F, 11.0F, 1.0F);
        this.p6.setTextureSize(64, 32);
        this.p6.mirror = true;
        this.setRotation(this.p6, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p7 = new ModelRenderer(this, 43, 9);
        this.p7.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 4);
        this.p7.setRotationPoint(9.0F, 11.0F, 1.0F);
        this.p7.setTextureSize(64, 32);
        this.p7.mirror = true;
        this.setRotation(this.p7, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p8 = new ModelRenderer(this, 39, 20);
        this.p8.addBox(-5.0F, 0.0F, 0.0F, 6, 6, 6);
        this.p8.setRotationPoint(-4.0F, 7.0F, 3.0F);
        this.p8.setTextureSize(64, 32);
        this.p8.mirror = true;
        this.setRotation(this.p8, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p9 = new ModelRenderer(this, 27, 1);
        this.p9.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 4);
        this.p9.setRotationPoint(-15.0F, 11.0F, 1.0F);
        this.p9.setTextureSize(64, 32);
        this.p9.mirror = true;
        this.setRotation(this.p9, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p10 = new ModelRenderer(this, 39, 4);
        this.p10.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 4);
        this.p10.setRotationPoint(0.0F, 20.0F, 5.0F);
        this.p10.setTextureSize(64, 32);
        this.p10.mirror = true;
        this.setRotation(this.p10, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p11 = new ModelRenderer(this, 0, 0);
        this.p11.addBox(-5.0F, 0.0F, 0.0F, 10, 6, 10);
        this.p11.setRotationPoint(-6.0F, 4.0F, 5.0F);
        this.p11.setTextureSize(64, 32);
        this.p11.mirror = true;
        this.setRotation(this.p11, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p12 = new ModelRenderer(this, 39, 4);
        this.p12.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p12.setRotationPoint(-15.0F, 1.0F, 1.0F);
        this.p12.setTextureSize(64, 32);
        this.p12.mirror = true;
        this.setRotation(this.p12, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p13 = new ModelRenderer(this, 39, 4);
        this.p13.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p13.setRotationPoint(15.0F, 1.0F, 1.0F);
        this.p13.setTextureSize(64, 32);
        this.p13.mirror = true;
        this.setRotation(this.p13, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p14 = new ModelRenderer(this, 27, 1);
        this.p14.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 7);
        this.p14.setRotationPoint(-11.0F, 11.0F, 1.0F);
        this.p14.setTextureSize(64, 32);
        this.p14.mirror = true;
        this.setRotation(this.p14, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p15 = new ModelRenderer(this, 43, 9);
        this.p15.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 7);
        this.p15.setRotationPoint(2.0F, 11.0F, 1.0F);
        this.p15.setTextureSize(64, 32);
        this.p15.mirror = true;
        this.setRotation(this.p15, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.p16 = new ModelRenderer(this, 39, 4);
        this.p16.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p16.setRotationPoint(-15.0F, 11.0F, 1.0F);
        this.p16.setTextureSize(64, 32);
        this.p16.mirror = true;
        this.setRotation(this.p16, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.p17 = new ModelRenderer(this, 39, 4);
        this.p17.addBox(-5.0F, 0.0F, 0.0F, 2, 2, 10);
        this.p17.setRotationPoint(0.0F, 10.0F, 5.0F);
        this.p17.setTextureSize(64, 32);
        this.p17.mirror = true;
        this.setRotation(this.p17, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
    }

    public void render(float var1)
    {
        this.p1.render(var1);
        this.p2.render(var1);
        this.p3.render(var1);
        this.p4.render(var1);
        this.p5.render(var1);
        this.p18.render(var1);
        this.p6.render(var1);
        this.p7.render(var1);
        this.p8.render(var1);
        this.p9.render(var1);
        this.p10.render(var1);
        this.p11.render(var1);
        this.p12.render(var1);
        this.p13.render(var1);
        this.p14.render(var1);
        this.p15.render(var1);
        this.p16.render(var1);
        this.p17.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
