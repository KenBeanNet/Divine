package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAridWarrior extends ModelBase
{
    ModelRenderer ear1;
    ModelRenderer leftarmBS1;
    ModelRenderer rightleg;
    ModelRenderer body;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer leftarmBS2;
    ModelRenderer leftarmTS1;
    ModelRenderer leftarmTS2;
    ModelRenderer rightarmTS2;
    ModelRenderer rightarmBS1;
    public ModelRenderer rightarmBS2;
    ModelRenderer rightarmTS1;
    ModelRenderer head;
    ModelRenderer ear2;
    ModelRenderer leftleg;
    ModelRenderer rightfoot;
    ModelRenderer rightlegpart;
    ModelRenderer rightlegpart2;
    ModelRenderer leftfoot;
    ModelRenderer leftlegpart2;
    ModelRenderer leftlegpart1;

    public ModelAridWarrior()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.ear1 = new ModelRenderer(this, 34, 0);
        this.ear1.addBox(-6.0F, -8.0F, -4.0F, 2, 3, 8);
        this.ear1.setRotationPoint(10.0F, -12.0F, -5.0F);
        this.ear1.setTextureSize(64, 32);
        this.ear1.mirror = true;
        this.setRotation(this.ear1, -0.8179294F, 0.0F, 0.0F);
        this.leftarmBS1 = new ModelRenderer(this, 28, 16);
        this.leftarmBS1.addBox(-1.0F, -1.0F, -2.0F, 7, 3, 4);
        this.leftarmBS1.setRotationPoint(8.0F, 4.0F, 0.0F);
        this.leftarmBS1.setTextureSize(64, 32);
        this.leftarmBS1.mirror = true;
        this.setRotation(this.leftarmBS1, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-5.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 6.0F, -2.0F, 14, 6, 4);
        this.body.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 16, 16);
        this.body2.addBox(-4.0F, 6.0F, -2.0F, 14, 6, 4);
        this.body2.setRotationPoint(-3.0F, -14.0F, 0.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 16, 16);
        this.body3.addBox(-4.0F, 6.0F, -2.0F, 3, 8, 4);
        this.body3.setRotationPoint(8.0F, -8.0F, 0.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 16, 16);
        this.body4.addBox(-4.0F, 6.0F, -2.0F, 3, 8, 4);
        this.body4.setRotationPoint(-3.0F, -8.0F, 0.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.leftarmBS2 = new ModelRenderer(this, 40, 16);
        this.leftarmBS2.addBox(2.0F, 1.0F, -2.0F, 4, 6, 4);
        this.leftarmBS2.setRotationPoint(8.0F, 5.0F, 0.0F);
        this.leftarmBS2.setTextureSize(64, 32);
        this.leftarmBS2.mirror = true;
        this.setRotation(this.leftarmBS2, 0.0F, 0.0F, 0.0F);
        this.leftarmTS1 = new ModelRenderer(this, 28, 16);
        this.leftarmTS1.addBox(-1.0F, -1.0F, -2.0F, 7, 3, 4);
        this.leftarmTS1.setRotationPoint(8.0F, -7.0F, 0.0F);
        this.leftarmTS1.setTextureSize(64, 32);
        this.leftarmTS1.mirror = true;
        this.setRotation(this.leftarmTS1, 0.0F, 0.0F, 0.0F);
        this.leftarmTS2 = new ModelRenderer(this, 40, 16);
        this.leftarmTS2.addBox(2.0F, 1.0F, -2.0F, 4, 6, 4);
        this.leftarmTS2.setRotationPoint(8.0F, -6.0F, 0.0F);
        this.leftarmTS2.setTextureSize(64, 32);
        this.leftarmTS2.mirror = true;
        this.setRotation(this.leftarmTS2, 0.0F, 0.0F, 0.0F);
        this.rightarmTS2 = new ModelRenderer(this, 40, 16);
        this.rightarmTS2.addBox(-6.0F, 1.0F, -2.0F, 4, 6, 4);
        this.rightarmTS2.setRotationPoint(-8.0F, -6.0F, 0.0F);
        this.rightarmTS2.setTextureSize(64, 32);
        this.rightarmTS2.mirror = true;
        this.setRotation(this.rightarmTS2, 0.0F, 0.0F, 0.0F);
        this.rightarmBS1 = new ModelRenderer(this, 28, 16);
        this.rightarmBS1.addBox(-6.0F, -1.0F, -2.0F, 7, 3, 4);
        this.rightarmBS1.setRotationPoint(-8.0F, 4.0F, 0.0F);
        this.rightarmBS1.setTextureSize(64, 32);
        this.rightarmBS1.mirror = true;
        this.setRotation(this.rightarmBS1, 0.0F, 0.0F, 0.0F);
        this.rightarmBS2 = new ModelRenderer(this, 40, 16);
        this.rightarmBS2.addBox(-6.0F, 1.0F, -2.0F, 4, 6, 4);
        this.rightarmBS2.setRotationPoint(-8.0F, 5.0F, 0.0F);
        this.rightarmBS2.setTextureSize(64, 32);
        this.rightarmBS2.mirror = true;
        this.setRotation(this.rightarmBS2, 0.0F, 0.0F, 0.0F);
        this.rightarmTS1 = new ModelRenderer(this, 28, 16);
        this.rightarmTS1.addBox(-6.0F, -1.0F, -2.0F, 7, 3, 4);
        this.rightarmTS1.setRotationPoint(-8.0F, -7.0F, 0.0F);
        this.rightarmTS1.setTextureSize(64, 32);
        this.rightarmTS1.mirror = true;
        this.setRotation(this.rightarmTS1, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.ear2 = new ModelRenderer(this, 34, 0);
        this.ear2.addBox(-6.0F, -8.0F, -4.0F, 2, 3, 8);
        this.ear2.setRotationPoint(0.0F, -12.0F, -5.0F);
        this.ear2.setTextureSize(64, 32);
        this.ear2.mirror = true;
        this.setRotation(this.ear2, -0.8179294F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(5.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 0, 16);
        this.rightfoot.addBox(-4.0F, 9.0F, -4.0F, 8, 3, 8);
        this.rightfoot.setRotationPoint(-5.0F, 12.0F, 0.0F);
        this.rightfoot.setTextureSize(64, 32);
        this.rightfoot.mirror = true;
        this.setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
        this.rightlegpart = new ModelRenderer(this, 0, 16);
        this.rightlegpart.addBox(-3.0F, 1.0F, -3.0F, 6, 3, 6);
        this.rightlegpart.setRotationPoint(-5.0F, 12.0F, 0.0F);
        this.rightlegpart.setTextureSize(64, 32);
        this.rightlegpart.mirror = true;
        this.setRotation(this.rightlegpart, 0.0F, 0.0F, 0.0F);
        this.rightlegpart2 = new ModelRenderer(this, 0, 16);
        this.rightlegpart2.addBox(-3.0F, 5.0F, -3.0F, 6, 3, 6);
        this.rightlegpart2.setRotationPoint(-5.0F, 12.0F, 0.0F);
        this.rightlegpart2.setTextureSize(64, 32);
        this.rightlegpart2.mirror = true;
        this.setRotation(this.rightlegpart2, 0.0F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 0, 16);
        this.leftfoot.addBox(-4.0F, 9.0F, -4.0F, 8, 3, 8);
        this.leftfoot.setRotationPoint(5.0F, 12.0F, 0.0F);
        this.leftfoot.setTextureSize(64, 32);
        this.leftfoot.mirror = true;
        this.setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
        this.leftlegpart2 = new ModelRenderer(this, 0, 16);
        this.leftlegpart2.addBox(-3.0F, 5.0F, -3.0F, 6, 3, 6);
        this.leftlegpart2.setRotationPoint(5.0F, 12.0F, 0.0F);
        this.leftlegpart2.setTextureSize(64, 32);
        this.leftlegpart2.mirror = true;
        this.setRotation(this.leftlegpart2, 0.0F, 0.0F, 0.0F);
        this.leftlegpart1 = new ModelRenderer(this, 0, 16);
        this.leftlegpart1.addBox(-3.0F, 1.0F, -3.0F, 6, 3, 6);
        this.leftlegpart1.setRotationPoint(5.0F, 12.0F, 0.0F);
        this.leftlegpart1.setTextureSize(64, 32);
        this.leftlegpart1.mirror = true;
        this.setRotation(this.leftlegpart1, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.ear1.render(var7);
        this.leftarmBS1.render(var7);
        this.rightleg.render(var7);
        this.body.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.leftarmBS2.render(var7);
        this.leftarmTS1.render(var7);
        this.leftarmTS2.render(var7);
        this.rightarmTS2.render(var7);
        this.rightarmBS1.render(var7);
        this.rightarmBS2.render(var7);
        this.rightarmTS1.render(var7);
        this.head.render(var7);
        this.ear2.render(var7);
        this.leftleg.render(var7);
        this.rightfoot.render(var7);
        this.rightlegpart.render(var7);
        this.rightlegpart2.render(var7);
        this.leftfoot.render(var7);
        this.leftlegpart2.render(var7);
        this.leftlegpart1.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.ear1.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.ear1.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.ear2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.ear2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightarmBS1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmBS2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmTS1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmTS2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarmBS1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmBS2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmTS1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmTS2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarmBS1.rotateAngleZ = 0.0F;
        this.rightarmBS2.rotateAngleZ = 0.0F;
        this.rightarmTS1.rotateAngleZ = 0.0F;
        this.rightarmTS2.rotateAngleZ = 0.0F;
        this.leftarmBS1.rotateAngleZ = 0.0F;
        this.leftarmBS2.rotateAngleZ = 0.0F;
        this.leftarmTS1.rotateAngleZ = 0.0F;
        this.leftarmTS2.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegpart.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegpart2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftlegpart1.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftlegpart2.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.rightlegpart.rotateAngleY = 0.0F;
        this.rightlegpart2.rotateAngleY = 0.0F;
        this.rightfoot.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.leftlegpart1.rotateAngleY = 0.0F;
        this.leftlegpart2.rotateAngleY = 0.0F;
        this.leftfoot.rotateAngleY = 0.0F;
        this.rightarmBS1.rotateAngleY = 0.0F;
        this.rightarmBS2.rotateAngleY = 0.0F;
        this.rightarmTS1.rotateAngleY = 0.0F;
        this.rightarmTS2.rotateAngleY = 0.0F;
        this.leftarmBS1.rotateAngleY = 0.0F;
        this.leftarmBS2.rotateAngleY = 0.0F;
        this.leftarmTS2.rotateAngleY = 0.0F;
        this.leftarmTS1.rotateAngleY = 0.0F;
        this.rightarmBS1.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmBS2.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmBS1.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmBS2.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmBS1.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmBS2.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmTS1.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmTS2.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmBS1.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmBS2.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmTS1.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmTS2.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmBS1.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmBS2.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmTS1.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmTS2.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }
}
