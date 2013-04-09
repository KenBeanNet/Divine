package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnderTriplets extends ModelBase
{
    ModelRenderer Head;
    ModelRenderer Jaw;
    ModelRenderer Tentacle11;
    ModelRenderer Tentacle12;
    ModelRenderer Tentacle31;
    ModelRenderer Tentacle511;
    ModelRenderer Head1;
    ModelRenderer Jaw1;
    ModelRenderer Tentacle132;
    ModelRenderer Tentacle122;
    ModelRenderer Tentacle121;
    ModelRenderer Tentacle131;
    ModelRenderer Jaw2;
    ModelRenderer Head2;
    ModelRenderer Tentacle211;
    ModelRenderer Tentacle212;
    ModelRenderer Tentacle231;
    ModelRenderer Tentacle232;
    ModelRenderer Tentacle222;
    ModelRenderer Tentacle221;
    ModelRenderer Tentacle332;
    ModelRenderer Tentacle432;
    ModelRenderer Tentacle311;
    ModelRenderer Tentacle411;

    public ModelEnderTriplets()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.Jaw = new ModelRenderer(this, 0, 20);
        this.Jaw.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 10);
        this.Jaw.setRotationPoint(0.0F, 5.0F, 5.0F);
        this.Jaw.setTextureSize(64, 32);
        this.Jaw.mirror = true;
        this.setRotation(this.Jaw, 0.1745329F, 0.0F, 0.0F);
        this.Tentacle11 = new ModelRenderer(this, 40, 0);
        this.Tentacle11.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle11.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.Tentacle11.setTextureSize(64, 32);
        this.Tentacle11.mirror = true;
        this.setRotation(this.Tentacle11, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle12 = new ModelRenderer(this, 40, 6);
        this.Tentacle12.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle12.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.Tentacle12.setTextureSize(64, 32);
        this.Tentacle12.mirror = true;
        this.setRotation(this.Tentacle12, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle31 = new ModelRenderer(this, 52, 0);
        this.Tentacle31.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle31.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Tentacle31.setTextureSize(64, 32);
        this.Tentacle31.mirror = true;
        this.setRotation(this.Tentacle31, 0.0F, 0.0F, 0.0F);
        this.Tentacle511 = new ModelRenderer(this, 11, 9);
        this.Tentacle511.addBox(-1.0F, -1.0F, 0.0F, 3, 2, 9);
        this.Tentacle511.setRotationPoint(-5.0F, 15.0F, 4.0F);
        this.Tentacle511.setTextureSize(64, 32);
        this.Tentacle511.mirror = true;
        this.setRotation(this.Tentacle511, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Head1 = new ModelRenderer(this, 0, 0);
        this.Head1.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10);
        this.Head1.setRotationPoint(-8.0F, 16.0F, 0.0F);
        this.Head1.setTextureSize(64, 32);
        this.Head1.mirror = true;
        this.setRotation(this.Head1, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.Jaw1 = new ModelRenderer(this, 0, 20);
        this.Jaw1.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 10);
        this.Jaw1.setRotationPoint(-8.0F, 21.0F, 5.0F);
        this.Jaw1.setTextureSize(64, 32);
        this.Jaw1.mirror = true;
        this.setRotation(this.Jaw1, 0.1745329F, 0.0F, 0.0F);
        this.Tentacle132 = new ModelRenderer(this, 40, 6);
        this.Tentacle132.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle132.setRotationPoint(8.0F, 7.0F, 0.0F);
        this.Tentacle132.setTextureSize(64, 32);
        this.Tentacle132.mirror = true;
        this.setRotation(this.Tentacle132, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle122 = new ModelRenderer(this, 40, 6);
        this.Tentacle122.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle122.setRotationPoint(-9.0F, 0.0F, 0.0F);
        this.Tentacle122.setTextureSize(64, 32);
        this.Tentacle122.mirror = true;
        this.setRotation(this.Tentacle122, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle121 = new ModelRenderer(this, 40, 0);
        this.Tentacle121.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle121.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.Tentacle121.setTextureSize(64, 32);
        this.Tentacle121.mirror = true;
        this.setRotation(this.Tentacle121, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle131 = new ModelRenderer(this, 52, 0);
        this.Tentacle131.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle131.setRotationPoint(-8.0F, 11.0F, 0.0F);
        this.Tentacle131.setTextureSize(64, 32);
        this.Tentacle131.mirror = true;
        this.setRotation(this.Tentacle131, 0.0F, 0.0F, 0.0F);
        this.Jaw2 = new ModelRenderer(this, 0, 20);
        this.Jaw2.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 10);
        this.Jaw2.setRotationPoint(8.0F, 21.0F, 5.0F);
        this.Jaw2.setTextureSize(64, 32);
        this.Jaw2.mirror = true;
        this.setRotation(this.Jaw2, 0.1745329F, 0.0F, 0.0F);
        this.Head2 = new ModelRenderer(this, 0, 0);
        this.Head2.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10);
        this.Head2.setRotationPoint(8.0F, 16.0F, 0.0F);
        this.Head2.setTextureSize(64, 32);
        this.Head2.mirror = true;
        this.setRotation(this.Head2, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.Tentacle211 = new ModelRenderer(this, 40, 0);
        this.Tentacle211.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle211.setRotationPoint(13.0F, 16.0F, 0.0F);
        this.Tentacle211.setTextureSize(64, 32);
        this.Tentacle211.mirror = true;
        this.setRotation(this.Tentacle211, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle212 = new ModelRenderer(this, 40, 6);
        this.Tentacle212.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle212.setRotationPoint(17.0F, 16.0F, 0.0F);
        this.Tentacle212.setTextureSize(64, 32);
        this.Tentacle212.mirror = true;
        this.setRotation(this.Tentacle212, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle231 = new ModelRenderer(this, 52, 0);
        this.Tentacle231.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle231.setRotationPoint(8.0F, 11.0F, 0.0F);
        this.Tentacle231.setTextureSize(64, 32);
        this.Tentacle231.mirror = true;
        this.setRotation(this.Tentacle231, 0.0F, 0.0F, 0.0F);
        this.Tentacle232 = new ModelRenderer(this, 40, 6);
        this.Tentacle232.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle232.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.Tentacle232.setTextureSize(64, 32);
        this.Tentacle232.mirror = true;
        this.setRotation(this.Tentacle232, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle222 = new ModelRenderer(this, 40, 6);
        this.Tentacle222.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle222.setRotationPoint(-17.0F, 16.0F, 0.0F);
        this.Tentacle222.setTextureSize(64, 32);
        this.Tentacle222.mirror = true;
        this.setRotation(this.Tentacle222, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle221 = new ModelRenderer(this, 40, 0);
        this.Tentacle221.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle221.setRotationPoint(-13.0F, 16.0F, 0.0F);
        this.Tentacle221.setTextureSize(64, 32);
        this.Tentacle221.mirror = true;
        this.setRotation(this.Tentacle221, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle332 = new ModelRenderer(this, 40, 6);
        this.Tentacle332.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2);
        this.Tentacle332.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle332.setTextureSize(64, 32);
        this.Tentacle332.mirror = true;
        this.setRotation(this.Tentacle332, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle432 = new ModelRenderer(this, 40, 6);
        this.Tentacle432.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle432.setRotationPoint(-8.0F, 7.0F, 0.0F);
        this.Tentacle432.setTextureSize(64, 32);
        this.Tentacle432.mirror = true;
        this.setRotation(this.Tentacle432, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle311 = new ModelRenderer(this, 11, 10);
        this.Tentacle311.addBox(-1.0F, -1.0F, 0.0F, 3, 2, 9);
        this.Tentacle311.setRotationPoint(0.0F, 6.0F, 4.0F);
        this.Tentacle311.setTextureSize(64, 32);
        this.Tentacle311.mirror = true;
        this.setRotation(this.Tentacle311, -0.8028515F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle411 = new ModelRenderer(this, 11, 10);
        this.Tentacle411.addBox(-1.0F, -1.0F, 0.0F, 3, 2, 9);
        this.Tentacle411.setRotationPoint(-6.0F, 12.0F, 4.0F);
        this.Tentacle411.setTextureSize(64, 32);
        this.Tentacle411.mirror = true;
        this.setRotation(this.Tentacle411, 0.8028515F, ((float)Math.PI / 2F), 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.Head.render(var7);
        this.Jaw.render(var7);
        this.Tentacle11.render(var7);
        this.Tentacle12.render(var7);
        this.Tentacle31.render(var7);
        this.Tentacle511.render(var7);
        this.Head1.render(var7);
        this.Jaw1.render(var7);
        this.Tentacle132.render(var7);
        this.Tentacle122.render(var7);
        this.Tentacle121.render(var7);
        this.Tentacle131.render(var7);
        this.Jaw2.render(var7);
        this.Head2.render(var7);
        this.Tentacle211.render(var7);
        this.Tentacle212.render(var7);
        this.Tentacle231.render(var7);
        this.Tentacle232.render(var7);
        this.Tentacle222.render(var7);
        this.Tentacle221.render(var7);
        this.Tentacle332.render(var7);
        this.Tentacle432.render(var7);
        this.Tentacle311.render(var7);
        this.Tentacle411.render(var7);
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
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
    }
}
