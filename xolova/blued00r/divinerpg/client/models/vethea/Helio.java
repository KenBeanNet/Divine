package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Helio extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer leftarmp1;
    ModelRenderer rightlegt;
    ModelRenderer leftlegt;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer leftlegm;
    ModelRenderer rightlegm;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer leftarmp2;
    ModelRenderer leftarmp3;
    ModelRenderer leftarmp4;
    ModelRenderer leftarmp5;
    ModelRenderer leftarmp6;

    public Helio()
    {
        this.textureWidth = 256;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(256, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 76, 0);
        this.body1.addBox(-4.0F, 0.0F, -2.0F, 6, 10, 3);
        this.body1.setRotationPoint(7.0F, 0.0F, -1.0F);
        this.body1.setTextureSize(256, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.0F, 0.0F, 0.0F);
        this.leftarmp1 = new ModelRenderer(this, 226, 6);
        this.leftarmp1.addBox(-1.0F, -3.0F, -3.0F, 8, 6, 6);
        this.leftarmp1.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp1.setTextureSize(256, 32);
        this.leftarmp1.mirror = true;
        this.setRotation(this.leftarmp1, 0.0F, 0.0F, 0.0F);
        this.rightlegt = new ModelRenderer(this, 199, 17);
        this.rightlegt.addBox(-3.0F, -2.0F, -3.0F, 6, 5, 6);
        this.rightlegt.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.rightlegt.setTextureSize(256, 32);
        this.rightlegt.mirror = true;
        this.setRotation(this.rightlegt, 0.0F, 0.0F, 0.0F);
        this.leftlegt = new ModelRenderer(this, 199, 17);
        this.leftlegt.addBox(-3.0F, -2.0F, -3.0F, 6, 5, 6);
        this.leftlegt.setRotationPoint(6.0F, 12.0F, 0.0F);
        this.leftlegt.setTextureSize(256, 32);
        this.leftlegt.mirror = true;
        this.setRotation(this.leftlegt, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 76, 0);
        this.body2.addBox(-4.0F, 0.0F, -2.0F, 6, 10, 3);
        this.body2.setRotationPoint(7.0F, 0.0F, 2.0F);
        this.body2.setTextureSize(256, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 58, 0);
        this.body3.addBox(-4.0F, 0.0F, -2.0F, 6, 12, 3);
        this.body3.setRotationPoint(1.0F, -2.0F, -1.0F);
        this.body3.setTextureSize(256, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 16, 16);
        this.body4.addBox(-4.0F, 0.0F, -2.0F, 6, 12, 3);
        this.body4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.body4.setTextureSize(256, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 40, 0);
        this.body5.addBox(-4.0F, 0.0F, -2.0F, 6, 10, 3);
        this.body5.setRotationPoint(-5.0F, 0.0F, -1.0F);
        this.body5.setTextureSize(256, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 40, 0);
        this.body6.addBox(-4.0F, 0.0F, -2.0F, 6, 10, 3);
        this.body6.setRotationPoint(-5.0F, 0.0F, 2.0F);
        this.body6.setTextureSize(256, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.leftlegm = new ModelRenderer(this, 97, 0);
        this.leftlegm.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftlegm.setRotationPoint(6.0F, 12.0F, 0.0F);
        this.leftlegm.setTextureSize(256, 32);
        this.leftlegm.mirror = true;
        this.setRotation(this.leftlegm, 0.0F, 0.0F, 0.0F);
        this.rightlegm = new ModelRenderer(this, 97, 0);
        this.rightlegm.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightlegm.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.rightlegm.setTextureSize(256, 32);
        this.rightlegm.mirror = true;
        this.setRotation(this.rightlegm, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 97, 20);
        this.leftleg.addBox(-3.0F, 7.0F, -3.0F, 6, 5, 6);
        this.leftleg.setRotationPoint(6.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(256, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 97, 20);
        this.rightleg.addBox(-3.0F, 7.0F, -3.0F, 6, 5, 6);
        this.rightleg.setRotationPoint(-6.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(256, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftarmp2 = new ModelRenderer(this, 140, 11);
        this.leftarmp2.addBox(3.0F, 10.0F, 10.0F, 12, 9, 12);
        this.leftarmp2.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp2.setTextureSize(256, 32);
        this.leftarmp2.mirror = true;
        this.setRotation(this.leftarmp2, -((float)Math.PI / 2F), 0.6108652F, 0.0F);
        this.leftarmp3 = new ModelRenderer(this, 36, 16);
        this.leftarmp3.addBox(1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarmp3.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp3.setTextureSize(256, 32);
        this.leftarmp3.mirror = true;
        this.setRotation(this.leftarmp3, 0.0F, 0.0F, 0.0F);
        this.leftarmp4 = new ModelRenderer(this, 69, 17);
        this.leftarmp4.addBox(0.0F, 6.0F, 0.0F, 6, 9, 6);
        this.leftarmp4.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp4.setTextureSize(256, 32);
        this.leftarmp4.mirror = true;
        this.setRotation(this.leftarmp4, -0.5235988F, 0.0F, 0.0F);
        this.leftarmp5 = new ModelRenderer(this, 116, 1);
        this.leftarmp5.addBox(1.0F, 9.0F, 3.0F, 8, 9, 8);
        this.leftarmp5.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp5.setTextureSize(256, 32);
        this.leftarmp5.mirror = true;
        this.setRotation(this.leftarmp5, -0.8726646F, 0.2974289F, 0.0F);
        this.leftarmp6 = new ModelRenderer(this, 193, 10);
        this.leftarmp6.addBox(0.0F, 9.0F, 9.0F, 10, 9, 10);
        this.leftarmp6.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftarmp6.setTextureSize(256, 32);
        this.leftarmp6.mirror = true;
        this.setRotation(this.leftarmp6, -1.396263F, 0.2974289F, 0.0F);
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
        this.leftarmp1.render(var7);
        this.rightlegt.render(var7);
        this.leftlegt.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.leftlegm.render(var7);
        this.rightlegm.render(var7);
        this.leftleg.render(var7);
        this.rightleg.render(var7);
        this.leftarmp2.render(var7);
        this.leftarmp3.render(var7);
        this.leftarmp4.render(var7);
        this.leftarmp5.render(var7);
        this.leftarmp6.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
