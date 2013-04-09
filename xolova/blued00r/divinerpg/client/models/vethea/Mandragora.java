package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mandragora extends ModelBase
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

    public Mandragora()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 24, 13);
        this.Shape1.addBox(0.0F, 16.0F, 0.0F, 2, 9, 2);
        this.Shape1.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 13, 4);
        this.Shape2.addBox(0.0F, 1.0F, -2.0F, 2, 5, 4);
        this.Shape2.setRotationPoint(0.0F, 10.0F, -1.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, -((float)Math.PI / 2F), -((float)Math.PI / 4F));
        this.Shape3 = new ModelRenderer(this, 0, 21);
        this.Shape3.addBox(-1.0F, 0.0F, -1.0F, 6, 5, 6);
        this.Shape3.setRotationPoint(-2.0F, -23.0F, -2.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 31, 0);
        this.Shape4.addBox(-1.0F, 5.0F, 1.0F, 6, 4, 0);
        this.Shape4.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, -0.3490659F);
        this.Shape5 = new ModelRenderer(this, 13, 4);
        this.Shape5.addBox(0.0F, -1.0F, -2.0F, 2, 5, 4);
        this.Shape5.setRotationPoint(0.0F, 10.0F, -2.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, -((float)Math.PI / 2F), ((float)Math.PI / 4F));
        this.Shape6 = new ModelRenderer(this, 13, 4);
        this.Shape6.addBox(0.0F, 1.0F, -2.0F, 2, 5, 4);
        this.Shape6.setRotationPoint(-1.0F, 10.0F, 0.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.Shape7 = new ModelRenderer(this, 13, 4);
        this.Shape7.addBox(0.0F, -1.0F, -2.0F, 2, 5, 4);
        this.Shape7.setRotationPoint(-2.0F, 10.0F, 0.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.Shape8 = new ModelRenderer(this, 0, 3);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 2, 16, 2);
        this.Shape8.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 31, 0);
        this.Shape9.addBox(-3.0F, 5.0F, 1.0F, 6, 4, 0);
        this.Shape9.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.3490659F);
        this.Shape10 = new ModelRenderer(this, 31, 0);
        this.Shape10.addBox(-8.0F, 17.0F, -1.0F, 6, 4, 0);
        this.Shape10.setRotationPoint(1.0F, -14.0F, -1.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, ((float)Math.PI / 2F), -0.3490659F);
        this.Shape11 = new ModelRenderer(this, 31, 0);
        this.Shape11.addBox(0.0F, 2.0F, 1.0F, 6, 4, 0);
        this.Shape11.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.0F, 0.0F, -0.3490659F);
        this.Shape12 = new ModelRenderer(this, 31, 0);
        this.Shape12.addBox(-2.0F, 7.0F, -1.0F, 6, 4, 0);
        this.Shape12.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0F, -((float)Math.PI / 2F), -0.3490659F);
        this.Shape13 = new ModelRenderer(this, 24, 24);
        this.Shape13.addBox(-1.0F, 13.0F, -1.0F, 4, 4, 4);
        this.Shape13.setRotationPoint(-1.0F, -14.0F, -1.0F);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
        this.Shape14 = new ModelRenderer(this, 8, 13);
        this.Shape14.addBox(-1.0F, 0.0F, -1.0F, 4, 4, 4);
        this.Shape14.setRotationPoint(-1.0F, -18.0F, -1.0F);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
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
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
