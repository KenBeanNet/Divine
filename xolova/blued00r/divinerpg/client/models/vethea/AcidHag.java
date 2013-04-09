package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class AcidHag extends ModelBase
{
    ModelRenderer body;
    ModelRenderer leftarmtop;
    ModelRenderer rightarmtop;
    ModelRenderer leftarmbottom;
    ModelRenderer rightarmbottom;
    ModelRenderer leftarms1;
    ModelRenderer rightarms1;
    ModelRenderer leftarms2;
    ModelRenderer rightarms2;
    ModelRenderer leftarms3;
    ModelRenderer rightarms3;
    ModelRenderer leftlegs1;
    ModelRenderer rightlegs1;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;
    ModelRenderer rightlegs2;
    ModelRenderer leftlegs2;
    ModelRenderer leftlegs3;
    ModelRenderer rightlegs3;
    ModelRenderer horn1;
    ModelRenderer head;
    ModelRenderer horn2;

    public AcidHag()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.leftarmtop = new ModelRenderer(this, 40, 16);
        this.leftarmtop.addBox(-1.0F, -2.0F, -2.0F, 4, 8, 4);
        this.leftarmtop.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarmtop.setTextureSize(64, 32);
        this.leftarmtop.mirror = true;
        this.setRotation(this.leftarmtop, 0.0F, 0.0F, 0.0F);
        this.rightarmtop = new ModelRenderer(this, 40, 16);
        this.rightarmtop.addBox(-3.0F, -2.0F, -2.0F, 4, 8, 4);
        this.rightarmtop.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarmtop.setTextureSize(64, 32);
        this.rightarmtop.mirror = true;
        this.setRotation(this.rightarmtop, 0.0F, 0.0F, 0.0F);
        this.leftarmbottom = new ModelRenderer(this, 40, 25);
        this.leftarmbottom.addBox(-1.0F, 18.0F, -5.0F, 4, 3, 4);
        this.leftarmbottom.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarmbottom.setTextureSize(64, 32);
        this.leftarmbottom.mirror = true;
        this.setRotation(this.leftarmbottom, 0.3490659F, 0.0F, 0.0F);
        this.rightarmbottom = new ModelRenderer(this, 40, 25);
        this.rightarmbottom.addBox(-3.0F, 18.0F, -5.0F, 4, 3, 4);
        this.rightarmbottom.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarmbottom.setTextureSize(64, 32);
        this.rightarmbottom.mirror = true;
        this.setRotation(this.rightarmbottom, 0.3490659F, 0.0F, 0.0F);
        this.leftarms1 = new ModelRenderer(this, 40, 20);
        this.leftarms1.addBox(-1.0F, 6.0F, -2.0F, 4, 4, 4);
        this.leftarms1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarms1.setTextureSize(64, 32);
        this.leftarms1.mirror = true;
        this.setRotation(this.leftarms1, 0.0872665F, 0.0F, 0.0F);
        this.rightarms1 = new ModelRenderer(this, 40, 20);
        this.rightarms1.addBox(-3.0F, 6.0F, -2.0F, 4, 4, 4);
        this.rightarms1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarms1.setTextureSize(64, 32);
        this.rightarms1.mirror = true;
        this.setRotation(this.rightarms1, 0.0872665F, 0.0F, 0.0F);
        this.leftarms2 = new ModelRenderer(this, 40, 20);
        this.leftarms2.addBox(-1.0F, 10.0F, -3.0F, 4, 4, 4);
        this.leftarms2.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarms2.setTextureSize(64, 32);
        this.leftarms2.mirror = true;
        this.setRotation(this.leftarms2, 0.1745329F, 0.0F, 0.0F);
        this.rightarms2 = new ModelRenderer(this, 40, 20);
        this.rightarms2.addBox(-3.0F, 10.0F, -3.0F, 4, 4, 4);
        this.rightarms2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarms2.setTextureSize(64, 32);
        this.rightarms2.mirror = true;
        this.setRotation(this.rightarms2, 0.1745329F, 0.0F, 0.0F);
        this.leftarms3 = new ModelRenderer(this, 40, 20);
        this.leftarms3.addBox(-1.0F, 14.0F, -4.0F, 4, 4, 4);
        this.leftarms3.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarms3.setTextureSize(64, 32);
        this.leftarms3.mirror = true;
        this.setRotation(this.leftarms3, 0.2617994F, 0.0F, 0.0F);
        this.rightarms3 = new ModelRenderer(this, 40, 20);
        this.rightarms3.addBox(-3.0F, 14.0F, -4.0F, 4, 4, 4);
        this.rightarms3.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarms3.setTextureSize(64, 32);
        this.rightarms3.mirror = true;
        this.setRotation(this.rightarms3, 0.2617994F, 0.0F, 0.0F);
        this.leftlegs1 = new ModelRenderer(this, 0, 16);
        this.leftlegs1.addBox(0.0F, 3.0F, -2.0F, 2, 3, 4);
        this.leftlegs1.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftlegs1.setTextureSize(64, 32);
        this.leftlegs1.mirror = true;
        this.setRotation(this.leftlegs1, 0.0F, 0.0F, 0.0F);
        this.rightlegs1 = new ModelRenderer(this, 0, 16);
        this.rightlegs1.addBox(-2.0F, 3.0F, -2.0F, 2, 3, 4);
        this.rightlegs1.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightlegs1.setTextureSize(64, 32);
        this.rightlegs1.mirror = true;
        this.setRotation(this.rightlegs1, 0.0F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 32, 0);
        this.rightfoot.addBox(-2.0F, 6.0F, -6.0F, 3, 3, 7);
        this.rightfoot.setRotationPoint(-2.0F, 15.0F, 0.0F);
        this.rightfoot.setTextureSize(64, 32);
        this.rightfoot.mirror = true;
        this.setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 32, 0);
        this.leftfoot.addBox(-1.0F, 6.0F, -6.0F, 3, 3, 7);
        this.leftfoot.setRotationPoint(2.0F, 15.0F, 0.0F);
        this.leftfoot.setTextureSize(64, 32);
        this.leftfoot.mirror = true;
        this.setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
        this.rightlegs2 = new ModelRenderer(this, 0, 16);
        this.rightlegs2.addBox(-2.0F, 0.0F, -2.0F, 3, 3, 4);
        this.rightlegs2.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightlegs2.setTextureSize(64, 32);
        this.rightlegs2.mirror = true;
        this.setRotation(this.rightlegs2, 0.0F, 0.0F, 0.0F);
        this.leftlegs2 = new ModelRenderer(this, 0, 16);
        this.leftlegs2.addBox(-1.0F, 0.0F, -2.0F, 3, 3, 4);
        this.leftlegs2.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftlegs2.setTextureSize(64, 32);
        this.leftlegs2.mirror = true;
        this.setRotation(this.leftlegs2, 0.0F, 0.0F, 0.0F);
        this.leftlegs3 = new ModelRenderer(this, 0, 16);
        this.leftlegs3.addBox(-1.0F, 6.0F, -2.0F, 3, 3, 4);
        this.leftlegs3.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftlegs3.setTextureSize(64, 32);
        this.leftlegs3.mirror = true;
        this.setRotation(this.leftlegs3, 0.0F, 0.0F, 0.0F);
        this.rightlegs3 = new ModelRenderer(this, 0, 16);
        this.rightlegs3.addBox(-2.0F, 6.0F, -2.0F, 3, 3, 4);
        this.rightlegs3.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightlegs3.setTextureSize(64, 32);
        this.rightlegs3.mirror = true;
        this.setRotation(this.rightlegs3, 0.0F, 0.0F, 0.0F);
        this.horn1 = new ModelRenderer(this, 32, 0);
        this.horn1.addBox(1.0F, -7.0F, -12.0F, 2, 2, 8);
        this.horn1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.horn1.setTextureSize(64, 32);
        this.horn1.mirror = true;
        this.setRotation(this.horn1, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.horn2 = new ModelRenderer(this, 32, 0);
        this.horn2.addBox(-3.0F, -7.0F, -12.0F, 2, 2, 8);
        this.horn2.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.horn2.setTextureSize(64, 32);
        this.horn2.mirror = true;
        this.setRotation(this.horn2, -((float)Math.PI / 4F), 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.body.render(var7);
        this.leftarmtop.render(var7);
        this.rightarmtop.render(var7);
        this.leftarmbottom.render(var7);
        this.rightarmbottom.render(var7);
        this.leftarms1.render(var7);
        this.rightarms1.render(var7);
        this.leftarms2.render(var7);
        this.rightarms2.render(var7);
        this.leftarms3.render(var7);
        this.rightarms3.render(var7);
        this.leftlegs1.render(var7);
        this.rightlegs1.render(var7);
        this.rightfoot.render(var7);
        this.leftfoot.render(var7);
        this.rightlegs2.render(var7);
        this.leftlegs2.render(var7);
        this.leftlegs3.render(var7);
        this.rightlegs3.render(var7);
        this.horn1.render(var7);
        this.head.render(var7);
        this.horn2.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftlegs1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftlegs2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftlegs3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegs1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightlegs2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightlegs3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarms1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + 0.0872665F;
        this.rightarms2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + 0.1745329F;
        this.rightarms3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + 0.2617994F;
        this.rightarmtop.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmbottom.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F + 0.3490659F;
        this.leftarms1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 0.0872665F;
        this.leftarms2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 0.1745329F;
        this.leftarms3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 0.2617994F;
        this.leftarmtop.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmbottom.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 0.3490659F;
    }
}
