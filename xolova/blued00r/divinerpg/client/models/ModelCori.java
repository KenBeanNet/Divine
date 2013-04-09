package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCori extends ModelBase
{
    ModelRenderer Head;
    ModelRenderer Tentacle1;
    ModelRenderer Tentacle2;
    ModelRenderer Tentacle3;
    ModelRenderer Tentacle4;
    ModelRenderer Tentacle5;
    ModelRenderer Tentacle6;
    ModelRenderer Tentacle7;
    ModelRenderer Tentacle8;
    ModelRenderer Tentacle9;
    ModelRenderer Tentacle10;
    ModelRenderer Tentacle11;
    ModelRenderer Tentacle12;
    ModelRenderer Tentacle13;
    ModelRenderer Tentacle14;
    ModelRenderer Tentacle15;
    ModelRenderer Tentacle16;
    ModelRenderer Tentacle17;
    ModelRenderer Tentacle18;
    ModelRenderer Tentacle19;
    ModelRenderer Tentacle20;

    public ModelCori()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10);
        this.Head.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.Tentacle1 = new ModelRenderer(this, 40, 0);
        this.Tentacle1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle1.setRotationPoint(5.0F, 2.0F, 5.0F);
        this.Tentacle1.setTextureSize(64, 32);
        this.Tentacle1.mirror = true;
        this.setRotation(this.Tentacle1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle2 = new ModelRenderer(this, 52, 0);
        this.Tentacle2.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle2.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Tentacle2.setTextureSize(64, 32);
        this.Tentacle2.mirror = true;
        this.setRotation(this.Tentacle2, 0.0F, 0.0F, 0.0F);
        this.Tentacle3 = new ModelRenderer(this, 40, 6);
        this.Tentacle3.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle3.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Tentacle3.setTextureSize(64, 32);
        this.Tentacle3.mirror = true;
        this.setRotation(this.Tentacle3, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle4 = new ModelRenderer(this, 11, 0);
        this.Tentacle4.addBox(-1.0F, -3.0F, -1.0F, 2, 5, 2);
        this.Tentacle4.setRotationPoint(6.0F, 17.0F, 5.0F);
        this.Tentacle4.setTextureSize(64, 32);
        this.Tentacle4.mirror = true;
        this.setRotation(this.Tentacle4, 0.0F, 0.0F, 0.0F);
        this.Tentacle5 = new ModelRenderer(this, 40, 6);
        this.Tentacle5.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tentacle5.setTextureSize(64, 32);
        this.Tentacle5.mirror = true;
        this.setRotation(this.Tentacle5, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle6 = new ModelRenderer(this, 40, 6);
        this.Tentacle6.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle6.setRotationPoint(-9.0F, 11.0F, 0.0F);
        this.Tentacle6.setTextureSize(64, 32);
        this.Tentacle6.mirror = true;
        this.setRotation(this.Tentacle6, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle7 = new ModelRenderer(this, 40, 6);
        this.Tentacle7.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle7.setRotationPoint(9.0F, 11.0F, 0.0F);
        this.Tentacle7.setTextureSize(64, 32);
        this.Tentacle7.mirror = true;
        this.setRotation(this.Tentacle7, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle8 = new ModelRenderer(this, 40, 0);
        this.Tentacle8.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle8.setRotationPoint(-5.0F, 2.0F, 5.0F);
        this.Tentacle8.setTextureSize(64, 32);
        this.Tentacle8.mirror = true;
        this.setRotation(this.Tentacle8, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle9 = new ModelRenderer(this, 40, 6);
        this.Tentacle9.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle9.setRotationPoint(9.0F, 2.0F, 5.0F);
        this.Tentacle9.setTextureSize(64, 32);
        this.Tentacle9.mirror = true;
        this.setRotation(this.Tentacle9, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle10 = new ModelRenderer(this, 40, 6);
        this.Tentacle10.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle10.setRotationPoint(9.0F, 20.0F, 5.0F);
        this.Tentacle10.setTextureSize(64, 32);
        this.Tentacle10.mirror = true;
        this.setRotation(this.Tentacle10, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle11 = new ModelRenderer(this, 40, 6);
        this.Tentacle11.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle11.setRotationPoint(-9.0F, 20.0F, 5.0F);
        this.Tentacle11.setTextureSize(64, 32);
        this.Tentacle11.mirror = true;
        this.setRotation(this.Tentacle11, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle12 = new ModelRenderer(this, 40, 6);
        this.Tentacle12.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle12.setRotationPoint(-9.0F, 2.0F, 5.0F);
        this.Tentacle12.setTextureSize(64, 32);
        this.Tentacle12.mirror = true;
        this.setRotation(this.Tentacle12, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle13 = new ModelRenderer(this, 40, 0);
        this.Tentacle13.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle13.setRotationPoint(-5.0F, 11.0F, 0.0F);
        this.Tentacle13.setTextureSize(64, 32);
        this.Tentacle13.mirror = true;
        this.setRotation(this.Tentacle13, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle14 = new ModelRenderer(this, 40, 0);
        this.Tentacle14.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle14.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.Tentacle14.setTextureSize(64, 32);
        this.Tentacle14.mirror = true;
        this.setRotation(this.Tentacle14, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle15 = new ModelRenderer(this, 40, 0);
        this.Tentacle15.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle15.setRotationPoint(-5.0F, 20.0F, 5.0F);
        this.Tentacle15.setTextureSize(64, 32);
        this.Tentacle15.mirror = true;
        this.setRotation(this.Tentacle15, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle16 = new ModelRenderer(this, 40, 0);
        this.Tentacle16.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle16.setRotationPoint(5.0F, 20.0F, 5.0F);
        this.Tentacle16.setTextureSize(64, 32);
        this.Tentacle16.mirror = true;
        this.setRotation(this.Tentacle16, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle17 = new ModelRenderer(this, 52, 0);
        this.Tentacle17.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle17.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Tentacle17.setTextureSize(64, 32);
        this.Tentacle17.mirror = true;
        this.setRotation(this.Tentacle17, 0.0F, 0.0F, 0.0F);
        this.Tentacle18 = new ModelRenderer(this, 11, 0);
        this.Tentacle18.addBox(-1.0F, -3.0F, -1.0F, 2, 5, 2);
        this.Tentacle18.setRotationPoint(-6.0F, 17.0F, 5.0F);
        this.Tentacle18.setTextureSize(64, 32);
        this.Tentacle18.mirror = true;
        this.setRotation(this.Tentacle18, 0.0F, 0.0F, 0.0F);
        this.Tentacle19 = new ModelRenderer(this, 11, 0);
        this.Tentacle19.addBox(-1.0F, -3.0F, -1.0F, 2, 5, 2);
        this.Tentacle19.setRotationPoint(6.0F, 6.0F, 5.0F);
        this.Tentacle19.setTextureSize(64, 32);
        this.Tentacle19.mirror = true;
        this.setRotation(this.Tentacle19, 0.0F, 0.0F, 0.0F);
        this.Tentacle20 = new ModelRenderer(this, 11, 0);
        this.Tentacle20.addBox(-1.0F, -3.0F, -1.0F, 2, 5, 2);
        this.Tentacle20.setRotationPoint(-6.0F, 6.0F, 5.0F);
        this.Tentacle20.setTextureSize(64, 32);
        this.Tentacle20.mirror = true;
        this.setRotation(this.Tentacle20, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.Head.render(var7);
        this.Tentacle1.render(var7);
        this.Tentacle2.render(var7);
        this.Tentacle3.render(var7);
        this.Tentacle4.render(var7);
        this.Tentacle5.render(var7);
        this.Tentacle6.render(var7);
        this.Tentacle7.render(var7);
        this.Tentacle8.render(var7);
        this.Tentacle9.render(var7);
        this.Tentacle10.render(var7);
        this.Tentacle11.render(var7);
        this.Tentacle12.render(var7);
        this.Tentacle13.render(var7);
        this.Tentacle14.render(var7);
        this.Tentacle15.render(var7);
        this.Tentacle16.render(var7);
        this.Tentacle17.render(var7);
        this.Tentacle18.render(var7);
        this.Tentacle19.render(var7);
        this.Tentacle20.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
