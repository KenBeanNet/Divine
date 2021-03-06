package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDramcryx extends ModelBase
{
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;

    public ModelDramcryx()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.WolfHead = new ModelRenderer(this, 0, 0);
        this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 10, 9, 4);
        this.WolfHead.setRotationPoint(-3.0F, 11.5F, -7.0F);
        this.WolfHead.setTextureSize(64, 32);
        this.WolfHead.mirror = true;
        this.setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 14);
        this.Body.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
        this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        this.setRotation(this.Body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Mane = new ModelRenderer(this, 21, 0);
        this.Mane.addBox(-4.0F, -3.0F, -3.0F, 8, 10, 7);
        this.Mane.setRotationPoint(-1.0F, 14.0F, -2.0F);
        this.Mane.setTextureSize(64, 32);
        this.Mane.mirror = true;
        this.setRotation(this.Mane, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 18);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 3);
        this.Leg1.setRotationPoint(-5.5F, 16.0F, 7.0F);
        this.Leg1.setTextureSize(64, 32);
        this.Leg1.mirror = true;
        this.setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 0, 18);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 3);
        this.Leg2.setRotationPoint(2.5F, 16.0F, 7.0F);
        this.Leg2.setTextureSize(64, 32);
        this.Leg2.mirror = true;
        this.setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 18);
        this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 3);
        this.Leg3.setRotationPoint(-6.5F, 16.0F, -4.0F);
        this.Leg3.setTextureSize(64, 32);
        this.Leg3.mirror = true;
        this.setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 18);
        this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 3, 8, 3);
        this.Leg4.setRotationPoint(3.5F, 16.0F, -4.0F);
        this.Leg4.setTextureSize(64, 32);
        this.Leg4.mirror = true;
        this.setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 22, 13);
        this.Tail.addBox(-1.0F, 0.0F, -1.0F, 4, 12, 4);
        this.Tail.setRotationPoint(-2.0F, 14.0F, 7.0F);
        this.Tail.setTextureSize(64, 32);
        this.Tail.mirror = true;
        this.setRotation(this.Tail, 1.130069F, 0.0F, 0.0F);
        this.Ear1 = new ModelRenderer(this, 16, 14);
        this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 4, 1);
        this.Ear1.setRotationPoint(-2.0F, 9.9F, -7.0F);
        this.Ear1.setTextureSize(64, 32);
        this.Ear1.mirror = true;
        this.setRotation(this.Ear1, 0.3490659F, 0.0F, 0.0F);
        this.Ear2 = new ModelRenderer(this, 16, 14);
        this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 4, 1);
        this.Ear2.setRotationPoint(0.0F, 9.9F, -7.0F);
        this.Ear2.setTextureSize(64, 32);
        this.Ear2.mirror = true;
        this.setRotation(this.Ear2, 0.3490659F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 20);
        this.Nose.addBox(-2.0F, 0.0F, -5.0F, 6, 5, 4);
        this.Nose.setRotationPoint(-2.0F, 11.5F, -8.0F);
        this.Nose.setTextureSize(64, 32);
        this.Nose.mirror = true;
        this.setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 52, 15);
        this.Shape1.addBox(-1.0F, -10.0F, 0.0F, 2, 10, 4);
        this.Shape1.setRotationPoint(-1.0F, 11.0F, 4.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, -1.003822F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 52, 15);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 13, 4);
        this.Shape2.setRotationPoint(-2.0F, 0.0F, 7.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, -0.6320364F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 52, 15);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 13, 4);
        this.Shape3.setRotationPoint(-2.0F, -2.0F, -5.466667F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.1115358F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.WolfHead.render(var7);
        this.Body.render(var7);
        this.Mane.render(var7);
        this.Leg1.render(var7);
        this.Leg2.render(var7);
        this.Leg3.render(var7);
        this.Leg4.render(var7);
        this.Tail.render(var7);
        this.Ear1.render(var7);
        this.Ear2.render(var7);
        this.Nose.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
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
        this.Leg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.Leg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.Leg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.Leg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    }
}
