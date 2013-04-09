package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDemonFurnace extends ModelBase
{
    ModelRenderer Box;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Arm3;
    ModelRenderer Arm4;
    ModelRenderer Arm5;
    ModelRenderer Arm6;
    public float scale;

    public ModelDemonFurnace(float var1)
    {
        this.scale = var1;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Box = new ModelRenderer(this, 0, 0);
        this.Box.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Box.setRotationPoint(8.0F, 8.0F, -8.0F);
        this.Box.setTextureSize(64, 64);
        this.Box.mirror = true;
        this.setRotation(this.Box, 0.0F, 0.0F, (float)Math.PI);
        this.Arm1 = new ModelRenderer(this, 0, 32);
        this.Arm1.addBox(0.0F, 0.0F, 0.0F, 4, 19, 2);
        this.Arm1.setRotationPoint(-7.0F, -7.0F, 3.0F);
        this.Arm1.setTextureSize(64, 64);
        this.Arm1.mirror = true;
        this.setRotation(this.Arm1, 0.0F, 0.0F, ((float)Math.PI * 2F / 5F));
        this.Arm2 = new ModelRenderer(this, 0, 32);
        this.Arm2.addBox(0.0F, 0.0F, 0.0F, 4, 16, 2);
        this.Arm2.setRotationPoint(-8.0F, 8.0F, 3.0F);
        this.Arm2.setTextureSize(64, 64);
        this.Arm2.mirror = true;
        this.setRotation(this.Arm2, 0.0F, 0.0F, 0.0F);
        this.Arm3 = new ModelRenderer(this, 0, 32);
        this.Arm3.addBox(0.0F, 0.0F, 0.0F, 4, 16, 2);
        this.Arm3.setRotationPoint(4.0F, 8.0F, 3.0F);
        this.Arm3.setTextureSize(64, 64);
        this.Arm3.mirror = true;
        this.setRotation(this.Arm3, 0.0F, 0.0F, 0.0F);
        this.Arm4 = new ModelRenderer(this, 0, 32);
        this.Arm4.addBox(0.0F, 0.0F, 0.0F, 4, 19, 2);
        this.Arm4.setRotationPoint(-8.0F, -4.0F, 3.0F);
        this.Arm4.setTextureSize(64, 64);
        this.Arm4.mirror = true;
        this.setRotation(this.Arm4, 0.0F, 0.0F, 0.6632251F);
        this.Arm5 = new ModelRenderer(this, 0, 32);
        this.Arm5.addBox(0.0F, 0.0F, 0.0F, 4, 19, 2);
        this.Arm5.setRotationPoint(6.0F, -3.0F, 3.0F);
        this.Arm5.setTextureSize(64, 64);
        this.Arm5.mirror = true;
        this.setRotation(this.Arm5, 0.0F, 0.0F, -((float)Math.PI * 2F / 5F));
        this.Arm6 = new ModelRenderer(this, 0, 32);
        this.Arm6.addBox(0.0F, 0.0F, 0.0F, 4, 19, 2);
        this.Arm6.setRotationPoint(4.0F, -3.0F, 3.0F);
        this.Arm6.setTextureSize(64, 64);
        this.Arm6.mirror = true;
        this.setRotation(this.Arm6, 0.0F, 0.0F, -0.6632251F);
    }

    public void render(float var1)
    {
        this.Box.render(var1);
        this.Arm1.render(var1);
        this.Arm2.render(var1);
        this.Arm3.render(var1);
        this.Arm4.render(var1);
        this.Arm5.render(var1);
        this.Arm6.render(var1);
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
