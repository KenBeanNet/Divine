package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLeorna extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer a;
    ModelRenderer Bar1;
    ModelRenderer Bar2;
    ModelRenderer Bar3;
    ModelRenderer Bar4;
    ModelRenderer Box;

    public ModelLeorna()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 13);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 13);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 13);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 13);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 13);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.a = new ModelRenderer(this, 0, 0);
        this.a.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.a.setTextureSize(64, 32);
        this.a.mirror = true;
        this.setRotation(this.a, 0.0F, 0.0F, 0.0F);
        this.Bar1 = new ModelRenderer(this, 0, 29);
        this.Bar1.addBox(0.0F, 0.0F, 0.0F, 24, 2, 1);
        this.Bar1.setRotationPoint(-12.0F, 9.0F, 3.0F);
        this.Bar1.setTextureSize(64, 32);
        this.Bar1.mirror = true;
        this.setRotation(this.Bar1, 0.0F, 0.0F, 0.0F);
        this.Bar2 = new ModelRenderer(this, 0, 29);
        this.Bar2.addBox(0.0F, 0.0F, 0.0F, 24, 2, 1);
        this.Bar2.setRotationPoint(-12.0F, 0.0F, 3.0F);
        this.Bar2.setTextureSize(64, 32);
        this.Bar2.mirror = true;
        this.setRotation(this.Bar2, 0.0F, 0.0F, 0.0F);
        this.Bar3 = new ModelRenderer(this, 0, 29);
        this.Bar3.addBox(0.0F, 0.0F, 0.0F, 24, 2, 1);
        this.Bar3.setRotationPoint(-12.0F, 3.0F, 3.0F);
        this.Bar3.setTextureSize(64, 32);
        this.Bar3.mirror = true;
        this.setRotation(this.Bar3, 0.0F, 0.0F, 0.0F);
        this.Bar4 = new ModelRenderer(this, 0, 29);
        this.Bar4.addBox(0.0F, 0.0F, 0.0F, 24, 2, 1);
        this.Bar4.setRotationPoint(-12.0F, 6.0F, 3.0F);
        this.Bar4.setTextureSize(64, 32);
        this.Bar4.mirror = true;
        this.setRotation(this.Bar4, 0.0F, 0.0F, 0.0F);
        this.Box = new ModelRenderer(this, 33, 0);
        this.Box.addBox(0.0F, 0.0F, 0.0F, 4, 12, 3);
        this.Box.setRotationPoint(-2.0F, -1.0F, 2.0F);
        this.Box.setTextureSize(64, 32);
        this.Box.mirror = true;
        this.setRotation(this.Box, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.head.render(var7);
        this.body.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.a.render(var7);
        this.Bar1.render(var7);
        this.Bar2.render(var7);
        this.Bar3.render(var7);
        this.Bar4.render(var7);
        this.Box.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;

        if (this.isRiding)
        {
            this.rightarm.rotateAngleX += -((float)Math.PI / 5F);
            this.leftarm.rotateAngleX += -((float)Math.PI / 5F);
            this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
            this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
        }

        this.rightarm.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;

        if (this.onGround > -9990.0F)
        {
            float var8 = this.onGround;
            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var8) * (float)Math.PI * 2.0F) * 0.2F;
            this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.rightarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleX += this.body.rotateAngleY;
            var8 = 1.0F - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0F - var8;
            float var9 = MathHelper.sin(var8 * (float)Math.PI);
            float var10 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)var9 * 1.2D + (double)var10));
            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
            this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
        }

        this.body.rotateAngleX = 0.0F;
        this.rightleg.rotationPointZ = 0.1F;
        this.leftleg.rotationPointZ = 0.1F;
        this.rightleg.rotationPointY = 12.0F;
        this.leftleg.rotationPointY = 12.0F;
        this.head.rotationPointY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }
}
