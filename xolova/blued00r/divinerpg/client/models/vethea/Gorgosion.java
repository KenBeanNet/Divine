package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Gorgosion extends ModelBase
{
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer rightleg2;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer rightleg4;
    ModelRenderer leftleg4;
    ModelRenderer rightleg5;
    ModelRenderer leftleg5;
    ModelRenderer leftleg6;
    ModelRenderer leftleg10;
    ModelRenderer rightleg10;
    ModelRenderer rightleg7;
    ModelRenderer rightleg8;
    ModelRenderer leftleg8;
    ModelRenderer rightleg9;
    ModelRenderer leftleg9;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer rightarm3;
    ModelRenderer leftarm3;
    ModelRenderer rightarm4;
    ModelRenderer leftarm4;
    ModelRenderer rightarm5;
    ModelRenderer leftarm5;

    public Gorgosion()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rightarm1 = new ModelRenderer(this, 40, 20);
        this.rightarm1.addBox(-3.0F, -5.0F, -3.0F, 6, 6, 6);
        this.rightarm1.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.rightarm1.setTextureSize(64, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, 0.0F, 0.0F, 0.0F);
        this.leftarm1 = new ModelRenderer(this, 40, 20);
        this.leftarm1.addBox(-3.0F, -5.0F, -3.0F, 6, 6, 6);
        this.leftarm1.setRotationPoint(8.0F, 2.0F, 0.0F);
        this.leftarm1.setTextureSize(64, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0F, 0.0F, 0.0F);
        this.rightleg1 = new ModelRenderer(this, 0, 22);
        this.rightleg1.addBox(2.0F, -10.0F, -12.0F, 2, 8, 2);
        this.rightleg1.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg1.setTextureSize(64, 32);
        this.rightleg1.mirror = true;
        this.setRotation(this.rightleg1, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftleg1 = new ModelRenderer(this, 0, 22);
        this.leftleg1.addBox(2.0F, -10.0F, -12.0F, 2, 8, 2);
        this.leftleg1.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg1.setTextureSize(64, 32);
        this.leftleg1.mirror = true;
        this.setRotation(this.leftleg1, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body1.setRotationPoint(-4.0F, -4.0F, -2.0F);
        this.body1.setTextureSize(64, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 24, 0);
        this.body2.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body2.setRotationPoint(4.0F, -4.0F, 2.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 0);
        this.body3.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body3.setRotationPoint(-4.0F, -4.0F, 2.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 24, 0);
        this.body4.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body4.setRotationPoint(4.0F, -4.0F, -2.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 24, 0);
        this.body5.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body5.setRotationPoint(4.0F, 4.0F, 2.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 0);
        this.body6.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body6.setRotationPoint(-4.0F, 4.0F, 2.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 24, 0);
        this.body7.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body7.setRotationPoint(8.0F, 8.0F, -2.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 0.0F, 0.0F, ((float)Math.PI / 2F));
        this.body8 = new ModelRenderer(this, 0, 0);
        this.body8.addBox(-4.0F, 0.0F, -2.0F, 8, 8, 4);
        this.body8.setRotationPoint(-8.0F, 8.0F, -2.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 0.0F, 0.0F, -((float)Math.PI / 2F));
        this.rightleg2 = new ModelRenderer(this, 0, 12);
        this.rightleg2.addBox(-3.0F, -6.0F, -3.0F, 5, 4, 6);
        this.rightleg2.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg2.setTextureSize(64, 32);
        this.rightleg2.mirror = true;
        this.setRotation(this.rightleg2, -0.3490659F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 0, 12);
        this.leftleg2.addBox(-2.0F, -6.0F, -3.0F, 5, 4, 6);
        this.leftleg2.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg2.setTextureSize(64, 32);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, -0.3490659F, 0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 50, 0);
        this.leftleg3.addBox(-1.0F, 2.0F, 1.0F, 2, 5, 2);
        this.leftleg3.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg3.setTextureSize(64, 32);
        this.leftleg3.mirror = true;
        this.setRotation(this.leftleg3, -1.22173F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 50, 0);
        this.rightleg3.addBox(-1.0F, 2.0F, 1.0F, 2, 5, 2);
        this.rightleg3.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg3.setTextureSize(64, 32);
        this.rightleg3.mirror = true;
        this.setRotation(this.rightleg3, -1.22173F, 0.0F, 0.0F);
        this.rightleg4 = new ModelRenderer(this, 22, 12);
        this.rightleg4.addBox(-2.0F, -2.0F, -11.0F, 4, 9, 4);
        this.rightleg4.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg4.setTextureSize(64, 32);
        this.rightleg4.mirror = true;
        this.setRotation(this.rightleg4, 1.22173F, 0.0F, 0.0F);
        this.leftleg4 = new ModelRenderer(this, 22, 12);
        this.leftleg4.addBox(-2.0F, -2.0F, -11.0F, 4, 9, 4);
        this.leftleg4.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg4.setTextureSize(64, 32);
        this.leftleg4.mirror = true;
        this.setRotation(this.leftleg4, 1.22173F, 0.0F, 0.0F);
        this.rightleg5 = new ModelRenderer(this, 8, 22);
        this.rightleg5.addBox(2.0F, -2.0F, -12.0F, 2, 7, 2);
        this.rightleg5.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg5.setTextureSize(64, 32);
        this.rightleg5.mirror = true;
        this.setRotation(this.rightleg5, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftleg5 = new ModelRenderer(this, 8, 22);
        this.leftleg5.addBox(2.0F, -2.0F, -12.0F, 2, 7, 2);
        this.leftleg5.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg5.setTextureSize(64, 32);
        this.leftleg5.mirror = true;
        this.setRotation(this.leftleg5, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftleg6 = new ModelRenderer(this, 8, 22);
        this.leftleg6.addBox(-4.0F, -2.0F, -12.0F, 2, 7, 2);
        this.leftleg6.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg6.setTextureSize(64, 32);
        this.leftleg6.mirror = true;
        this.setRotation(this.leftleg6, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.leftleg10 = new ModelRenderer(this, 0, 22);
        this.leftleg10.addBox(-4.0F, -10.0F, -12.0F, 2, 8, 2);
        this.leftleg10.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg10.setTextureSize(64, 32);
        this.leftleg10.mirror = true;
        this.setRotation(this.leftleg10, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.rightleg10 = new ModelRenderer(this, 8, 22);
        this.rightleg10.addBox(-4.0F, -2.0F, -12.0F, 2, 7, 2);
        this.rightleg10.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg10.setTextureSize(64, 32);
        this.rightleg10.mirror = true;
        this.setRotation(this.rightleg10, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.rightleg7 = new ModelRenderer(this, 0, 22);
        this.rightleg7.addBox(-4.0F, -10.0F, -12.0F, 2, 8, 2);
        this.rightleg7.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg7.setTextureSize(64, 32);
        this.rightleg7.mirror = true;
        this.setRotation(this.rightleg7, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.rightleg8 = new ModelRenderer(this, 22, 12);
        this.rightleg8.addBox(-2.0F, -2.0F, -2.0F, 4, 9, 4);
        this.rightleg8.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg8.setTextureSize(64, 32);
        this.rightleg8.mirror = true;
        this.setRotation(this.rightleg8, -0.3490659F, 0.0F, 0.0F);
        this.leftleg8 = new ModelRenderer(this, 22, 12);
        this.leftleg8.addBox(-2.0F, -2.0F, -2.0F, 4, 9, 4);
        this.leftleg8.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg8.setTextureSize(64, 32);
        this.leftleg8.mirror = true;
        this.setRotation(this.leftleg8, -0.3490659F, 0.0F, 0.0F);
        this.rightleg9 = new ModelRenderer(this, 50, 0);
        this.rightleg9.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2);
        this.rightleg9.setRotationPoint(-10.0F, 12.0F, 0.0F);
        this.rightleg9.setTextureSize(64, 32);
        this.rightleg9.mirror = true;
        this.setRotation(this.rightleg9, -1.22173F, 0.0F, 0.0F);
        this.leftleg9 = new ModelRenderer(this, 50, 0);
        this.leftleg9.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2);
        this.leftleg9.setRotationPoint(10.0F, 12.0F, 0.0F);
        this.leftleg9.setTextureSize(64, 32);
        this.leftleg9.mirror = true;
        this.setRotation(this.leftleg9, -1.22173F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 40, 16);
        this.rightarm2.addBox(-11.0F, -4.0F, -2.0F, 11, 4, 4);
        this.rightarm2.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.rightarm2.setTextureSize(64, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, 0.0F, 0.0F, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 40, 16);
        this.leftarm2.addBox(0.0F, -4.0F, -2.0F, 11, 4, 4);
        this.leftarm2.setRotationPoint(8.0F, 2.0F, 0.0F);
        this.leftarm2.setTextureSize(64, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0F, 0.0F, 0.0F);
        this.rightarm3 = new ModelRenderer(this, 22, 12);
        this.rightarm3.addBox(-11.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm3.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.rightarm3.setTextureSize(64, 32);
        this.rightarm3.mirror = true;
        this.setRotation(this.rightarm3, 0.0F, 0.0F, 0.0F);
        this.leftarm3 = new ModelRenderer(this, 22, 12);
        this.leftarm3.addBox(7.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm3.setRotationPoint(8.0F, 2.0F, 0.0F);
        this.leftarm3.setTextureSize(64, 32);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, 0.0F, 0.0F, 0.0F);
        this.rightarm4 = new ModelRenderer(this, 40, 20);
        this.rightarm4.addBox(-12.0F, 9.0F, -3.0F, 6, 6, 6);
        this.rightarm4.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.rightarm4.setTextureSize(64, 32);
        this.rightarm4.mirror = true;
        this.setRotation(this.rightarm4, 0.0F, 0.0F, 0.0F);
        this.leftarm4 = new ModelRenderer(this, 40, 20);
        this.leftarm4.addBox(6.0F, 9.0F, -3.0F, 6, 6, 6);
        this.leftarm4.setRotationPoint(8.0F, 2.0F, 0.0F);
        this.leftarm4.setTextureSize(64, 32);
        this.leftarm4.mirror = true;
        this.setRotation(this.leftarm4, 0.0F, 0.0F, 0.0F);
        this.rightarm5 = new ModelRenderer(this, 40, 20);
        this.rightarm5.addBox(-12.0F, -5.0F, -3.0F, 6, 6, 6);
        this.rightarm5.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.rightarm5.setTextureSize(64, 32);
        this.rightarm5.mirror = true;
        this.setRotation(this.rightarm5, 0.0F, 0.0F, 0.0F);
        this.leftarm5 = new ModelRenderer(this, 40, 20);
        this.leftarm5.addBox(6.0F, -5.0F, -3.0F, 6, 6, 6);
        this.leftarm5.setRotationPoint(8.0F, 2.0F, 0.0F);
        this.leftarm5.setTextureSize(64, 32);
        this.leftarm5.mirror = true;
        this.setRotation(this.leftarm5, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.rightarm1.render(var7);
        this.leftarm1.render(var7);
        this.rightleg1.render(var7);
        this.leftleg1.render(var7);
        this.body1.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
        this.rightleg2.render(var7);
        this.leftleg2.render(var7);
        this.leftleg3.render(var7);
        this.rightleg3.render(var7);
        this.rightleg4.render(var7);
        this.leftleg4.render(var7);
        this.rightleg5.render(var7);
        this.leftleg5.render(var7);
        this.leftleg6.render(var7);
        this.leftleg10.render(var7);
        this.rightleg10.render(var7);
        this.rightleg7.render(var7);
        this.rightleg8.render(var7);
        this.leftleg8.render(var7);
        this.rightleg9.render(var7);
        this.leftleg9.render(var7);
        this.rightarm2.render(var7);
        this.leftarm2.render(var7);
        this.rightarm3.render(var7);
        this.leftarm3.render(var7);
        this.rightarm4.render(var7);
        this.leftarm4.render(var7);
        this.rightarm5.render(var7);
        this.leftarm5.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.leftleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + -0.3490659F;
        this.leftleg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + -1.22173F;
        this.leftleg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + 1.22173F;
        this.leftleg5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.leftleg6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.leftleg8.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + -0.3490659F;
        this.leftleg9.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + -1.22173F;
        this.leftleg10.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.rightleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.rightleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + -0.3490659F;
        this.rightleg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + -1.22173F;
        this.rightleg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + 1.22173F;
        this.rightleg5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.rightleg7.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.rightleg8.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + -0.3490659F;
        this.rightleg9.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + -1.22173F;
        this.rightleg10.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2 + ((float)Math.PI / 2F);
        this.rightarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
    }
}
