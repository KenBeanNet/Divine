package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMoonWolf;

public class ModelMoonWolf extends ModelBase
{
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Ear4;
    ModelRenderer Ear3;
    ModelRenderer spike1;
    ModelRenderer spike2;
    ModelRenderer spike3;
    ModelRenderer spike4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;

    public ModelMoonWolf()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.WolfHead = new ModelRenderer(this, 0, 0);
        this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
        this.WolfHead.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.WolfHead.setTextureSize(64, 32);
        this.WolfHead.mirror = true;
        this.setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 14);
        this.Body.addBox(-4.0F, -3.0F, -3.0F, 6, 9, 6);
        this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.Body.setTextureSize(64, 32);
        this.Body.mirror = true;
        this.setRotation(this.Body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Mane = new ModelRenderer(this, 21, 0);
        this.Mane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7);
        this.Mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.Mane.setTextureSize(64, 32);
        this.Mane.mirror = true;
        this.setRotation(this.Mane, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 18);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.Leg1.setTextureSize(64, 32);
        this.Leg1.mirror = true;
        this.setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
        this.Leg2 = new ModelRenderer(this, 0, 18);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.Leg2.setTextureSize(64, 32);
        this.Leg2.mirror = true;
        this.setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 18);
        this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.Leg3.setTextureSize(64, 32);
        this.Leg3.mirror = true;
        this.setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 18);
        this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.Leg4.setTextureSize(64, 32);
        this.Leg4.mirror = true;
        this.setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
        this.Ear1 = new ModelRenderer(this, 16, 14);
        this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1);
        this.Ear1.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.Ear1.setTextureSize(64, 32);
        this.Ear1.mirror = true;
        this.setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
        this.Ear2 = new ModelRenderer(this, 16, 14);
        this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1);
        this.Ear2.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.Ear2.setTextureSize(64, 32);
        this.Ear2.mirror = true;
        this.setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 0, 10);
        this.Nose.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4);
        this.Nose.setRotationPoint(-0.5F, 13.5F, -7.0F);
        this.Nose.setTextureSize(64, 32);
        this.Nose.mirror = true;
        this.setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
        this.Ear4 = new ModelRenderer(this, 16, 14);
        this.Ear4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
        this.Ear4.setRotationPoint(0.0F, 8.0F, -5.0F);
        this.Ear4.setTextureSize(64, 32);
        this.Ear4.mirror = true;
        this.setRotation(this.Ear4, 0.0F, 0.0F, 0.0F);
        this.Ear3 = new ModelRenderer(this, 16, 14);
        this.Ear3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
        this.Ear3.setRotationPoint(-4.0F, 8.0F, -5.0F);
        this.Ear3.setTextureSize(64, 32);
        this.Ear3.mirror = true;
        this.setRotation(this.Ear3, 0.0F, 0.0F, 0.0F);
        this.spike1 = new ModelRenderer(this, 37, 0);
        this.spike1.addBox(-1.0F, -8.0F, 0.0F, 2, 6, 1);
        this.spike1.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.spike1.setTextureSize(64, 32);
        this.spike1.mirror = true;
        this.setRotation(this.spike1, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.spike2 = new ModelRenderer(this, 37, 0);
        this.spike2.addBox(-1.0F, -8.0F, 3.0F, 2, 6, 1);
        this.spike2.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.spike2.setTextureSize(64, 32);
        this.spike2.mirror = true;
        this.setRotation(this.spike2, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.spike3 = new ModelRenderer(this, 37, 0);
        this.spike3.addBox(-2.0F, -8.0F, 0.0F, 2, 6, 1);
        this.spike3.setRotationPoint(-1.0F, 14.0F, 2.0F);
        this.spike3.setTextureSize(64, 32);
        this.spike3.mirror = true;
        this.setRotation(this.spike3, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.spike4 = new ModelRenderer(this, 37, 0);
        this.spike4.addBox(-2.0F, -9.0F, 4.0F, 2, 6, 1);
        this.spike4.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.spike4.setTextureSize(64, 32);
        this.spike4.mirror = true;
        this.setRotation(this.spike4, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.Shape1 = new ModelRenderer(this, 4, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
        this.Shape1.setRotationPoint(1.0F, 11.0F, -12.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 4, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
        this.Shape2.setRotationPoint(-4.0F, 11.0F, -12.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.WolfHead.render(var7);
        this.Body.render(var7);
        this.Mane.render(var7);
        this.Leg1.render(var7);
        this.Leg2.render(var7);
        this.Leg3.render(var7);
        this.Leg4.render(var7);
        this.Ear1.render(var7);
        this.Ear2.render(var7);
        this.Nose.render(var7);
        this.Ear4.render(var7);
        this.Ear3.render(var7);
        this.spike1.render(var7);
        this.spike2.render(var7);
        this.spike3.render(var7);
        this.spike4.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLiving var1, float var2, float var3, float var4)
    {
        EntityMoonWolf var5 = (EntityMoonWolf)var1;

        if (var5.isSitting())
        {
            this.Mane.setRotationPoint(-1.0F, 16.0F, -3.0F);
            this.Mane.rotateAngleX = ((float)Math.PI * 2F / 5F);
            this.Mane.rotateAngleY = 0.0F;
            this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
            this.Body.rotateAngleX = ((float)Math.PI / 4F);
            this.spike1.setRotationPoint(0.0F, 18.0F, 2.0F);
            this.spike2.setRotationPoint(0.0F, 18.0F, 3.0F);
            this.spike3.setRotationPoint(-1.0F, 18.0F, 2.0F);
            this.spike4.setRotationPoint(0.0F, 18.0F, 2.0F);
            this.Leg1.setRotationPoint(-2.5F, 22.0F, 2.0F);
            this.Leg1.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.Leg2.setRotationPoint(0.5F, 22.0F, 2.0F);
            this.Leg2.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.Leg3.rotateAngleX = 5.811947F;
            this.Leg3.setRotationPoint(-2.49F, 17.0F, -4.0F);
            this.Leg4.rotateAngleX = 5.811947F;
            this.Leg4.setRotationPoint(0.51F, 17.0F, -4.0F);
        }
        else
        {
            this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
            this.Body.rotateAngleX = ((float)Math.PI / 2F);
            this.spike1.setRotationPoint(0.0F, 14.0F, 2.0F);
            this.spike2.setRotationPoint(0.0F, 14.0F, 3.0F);
            this.spike3.setRotationPoint(-1.0F, 14.0F, 2.0F);
            this.spike4.setRotationPoint(0.0F, 14.0F, 2.0F);
            this.Mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
            this.Mane.rotateAngleX = this.Body.rotateAngleX;
            this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
            this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
            this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
            this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
            this.Leg1.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
            this.Leg2.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
            this.Leg3.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
            this.Leg4.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        }

        this.WolfHead.rotateAngleZ = var5.getInterestedAngle(var4) + var5.getShakeAngle(var4, 0.0F);
        this.Mane.rotateAngleZ = var5.getShakeAngle(var4, -0.08F);
        this.Body.rotateAngleZ = var5.getShakeAngle(var4, -0.16F);

        if (var5.getWolfShaking())
        {
            float var6 = var5.getBrightness(var4) * var5.getShadingWhileShaking(var4);
            GL11.glColor3f(var6, var6, var6);
        }
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.WolfHead.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.WolfHead.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Nose.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Nose.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Ear1.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Ear1.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Ear2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Ear2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Ear3.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Ear3.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.Ear4.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.Ear4.rotateAngleY = var4 / (180F / (float)Math.PI);
    }
}
