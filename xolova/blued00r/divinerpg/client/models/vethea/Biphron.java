package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Biphron extends ModelBase
{
    ModelRenderer head;
    ModelRenderer bodytop;
    ModelRenderer rightarmts1;
    ModelRenderer leftarmts1;
    ModelRenderer rightlegts1;
    ModelRenderer leftlegts1;
    ModelRenderer leftlegts2;
    ModelRenderer rightlegts2;
    ModelRenderer rightarmtspike1;
    ModelRenderer leftarmtspike1;
    ModelRenderer rightarmts2;
    ModelRenderer leftarmts2;
    ModelRenderer leftarmtspike2;
    ModelRenderer rightarmtspike2;
    ModelRenderer bodybottom;
    ModelRenderer rightarms1;
    ModelRenderer leftarms1;
    ModelRenderer leftarms2;
    ModelRenderer leftarmspike1;
    ModelRenderer leftarmspike2;
    ModelRenderer rightarmspike1;
    ModelRenderer rightarms2;
    ModelRenderer rightarmspike2;
    ModelRenderer leftlegs1;
    ModelRenderer leftlegs2;
    ModelRenderer rightlegs2;
    ModelRenderer rightlegs1;

    public Biphron()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.bodytop = new ModelRenderer(this, 16, 16);
        this.bodytop.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.bodytop.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.bodytop.setTextureSize(64, 32);
        this.bodytop.mirror = true;
        this.setRotation(this.bodytop, -(float)Math.PI, 0.0F, 0.0F);
        this.rightarmts1 = new ModelRenderer(this, 48, 12);
        this.rightarmts1.addBox(-3.0F, -2.0F, -2.0F, 4, 3, 4);
        this.rightarmts1.setRotationPoint(-5.0F, -10.0F, 0.0F);
        this.rightarmts1.setTextureSize(64, 32);
        this.rightarmts1.mirror = true;
        this.setRotation(this.rightarmts1, -(float)Math.PI, 0.0F, 0.0F);
        this.leftarmts1 = new ModelRenderer(this, 48, 12);
        this.leftarmts1.addBox(7.0F, -2.0F, -2.0F, 4, 3, 4);
        this.leftarmts1.setRotationPoint(-3.0F, -10.0F, 0.0F);
        this.leftarmts1.setTextureSize(64, 32);
        this.leftarmts1.mirror = true;
        this.setRotation(this.leftarmts1, -(float)Math.PI, 0.0F, 0.0F);
        this.rightlegts1 = new ModelRenderer(this, 41, 23);
        this.rightlegts1.addBox(-3.0F, -3.0F, -3.0F, 6, 3, 6);
        this.rightlegts1.setRotationPoint(-6.0F, -20.0F, 0.0F);
        this.rightlegts1.setTextureSize(64, 32);
        this.rightlegts1.mirror = true;
        this.setRotation(this.rightlegts1, -(float)Math.PI, 0.0F, 0.0F);
        this.leftlegts1 = new ModelRenderer(this, 41, 23);
        this.leftlegts1.addBox(-3.0F, -3.0F, -3.0F, 6, 3, 6);
        this.leftlegts1.setRotationPoint(6.0F, -20.0F, 0.0F);
        this.leftlegts1.setTextureSize(64, 32);
        this.leftlegts1.mirror = true;
        this.setRotation(this.leftlegts1, -(float)Math.PI, 0.0F, 0.0F);
        this.leftlegts2 = new ModelRenderer(this, 0, 16);
        this.leftlegts2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftlegts2.setRotationPoint(6.0F, -20.0F, 0.0F);
        this.leftlegts2.setTextureSize(64, 32);
        this.leftlegts2.mirror = true;
        this.setRotation(this.leftlegts2, -(float)Math.PI, 0.0F, 0.0F);
        this.rightlegts2 = new ModelRenderer(this, 0, 16);
        this.rightlegts2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightlegts2.setRotationPoint(-6.0F, -20.0F, 0.0F);
        this.rightlegts2.setTextureSize(64, 32);
        this.rightlegts2.mirror = true;
        this.setRotation(this.rightlegts2, -(float)Math.PI, 0.0F, 0.0F);
        this.rightarmtspike1 = new ModelRenderer(this, 33, 0);
        this.rightarmtspike1.addBox(-7.0F, 6.0F, 1.0F, 1, 8, 1);
        this.rightarmtspike1.setRotationPoint(-5.0F, -10.0F, 0.0F);
        this.rightarmtspike1.setTextureSize(64, 32);
        this.rightarmtspike1.mirror = true;
        this.setRotation(this.rightarmtspike1, -(float)Math.PI, 0.0F, 0.0F);
        this.leftarmtspike1 = new ModelRenderer(this, 33, 0);
        this.leftarmtspike1.addBox(6.0F, 6.0F, 1.0F, 1, 8, 1);
        this.leftarmtspike1.setRotationPoint(5.0F, -10.0F, 0.0F);
        this.leftarmtspike1.setTextureSize(64, 32);
        this.leftarmtspike1.mirror = true;
        this.setRotation(this.leftarmtspike1, -(float)Math.PI, 0.0F, 0.0F);
        this.rightarmts2 = new ModelRenderer(this, 37, 0);
        this.rightarmts2.addBox(-7.0F, -2.0F, -2.0F, 4, 8, 4);
        this.rightarmts2.setRotationPoint(-5.0F, -10.0F, 0.0F);
        this.rightarmts2.setTextureSize(64, 32);
        this.rightarmts2.mirror = true;
        this.setRotation(this.rightarmts2, -(float)Math.PI, 0.0F, 0.0F);
        this.leftarmts2 = new ModelRenderer(this, 37, 0);
        this.leftarmts2.addBox(3.0F, -2.0F, -2.0F, 4, 8, 4);
        this.leftarmts2.setRotationPoint(5.0F, -10.0F, 0.0F);
        this.leftarmts2.setTextureSize(64, 32);
        this.leftarmts2.mirror = true;
        this.setRotation(this.leftarmts2, -(float)Math.PI, 0.0F, 0.0F);
        this.leftarmtspike2 = new ModelRenderer(this, 33, 0);
        this.leftarmtspike2.addBox(6.0F, 6.0F, -2.0F, 1, 8, 1);
        this.leftarmtspike2.setRotationPoint(5.0F, -10.0F, 0.0F);
        this.leftarmtspike2.setTextureSize(64, 32);
        this.leftarmtspike2.mirror = true;
        this.setRotation(this.leftarmtspike2, -(float)Math.PI, 0.0F, 0.0F);
        this.rightarmtspike2 = new ModelRenderer(this, 33, 0);
        this.rightarmtspike2.addBox(-7.0F, 6.0F, -2.0F, 1, 8, 1);
        this.rightarmtspike2.setRotationPoint(-5.0F, -10.0F, 0.0F);
        this.rightarmtspike2.setTextureSize(64, 32);
        this.rightarmtspike2.mirror = true;
        this.setRotation(this.rightarmtspike2, -(float)Math.PI, 0.0F, 0.0F);
        this.bodybottom = new ModelRenderer(this, 16, 16);
        this.bodybottom.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.bodybottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybottom.setTextureSize(64, 32);
        this.bodybottom.mirror = true;
        this.setRotation(this.bodybottom, 0.0F, 0.0F, 0.0F);
        this.rightarms1 = new ModelRenderer(this, 48, 12);
        this.rightarms1.addBox(-3.0F, -2.0F, -2.0F, 4, 3, 4);
        this.rightarms1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarms1.setTextureSize(64, 32);
        this.rightarms1.mirror = true;
        this.setRotation(this.rightarms1, 0.0F, 0.0F, 0.0F);
        this.leftarms1 = new ModelRenderer(this, 48, 12);
        this.leftarms1.addBox(7.0F, -2.0F, -2.0F, 4, 3, 4);
        this.leftarms1.setRotationPoint(-3.0F, 2.0F, 0.0F);
        this.leftarms1.setTextureSize(64, 32);
        this.leftarms1.mirror = true;
        this.setRotation(this.leftarms1, 0.0F, 0.0F, 0.0F);
        this.leftarms2 = new ModelRenderer(this, 37, 0);
        this.leftarms2.addBox(3.0F, -2.0F, -2.0F, 4, 8, 4);
        this.leftarms2.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarms2.setTextureSize(64, 32);
        this.leftarms2.mirror = true;
        this.setRotation(this.leftarms2, 0.0F, 0.0F, 0.0F);
        this.leftarmspike1 = new ModelRenderer(this, 33, 0);
        this.leftarmspike1.addBox(6.0F, 6.0F, 1.0F, 1, 8, 1);
        this.leftarmspike1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarmspike1.setTextureSize(64, 32);
        this.leftarmspike1.mirror = true;
        this.setRotation(this.leftarmspike1, 0.0F, 0.0F, 0.0F);
        this.leftarmspike2 = new ModelRenderer(this, 33, 0);
        this.leftarmspike2.addBox(6.0F, 6.0F, -2.0F, 1, 8, 1);
        this.leftarmspike2.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarmspike2.setTextureSize(64, 32);
        this.leftarmspike2.mirror = true;
        this.setRotation(this.leftarmspike2, 0.0F, 0.0F, 0.0F);
        this.rightarmspike1 = new ModelRenderer(this, 33, 0);
        this.rightarmspike1.addBox(-7.0F, 6.0F, -2.0F, 1, 8, 1);
        this.rightarmspike1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarmspike1.setTextureSize(64, 32);
        this.rightarmspike1.mirror = true;
        this.setRotation(this.rightarmspike1, 0.0F, 0.0F, 0.0F);
        this.rightarms2 = new ModelRenderer(this, 37, 0);
        this.rightarms2.addBox(-7.0F, -2.0F, -2.0F, 4, 8, 4);
        this.rightarms2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarms2.setTextureSize(64, 32);
        this.rightarms2.mirror = true;
        this.setRotation(this.rightarms2, 0.0F, 0.0F, 0.0F);
        this.rightarmspike2 = new ModelRenderer(this, 33, 0);
        this.rightarmspike2.addBox(-7.0F, 6.0F, 1.0F, 1, 8, 1);
        this.rightarmspike2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarmspike2.setTextureSize(64, 32);
        this.rightarmspike2.mirror = true;
        this.setRotation(this.rightarmspike2, 0.0F, 0.0F, 0.0F);
        this.leftlegs1 = new ModelRenderer(this, 0, 16);
        this.leftlegs1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftlegs1.setRotationPoint(6.0F, 12.0F, 0.0F);
        this.leftlegs1.setTextureSize(64, 32);
        this.leftlegs1.mirror = true;
        this.setRotation(this.leftlegs1, 0.0F, 0.0F, 0.0F);
        this.leftlegs2 = new ModelRenderer(this, 41, 23);
        this.leftlegs2.addBox(-3.0F, -3.0F, -3.0F, 6, 3, 6);
        this.leftlegs2.setRotationPoint(6.0F, 12.0F, 0.0F);
        this.leftlegs2.setTextureSize(64, 32);
        this.leftlegs2.mirror = true;
        this.setRotation(this.leftlegs2, 0.0F, 0.0F, 0.0F);
        this.rightlegs2 = new ModelRenderer(this, 41, 23);
        this.rightlegs2.addBox(-3.0F, -3.0F, -3.0F, 6, 3, 6);
        this.rightlegs2.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.rightlegs2.setTextureSize(64, 32);
        this.rightlegs2.mirror = true;
        this.setRotation(this.rightlegs2, 0.0F, 0.0F, 0.0F);
        this.rightlegs1 = new ModelRenderer(this, 0, 16);
        this.rightlegs1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightlegs1.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.rightlegs1.setTextureSize(64, 32);
        this.rightlegs1.mirror = true;
        this.setRotation(this.rightlegs1, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.bodytop.render(var7);
        this.rightarmts1.render(var7);
        this.leftarmts1.render(var7);
        this.rightlegts1.render(var7);
        this.leftlegts1.render(var7);
        this.leftlegts2.render(var7);
        this.rightlegts2.render(var7);
        this.rightarmtspike1.render(var7);
        this.leftarmtspike1.render(var7);
        this.rightarmts2.render(var7);
        this.leftarmts2.render(var7);
        this.leftarmtspike2.render(var7);
        this.rightarmtspike2.render(var7);
        this.bodybottom.render(var7);
        this.rightarms1.render(var7);
        this.leftarms1.render(var7);
        this.leftarms2.render(var7);
        this.leftarmspike1.render(var7);
        this.leftarmspike2.render(var7);
        this.rightarmspike1.render(var7);
        this.rightarms2.render(var7);
        this.rightarmspike2.render(var7);
        this.leftlegs1.render(var7);
        this.leftlegs2.render(var7);
        this.rightlegs2.render(var7);
        this.rightlegs1.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftlegs1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftlegs2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegs1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightlegs2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarms1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarms2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmspike1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmspike2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarms1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarms2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmspike1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmspike2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftlegts1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 - (float)Math.PI;
        this.leftlegts2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 - (float)Math.PI;
        this.rightlegts1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 - (float)Math.PI;
        this.rightlegts2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 - (float)Math.PI;
        this.rightarmts1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.rightarmts2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.rightarmtspike1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.rightarmtspike2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.leftarmts1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.leftarmts2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.leftarmtspike1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - (float)Math.PI;
        this.leftarmtspike2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - (float)Math.PI;
    }
}