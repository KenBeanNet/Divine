package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRazorback extends ModelBase
{
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer Spike1;
    ModelRenderer Spike2;
    ModelRenderer Spike3;
    ModelRenderer Spike4;
    ModelRenderer Spike5;
    ModelRenderer Spike6;
    ModelRenderer Spike7;
    ModelRenderer Spike8;
    ModelRenderer Spike9;
    ModelRenderer Spike10;

    public ModelRazorback()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 18, 4);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 8, 3);
        this.body.setRotationPoint(-4.0F, 22.0F, -4.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 19);
        this.leg1.addBox(-2.0F, 0.0F, 0.0F, 1, 3, 1);
        this.leg1.setRotationPoint(-3.0F, 21.0F, 3.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 19);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.leg2.setRotationPoint(4.0F, 21.0F, 3.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 19);
        this.leg3.addBox(-2.0F, 0.0F, -1.0F, 1, 3, 1);
        this.leg3.setRotationPoint(-3.0F, 21.0F, -3.0F);
        this.leg3.setTextureSize(64, 32);
        this.leg3.mirror = true;
        this.setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 19);
        this.leg4.addBox(0.0F, 0.0F, -1.0F, 1, 3, 1);
        this.leg4.setRotationPoint(4.0F, 21.0F, -3.0F);
        this.leg4.setTextureSize(64, 32);
        this.leg4.mirror = true;
        this.setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
        this.Spike1 = new ModelRenderer(this, 0, 25);
        this.Spike1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike1.setRotationPoint(3.0F, 17.0F, 0.0F);
        this.Spike1.setTextureSize(64, 32);
        this.Spike1.mirror = true;
        this.setRotation(this.Spike1, 0.0F, 0.0F, 0.0F);
        this.Spike2 = new ModelRenderer(this, 0, 25);
        this.Spike2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike2.setRotationPoint(-3.0F, 17.0F, 0.0F);
        this.Spike2.setTextureSize(64, 32);
        this.Spike2.mirror = true;
        this.setRotation(this.Spike2, 0.0F, 0.0F, 0.0F);
        this.Spike3 = new ModelRenderer(this, 0, 25);
        this.Spike3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike3.setRotationPoint(-4.0F, 17.0F, -3.0F);
        this.Spike3.setTextureSize(64, 32);
        this.Spike3.mirror = true;
        this.setRotation(this.Spike3, 0.0F, 0.0F, 0.0F);
        this.Spike4 = new ModelRenderer(this, 0, 25);
        this.Spike4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike4.setRotationPoint(-4.0F, 17.0F, 2.0F);
        this.Spike4.setTextureSize(64, 32);
        this.Spike4.mirror = true;
        this.setRotation(this.Spike4, 0.0F, 0.0F, 0.0F);
        this.Spike5 = new ModelRenderer(this, 0, 25);
        this.Spike5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike5.setRotationPoint(2.0F, 17.0F, 2.0F);
        this.Spike5.setTextureSize(64, 32);
        this.Spike5.mirror = true;
        this.setRotation(this.Spike5, 0.0F, 0.0F, 0.0F);
        this.Spike6 = new ModelRenderer(this, 0, 25);
        this.Spike6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike6.setRotationPoint(2.0F, 17.0F, -2.0F);
        this.Spike6.setTextureSize(64, 32);
        this.Spike6.mirror = true;
        this.setRotation(this.Spike6, 0.0F, 0.0F, 0.0F);
        this.Spike7 = new ModelRenderer(this, 0, 25);
        this.Spike7.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike7.setRotationPoint(0.0F, 17.0F, -3.0F);
        this.Spike7.setTextureSize(64, 32);
        this.Spike7.mirror = true;
        this.setRotation(this.Spike7, 0.0F, 0.0F, 0.0F);
        this.Spike8 = new ModelRenderer(this, 0, 25);
        this.Spike8.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike8.setRotationPoint(-1.0F, 17.0F, -1.0F);
        this.Spike8.setTextureSize(64, 32);
        this.Spike8.mirror = true;
        this.setRotation(this.Spike8, 0.0F, 0.0F, 0.0F);
        this.Spike9 = new ModelRenderer(this, 0, 25);
        this.Spike9.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike9.setRotationPoint(3.0F, 17.0F, -4.0F);
        this.Spike9.setTextureSize(64, 32);
        this.Spike9.mirror = true;
        this.setRotation(this.Spike9, 0.0F, 0.0F, 0.0F);
        this.Spike10 = new ModelRenderer(this, 0, 25);
        this.Spike10.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
        this.Spike10.setRotationPoint(-1.0F, 17.0F, 3.0F);
        this.Spike10.setTextureSize(64, 32);
        this.Spike10.mirror = true;
        this.setRotation(this.Spike10, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.body.render(var7);
        this.leg1.render(var7);
        this.leg2.render(var7);
        this.leg3.render(var7);
        this.leg4.render(var7);
        this.Spike1.render(var7);
        this.Spike2.render(var7);
        this.Spike3.render(var7);
        this.Spike4.render(var7);
        this.Spike5.render(var7);
        this.Spike6.render(var7);
        this.Spike7.render(var7);
        this.Spike8.render(var7);
        this.Spike9.render(var7);
        this.Spike10.render(var7);
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
        this.leg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    }
}
