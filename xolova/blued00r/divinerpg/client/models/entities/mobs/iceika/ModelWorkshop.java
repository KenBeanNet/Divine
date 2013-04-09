package xolova.blued00r.divinerpg.client.models.entities.mobs.iceika;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWorkshop extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarmtop;
    ModelRenderer rightlegbottom;
    ModelRenderer rightleg;
    ModelRenderer leftlegbottom;
    ModelRenderer leftleg;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer leftarmtop;

    public ModelWorkshop()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 30, 14);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 14, 4);
        this.body.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarmtop = new ModelRenderer(this, 37, 16);
        this.rightarmtop.addBox(-6.0F, -3.0F, -2.0F, 8, 5, 6);
        this.rightarmtop.setRotationPoint(-6.0F, -5.0F, -1.0F);
        this.rightarmtop.setTextureSize(64, 32);
        this.rightarmtop.mirror = true;
        this.setRotation(this.rightarmtop, 0.0F, 0.0F, 0.0F);
        this.rightlegbottom = new ModelRenderer(this, 0, 16);
        this.rightlegbottom.addBox(-3.0F, 8.0F, -3.0F, 6, 9, 6);
        this.rightlegbottom.setRotationPoint(-4.0F, 7.0F, 0.0F);
        this.rightlegbottom.setTextureSize(64, 32);
        this.rightlegbottom.mirror = true;
        this.setRotation(this.rightlegbottom, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-4.0F, 7.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftlegbottom = new ModelRenderer(this, 0, 16);
        this.leftlegbottom.addBox(-3.0F, 8.0F, -3.0F, 6, 9, 6);
        this.leftlegbottom.setRotationPoint(4.0F, 7.0F, 0.0F);
        this.leftlegbottom.setTextureSize(64, 32);
        this.leftlegbottom.mirror = true;
        this.setRotation(this.leftlegbottom, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(4.0F, 7.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-5.0F, 2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-6.0F, -5.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(0.0F, 2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(7.0F, -5.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.leftarmtop = new ModelRenderer(this, 36, 16);
        this.leftarmtop.addBox(-3.0F, -3.0F, -2.0F, 8, 5, 6);
        this.leftarmtop.setRotationPoint(7.0F, -5.0F, -1.0F);
        this.leftarmtop.setTextureSize(64, 32);
        this.leftarmtop.mirror = true;
        this.setRotation(this.leftarmtop, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.head.render(var7);
        this.body.render(var7);
        this.rightarmtop.render(var7);
        this.rightlegbottom.render(var7);
        this.rightleg.render(var7);
        this.leftlegbottom.render(var7);
        this.leftleg.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.leftarmtop.render(var7);
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
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.rightarmtop.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarmtop.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarmtop.rotateAngleZ = 0.0F;
        this.leftarmtop.rotateAngleZ = 0.0F;
        this.rightlegbottom.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftlegbottom.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightlegbottom.rotateAngleY = 0.0F;
        this.leftlegbottom.rotateAngleY = 0.0F;
    }
}
