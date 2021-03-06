package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Zoragon extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;

    public Zoragon()
    {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 64, 14);
        this.Shape1.addBox(-6.0F, 9.0F, -8.0F, 2, 2, 16);
        this.Shape1.setRotationPoint(14.0F, 4.0F, 0.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 0);
        this.Shape2.addBox(-8.0F, -7.0F, -8.0F, 16, 16, 16);
        this.Shape2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 64, 0);
        this.Shape3.addBox(-8.0F, -7.0F, -8.0F, 2, 18, 2);
        this.Shape3.setRotationPoint(16.0F, 2.0F, 16.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 64, 0);
        this.Shape4.addBox(-8.0F, -7.0F, -8.0F, 2, 18, 2);
        this.Shape4.setRotationPoint(-2.0F, 4.0F, 16.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 74, 0);
        this.Shape5.addBox(-6.0F, 9.0F, -8.0F, 18, 2, 2);
        this.Shape5.setRotationPoint(-2.0F, 4.0F, 16.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 74, 0);
        this.Shape6.addBox(-6.0F, 9.0F, -8.0F, 18, 2, 2);
        this.Shape6.setRotationPoint(-4.0F, -14.0F, -2.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 64, 0);
        this.Shape7.addBox(-8.0F, -7.0F, -8.0F, 2, 18, 2);
        this.Shape7.setRotationPoint(-2.0F, 4.0F, -2.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 95, 7);
        this.Shape8.addBox(-1.0F, 4.0F, -3.0F, 10, 2, 2);
        this.Shape8.setRotationPoint(-2.0F, 16.0F, 8.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.Shape9 = new ModelRenderer(this, 64, 0);
        this.Shape9.addBox(-8.0F, -7.0F, -8.0F, 2, 18, 2);
        this.Shape9.setRotationPoint(16.0F, 2.0F, -2.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 74, 0);
        this.Shape10.addBox(-6.0F, 9.0F, -8.0F, 18, 2, 2);
        this.Shape10.setRotationPoint(-4.0F, -14.0F, 16.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 64, 14);
        this.Shape11.addBox(-6.0F, 9.0F, -8.0F, 2, 2, 16);
        this.Shape11.setRotationPoint(14.0F, -14.0F, 0.0F);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 64, 14);
        this.Shape12.addBox(-6.0F, 9.0F, -8.0F, 2, 2, 16);
        this.Shape12.setRotationPoint(-4.0F, -14.0F, 0.0F);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
        this.Shape13 = new ModelRenderer(this, 64, 14);
        this.Shape13.addBox(-6.0F, 9.0F, -8.0F, 2, 2, 16);
        this.Shape13.setRotationPoint(-4.0F, 4.0F, 0.0F);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
        this.Shape14 = new ModelRenderer(this, 74, 0);
        this.Shape14.addBox(-6.0F, 9.0F, -8.0F, 18, 2, 2);
        this.Shape14.setRotationPoint(-2.0F, 4.0F, -2.0F);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
        this.Shape15 = new ModelRenderer(this, 95, 7);
        this.Shape15.addBox(-6.0F, 1.0F, -3.0F, 10, 2, 2);
        this.Shape15.setRotationPoint(-2.0F, 16.0F, 8.0F);
        this.Shape15.setTextureSize(64, 32);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.Shape16 = new ModelRenderer(this, 95, 7);
        this.Shape16.addBox(-1.0F, 4.0F, -3.0F, 10, 2, 2);
        this.Shape16.setRotationPoint(4.0F, 16.0F, -2.0F);
        this.Shape16.setTextureSize(64, 32);
        this.Shape16.mirror = true;
        this.Shape15.mirror = false;
        this.setRotation(this.Shape16, 0.0F, -((float)Math.PI / 2F), -((float)Math.PI / 4F));
        this.Shape17 = new ModelRenderer(this, 95, 7);
        this.Shape17.addBox(-6.0F, 1.0F, -3.0F, 10, 2, 2);
        this.Shape17.setRotationPoint(4.0F, 16.0F, -2.0F);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 0.0F, -((float)Math.PI / 2F), ((float)Math.PI / 4F));
        this.Shape18 = new ModelRenderer(this, 95, 7);
        this.Shape18.addBox(-1.0F, 4.0F, -3.0F, 10, 2, 2);
        this.Shape18.setRotationPoint(-2.0F, 16.0F, -4.0F);
        this.Shape18.setTextureSize(64, 32);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.Shape19 = new ModelRenderer(this, 95, 7);
        this.Shape19.addBox(-6.0F, 1.0F, -3.0F, 10, 2, 2);
        this.Shape19.setRotationPoint(-2.0F, 16.0F, -4.0F);
        this.Shape19.setTextureSize(64, 32);
        this.Shape19.mirror = true;
        this.setRotation(this.Shape19, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.Shape20 = new ModelRenderer(this, 95, 7);
        this.Shape20.addBox(-1.0F, 4.0F, -3.0F, 10, 2, 2);
        this.Shape20.setRotationPoint(-8.0F, 16.0F, -2.0F);
        this.Shape20.setTextureSize(64, 32);
        this.Shape20.mirror = true;
        this.setRotation(this.Shape20, 0.0F, -((float)Math.PI / 2F), -((float)Math.PI / 4F));
        this.Shape21 = new ModelRenderer(this, 95, 7);
        this.Shape21.addBox(-6.0F, 1.0F, -3.0F, 10, 2, 2);
        this.Shape21.setRotationPoint(-8.0F, 16.0F, -2.0F);
        this.Shape21.setTextureSize(64, 32);
        this.Shape21.mirror = true;
        this.setRotation(this.Shape21, 0.0F, -((float)Math.PI / 2F), ((float)Math.PI / 4F));
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
        this.Shape8.render(var7);
        this.Shape9.render(var7);
        this.Shape10.render(var7);
        this.Shape11.render(var7);
        this.Shape12.render(var7);
        this.Shape13.render(var7);
        this.Shape14.render(var7);
        this.Shape15.render(var7);
        this.Shape16.render(var7);
        this.Shape17.render(var7);
        this.Shape18.render(var7);
        this.Shape19.render(var7);
        this.Shape20.render(var7);
        this.Shape21.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
