package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Cymesoid extends ModelBase
{
    ModelRenderer head;
    ModelRenderer bodyext1;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer body;
    ModelRenderer bodyext2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;

    public Cymesoid()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.bodyext1 = new ModelRenderer(this, 20, 22);
        this.bodyext1.addBox(-12.0F, 0.0F, 2.0F, 8, 6, 2);
        this.bodyext1.setRotationPoint(4.0F, 8.0F, 0.0F);
        this.bodyext1.setTextureSize(64, 32);
        this.bodyext1.mirror = true;
        this.setRotation(this.bodyext1, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.bodyext2 = new ModelRenderer(this, 19, 22);
        this.bodyext2.addBox(-4.0F, 0.0F, 2.0F, 8, 6, 2);
        this.bodyext2.setRotationPoint(4.0F, 8.0F, 0.0F);
        this.bodyext2.setTextureSize(64, 32);
        this.bodyext2.mirror = true;
        this.setRotation(this.bodyext2, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 35, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape1.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, -2.094395F, -((float)Math.PI / 4F));
        this.Shape2 = new ModelRenderer(this, 35, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape2.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, -2.356194F, -0.6108652F);
        this.Shape3 = new ModelRenderer(this, 35, 0);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape3.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, -2.617994F, -0.4363323F);
        this.Shape4 = new ModelRenderer(this, 35, 0);
        this.Shape4.addBox(2.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape4.setRotationPoint(2.0F, 0.0F, 2.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, -2.96706F, -0.2617994F);
        this.Shape5 = new ModelRenderer(this, 35, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape5.setRotationPoint(2.0F, 0.0F, 2.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, -0.2617994F, -0.2617994F);
        this.Shape6 = new ModelRenderer(this, 35, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, -0.5235988F, -0.4363323F);
        this.Shape7 = new ModelRenderer(this, 35, 0);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape7.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, -((float)Math.PI / 4F), -0.6108652F);
        this.Shape8 = new ModelRenderer(this, 35, 0);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 12, 14, 0);
        this.Shape8.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, -1.047198F, -((float)Math.PI / 4F));
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.bodyext1.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.body.render(var7);
        this.bodyext2.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
        this.Shape7.render(var7);
        this.Shape8.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + 0.0872665F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 0.0872665F;
    }
}
