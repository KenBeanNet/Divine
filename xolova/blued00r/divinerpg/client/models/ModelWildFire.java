package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWildFire extends ModelBase
{
    ModelRenderer P1;
    ModelRenderer P2;
    ModelRenderer P3;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer P4;
    ModelRenderer P5;
    ModelRenderer P6;
    ModelRenderer P7;
    ModelRenderer P8;
    public ModelRenderer rightarm;
    ModelRenderer P9;
    ModelRenderer P10;
    ModelRenderer P11;
    ModelRenderer P12;
    ModelRenderer P13;
    ModelRenderer P14;
    ModelRenderer P15;
    ModelRenderer P16;
    ModelRenderer P17;

    public ModelWildFire()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.P1 = new ModelRenderer(this, 32, 17);
        this.P1.addBox(-4.0F, -13.0F, -1.0F, 2, 8, 2);
        this.P1.setRotationPoint(6.0F, -6.0F, 9.0F);
        this.P1.setTextureSize(64, 32);
        this.P1.mirror = true;
        this.setRotation(this.P1, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.P2 = new ModelRenderer(this, 16, 16);
        this.P2.addBox(-4.0F, 0.0F, -2.0F, 5, 12, 4);
        this.P2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.P2.setTextureSize(64, 32);
        this.P2.mirror = true;
        this.setRotation(this.P2, 0.0F, 0.0F, 0.0F);
        this.P3 = new ModelRenderer(this, 40, 16);
        this.P3.addBox(-1.0F, -3.0F, -2.0F, 2, 4, 6);
        this.P3.setRotationPoint(5.0F, -1.0F, -1.0F);
        this.P3.setTextureSize(64, 32);
        this.P3.mirror = true;
        this.setRotation(this.P3, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(7.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-3.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(3.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.P4 = new ModelRenderer(this, 43, 18);
        this.P4.addBox(1.0F, -2.0F, -2.0F, 1, 2, 4);
        this.P4.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.P4.setTextureSize(64, 32);
        this.P4.mirror = true;
        this.setRotation(this.P4, 0.0F, 0.0F, 0.0F);
        this.P5 = new ModelRenderer(this, 40, 16);
        this.P5.addBox(-2.0F, -3.0F, -2.0F, 6, 2, 4);
        this.P5.setRotationPoint(7.0F, 1.0F, 0.0F);
        this.P5.setTextureSize(64, 32);
        this.P5.mirror = true;
        this.setRotation(this.P5, 0.0F, 0.0F, 0.0F);
        this.P6 = new ModelRenderer(this, 40, 16);
        this.P6.addBox(-2.0F, -3.0F, -2.0F, 6, 2, 4);
        this.P6.setRotationPoint(-9.0F, 1.0F, 0.0F);
        this.P6.setTextureSize(64, 32);
        this.P6.mirror = true;
        this.setRotation(this.P6, 0.0F, 0.0F, 0.0F);
        this.P7 = new ModelRenderer(this, 40, 16);
        this.P7.addBox(-1.0F, -3.0F, -2.0F, 2, 4, 6);
        this.P7.setRotationPoint(-5.0F, -1.0F, -1.0F);
        this.P7.setTextureSize(64, 32);
        this.P7.mirror = true;
        this.setRotation(this.P7, 0.0F, 0.0F, 0.0F);
        this.P8 = new ModelRenderer(this, 43, 18);
        this.P8.addBox(1.0F, -2.0F, -2.0F, 1, 2, 4);
        this.P8.setRotationPoint(-7.0F, 2.0F, 0.0F);
        this.P8.setTextureSize(64, 32);
        this.P8.mirror = true;
        this.setRotation(this.P8, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-7.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.P9 = new ModelRenderer(this, 23, 19);
        this.P9.addBox(-3.0F, -2.0F, -2.0F, 3, 9, 2);
        this.P9.setRotationPoint(-10.0F, -1.0F, 1.0F);
        this.P9.setTextureSize(64, 32);
        this.P9.mirror = true;
        this.setRotation(this.P9, 0.0F, 0.0F, 2.530727F);
        this.P10 = new ModelRenderer(this, 23, 19);
        this.P10.addBox(-3.0F, -2.0F, -2.0F, 3, 9, 2);
        this.P10.setRotationPoint(8.0F, -3.0F, 1.0F);
        this.P10.setTextureSize(64, 32);
        this.P10.mirror = true;
        this.setRotation(this.P10, 0.0F, 0.0F, -2.530727F);
        this.P11 = new ModelRenderer(this, 32, 0);
        this.P11.addBox(-3.0F, -8.0F, -4.0F, 6, 12, 6);
        this.P11.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.P11.setTextureSize(64, 32);
        this.P11.mirror = true;
        this.setRotation(this.P11, -0.3490659F, 0.0F, 0.0F);
        this.P12 = new ModelRenderer(this, 32, 17);
        this.P12.addBox(-4.0F, -13.0F, -1.0F, 2, 8, 2);
        this.P12.setRotationPoint(0.0F, -6.0F, 9.0F);
        this.P12.setTextureSize(64, 32);
        this.P12.mirror = true;
        this.setRotation(this.P12, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.P13 = new ModelRenderer(this, 19, 22);
        this.P13.addBox(-5.0F, -14.0F, -1.0F, 4, 4, 4);
        this.P13.setRotationPoint(6.0F, 1.0F, -1.0F);
        this.P13.setTextureSize(64, 32);
        this.P13.mirror = true;
        this.setRotation(this.P13, -0.3490659F, 0.0F, 0.0F);
        this.P14 = new ModelRenderer(this, 19, 22);
        this.P14.addBox(-5.0F, -14.0F, -1.0F, 4, 4, 4);
        this.P14.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.P14.setTextureSize(64, 32);
        this.P14.mirror = true;
        this.setRotation(this.P14, -0.3490659F, 0.0F, 0.0F);
        this.P15 = new ModelRenderer(this, 32, 17);
        this.P15.addBox(-4.0F, -13.0F, -1.0F, 2, 8, 2);
        this.P15.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.P15.setTextureSize(64, 32);
        this.P15.mirror = true;
        this.setRotation(this.P15, -0.3490659F, 0.0F, 0.0F);
        this.P16 = new ModelRenderer(this, 32, 17);
        this.P16.addBox(-4.0F, -13.0F, -1.0F, 2, 8, 2);
        this.P16.setRotationPoint(6.0F, 2.0F, 0.0F);
        this.P16.setTextureSize(64, 32);
        this.P16.mirror = true;
        this.setRotation(this.P16, -0.3490659F, 0.0F, 0.0F);
        this.P17 = new ModelRenderer(this, 16, 16);
        this.P17.addBox(-4.0F, 0.0F, -2.0F, 5, 12, 4);
        this.P17.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.P17.setTextureSize(64, 32);
        this.P17.mirror = true;
        this.setRotation(this.P17, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.P1.render(var7);
        this.P2.render(var7);
        this.P3.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.P4.render(var7);
        this.P5.render(var7);
        this.P6.render(var7);
        this.P7.render(var7);
        this.P8.render(var7);
        this.rightarm.render(var7);
        this.P9.render(var7);
        this.P10.render(var7);
        this.P11.render(var7);
        this.P12.render(var7);
        this.P13.render(var7);
        this.P14.render(var7);
        this.P15.render(var7);
        this.P16.render(var7);
        this.P17.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }
}
