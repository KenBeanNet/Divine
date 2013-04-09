package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhoenixAltar extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer P1;
    ModelRenderer P2;
    ModelRenderer P3;
    ModelRenderer P4;
    ModelRenderer S1;
    ModelRenderer S2;
    ModelRenderer S3;
    ModelRenderer S4;
    private float f5;

    public ModelPhoenixAltar(float var1)
    {
        this.f5 = var1;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Base = new ModelRenderer(this, 0, 15);
        this.Base.addBox(0.0F, 0.0F, 0.0F, 16, 1, 16);
        this.Base.setRotationPoint(-8.0F, 10.0F, -8.0F);
        this.Base.setTextureSize(64, 32);
        this.Base.mirror = true;
        this.setRotation(this.Base, 0.0F, 0.0F, 0.0F);
        this.P1 = new ModelRenderer(this, 0, 0);
        this.P1.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2);
        this.P1.setRotationPoint(-3.0F, 11.0F, -6.0F);
        this.P1.setTextureSize(64, 32);
        this.P1.mirror = true;
        this.setRotation(this.P1, 0.0F, 0.0F, 0.0F);
        this.P2 = new ModelRenderer(this, 0, 0);
        this.P2.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2);
        this.P2.setRotationPoint(1.0F, 11.0F, -6.0F);
        this.P2.setTextureSize(64, 32);
        this.P2.mirror = true;
        this.setRotation(this.P2, 0.0F, 0.0F, 0.0F);
        this.P3 = new ModelRenderer(this, 0, 0);
        this.P3.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2);
        this.P3.setRotationPoint(1.0F, 11.0F, 4.0F);
        this.P3.setTextureSize(64, 32);
        this.P3.mirror = true;
        this.setRotation(this.P3, 0.0F, 0.0F, 0.0F);
        this.P4 = new ModelRenderer(this, 0, 0);
        this.P4.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2);
        this.P4.setRotationPoint(-3.0F, 11.0F, 4.0F);
        this.P4.setTextureSize(64, 32);
        this.P4.mirror = true;
        this.setRotation(this.P4, 0.0F, 0.0F, 0.0F);
        this.S1 = new ModelRenderer(this, 22, 0);
        this.S1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
        this.S1.setRotationPoint(1.0F, 20.0F, 4.0F);
        this.S1.setTextureSize(64, 32);
        this.S1.mirror = true;
        this.setRotation(this.S1, 0.0F, 0.0F, 0.0F);
        this.S2 = new ModelRenderer(this, 22, 0);
        this.S2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
        this.S2.setRotationPoint(-5.0F, 20.0F, 4.0F);
        this.S2.setTextureSize(64, 32);
        this.S2.mirror = true;
        this.setRotation(this.S2, 0.0F, 0.0F, 0.0F);
        this.S3 = new ModelRenderer(this, 22, 0);
        this.S3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
        this.S3.setRotationPoint(-5.0F, 20.0F, -8.0F);
        this.S3.setTextureSize(64, 32);
        this.S3.mirror = true;
        this.setRotation(this.S3, 0.0F, 0.0F, 0.0F);
        this.S4 = new ModelRenderer(this, 22, 0);
        this.S4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4);
        this.S4.setRotationPoint(1.0F, 20.0F, -8.0F);
        this.S4.setTextureSize(64, 32);
        this.S4.mirror = true;
        this.setRotation(this.S4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.Base.render(var7);
        this.P1.render(var7);
        this.P2.render(var7);
        this.P3.render(var7);
        this.P4.render(var7);
        this.S1.render(var7);
        this.S2.render(var7);
        this.S3.render(var7);
        this.S4.render(var7);
    }

    public void render(float var1)
    {
        this.Base.render(var1);
        this.P1.render(var1);
        this.P2.render(var1);
        this.P3.render(var1);
        this.P4.render(var1);
        this.S1.render(var1);
        this.S2.render(var1);
        this.S3.render(var1);
        this.S4.render(var1);
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
