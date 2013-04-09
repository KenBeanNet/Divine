package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelWatcherStatue extends ModelBase
{
    ModelRenderer Head;
    ModelRenderer Jaw;
    ModelRenderer Tentacle11;
    ModelRenderer Tentacle12;
    ModelRenderer Tentacle21;
    ModelRenderer Tentacle22;
    ModelRenderer Support;
    ModelRenderer Tentacle32;
    ModelRenderer Tentacle31;

    public ModelWatcherStatue()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.addBox(-5.0F, -5.0F, -5.0F, 10, 10, 10);
        this.Head.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Head.setTextureSize(64, 32);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.Jaw = new ModelRenderer(this, 0, 20);
        this.Jaw.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 10);
        this.Jaw.setRotationPoint(0.0F, 18.0F, 5.0F);
        this.Jaw.setTextureSize(64, 32);
        this.Jaw.mirror = true;
        this.setRotation(this.Jaw, 0.1745329F, 0.0F, 0.0F);
        this.Tentacle11 = new ModelRenderer(this, 40, 0);
        this.Tentacle11.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle11.setRotationPoint(5.0F, 13.0F, 0.0F);
        this.Tentacle11.setTextureSize(64, 32);
        this.Tentacle11.mirror = true;
        this.setRotation(this.Tentacle11, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Tentacle12 = new ModelRenderer(this, 40, 6);
        this.Tentacle12.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle12.setRotationPoint(9.0F, 13.0F, 0.0F);
        this.Tentacle12.setTextureSize(64, 32);
        this.Tentacle12.mirror = true;
        this.setRotation(this.Tentacle12, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle21 = new ModelRenderer(this, 40, 0);
        this.Tentacle21.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3);
        this.Tentacle21.setRotationPoint(-5.0F, 13.0F, 0.0F);
        this.Tentacle21.setTextureSize(64, 32);
        this.Tentacle21.mirror = true;
        this.setRotation(this.Tentacle21, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle22 = new ModelRenderer(this, 40, 6);
        this.Tentacle22.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle22.setRotationPoint(-9.0F, 13.0F, 0.0F);
        this.Tentacle22.setTextureSize(64, 32);
        this.Tentacle22.mirror = true;
        this.setRotation(this.Tentacle22, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Support = new ModelRenderer(this, 52, 0);
        this.Support.addBox(-1.0F, -3.0F, -1.0F, 2, 4, 2);
        this.Support.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.Support.setTextureSize(64, 32);
        this.Support.mirror = true;
        this.setRotation(this.Support, 0.0F, 0.0F, 0.0F);
        this.Tentacle32 = new ModelRenderer(this, 40, 6);
        this.Tentacle32.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        this.Tentacle32.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Tentacle32.setTextureSize(64, 32);
        this.Tentacle32.mirror = true;
        this.setRotation(this.Tentacle32, 0.0F, ((float)Math.PI * 3F / 2F), 0.0F);
        this.Tentacle31 = new ModelRenderer(this, 52, 0);
        this.Tentacle31.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2);
        this.Tentacle31.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Tentacle31.setTextureSize(64, 32);
        this.Tentacle31.mirror = true;
        this.setRotation(this.Tentacle31, 0.0F, 0.0F, 0.0F);
    }

    public void render(float var1)
    {
        this.Head.render(var1);
        this.Jaw.render(var1);
        this.Tentacle11.render(var1);
        this.Tentacle12.render(var1);
        this.Tentacle21.render(var1);
        this.Tentacle22.render(var1);
        this.Support.render(var1);
        this.Tentacle32.render(var1);
        this.Tentacle31.render(var1);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
