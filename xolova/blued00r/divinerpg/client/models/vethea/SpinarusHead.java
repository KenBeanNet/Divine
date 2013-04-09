package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpinarusHead extends ModelBase
{
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;

    public SpinarusHead()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer(this, 0, 0);
        this.part1.addBox(-5.0F, -2.0F, -10.0F, 10, 4, 10);
        this.part1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.0F, 0.0F, 0.0F);
        this.part2 = new ModelRenderer(this, 0, 19);
        this.part2.addBox(-1.0F, -1.0F, 15.0F, 2, 2, 7);
        this.part2.setRotationPoint(-4.0F, 0.0F, -9.0F);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.0F, 0.5235988F, 0.0F);
        this.part3 = new ModelRenderer(this, 0, 19);
        this.part3.addBox(-1.0F, -1.0F, 15.0F, 2, 2, 7);
        this.part3.setRotationPoint(4.0F, 0.0F, -9.0F);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 0.0F, -0.5235988F, 0.0F);
        this.part4 = new ModelRenderer(this, 0, 14);
        this.part4.addBox(-1.0F, -1.0F, -4.0F, 1, 1, 4);
        this.part4.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.part4.setTextureSize(64, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 0.0F, 0.3490659F, 0.0F);
        this.part5 = new ModelRenderer(this, 0, 14);
        this.part5.addBox(0.0F, -1.0F, -4.0F, 1, 1, 4);
        this.part5.setRotationPoint(1.0F, 0.0F, -10.0F);
        this.part5.setTextureSize(64, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, 0.0F, -0.3490659F, 0.0F);
        this.part6 = new ModelRenderer(this, 40, 0);
        this.part6.addBox(-4.0F, -1.0F, 0.0F, 8, 2, 1);
        this.part6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part6.setTextureSize(64, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, 0.0F, 0.0F, 0.0F);
        this.part7 = new ModelRenderer(this, 0, 0);
        this.part7.addBox(-5.0F, -2.0F, 0.0F, 10, 4, 10);
        this.part7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.part7.setTextureSize(64, 32);
        this.part7.mirror = true;
        this.setRotation(this.part7, 0.0F, 0.0F, 0.0F);
        this.part8 = new ModelRenderer(this, 0, 19);
        this.part8.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7);
        this.part8.setRotationPoint(4.0F, 0.0F, -9.0F);
        this.part8.setTextureSize(64, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, 0.0F, -0.5235988F, 0.0F);
        this.part9 = new ModelRenderer(this, 0, 19);
        this.part9.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7);
        this.part9.setRotationPoint(-4.0F, 0.0F, -9.0F);
        this.part9.setTextureSize(64, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, 0.0F, 0.5235988F, 0.0F);
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
        this.part5.render(var7);
        this.part6.render(var7);
        this.part7.render(var7);
        this.part8.render(var7);
        this.part9.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
