package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelNesro extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftarmbox;
    ModelRenderer leftarm;
    ModelRenderer rightlegext;
    ModelRenderer leftlegext;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer rightarm;
    ModelRenderer rightarmbox;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;

    public ModelNesro()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 25, 16);
        this.body.addBox(-7.0F, 0.0F, -2.0F, 14, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.4461433F, 0.0F, 0.0F);
        this.leftarmbox = new ModelRenderer(this, 32, 0);
        this.leftarmbox.addBox(-2.0F, 10.0F, -3.0F, 6, 4, 6);
        this.leftarmbox.setRotationPoint(8.0F, 2.0F, 3.0F);
        this.leftarmbox.setTextureSize(64, 32);
        this.leftarmbox.mirror = true;
        this.setRotation(this.leftarmbox, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(8.0F, 2.0F, 3.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightlegext = new ModelRenderer(this, 0, 16);
        this.rightlegext.addBox(-2.0F, 0.0F, -6.0F, 4, 3, 8);
        this.rightlegext.setRotationPoint(-4.0F, 9.0F, 4.0F);
        this.rightlegext.setTextureSize(64, 32);
        this.rightlegext.mirror = true;
        this.setRotation(this.rightlegext, 0.0F, 0.0F, 0.0F);
        this.leftlegext = new ModelRenderer(this, 0, 16);
        this.leftlegext.addBox(-2.0F, 0.0F, -6.0F, 4, 3, 8);
        this.leftlegext.setRotationPoint(4.0F, 9.0F, 4.0F);
        this.leftlegext.setTextureSize(64, 32);
        this.leftlegext.mirror = true;
        this.setRotation(this.leftlegext, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 3.0F, -6.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(4.0F, 9.0F, 4.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 3.0F, -6.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-4.0F, 9.0F, 4.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-8.0F, 2.0F, 3.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.rightarmbox = new ModelRenderer(this, 32, 0);
        this.rightarmbox.addBox(-4.0F, 10.0F, -3.0F, 6, 4, 6);
        this.rightarmbox.setRotationPoint(-8.0F, 2.0F, 3.0F);
        this.rightarmbox.setTextureSize(64, 32);
        this.rightarmbox.mirror = true;
        this.setRotation(this.rightarmbox, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 57, 0);
        this.Shape1.addBox(-5.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape1.setRotationPoint(-1.0F, -3.0F, 10.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, -0.5948578F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 57, 0);
        this.Shape2.addBox(-5.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape2.setRotationPoint(-1.0F, 0.0F, 12.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, -0.5948578F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 57, 0);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape3.setRotationPoint(-1.0F, -3.0F, 10.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, -0.5948578F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 57, 0);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape4.setRotationPoint(-1.0F, 0.0F, 12.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, -0.5948578F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 57, 0);
        this.Shape5.addBox(5.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape5.setRotationPoint(-1.0F, -3.0F, 10.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, -0.5948578F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 57, 0);
        this.Shape6.addBox(5.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape6.setRotationPoint(-1.0F, 0.0F, 12.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, -0.5948578F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body.render(var7);
        this.leftarmbox.render(var7);
        this.leftarm.render(var7);
        this.rightlegext.render(var7);
        this.leftlegext.render(var7);
        this.leftleg.render(var7);
        this.rightleg.render(var7);
        this.rightarm.render(var7);
        this.rightarmbox.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmbox.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmbox.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.rightarmbox.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.leftarmbox.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegext.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leftlegext.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.rightlegext.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.leftlegext.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleY = 0.0F;
        this.rightarmbox.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        this.leftarmbox.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmbox.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmbox.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmbox.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmbox.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }
}
