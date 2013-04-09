package xolova.blued00r.divinerpg.client.models.entities.mobs.iceika;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFractite extends ModelBase
{
    ModelRenderer frostBody;
    ModelRenderer shard1;
    ModelRenderer shard2;
    ModelRenderer shard7;
    ModelRenderer shard8;
    ModelRenderer shard4;
    ModelRenderer shard3;
    ModelRenderer shard5;
    ModelRenderer shard6;

    public ModelFractite()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.frostBody = new ModelRenderer(this, 0, 11);
        this.frostBody.addBox(0.0F, 0.0F, 0.0F, 8, 8, 6);
        this.frostBody.setRotationPoint(-4.0F, 5.0F, -4.0F);
        this.frostBody.setTextureSize(64, 32);
        this.frostBody.mirror = true;
        this.setRotation(this.frostBody, 0.0F, 0.0F, 0.0F);
        this.shard1 = new ModelRenderer(this, 0, 0);
        this.shard1.addBox(8.0F, 0.0F, 0.0F, 9, 1, 2);
        this.shard1.setRotationPoint(1.0F, 8.0F, -2.0F);
        this.shard1.setTextureSize(64, 32);
        this.shard1.mirror = true;
        this.setRotation(this.shard1, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.shard2 = new ModelRenderer(this, 0, 0);
        this.shard2.addBox(-19.0F, 0.0F, 0.0F, 9, 1, 2);
        this.shard2.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.shard2.setTextureSize(64, 32);
        this.shard2.mirror = true;
        this.setRotation(this.shard2, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.shard7 = new ModelRenderer(this, 0, 0);
        this.shard7.addBox(10.0F, 0.0F, 0.0F, 10, 1, 2);
        this.shard7.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.shard7.setTextureSize(64, 32);
        this.shard7.mirror = true;
        this.setRotation(this.shard7, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.shard8 = new ModelRenderer(this, 0, 0);
        this.shard8.addBox(-19.0F, 0.0F, 0.0F, 10, 1, 2);
        this.shard8.setRotationPoint(-1.0F, 9.0F, -2.0F);
        this.shard8.setTextureSize(64, 32);
        this.shard8.mirror = true;
        this.setRotation(this.shard8, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.shard4 = new ModelRenderer(this, 0, 0);
        this.shard4.addBox(-6.0F, -8.0F, 0.0F, 15, 1, 2);
        this.shard4.setRotationPoint(0.0F, 8.0F, -2.0F);
        this.shard4.setTextureSize(64, 32);
        this.shard4.mirror = true;
        this.setRotation(this.shard4, 0.0F, 0.0F, ((float)Math.PI / 2F));
        this.shard3 = new ModelRenderer(this, 0, 0);
        this.shard3.addBox(-7.0F, 7.0F, 0.0F, 15, 1, 2);
        this.shard3.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.shard3.setTextureSize(64, 32);
        this.shard3.mirror = true;
        this.setRotation(this.shard3, 0.0F, 0.0F, ((float)Math.PI / 2F));
        this.shard5 = new ModelRenderer(this, 0, 0);
        this.shard5.addBox(-8.0F, -7.0F, 0.0F, 14, 1, 2);
        this.shard5.setRotationPoint(1.0F, 9.0F, -2.0F);
        this.shard5.setTextureSize(64, 32);
        this.shard5.mirror = true;
        this.setRotation(this.shard5, 0.0F, 0.0F, 0.0F);
        this.shard6 = new ModelRenderer(this, 0, 0);
        this.shard6.addBox(-7.0F, 7.0F, 0.0F, 14, 1, 2);
        this.shard6.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.shard6.setTextureSize(64, 32);
        this.shard6.mirror = true;
        this.setRotation(this.shard6, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.frostBody.render(var7);
        this.shard1.render(var7);
        this.shard2.render(var7);
        this.shard7.render(var7);
        this.shard8.render(var7);
        this.shard4.render(var7);
        this.shard3.render(var7);
        this.shard5.render(var7);
        this.shard6.render(var7);
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
        this.shard1.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard2.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard3.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard4.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard5.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard6.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard7.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
        this.shard8.rotateAngleX = MathHelper.cos(var3 * 0.1F) * (float)Math.PI;
    }
}
