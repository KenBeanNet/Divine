package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelExtractor extends ModelBase
{
    ModelRenderer P2;
    ModelRenderer S1;
    ModelRenderer S2;
    ModelRenderer S3;
    ModelRenderer S4;
    ModelRenderer r1;
    ModelRenderer r2;
    ModelRenderer r3;
    ModelRenderer r4;
    ModelRenderer r5;
    ModelRenderer r6;
    ModelRenderer r7;
    ModelRenderer r8;
    ModelRenderer r9;
    ModelRenderer r10;
    ModelRenderer S7;
    ModelRenderer S6;
    ModelRenderer S5;
    ModelRenderer S8;
    ModelRenderer P4;
    ModelRenderer P3;
    private float f5;

    public ModelExtractor(float var1)
    {
        this.f5 = var1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.P2 = new ModelRenderer(this, 0, 16);
        this.P2.addBox(0.0F, 0.0F, 0.0F, 14, 2, 14);
        this.P2.setRotationPoint(-7.0F, 8.0F, -7.0F);
        this.P2.setTextureSize(64, 32);
        this.P2.mirror = true;
        this.setRotation(this.P2, 0.0F, 0.0F, 0.0F);
        this.S1 = new ModelRenderer(this, 12, 0);
        this.S1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S1.setRotationPoint(3.0F, 10.0F, -5.0F);
        this.S1.setTextureSize(64, 32);
        this.S1.mirror = true;
        this.setRotation(this.S1, 0.0F, 0.0F, 0.0F);
        this.S2 = new ModelRenderer(this, 12, 0);
        this.S2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S2.setRotationPoint(-5.0F, 10.0F, 3.0F);
        this.S2.setTextureSize(64, 32);
        this.S2.mirror = true;
        this.setRotation(this.S2, 0.0F, 0.0F, 0.0F);
        this.S3 = new ModelRenderer(this, 12, 0);
        this.S3.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S3.setRotationPoint(3.0F, 10.0F, 3.0F);
        this.S3.setTextureSize(64, 32);
        this.S3.mirror = true;
        this.setRotation(this.S3, 0.0F, 0.0F, 0.0F);
        this.S4 = new ModelRenderer(this, 12, 0);
        this.S4.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S4.setRotationPoint(-5.0F, 10.0F, -5.0F);
        this.S4.setTextureSize(64, 32);
        this.S4.mirror = true;
        this.setRotation(this.S4, 0.0F, 0.0F, 0.0F);
        this.r1 = new ModelRenderer(this, 0, 0);
        this.r1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.r1.setRotationPoint(1.0F, 20.0F, 0.0F);
        this.r1.setTextureSize(64, 32);
        this.r1.mirror = true;
        this.setRotation(this.r1, 0.0F, 0.0F, 0.0F);
        this.r2 = new ModelRenderer(this, 0, 0);
        this.r2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.r2.setRotationPoint(-3.0F, 20.0F, 4.0F);
        this.r2.setTextureSize(64, 32);
        this.r2.mirror = true;
        this.setRotation(this.r2, 0.0F, 0.0F, 0.0F);
        this.r3 = new ModelRenderer(this, 0, 0);
        this.r3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.r3.setRotationPoint(4.0F, 20.0F, -6.0F);
        this.r3.setTextureSize(64, 32);
        this.r3.mirror = true;
        this.setRotation(this.r3, 0.0F, 0.0F, 0.0F);
        this.r4 = new ModelRenderer(this, 0, 0);
        this.r4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.r4.setRotationPoint(-5.0F, 20.0F, -4.0F);
        this.r4.setTextureSize(64, 32);
        this.r4.mirror = true;
        this.setRotation(this.r4, 0.0F, 0.0F, 0.0F);
        this.r5 = new ModelRenderer(this, 0, 0);
        this.r5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r5.setRotationPoint(4.0F, 20.0F, -1.0F);
        this.r5.setTextureSize(64, 32);
        this.r5.mirror = true;
        this.setRotation(this.r5, 0.0F, 0.0F, 0.0F);
        this.r6 = new ModelRenderer(this, 0, 0);
        this.r6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r6.setRotationPoint(-5.0F, 20.0F, 2.0F);
        this.r6.setTextureSize(64, 32);
        this.r6.mirror = true;
        this.setRotation(this.r6, 0.0F, 0.0F, 0.0F);
        this.r7 = new ModelRenderer(this, 0, 0);
        this.r7.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r7.setRotationPoint(-1.0F, 20.0F, -5.0F);
        this.r7.setTextureSize(64, 32);
        this.r7.mirror = true;
        this.setRotation(this.r7, 0.0F, 0.0F, 0.0F);
        this.r8 = new ModelRenderer(this, 0, 0);
        this.r8.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r8.setRotationPoint(5.0F, 20.0F, 5.0F);
        this.r8.setTextureSize(64, 32);
        this.r8.mirror = true;
        this.setRotation(this.r8, 0.0F, 0.0F, 0.0F);
        this.r9 = new ModelRenderer(this, 0, 0);
        this.r9.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r9.setRotationPoint(2.0F, 20.0F, 3.0F);
        this.r9.setTextureSize(64, 32);
        this.r9.mirror = true;
        this.setRotation(this.r9, 0.0F, 0.0F, 0.0F);
        this.r10 = new ModelRenderer(this, 0, 0);
        this.r10.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.r10.setRotationPoint(-3.0F, 20.0F, -2.0F);
        this.r10.setTextureSize(64, 32);
        this.r10.mirror = true;
        this.setRotation(this.r10, 0.0F, 0.0F, 0.0F);
        this.S7 = new ModelRenderer(this, 12, 0);
        this.S7.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S7.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.S7.setTextureSize(64, 32);
        this.S7.mirror = true;
        this.setRotation(this.S7, 0.0F, 0.0F, 0.0F);
        this.S6 = new ModelRenderer(this, 12, 0);
        this.S6.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S6.setRotationPoint(2.0F, 0.0F, 2.0F);
        this.S6.setTextureSize(64, 32);
        this.S6.mirror = true;
        this.setRotation(this.S6, 0.0F, 0.0F, 0.0F);
        this.S5 = new ModelRenderer(this, 12, 0);
        this.S5.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S5.setRotationPoint(2.0F, 0.0F, -4.0F);
        this.S5.setTextureSize(64, 32);
        this.S5.mirror = true;
        this.setRotation(this.S5, 0.0F, 0.0F, 0.0F);
        this.S8 = new ModelRenderer(this, 12, 0);
        this.S8.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
        this.S8.setRotationPoint(-4.0F, 0.0F, -4.0F);
        this.S8.setTextureSize(64, 32);
        this.S8.mirror = true;
        this.setRotation(this.S8, 0.0F, 0.0F, 0.0F);
        this.P4 = new ModelRenderer(this, 0, 16);
        this.P4.addBox(0.0F, 0.0F, 0.0F, 14, 2, 14);
        this.P4.setRotationPoint(-7.0F, 18.0F, -7.0F);
        this.P4.setTextureSize(64, 32);
        this.P4.mirror = true;
        this.setRotation(this.P4, 0.0F, 0.0F, 0.0F);
        this.P3 = new ModelRenderer(this, 0, 16);
        this.P3.addBox(0.0F, 0.0F, 0.0F, 14, 2, 14);
        this.P3.setRotationPoint(-7.0F, -1.0F, -7.0F);
        this.P3.setTextureSize(64, 32);
        this.P3.mirror = true;
        this.setRotation(this.P3, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.P2.render(var7);
        this.S1.render(var7);
        this.S2.render(var7);
        this.S3.render(var7);
        this.S4.render(var7);
        this.r1.render(var7);
        this.r2.render(var7);
        this.r3.render(var7);
        this.r4.render(var7);
        this.r5.render(var7);
        this.r6.render(var7);
        this.r7.render(var7);
        this.r8.render(var7);
        this.r9.render(var7);
        this.r10.render(var7);
        this.S7.render(var7);
        this.S6.render(var7);
        this.S5.render(var7);
        this.S8.render(var7);
        this.P4.render(var7);
        this.P3.render(var7);
    }

    public void render(float var1)
    {
        this.P2.render(var1);
        this.S1.render(var1);
        this.S2.render(var1);
        this.S3.render(var1);
        this.S4.render(var1);
        this.r1.render(var1);
        this.r2.render(var1);
        this.r3.render(var1);
        this.r4.render(var1);
        this.r5.render(var1);
        this.r6.render(var1);
        this.r7.render(var1);
        this.r8.render(var1);
        this.r9.render(var1);
        this.r10.render(var1);
        this.S7.render(var1);
        this.S6.render(var1);
        this.S5.render(var1);
        this.S8.render(var1);
        this.P4.render(var1);
        this.P3.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7)
    {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
    }
}
