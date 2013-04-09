package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class HiveSoldier extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;

    public HiveSoldier()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 7, 8);
        this.head.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 16, 16);
        this.body1.addBox(0.0F, 10.0F, -2.0F, 2, 2, 2);
        this.body1.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body1.setTextureSize(64, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 12, 2);
        this.rightarm.setRotationPoint(-4.0F, 2.0F, 1.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 12, 2);
        this.leftarm.setRotationPoint(6.0F, 2.0F, 1.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 1.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 2, 12, 2);
        this.leftleg.setRotationPoint(4.0F, 12.0F, 1.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 16, 16);
        this.body2.addBox(-4.0F, 0.0F, -2.0F, 4, 12, 2);
        this.body2.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 16, 16);
        this.body3.addBox(-7.0F, 2.0F, -2.0F, 3, 2, 2);
        this.body3.setRotationPoint(9.0F, 3.0F, 1.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 16, 16);
        this.body4.addBox(-6.0F, 10.0F, -2.0F, 2, 2, 2);
        this.body4.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 16, 16);
        this.body5.addBox(-7.0F, 2.0F, -2.0F, 3, 2, 2);
        this.body5.setRotationPoint(2.0F, 3.0F, 1.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 16, 16);
        this.body6.addBox(-7.0F, 2.0F, -2.0F, 3, 2, 2);
        this.body6.setRotationPoint(9.0F, -1.0F, 1.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 16, 16);
        this.body7.addBox(-7.0F, 2.0F, -2.0F, 3, 2, 2);
        this.body7.setRotationPoint(2.0F, -1.0F, 1.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body1.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
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
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
    }
}
