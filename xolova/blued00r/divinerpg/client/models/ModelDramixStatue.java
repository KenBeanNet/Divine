package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDramixStatue extends ModelBase
{
    ModelRenderer Leg_Right;
    ModelRenderer Leg_Left;
    ModelRenderer Arm_Right;
    ModelRenderer Arm_Left;
    ModelRenderer Head;
    ModelRenderer Chest;

    public ModelDramixStatue()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Leg_Right = new ModelRenderer(this, 0, 22);
        this.Leg_Right.addBox(-2.0F, -2.0F, -3.0F, 5, 15, 6);
        this.Leg_Right.setRotationPoint(-4.0F, 11.0F, 1.0F);
        this.Leg_Right.setTextureSize(64, 64);
        this.Leg_Right.mirror = true;
        this.setRotation(this.Leg_Right, 0.0F, 0.0F, 0.0F);
        this.Leg_Left = new ModelRenderer(this, 0, 22);
        this.Leg_Left.addBox(-3.0F, -2.0F, -3.0F, 5, 15, 6);
        this.Leg_Left.setRotationPoint(4.0F, 11.0F, 1.0F);
        this.Leg_Left.setTextureSize(64, 64);
        this.Leg_Left.mirror = true;
        this.setRotation(this.Leg_Left, -0.8922867F, 0.0F, 0.0F);
        this.Arm_Right = new ModelRenderer(this, 22, 22);
        this.Arm_Right.addBox(-2.0F, -2.0F, -3.0F, 4, 16, 6);
        this.Arm_Right.setRotationPoint(-8.0F, -5.0F, 1.0F);
        this.Arm_Right.setTextureSize(64, 64);
        this.Arm_Right.mirror = true;
        this.setRotation(this.Arm_Right, -2.342252F, 0.0F, 0.0F);
        this.Arm_Right.mirror = false;
        this.Arm_Left = new ModelRenderer(this, 22, 22);
        this.Arm_Left.addBox(-2.0F, -2.0F, -3.0F, 4, 16, 6);
        this.Arm_Left.setRotationPoint(8.0F, -5.0F, 1.0F);
        this.Arm_Left.setTextureSize(64, 64);
        this.Arm_Left.mirror = true;
        this.setRotation(this.Arm_Left, -2.342252F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 36, 0);
        this.Head.addBox(-3.0F, -5.0F, -3.0F, 6, 10, 6);
        this.Head.setRotationPoint(0.0F, -12.0F, 1.0F);
        this.Head.setTextureSize(64, 64);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, 0.0F, 0.0F);
        this.Chest = new ModelRenderer(this, 0, 0);
        this.Chest.addBox(-6.0F, -7.0F, -2.0F, 12, 16, 6);
        this.Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chest.setTextureSize(64, 64);
        this.Chest.mirror = true;
        this.setRotation(this.Chest, 0.0F, 0.0F, 0.0F);
    }

    public void render(float var1)
    {
        this.Leg_Right.render(var1);
        this.Leg_Left.render(var1);
        this.Arm_Right.render(var1);
        this.Arm_Left.render(var1);
        this.Head.render(var1);
        this.Chest.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }
}
