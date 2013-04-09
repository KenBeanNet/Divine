package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Tocaxin extends ModelBase
{
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer leftleg1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer rightarm3;
    ModelRenderer leftarm3;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part11;

    public Tocaxin()
    {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer(this, 0, 0);
        this.part1.addBox(-4.0F, -10.0F, -4.0F, 8, 8, 8);
        this.part1.setRotationPoint(0.0F, -22.0F, -7.0F);
        this.part1.setTextureSize(128, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.4014257F, 0.0F, 0.0F);
        this.part2 = new ModelRenderer(this, 34, 2);
        this.part2.addBox(-2.0F, -15.0F, -4.0F, 4, 6, 2);
        this.part2.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.part2.setTextureSize(128, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.4014257F, 0.0F, 0.0F);
        this.rightarm1 = new ModelRenderer(this, 64, 0);
        this.rightarm1.addBox(-2.0F, 8.0F, 4.0F, 2, 2, 30);
        this.rightarm1.setRotationPoint(-11.0F, -10.0F, 0.0F);
        this.rightarm1.setTextureSize(128, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftarm1 = new ModelRenderer(this, 40, 16);
        this.leftarm1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm1.setRotationPoint(11.0F, -10.0F, 0.0F);
        this.leftarm1.setTextureSize(128, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, -1.047198F, 0.0F, 0.0F);
        this.leftleg1 = new ModelRenderer(this, 0, 16);
        this.leftleg1.addBox(-2.0F, 12.0F, -1.0F, 2, 12, 2);
        this.leftleg1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.leftleg1.setTextureSize(128, 32);
        this.leftleg1.mirror = true;
        this.setRotation(this.leftleg1, 0.0F, 0.0F, 0.0F);
        this.rightleg1 = new ModelRenderer(this, 0, 16);
        this.rightleg1.addBox(-2.0F, 12.0F, -1.0F, 2, 12, 2);
        this.rightleg1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.rightleg1.setTextureSize(128, 32);
        this.rightleg1.mirror = true;
        this.setRotation(this.rightleg1, 0.0F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 0, 16);
        this.leftleg2.addBox(-2.0F, 0.0F, -1.0F, 2, 12, 2);
        this.leftleg2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.leftleg2.setTextureSize(128, 32);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, 0.0F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 0, 16);
        this.rightleg2.addBox(-2.0F, 0.0F, -1.0F, 2, 12, 2);
        this.rightleg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.rightleg2.setTextureSize(128, 32);
        this.rightleg2.mirror = true;
        this.setRotation(this.rightleg2, 0.0F, 0.0F, 0.0F);
        this.part3 = new ModelRenderer(this, 46, 9);
        this.part3.addBox(-7.0F, 0.0F, 0.0F, 20, 3, 2);
        this.part3.setRotationPoint(-3.0F, -12.0F, -4.0F);
        this.part3.setTextureSize(128, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 0.4014257F, 0.0F, 0.0F);
        this.part4 = new ModelRenderer(this, 68, 15);
        this.part4.addBox(-4.0F, -12.0F, -2.0F, 8, 12, 2);
        this.part4.setRotationPoint(0.0F, -12.0F, -4.0F);
        this.part4.setTextureSize(128, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 0.4014257F, 0.0F, 0.0F);
        this.part5 = new ModelRenderer(this, 59, 2);
        this.part5.addBox(-4.0F, -4.0F, 0.0F, 14, 3, 2);
        this.part5.setRotationPoint(-3.0F, -12.0F, -4.0F);
        this.part5.setTextureSize(128, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, 0.4014257F, 0.0F, 0.0F);
        this.part6 = new ModelRenderer(this, 59, 2);
        this.part6.addBox(-4.0F, -9.0F, 0.0F, 14, 3, 2);
        this.part6.setRotationPoint(-3.0F, -12.0F, -4.0F);
        this.part6.setTextureSize(128, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, 0.4014257F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 40, 16);
        this.rightarm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm2.setRotationPoint(-11.0F, -10.0F, 0.0F);
        this.rightarm2.setTextureSize(128, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, -1.047198F, 0.0F, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 64, 0);
        this.leftarm2.addBox(0.0F, 8.0F, 4.0F, 2, 2, 30);
        this.leftarm2.setRotationPoint(11.0F, -10.0F, 0.0F);
        this.leftarm2.setTextureSize(128, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.rightarm3 = new ModelRenderer(this, 100, 16);
        this.rightarm3.addBox(-4.0F, 6.0F, 1.0F, 6, 6, 6);
        this.rightarm3.setRotationPoint(-11.0F, -10.0F, 0.0F);
        this.rightarm3.setTextureSize(128, 32);
        this.rightarm3.mirror = true;
        this.setRotation(this.rightarm3, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftarm3 = new ModelRenderer(this, 100, 16);
        this.leftarm3.addBox(-2.0F, 6.0F, 1.0F, 6, 6, 6);
        this.leftarm3.setRotationPoint(11.0F, -10.0F, 0.0F);
        this.leftarm3.setTextureSize(128, 32);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.part7 = new ModelRenderer(this, 41, 16);
        this.part7.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 2);
        this.part7.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.part7.setTextureSize(128, 32);
        this.part7.mirror = true;
        this.setRotation(this.part7, 0.4014257F, 0.0F, 0.0F);
        this.part8 = new ModelRenderer(this, 41, 16);
        this.part8.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 2);
        this.part8.setRotationPoint(0.0F, -12.0F, -4.0F);
        this.part8.setTextureSize(128, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, 0.4014257F, 0.0F, 0.0F);
        this.part9 = new ModelRenderer(this, 59, 2);
        this.part9.addBox(-4.0F, 10.0F, 0.0F, 14, 3, 2);
        this.part9.setRotationPoint(-3.0F, -12.0F, -4.0F);
        this.part9.setTextureSize(128, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, 0.4014257F, 0.0F, 0.0F);
        this.part10 = new ModelRenderer(this, 59, 2);
        this.part10.addBox(-4.0F, 5.0F, 0.0F, 14, 3, 2);
        this.part10.setRotationPoint(-3.0F, -12.0F, -4.0F);
        this.part10.setTextureSize(128, 32);
        this.part10.mirror = true;
        this.setRotation(this.part10, 0.4014257F, 0.0F, 0.0F);
        this.part11 = new ModelRenderer(this, 68, 15);
        this.part11.addBox(-4.0F, -12.0F, -2.0F, 8, 12, 2);
        this.part11.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.part11.setTextureSize(128, 32);
        this.part11.mirror = true;
        this.setRotation(this.part11, 0.4014257F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.part1.render(var7);
        this.part2.render(var7);
        this.rightarm1.render(var7);
        this.leftarm1.render(var7);
        this.leftleg1.render(var7);
        this.rightleg1.render(var7);
        this.leftleg2.render(var7);
        this.rightleg2.render(var7);
        this.part3.render(var7);
        this.part4.render(var7);
        this.part5.render(var7);
        this.part6.render(var7);
        this.rightarm2.render(var7);
        this.leftarm2.render(var7);
        this.rightarm3.render(var7);
        this.leftarm3.render(var7);
        this.part7.render(var7);
        this.part8.render(var7);
        this.part9.render(var7);
        this.part10.render(var7);
        this.part11.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + -((float)Math.PI / 2F);
        this.rightarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - 1.047198F;
        this.rightarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F - ((float)Math.PI / 2F);
        this.leftarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - 1.047198F;
        this.leftarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - ((float)Math.PI / 2F);
        this.leftarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F - ((float)Math.PI / 2F);
    }
}
