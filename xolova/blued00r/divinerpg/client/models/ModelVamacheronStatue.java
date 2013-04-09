package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelVamacheronStatue extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer Horn;
    ModelRenderer Shape17;
    ModelRenderer head2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer Horn5;
    ModelRenderer Shape1;

    public ModelVamacheronStatue()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(-6.0F, 4.0F, -8.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 4);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 8, 18, 10);
        this.body.setRotationPoint(2.0F, 5.0F, 2.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg1.setRotationPoint(-2.0F, 12.0F, 7.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.4833219F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg2.setRotationPoint(2.0F, 12.0F, 7.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, -0.2230717F, 0.0F, 0.0F);
        this.leg2.mirror = false;
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
        this.leg3.setRotationPoint(-2.0F, 12.0F, -5.0F);
        this.leg3.setTextureSize(64, 32);
        this.leg3.mirror = true;
        this.setRotation(this.leg3, 0.2974289F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
        this.leg4.setRotationPoint(2.0F, 12.0F, -5.0F);
        this.leg4.setTextureSize(64, 32);
        this.leg4.mirror = true;
        this.setRotation(this.leg4, -0.3717861F, 0.0F, 0.0F);
        this.horn1 = new ModelRenderer(this, 54, 0);
        this.horn1.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 3);
        this.horn1.setRotationPoint(-6.0F, 2.0F, -8.0F);
        this.horn1.setTextureSize(64, 32);
        this.horn1.mirror = true;
        this.setRotation(this.horn1, 0.0F, 0.0F, 0.0F);
        this.horn2 = new ModelRenderer(this, 55, 0);
        this.horn2.addBox(3.0F, -5.0F, -4.0F, 1, 3, 3);
        this.horn2.setRotationPoint(-6.0F, 2.0F, -8.0F);
        this.horn2.setTextureSize(64, 32);
        this.horn2.mirror = true;
        this.setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
        this.Horn = new ModelRenderer(this, 55, 7);
        this.Horn.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2);
        this.Horn.setRotationPoint(-7.0F, 0.0F, -20.0F);
        this.Horn.setTextureSize(64, 32);
        this.Horn.mirror = true;
        this.setRotation(this.Horn, 1.22173F, 0.0F, 0.0F);
        this.Shape17 = new ModelRenderer(this, 9, 0);
        this.Shape17.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.Shape17.setRotationPoint(-7.0F, 3.0F, -15.0F);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.addBox(0.0F, 0.0F, 0.0F, 8, 8, 6);
        this.head2.setRotationPoint(2.0F, 0.0F, -14.0F);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, 0.0F, 0.0F);
        this.horn3 = new ModelRenderer(this, 55, 0);
        this.horn3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3);
        this.horn3.setRotationPoint(2.0F, -3.0F, -12.0F);
        this.horn3.setTextureSize(64, 32);
        this.horn3.mirror = true;
        this.setRotation(this.horn3, 0.0F, 0.0F, 0.0F);
        this.horn4 = new ModelRenderer(this, 55, 0);
        this.horn4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3);
        this.horn4.setRotationPoint(9.0F, -3.0F, -12.0F);
        this.horn4.setTextureSize(64, 32);
        this.horn4.mirror = true;
        this.setRotation(this.horn4, 0.0F, 0.0F, 0.0F);
        this.Horn5 = new ModelRenderer(this, 55, 7);
        this.Horn5.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2);
        this.Horn5.setRotationPoint(5.0F, 0.0F, -20.0F);
        this.Horn5.setTextureSize(64, 32);
        this.Horn5.mirror = true;
        this.setRotation(this.Horn5, 1.22173F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 9, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
        this.Shape1.setRotationPoint(5.0F, 3.0F, -15.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    }

    public void render(float var1)
    {
        this.head.render(var1);
        this.body.render(var1);
        this.leg1.render(var1);
        this.leg2.render(var1);
        this.leg3.render(var1);
        this.leg4.render(var1);
        this.horn1.render(var1);
        this.horn2.render(var1);
        this.Horn.render(var1);
        this.Shape17.render(var1);
        this.head2.render(var1);
        this.horn3.render(var1);
        this.horn4.render(var1);
        this.Horn5.render(var1);
        this.Shape1.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
