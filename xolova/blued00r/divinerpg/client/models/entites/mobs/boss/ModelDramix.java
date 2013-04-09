package xolova.blued00r.divinerpg.client.models.entites.mobs.boss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDramix extends ModelBase
{
    ModelRenderer Leg_Right;
    ModelRenderer Leg_Left;
    ModelRenderer Arm_Right;
    ModelRenderer Arm_Left;
    ModelRenderer Head;
    ModelRenderer Chest;

    public ModelDramix()
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
        this.setRotation(this.Leg_Left, 0.0F, 0.0F, 0.0F);
        this.Arm_Right.mirror = true;
        this.Arm_Right = new ModelRenderer(this, 22, 22);
        this.Arm_Right.addBox(-2.0F, -2.0F, -3.0F, 4, 16, 6);
        this.Arm_Right.setRotationPoint(-8.0F, -5.0F, 1.0F);
        this.Arm_Right.setTextureSize(64, 64);
        this.Arm_Right.mirror = true;
        this.setRotation(this.Arm_Right, 0.0F, 0.0F, 0.0F);
        this.Arm_Right.mirror = false;
        this.Arm_Left = new ModelRenderer(this, 22, 22);
        this.Arm_Left.addBox(-2.0F, -2.0F, -3.0F, 4, 16, 6);
        this.Arm_Left.setRotationPoint(8.0F, -5.0F, 1.0F);
        this.Arm_Left.setTextureSize(64, 64);
        this.Arm_Left.mirror = true;
        this.setRotation(this.Arm_Left, 0.0F, 0.0F, 0.0F);
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

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.Leg_Right.render(var7);
        this.Leg_Left.render(var7);
        this.Arm_Right.render(var7);
        this.Arm_Left.render(var7);
        this.Head.render(var7);
        this.Chest.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.Arm_Right.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.Arm_Left.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.Arm_Right.rotateAngleZ = 0.0F;
        this.Arm_Left.rotateAngleZ = 0.0F;
        this.Leg_Right.rotateAngleX = MathHelper.cos(var1) * 1.4F * var2;
        this.Leg_Left.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.Leg_Right.rotateAngleY = 0.0F;
        this.Leg_Left.rotateAngleY = 0.0F;
    }
}
