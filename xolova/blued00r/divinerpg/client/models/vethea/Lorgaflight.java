package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Lorgaflight extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;

    public Lorgaflight()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 21, 16);
        this.body.addBox(-1.0F, 3.0F, 5.0F, 10, 4, 4);
        this.body.setRotationPoint(-4.0F, 7.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 1.0F, 3.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 1.047198F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 12, 4);
        this.leftarm.setRotationPoint(7.0F, -1.0F, 3.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, -1.047198F);
        this.body2 = new ModelRenderer(this, 26, 0);
        this.body2.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2);
        this.body2.setRotationPoint(2.0F, -3.0F, 1.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body2.mirror = false;
        this.body3 = new ModelRenderer(this, 55, 0);
        this.body3.addBox(-1.0F, 0.0F, -2.0F, 2, 12, 2);
        this.body3.setRotationPoint(0.0F, -4.0F, 1.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 26, 0);
        this.body4.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2);
        this.body4.setRotationPoint(-2.0F, -3.0F, 1.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 36, 0);
        this.body5.addBox(-1.0F, 0.0F, 1.0F, 5, 2, 2);
        this.body5.setRotationPoint(-5.0F, 1.0F, 1.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 36, 0);
        this.body6.addBox(-1.0F, 0.0F, 1.0F, 5, 2, 2);
        this.body6.setRotationPoint(2.0F, 1.0F, 1.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 26, 0);
        this.body7.addBox(-1.0F, 0.0F, 4.0F, 2, 2, 2);
        this.body7.setRotationPoint(-2.0F, 5.0F, 1.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 26, 0);
        this.body8.addBox(-1.0F, 0.0F, 4.0F, 2, 2, 2);
        this.body8.setRotationPoint(2.0F, 5.0F, 1.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.body8.mirror = false;
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
