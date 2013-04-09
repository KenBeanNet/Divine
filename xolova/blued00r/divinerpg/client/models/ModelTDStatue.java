package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelTDStatue extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer connector;
    ModelRenderer head2;
    ModelRenderer Spear2;
    ModelRenderer Shape1;
    ModelRenderer head3;
    ModelRenderer connector1;
    ModelRenderer connector2;

    public ModelTDStatue()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, -5.576792F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, -0.669215F, 0.0F);
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
        this.setRotation(this.leftleg, 0.0F, -0.5948578F, 0.0F);
        this.connector = new ModelRenderer(this, 0, 20);
        this.connector.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6);
        this.connector.setRotationPoint(6.0F, -6.0F, -11.0F);
        this.connector.setTextureSize(64, 32);
        this.connector.mirror = true;
        this.setRotation(this.connector, 0.0F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 32, 0);
        this.head2.addBox(1.0F, 0.0F, -3.0F, 8, 8, 8);
        this.head2.setRotationPoint(4.0F, -8.0F, -16.0F);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, -0.3717861F, 0.0F);
        this.Spear2 = new ModelRenderer(this, -2, 0);
        this.Spear2.addBox(1.0F, 0.0F, 0.0F, 1, 1, 13);
        this.Spear2.setRotationPoint(5.5F, 10.0F, -1.0F);
        this.Spear2.setTextureSize(64, 32);
        this.Spear2.mirror = true;
        this.setRotation(this.Spear2, (float)Math.PI, -0.669215F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(1.0F, -4.0F, -6.0F, 1, 1, 13);
        this.Shape1.setRotationPoint(-7.0F, 10.0F, -1.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, -2.435199F, 0.0F, 0.0F);
        this.head3 = new ModelRenderer(this, 32, 0);
        this.head3.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
        this.head3.setRotationPoint(-11.4F, -8.0F, -16.0F);
        this.head3.setTextureSize(64, 32);
        this.head3.mirror = true;
        this.setRotation(this.head3, 0.0F, 0.0F, 0.0F);
        this.connector1 = new ModelRenderer(this, 0, 20);
        this.connector1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6);
        this.connector1.setRotationPoint(-10.0F, -6.0F, -11.0F);
        this.connector1.setTextureSize(64, 32);
        this.connector1.mirror = true;
        this.setRotation(this.connector1, 0.0F, 0.0F, 0.0F);
        this.connector2 = new ModelRenderer(this, 0, 20);
        this.connector2.addBox(-4.0F, 0.0F, 0.0F, 20, 4, 4);
        this.connector2.setRotationPoint(-6.0F, -6.0F, -5.0F);
        this.connector2.setTextureSize(64, 32);
        this.connector2.mirror = true;
        this.setRotation(this.connector2, 0.0F, 0.0F, 0.0F);
    }

    public void render(float var1)
    {
        this.head.render(var1);
        this.body.render(var1);
        this.rightarm.render(var1);
        this.leftarm.render(var1);
        this.rightleg.render(var1);
        this.leftleg.render(var1);
        this.connector.render(var1);
        this.head2.render(var1);
        this.Spear2.render(var1);
        this.Shape1.render(var1);
        this.head3.render(var1);
        this.connector1.render(var1);
        this.connector2.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
