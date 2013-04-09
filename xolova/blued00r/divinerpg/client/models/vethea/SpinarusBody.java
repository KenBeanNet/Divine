package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpinarusBody extends ModelBase
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
    ModelRenderer part10;
    ModelRenderer part11;
    ModelRenderer part12;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part17;
    ModelRenderer part18;
    ModelRenderer part19;

    public SpinarusBody()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer(this, 0, 0);
        this.part1.addBox(-1.0F, -1.0F, -14.0F, 1, 4, 10);
        this.part1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, ((float)Math.PI / 4F), 0.0F, -((float)Math.PI / 2F));
        this.part2 = new ModelRenderer(this, 0, 14);
        this.part2.addBox(-4.0F, -1.0F, 0.0F, 8, 2, 1);
        this.part2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.0F, 0.0F, 0.0F);
        this.part3 = new ModelRenderer(this, 0, 0);
        this.part3.addBox(-5.0F, -2.0F, 0.0F, 10, 4, 10);
        this.part3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 0.0F, 0.0F, 0.0F);
        this.part4 = new ModelRenderer(this, 0, 0);
        this.part4.addBox(-5.0F, -2.0F, -10.0F, 10, 4, 10);
        this.part4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part4.setTextureSize(64, 32);
        this.part4.mirror = true;
        this.setRotation(this.part4, 0.0F, 0.0F, 0.0F);
        this.part5 = new ModelRenderer(this, 0, 0);
        this.part5.addBox(-6.0F, -9.0F, -3.0F, 1, 4, 10);
        this.part5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part5.setTextureSize(64, 32);
        this.part5.mirror = true;
        this.setRotation(this.part5, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part6 = new ModelRenderer(this, 0, 0);
        this.part6.addBox(-1.0F, 6.0F, -7.0F, 1, 4, 10);
        this.part6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part6.setTextureSize(64, 32);
        this.part6.mirror = true;
        this.setRotation(this.part6, ((float)Math.PI / 4F), 0.0F, -((float)Math.PI / 2F));
        this.part7 = new ModelRenderer(this, 0, 0);
        this.part7.addBox(-6.0F, -2.0F, -10.0F, 1, 4, 10);
        this.part7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part7.setTextureSize(64, 32);
        this.part7.mirror = true;
        this.setRotation(this.part7, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part8 = new ModelRenderer(this, 13, 19);
        this.part8.addBox(6.0F, -9.0F, 2.0F, 1, 4, 5);
        this.part8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part8.setTextureSize(64, 32);
        this.part8.mirror = true;
        this.setRotation(this.part8, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part9 = new ModelRenderer(this, 13, 19);
        this.part9.addBox(6.0F, -2.0F, -5.0F, 1, 4, 5);
        this.part9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part9.setTextureSize(64, 32);
        this.part9.mirror = true;
        this.setRotation(this.part9, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part10 = new ModelRenderer(this, 13, 19);
        this.part10.addBox(-7.0F, -9.0F, 2.0F, 1, 4, 5);
        this.part10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part10.setTextureSize(64, 32);
        this.part10.mirror = true;
        this.setRotation(this.part10, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part11 = new ModelRenderer(this, 13, 19);
        this.part11.addBox(-7.0F, -2.0F, -5.0F, 1, 4, 5);
        this.part11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part11.setTextureSize(64, 32);
        this.part11.mirror = true;
        this.setRotation(this.part11, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part12 = new ModelRenderer(this, 0, 0);
        this.part12.addBox(-1.0F, -10.0F, -7.0F, 1, 4, 10);
        this.part12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part12.setTextureSize(64, 32);
        this.part12.mirror = true;
        this.setRotation(this.part12, -((float)Math.PI / 4F), 0.0F, -((float)Math.PI / 2F));
        this.part13 = new ModelRenderer(this, 0, 0);
        this.part13.addBox(-1.0F, -3.0F, -14.0F, 1, 4, 10);
        this.part13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part13.setTextureSize(64, 32);
        this.part13.mirror = true;
        this.setRotation(this.part13, -((float)Math.PI / 4F), 0.0F, -((float)Math.PI / 2F));
        this.part14 = new ModelRenderer(this, 0, 0);
        this.part14.addBox(5.0F, -2.0F, -10.0F, 1, 4, 10);
        this.part14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part14.setTextureSize(64, 32);
        this.part14.mirror = true;
        this.setRotation(this.part14, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part15 = new ModelRenderer(this, 0, 0);
        this.part15.addBox(5.0F, -9.0F, -3.0F, 1, 4, 10);
        this.part15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part15.setTextureSize(64, 32);
        this.part15.mirror = true;
        this.setRotation(this.part15, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part16 = new ModelRenderer(this, 0, 0);
        this.part16.addBox(-8.0F, -9.0F, -3.0F, 1, 4, 10);
        this.part16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part16.setTextureSize(64, 32);
        this.part16.mirror = true;
        this.setRotation(this.part16, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part17 = new ModelRenderer(this, 0, 0);
        this.part17.addBox(-8.0F, -2.0F, -10.0F, 1, 4, 10);
        this.part17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part17.setTextureSize(64, 32);
        this.part17.mirror = true;
        this.setRotation(this.part17, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part18 = new ModelRenderer(this, 0, 0);
        this.part18.addBox(7.0F, -9.0F, -3.0F, 1, 4, 10);
        this.part18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part18.setTextureSize(64, 32);
        this.part18.mirror = true;
        this.setRotation(this.part18, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.part19 = new ModelRenderer(this, 0, 0);
        this.part19.addBox(7.0F, -2.0F, -10.0F, 1, 4, 10);
        this.part19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part19.setTextureSize(64, 32);
        this.part19.mirror = true;
        this.setRotation(this.part19, -((float)Math.PI / 4F), 0.0F, 0.0F);
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
        this.part10.render(var7);
        this.part11.render(var7);
        this.part12.render(var7);
        this.part13.render(var7);
        this.part14.render(var7);
        this.part15.render(var7);
        this.part16.render(var7);
        this.part17.render(var7);
        this.part18.render(var7);
        this.part19.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
