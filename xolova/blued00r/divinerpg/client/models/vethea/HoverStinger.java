package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class HoverStinger extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Wing1;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Wing2;
    ModelRenderer Wing3;
    ModelRenderer Wing4;

    public HoverStinger()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, 1.0F, 8, 3, 8);
        this.Shape1.setRotationPoint(-4.0F, -1.0F, -3.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.Shape2.setRotationPoint(-3.0F, 8.0F, -1.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, -0.6108652F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 0, 0);
        this.Shape3.addBox(1.0F, 3.0F, 2.0F, 4, 6, 4);
        this.Shape3.setRotationPoint(-3.0F, 8.0F, -1.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 0, 18);
        this.Shape4.addBox(2.0F, 7.0F, 4.0F, 2, 5, 2);
        this.Shape4.setRotationPoint(-3.0F, 8.0F, -1.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, -0.9599311F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 0, 0);
        this.Shape5.addBox(0.0F, 0.0F, 1.0F, 8, 6, 8);
        this.Shape5.setRotationPoint(-4.0F, 4.0F, -2.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, -0.4363323F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 0, 0);
        this.Shape6.addBox(0.0F, 0.0F, 1.0F, 10, 6, 10);
        this.Shape6.setRotationPoint(-5.0F, 2.0F, -4.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 42, 0);
        this.Shape7.addBox(0.0F, 0.0F, 1.0F, 2, 8, 2);
        this.Shape7.setRotationPoint(4.0F, -15.0F, -8.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Wing1 = new ModelRenderer(this, 0, 26);
        this.Wing1.addBox(0.0F, -2.0F, 1.0F, 10, 6, 0);
        this.Wing1.setRotationPoint(5.0F, 4.0F, 4.0F);
        this.Wing1.setTextureSize(64, 32);
        this.Wing1.mirror = true;
        this.setRotation(this.Wing1, 0.0F, 0.0F, 0.0F);
        this.Wing1.mirror = false;
        this.Shape8 = new ModelRenderer(this, 22, 16);
        this.Shape8.addBox(0.0F, 0.0F, 1.0F, 8, 8, 8);
        this.Shape8.setRotationPoint(-4.0F, -11.0F, -10.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 42, 0);
        this.Shape9.addBox(0.0F, 0.0F, 1.0F, 2, 8, 2);
        this.Shape9.setRotationPoint(-6.0F, -15.0F, -8.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 0, 0);
        this.Shape10.addBox(0.0F, 0.0F, 1.0F, 10, 6, 10);
        this.Shape10.setRotationPoint(-5.0F, -7.0F, -4.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
        this.Wing2 = new ModelRenderer(this, 0, 26);
        this.Wing2.addBox(-9.0F, -2.0F, 1.0F, 10, 6, 0);
        this.Wing2.setRotationPoint(-6.0F, 4.0F, 4.0F);
        this.Wing2.setTextureSize(64, 32);
        this.Wing2.mirror = false;
        this.setRotation(this.Wing2, 0.0F, 0.0F, 0.0F);
        this.Wing3 = new ModelRenderer(this, 0, 26);
        this.Wing3.addBox(0.0F, -2.0F, 1.0F, 10, 6, 0);
        this.Wing3.setRotationPoint(5.0F, -5.0F, 2.0F);
        this.Wing3.setTextureSize(64, 32);
        this.Wing3.mirror = true;
        this.setRotation(this.Wing3, 0.0F, 0.0F, 0.0F);
        this.Wing3.mirror = false;
        this.Wing4 = new ModelRenderer(this, 0, 26);
        this.Wing4.addBox(-9.0F, -2.0F, 1.0F, 10, 6, 0);
        this.Wing4.setRotationPoint(-6.0F, -5.0F, 2.0F);
        this.Wing4.setTextureSize(64, 32);
        this.Wing4.mirror = false;
        this.setRotation(this.Wing4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
        this.Shape7.render(var7);
        this.Wing1.render(var7);
        this.Shape8.render(var7);
        this.Shape9.render(var7);
        this.Shape10.render(var7);
        this.Wing2.render(var7);
        this.Wing3.render(var7);
        this.Wing4.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.Wing1.rotateAngleY = MathHelper.cos(var4 * 1.3F) * (float)Math.PI * 0.25F;
        this.Wing2.rotateAngleY = -this.Wing1.rotateAngleY;
        this.Wing3.rotateAngleY = MathHelper.cos(var4 * 1.3F) * (float)Math.PI * 0.25F;
        this.Wing4.rotateAngleY = -this.Wing3.rotateAngleY;
    }
}
