package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityParatiku;

public class ModelParatiku extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer WingRT;
    ModelRenderer WingRB;
    ModelRenderer WingLB;
    ModelRenderer WingLT;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;

    public ModelParatiku()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 7);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(0.0F, 6.0F, -8.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 19, 0);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 22, 10);
        this.body.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.8644027F, 0.0F, 0.0F);
        this.WingRT = new ModelRenderer(this, 0, 0);
        this.WingRT.addBox(-14.0F, 0.0F, -5.0F, 14, 1, 10);
        this.WingRT.setRotationPoint(-6.0F, 7.0F, 0.0F);
        this.WingRT.setTextureSize(64, 32);
        this.WingRT.mirror = true;
        this.setRotation(this.WingRT, -0.7330383F, 0.0F, 0.0F);
        this.WingRB = new ModelRenderer(this, 0, 0);
        this.WingRB.addBox(-14.0F, 0.0F, -5.0F, 14, 1, 10);
        this.WingRB.setRotationPoint(-6.0F, 14.0F, 0.0F);
        this.WingRB.setTextureSize(64, 32);
        this.WingRB.mirror = true;
        this.setRotation(this.WingRB, -0.7330383F, 0.0F, 0.0F);
        this.WingLB = new ModelRenderer(this, 0, 0);
        this.WingLB.addBox(0.0F, 0.0F, -5.0F, 14, 1, 10);
        this.WingLB.setRotationPoint(6.0F, 14.0F, 0.0F);
        this.WingLB.setTextureSize(64, 32);
        this.WingLB.mirror = true;
        this.setRotation(this.WingLB, -0.7330383F, 0.0F, 0.0F);
        this.WingLT = new ModelRenderer(this, 0, 0);
        this.WingLT.addBox(0.0F, 0.0F, -5.0F, 14, 1, 10);
        this.WingLT.setRotationPoint(6.0F, 7.0F, 0.0F);
        this.WingLT.setTextureSize(64, 32);
        this.WingLT.mirror = true;
        this.setRotation(this.WingLT, -0.7330383F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 13, 21);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1);
        this.Shape1.setRotationPoint(-1.0F, 4.0F, 10.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, -0.2602503F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 13, 21);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1);
        this.Shape2.setRotationPoint(-1.0F, -4.0F, 0.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, -0.2602503F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 13, 21);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1);
        this.Shape3.setRotationPoint(-1.0F, -1.0F, 5.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, -0.2602503F, 0.0F, 0.0F);
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
        this.WingRT.render(var7);
        this.WingRB.render(var7);
        this.WingLB.render(var7);
        this.WingLT.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
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
        EntityParatiku var8 = (EntityParatiku)var7;
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleZ = 0.0F;
        this.body.rotateAngleX = ((float)Math.PI / 4F) + MathHelper.cos(var3 * 0.1F) * 0.15F;
        this.body.rotateAngleY = 0.0F;
        this.WingRT.rotateAngleY = MathHelper.cos(var3 * 1.3F) * (float)Math.PI * 0.25F;
        this.WingLT.rotateAngleY = -this.WingRT.rotateAngleY;
        this.WingRB.rotateAngleY = MathHelper.cos(var3 * 1.3F) * (float)Math.PI * 0.25F;
        this.WingLB.rotateAngleY = -this.WingRB.rotateAngleY;
        this.head.render(var6);
        this.body.render(var6);
    }
}
