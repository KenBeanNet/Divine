package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Shadahier extends ModelBase
{
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer rightarm2;
    ModelRenderer leftarm3;
    ModelRenderer rightarm3;
    ModelRenderer leftarm4;
    ModelRenderer rightarm4;
    ModelRenderer leftarm5;
    ModelRenderer rightarm5;
    ModelRenderer leftarm6;
    ModelRenderer rightarm6;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part11;
    ModelRenderer part12;
    ModelRenderer part13;
    ModelRenderer part14;

    public Shadahier()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer(this, 56, 26);
        this.part1.addBox(8.0F, -9.0F, -3.0F, 2, 4, 2);
        this.part1.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.0F, 0.0F, 0.0F);
        this.part2 = new ModelRenderer(this, 16, 16);
        this.part2.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 4);
        this.part2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.0F, 0.0F, 0.0F);
        this.part3 = new ModelRenderer(this, 33, 0);
        this.part3.addBox(-3.0F, -3.0F, -3.0F, 6, 4, 6);
        this.part3.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 0.0F, 0.0F, 0.0F);
        this.part4 = new ModelRenderer(this, 33, 0);
        this.part4.addBox(-3.0F, -3.0F, -3.0F, 6, 4, 6);
        this.part4.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.part4.setTextureSize(64, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 21);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
        this.rightleg.setRotationPoint(-3.0F, 17.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 21);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
        this.leftleg.setRotationPoint(3.0F, 17.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightarm1 = new ModelRenderer(this, 58, 0);
        this.rightarm1.addBox(-1.0F, 2.0F, 2.0F, 2, 8, 1);
        this.rightarm1.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightarm1.setTextureSize(64, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, 0.0F, 0.0F, 0.5235988F);
        this.leftarm1 = new ModelRenderer(this, 58, 0);
        this.leftarm1.addBox(-1.0F, 2.0F, 2.0F, 2, 8, 1);
        this.leftarm1.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.leftarm1.setTextureSize(64, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0F, 0.0F, -0.5235988F);
        this.leftarm2 = new ModelRenderer(this, 40, 12);
        this.leftarm2.addBox(0.0F, 6.0F, -7.0F, 2, 2, 6);
        this.leftarm2.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.leftarm2.setTextureSize(64, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 40, 12);
        this.rightarm2.addBox(-2.0F, 6.0F, -7.0F, 2, 2, 6);
        this.rightarm2.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightarm2.setTextureSize(64, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, 0.0F, 0.0F, 0.0F);
        this.leftarm3 = new ModelRenderer(this, 58, 0);
        this.leftarm3.addBox(-1.0F, 2.0F, -1.0F, 2, 8, 1);
        this.leftarm3.setRotationPoint(7.0F, 12.0F, 1.0F);
        this.leftarm3.setTextureSize(64, 32);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, 0.0F, 0.0F, -0.5235988F);
        this.rightarm3 = new ModelRenderer(this, 58, 0);
        this.rightarm3.addBox(-1.0F, 2.0F, -1.0F, 2, 8, 1);
        this.rightarm3.setRotationPoint(-7.0F, 12.0F, 1.0F);
        this.rightarm3.setTextureSize(64, 32);
        this.rightarm3.mirror = true;
        this.setRotation(this.rightarm3, 0.0F, 0.0F, 0.5235988F);
        this.leftarm4 = new ModelRenderer(this, 58, 0);
        this.leftarm4.addBox(-1.0F, 2.0F, -3.0F, 2, 8, 1);
        this.leftarm4.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.leftarm4.setTextureSize(64, 32);
        this.leftarm4.mirror = true;
        this.setRotation(this.leftarm4, 0.0F, 0.0F, -0.5235988F);
        this.rightarm4 = new ModelRenderer(this, 58, 0);
        this.rightarm4.addBox(-1.0F, 2.0F, -3.0F, 2, 8, 1);
        this.rightarm4.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightarm4.setTextureSize(64, 32);
        this.rightarm4.mirror = true;
        this.setRotation(this.rightarm4, 0.0F, 0.0F, 0.5235988F);
        this.leftarm5 = new ModelRenderer(this, 58, 0);
        this.leftarm5.addBox(-1.0F, 2.0F, -1.0F, 2, 8, 1);
        this.leftarm5.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.leftarm5.setTextureSize(64, 32);
        this.leftarm5.mirror = true;
        this.setRotation(this.leftarm5, 0.0F, 0.0F, -0.5235988F);
        this.rightarm5 = new ModelRenderer(this, 58, 0);
        this.rightarm5.addBox(-1.0F, 2.0F, -1.0F, 2, 8, 1);
        this.rightarm5.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightarm5.setTextureSize(64, 32);
        this.rightarm5.mirror = true;
        this.setRotation(this.rightarm5, 0.0F, 0.0F, 0.5235988F);
        this.leftarm6 = new ModelRenderer(this, 40, 20);
        this.leftarm6.addBox(-1.0F, 1.0F, -2.0F, 4, 8, 4);
        this.leftarm6.setRotationPoint(7.0F, 12.0F, 0.0F);
        this.leftarm6.setTextureSize(64, 32);
        this.leftarm6.mirror = true;
        this.setRotation(this.leftarm6, 0.0F, 0.0F, 0.0F);
        this.rightarm6 = new ModelRenderer(this, 40, 20);
        this.rightarm6.addBox(-3.0F, 1.0F, -2.0F, 4, 8, 4);
        this.rightarm6.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightarm6.setTextureSize(64, 32);
        this.rightarm6.mirror = true;
        this.setRotation(this.rightarm6, 0.0F, 0.0F, 0.0F);
        this.part5 = new ModelRenderer(this, 52, 11);
        this.part5.addBox(1.0F, -4.0F, -5.0F, 2, 2, 4);
        this.part5.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part5.setTextureSize(64, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part6 = new ModelRenderer(this, 56, 26);
        this.part6.addBox(-10.0F, -9.0F, -3.0F, 2, 4, 2);
        this.part6.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part6.setTextureSize(64, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, 0.0F, 0.0F, 0.0F);
        this.part7 = new ModelRenderer(this, 33, 11);
        this.part7.addBox(4.0F, -7.0F, -3.0F, 4, 2, 2);
        this.part7.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part7.setTextureSize(64, 32);
        this.part7.mirror = true;
        this.setRotation(this.part7, 0.0F, 0.0F, 0.0F);
        this.part8 = new ModelRenderer(this, 33, 11);
        this.part8.addBox(-8.0F, -7.0F, -3.0F, 4, 2, 2);
        this.part8.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part8.setTextureSize(64, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, 0.0F, 0.0F, 0.0F);
        this.part9 = new ModelRenderer(this, 56, 26);
        this.part9.addBox(-10.0F, -9.0F, 1.0F, 2, 4, 2);
        this.part9.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part9.setTextureSize(64, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, 0.0F, 0.0F, 0.0F);
        this.part10 = new ModelRenderer(this, 33, 11);
        this.part10.addBox(-8.0F, -7.0F, 1.0F, 4, 2, 2);
        this.part10.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part10.setTextureSize(64, 32);
        this.part10.mirror = true;
        this.setRotation(this.part10, 0.0F, 0.0F, 0.0F);
        this.part11 = new ModelRenderer(this, 33, 11);
        this.part11.addBox(4.0F, -7.0F, 1.0F, 4, 2, 2);
        this.part11.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part11.setTextureSize(64, 32);
        this.part11.mirror = true;
        this.setRotation(this.part11, 0.0F, 0.0F, 0.0F);
        this.part12 = new ModelRenderer(this, 56, 26);
        this.part12.addBox(8.0F, -9.0F, 1.0F, 2, 4, 2);
        this.part12.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part12.setTextureSize(64, 32);
        this.part12.mirror = true;
        this.setRotation(this.part12, 0.0F, 0.0F, 0.0F);
        this.part13 = new ModelRenderer(this, 0, 0);
        this.part13.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.part13.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part13.setTextureSize(64, 32);
        this.part13.mirror = true;
        this.setRotation(this.part13, 0.0F, 0.0F, 0.0F);
        this.part14 = new ModelRenderer(this, 52, 11);
        this.part14.addBox(-3.0F, -4.0F, -5.0F, 2, 2, 4);
        this.part14.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.part14.setTextureSize(64, 32);
        this.part14.mirror = true;
        this.setRotation(this.part14, ((float)Math.PI / 4F), 0.0F, 0.0F);
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
        this.part3.render(var7);
        this.part4.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.rightarm1.render(var7);
        this.leftarm1.render(var7);
        this.leftarm2.render(var7);
        this.rightarm2.render(var7);
        this.leftarm3.render(var7);
        this.rightarm3.render(var7);
        this.leftarm4.render(var7);
        this.rightarm4.render(var7);
        this.leftarm5.render(var7);
        this.rightarm5.render(var7);
        this.leftarm6.render(var7);
        this.rightarm6.render(var7);
        this.part5.render(var7);
        this.part6.render(var7);
        this.part7.render(var7);
        this.part8.render(var7);
        this.part9.render(var7);
        this.part10.render(var7);
        this.part11.render(var7);
        this.part12.render(var7);
        this.part13.render(var7);
        this.part14.render(var7);
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
        this.rightarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm6.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
    }
}
