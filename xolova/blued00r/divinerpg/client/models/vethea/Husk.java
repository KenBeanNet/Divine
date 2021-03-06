package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Husk extends ModelBase
{
    ModelRenderer head;
    ModelRenderer tooth2;
    ModelRenderer tooth1;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg2;
    ModelRenderer leg1;
    ModelRenderer body;

    public Husk()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(0.0F, 4.0F, -7.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.tooth2 = new ModelRenderer(this, 22, 0);
        this.tooth2.addBox(2.0F, -7.0F, 6.0F, 1, 3, 1);
        this.tooth2.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.tooth2.setTextureSize(64, 32);
        this.tooth2.mirror = true;
        this.setRotation(this.tooth2, -(float)Math.PI, 0.0F, 0.0F);
        this.tooth1 = new ModelRenderer(this, 22, 0);
        this.tooth1.addBox(-3.0F, -7.0F, 6.0F, 1, 3, 1);
        this.tooth1.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.tooth1.setTextureSize(64, 32);
        this.tooth1.mirror = true;
        this.setRotation(this.tooth1, -(float)Math.PI, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 13);
        this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 15, 4);
        this.leg3.setRotationPoint(-3.0F, 9.0F, -5.0F);
        this.leg3.setTextureSize(64, 32);
        this.leg3.mirror = true;
        this.setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 13);
        this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 15, 4);
        this.leg4.setRotationPoint(3.0F, 9.0F, -5.0F);
        this.leg4.setTextureSize(64, 32);
        this.leg4.mirror = true;
        this.setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg2.setRotationPoint(3.0F, 12.0F, 5.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg1.setRotationPoint(-3.0F, 12.0F, 5.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 4);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 1.362596F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.tooth2.render(var7);
        this.tooth1.render(var7);
        this.leg3.render(var7);
        this.leg4.render(var7);
        this.leg2.render(var7);
        this.leg1.render(var7);
        this.body.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    }
}
