package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Karos extends ModelBase
{
    ModelRenderer head1;
    ModelRenderer body1;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer head2;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;

    public Karos()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head1 = new ModelRenderer(this, 0, 0);
        this.head1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head1.setRotationPoint(8.0F, -11.0F, 0.0F);
        this.head1.setTextureSize(64, 32);
        this.head1.mirror = true;
        this.setRotation(this.head1, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 16, 16);
        this.body1.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body1.setRotationPoint(4.0F, -1.0F, 2.0F);
        this.body1.setTextureSize(64, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.rightarm1 = new ModelRenderer(this, 40, 0);
        this.rightarm1.addBox(-4.0F, -4.0F, -3.0F, 6, 4, 6);
        this.rightarm1.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.rightarm1.setTextureSize(64, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, 0.0F, 0.0F, 0.0F);
        this.leftarm1 = new ModelRenderer(this, 40, 0);
        this.leftarm1.addBox(-2.0F, -4.0F, -3.0F, 6, 4, 6);
        this.leftarm1.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarm1.setTextureSize(64, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head2.setRotationPoint(-8.0F, -11.0F, 0.0F);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 40, 16);
        this.rightarm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm2.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.rightarm2.setTextureSize(64, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, 0.0F, 0.0F, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 40, 16);
        this.leftarm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm2.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarm2.setTextureSize(64, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 16, 16);
        this.body2.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body2.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 16, 16);
        this.body3.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body3.setRotationPoint(-4.0F, -1.0F, 2.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 16, 16);
        this.body4.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body4.setRotationPoint(-4.0F, -1.0F, -2.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 16, 16);
        this.body5.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body5.setRotationPoint(4.0F, -1.0F, -2.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 16, 16);
        this.body6.addBox(1.0F, -2.0F, -3.0F, 4, 4, 4);
        this.body6.setRotationPoint(6.0F, -6.0F, 1.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.0F, 0.0F, -0.6108652F);
        this.body7 = new ModelRenderer(this, 27, 0);
        this.body7.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body7.setRotationPoint(7.0F, 11.0F, 5.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 0.0F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 16, 16);
        this.body8.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body8.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 0.0F, 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 16, 16);
        this.body9.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body9.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.body9.setTextureSize(64, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, 0.0F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 27, 0);
        this.body10.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body10.setRotationPoint(0.0F, 11.0F, -2.0F);
        this.body10.setTextureSize(64, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 0.0F, 0.0F, 0.0F);
        this.body11 = new ModelRenderer(this, 27, 0);
        this.body11.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body11.setRotationPoint(2.0F, 11.0F, 3.0F);
        this.body11.setTextureSize(64, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, 0.0F, 0.0F, 0.0F);
        this.body12 = new ModelRenderer(this, 27, 0);
        this.body12.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body12.setRotationPoint(1.0F, 11.0F, 5.0F);
        this.body12.setTextureSize(64, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 0.0F, 0.0F, 0.0F);
        this.body13 = new ModelRenderer(this, 27, 0);
        this.body13.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body13.setRotationPoint(5.0F, 11.0F, 4.0F);
        this.body13.setTextureSize(64, 32);
        this.body13.mirror = true;
        this.setRotation(this.body13, 0.0F, 0.0F, 0.0F);
        this.body14 = new ModelRenderer(this, 27, 0);
        this.body14.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body14.setRotationPoint(6.0F, 11.0F, 0.0F);
        this.body14.setTextureSize(64, 32);
        this.body14.mirror = true;
        this.setRotation(this.body14, 0.0F, 0.0F, 0.0F);
        this.body15 = new ModelRenderer(this, 27, 0);
        this.body15.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body15.setRotationPoint(4.0F, 11.0F, 1.0F);
        this.body15.setTextureSize(64, 32);
        this.body15.mirror = true;
        this.setRotation(this.body15, 0.0F, 0.0F, 0.0F);
        this.body16 = new ModelRenderer(this, 27, 0);
        this.body16.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body16.setRotationPoint(7.0F, 11.0F, -2.0F);
        this.body16.setTextureSize(64, 32);
        this.body16.mirror = true;
        this.setRotation(this.body16, 0.0F, 0.0F, 0.0F);
        this.body17 = new ModelRenderer(this, 27, 0);
        this.body17.addBox(-4.0F, 0.0F, -2.0F, 1, 6, 1);
        this.body17.setRotationPoint(3.0F, 11.0F, -1.0F);
        this.body17.setTextureSize(64, 32);
        this.body17.mirror = true;
        this.setRotation(this.body17, 0.0F, 0.0F, 0.0F);
        this.body18 = new ModelRenderer(this, 16, 16);
        this.body18.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body18.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.body18.setTextureSize(64, 32);
        this.body18.mirror = true;
        this.setRotation(this.body18, 0.0F, 0.0F, 0.0F);
        this.body19 = new ModelRenderer(this, 16, 16);
        this.body19.addBox(-5.0F, -2.0F, -3.0F, 4, 4, 4);
        this.body19.setRotationPoint(-5.0F, -6.0F, 1.0F);
        this.body19.setTextureSize(64, 32);
        this.body19.mirror = true;
        this.setRotation(this.body19, 0.0F, 0.0F, 0.6108652F);
        this.body20 = new ModelRenderer(this, 16, 16);
        this.body20.addBox(-4.0F, -1.0F, -2.0F, 7, 2, 2);
        this.body20.setRotationPoint(6.0F, -6.0F, 1.0F);
        this.body20.setTextureSize(64, 32);
        this.body20.mirror = true;
        this.setRotation(this.body20, 0.0F, 0.0F, -0.6108652F);
        this.body21 = new ModelRenderer(this, 32, 11);
        this.body21.addBox(-4.0F, -1.0F, -2.0F, 5, 2, 2);
        this.body21.setRotationPoint(9.0F, -11.0F, 1.0F);
        this.body21.setTextureSize(64, 32);
        this.body21.mirror = true;
        this.setRotation(this.body21, 0.0F, 0.0F, -((float)Math.PI / 2F));
        this.body22 = new ModelRenderer(this, 16, 16);
        this.body22.addBox(-4.0F, -1.0F, -2.0F, 7, 2, 2);
        this.body22.setRotationPoint(-5.0F, -6.0F, 1.0F);
        this.body22.setTextureSize(64, 32);
        this.body22.mirror = true;
        this.setRotation(this.body22, 0.0F, 0.0F, 0.6108652F);
        this.body23 = new ModelRenderer(this, 32, 11);
        this.body23.addBox(-4.0F, -1.0F, -2.0F, 5, 2, 2);
        this.body23.setRotationPoint(-8.0F, -11.0F, 1.0F);
        this.body23.setTextureSize(64, 32);
        this.body23.mirror = true;
        this.setRotation(this.body23, 0.0F, 0.0F, -((float)Math.PI / 2F));
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head1.render(var7);
        this.body1.render(var7);
        this.rightarm1.render(var7);
        this.leftarm1.render(var7);
        this.head2.render(var7);
        this.rightarm2.render(var7);
        this.leftarm2.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
        this.body9.render(var7);
        this.body10.render(var7);
        this.body11.render(var7);
        this.body12.render(var7);
        this.body13.render(var7);
        this.body14.render(var7);
        this.body15.render(var7);
        this.body16.render(var7);
        this.body17.render(var7);
        this.body18.render(var7);
        this.body19.render(var7);
        this.body20.render(var7);
        this.body21.render(var7);
        this.body22.render(var7);
        this.body23.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.rightarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
    }
}
