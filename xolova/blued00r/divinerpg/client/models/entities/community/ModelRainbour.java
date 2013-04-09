package xolova.blued00r.divinerpg.client.models.entities.community;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRainbour extends ModelBase
{
    ModelRenderer Nose;
    ModelRenderer BodyLower;
    ModelRenderer Body;
    ModelRenderer Headfin;
    ModelRenderer Head;
    ModelRenderer EarExtR;
    ModelRenderer EarR;
    ModelRenderer EarExtL;
    ModelRenderer EarL;
    ModelRenderer FootRCap;
    ModelRenderer Tail;
    ModelRenderer FootR;
    ModelRenderer FootL;
    ModelRenderer FootLCap;
    ModelRenderer WingRExt;
    ModelRenderer WingR;
    ModelRenderer WingLExt;
    ModelRenderer WingL;

    public ModelRainbour()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Nose = new ModelRenderer(this, 0, 19);
        this.Nose.addBox(0.0F, -1.0F, 0.0F, 4, 4, 2);
        this.Nose.setRotationPoint(-2.0F, 13.0F, -17.0F);
        this.Nose.setTextureSize(64, 32);
        this.Nose.mirror = true;
        this.setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
        this.BodyLower = new ModelRenderer(this, 0, 0);
        this.BodyLower.addBox(0.0F, -1.0F, 0.0F, 10, 1, 12);
        this.BodyLower.setRotationPoint(-5.0F, 18.0F, -6.0F);
        this.BodyLower.setTextureSize(64, 32);
        this.BodyLower.mirror = true;
        this.setRotation(this.BodyLower, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.addBox(0.0F, -1.0F, 0.0F, 10, 6, 16);
        this.Body.setRotationPoint(-5.0F, 12.0F, -8.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        this.setRotation(this.Body, 0.0F, 0.0F, 0.0F);
        this.Headfin = new ModelRenderer(this, 0, 0);
        this.Headfin.addBox(0.0F, -1.0F, 0.0F, 2, 6, 4);
        this.Headfin.setRotationPoint(-1.0F, 10.0F, -12.0F);
        this.Headfin.setTextureSize(64, 32);
        this.Headfin.mirror = true;
        this.setRotation(this.Headfin, -((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 19);
        this.Head.addBox(0.0F, -1.0F, 0.0F, 6, 6, 7);
        this.Head.setRotationPoint(-3.0F, 12.0F, -15.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, 0.0F, 0.0F);
        this.EarExtR = new ModelRenderer(this, 0, 0);
        this.EarExtR.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.EarExtR.setRotationPoint(-4.0F, 7.0F, -5.0F);
        this.EarExtR.setTextureSize(64, 32);
        this.EarExtR.mirror = true;
        this.setRotation(this.EarExtR, -0.9599311F, 0.0F, 0.0F);
        this.EarR = new ModelRenderer(this, 0, 0);
        this.EarR.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2);
        this.EarR.setRotationPoint(-4.0F, 8.0F, -8.0F);
        this.EarR.setTextureSize(64, 32);
        this.EarR.mirror = true;
        this.setRotation(this.EarR, -0.9599311F, 0.0F, 0.0F);
        this.EarExtL = new ModelRenderer(this, 0, 0);
        this.EarExtL.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.EarExtL.setRotationPoint(3.0F, 7.0F, -5.0F);
        this.EarExtL.setTextureSize(64, 32);
        this.EarExtL.mirror = true;
        this.setRotation(this.EarExtL, -0.9599311F, 0.0F, 0.0F);
        this.EarL = new ModelRenderer(this, 0, 0);
        this.EarL.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2);
        this.EarL.setRotationPoint(3.0F, 8.0F, -8.0F);
        this.EarL.setTextureSize(64, 32);
        this.EarL.mirror = true;
        this.setRotation(this.EarL, -0.9599311F, 0.0F, 0.0F);
        this.FootRCap = new ModelRenderer(this, 53, 15);
        this.FootRCap.addBox(-2.0F, -1.0F, 6.0F, 4, 4, 1);
        this.FootRCap.setRotationPoint(-5.0F, 14.0F, 8.0F);
        this.FootRCap.setTextureSize(64, 32);
        this.FootRCap.mirror = true;
        this.setRotation(this.FootRCap, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 40, 0);
        this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 10);
        this.Tail.setRotationPoint(0.0F, 14.0F, 8.0F);
        this.Tail.setTextureSize(64, 32);
        this.Tail.mirror = true;
        this.setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
        this.FootR = new ModelRenderer(this, 0, 0);
        this.FootR.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6);
        this.FootR.setRotationPoint(-4.0F, 14.0F, 8.0F);
        this.FootR.setTextureSize(64, 32);
        this.FootR.mirror = true;
        this.setRotation(this.FootR, 0.0F, 0.0F, 0.0F);
        this.FootL = new ModelRenderer(this, 0, 0);
        this.FootL.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6);
        this.FootL.setRotationPoint(4.0F, 14.0F, 8.0F);
        this.FootL.setTextureSize(64, 32);
        this.FootL.mirror = true;
        this.setRotation(this.FootL, 0.0F, 0.0F, 0.0F);
        this.FootLCap = new ModelRenderer(this, 53, 15);
        this.FootLCap.addBox(-2.0F, -1.0F, 6.0F, 4, 4, 1);
        this.FootLCap.setRotationPoint(4.0F, 14.0F, 8.0F);
        this.FootLCap.setTextureSize(64, 32);
        this.FootLCap.mirror = true;
        this.setRotation(this.FootLCap, 0.0F, 0.0F, 0.0F);
        this.WingRExt = new ModelRenderer(this, 28, 27);
        this.WingRExt.addBox(-15.0F, 0.0F, 0.0F, 8, 1, 2);
        this.WingRExt.setRotationPoint(-6.0F, 12.0F, -3.0F);
        this.WingRExt.setTextureSize(64, 32);
        this.WingRExt.mirror = true;
        this.setRotation(this.WingRExt, 0.0F, 0.0F, 0.0F);
        this.WingR = new ModelRenderer(this, 28, 27);
        this.WingR.addBox(-7.0F, 0.0F, -2.0F, 8, 1, 4);
        this.WingR.setRotationPoint(-6.0F, 12.0F, -3.0F);
        this.WingR.setTextureSize(64, 32);
        this.WingR.mirror = true;
        this.setRotation(this.WingR, 0.0F, 0.0F, 0.0F);
        this.WingLExt = new ModelRenderer(this, 28, 27);
        this.WingLExt.addBox(8.0F, 0.0F, 0.0F, 8, 1, 2);
        this.WingLExt.setRotationPoint(5.0F, 12.0F, -3.0F);
        this.WingLExt.setTextureSize(64, 32);
        this.WingLExt.mirror = true;
        this.setRotation(this.WingLExt, 0.0F, 0.0F, 0.0F);
        this.WingL = new ModelRenderer(this, 28, 27);
        this.WingL.addBox(0.0F, 0.0F, -2.0F, 8, 1, 4);
        this.WingL.setRotationPoint(5.0F, 12.0F, -3.0F);
        this.WingL.setTextureSize(64, 32);
        this.WingL.mirror = true;
        this.setRotation(this.WingL, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.Nose.render(var7);
        this.BodyLower.render(var7);
        this.Body.render(var7);
        this.Headfin.render(var7);
        this.Head.render(var7);
        this.EarExtR.render(var7);
        this.EarR.render(var7);
        this.EarExtL.render(var7);
        this.EarL.render(var7);
        this.FootRCap.render(var7);
        this.Tail.render(var7);
        this.FootR.render(var7);
        this.FootL.render(var7);
        this.FootLCap.render(var7);
        this.WingRExt.render(var7);
        this.WingR.render(var7);
        this.WingLExt.render(var7);
        this.WingL.render(var7);
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
        this.WingR.rotateAngleZ = MathHelper.cos(var3 * 0.1F) * (float)Math.PI * 0.15F;
        this.WingL.rotateAngleZ = -this.WingR.rotateAngleZ;
        this.WingRExt.rotateAngleZ = MathHelper.cos(var3 * 0.1F) * (float)Math.PI * 0.15F;
        this.WingLExt.rotateAngleZ = -this.WingRExt.rotateAngleZ;
        this.FootR.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI * 0.15F;
        this.FootL.rotateAngleX = this.FootR.rotateAngleX;
        this.FootRCap.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI * 0.15F;
        this.FootLCap.rotateAngleX = this.FootRCap.rotateAngleX;
        this.Tail.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI * 0.15F;
    }
}
