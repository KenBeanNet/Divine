package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMadivel extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer neckbone;
    ModelRenderer neck;
    ModelRenderer headbone;
    ModelRenderer rightarmbones;
    ModelRenderer leftarmbones;

    public ModelMadivel()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 35, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 6, 9, 7);
        this.head.setRotationPoint(1.0F, -13.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, -5.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, -5.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 9);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 19, 4);
        this.rightleg.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 9);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 19, 4);
        this.leftleg.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.neckbone = new ModelRenderer(this, 2, 1);
        this.neckbone.addBox(-6.0F, 1.0F, -1.0F, 10, 2, 2);
        this.neckbone.setRotationPoint(1.0F, -13.0F, 0.0F);
        this.neckbone.setTextureSize(64, 32);
        this.neckbone.mirror = true;
        this.setRotation(this.neckbone, 0.0F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 36, 20);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4);
        this.neck.setRotationPoint(-2.0F, -12.0F, -2.0F);
        this.neck.setTextureSize(64, 32);
        this.neck.mirror = true;
        this.setRotation(this.neck, 0.0F, 0.0F, 0.0F);
        this.headbone = new ModelRenderer(this, 2, 1);
        this.headbone.addBox(-6.0F, -2.0F, 0.0F, 10, 2, 2);
        this.headbone.setRotationPoint(1.0F, -18.0F, -1.0F);
        this.headbone.setTextureSize(64, 32);
        this.headbone.mirror = true;
        this.setRotation(this.headbone, 0.0F, 0.0F, 0.0F);
        this.rightarmbones = new ModelRenderer(this, 40, 24);
        this.rightarmbones.addBox(-8.0F, -2.0F, -1.0F, 6, 3, 2);
        this.rightarmbones.setRotationPoint(-5.0F, -1.0F, 0.0F);
        this.rightarmbones.setTextureSize(64, 32);
        this.rightarmbones.mirror = true;
        this.setRotation(this.rightarmbones, 0.0F, 0.0F, 0.0F);
        this.leftarmbones = new ModelRenderer(this, 40, 24);
        this.leftarmbones.addBox(2.0F, 2.0F, -1.0F, 6, 3, 2);
        this.leftarmbones.setRotationPoint(5.0F, -5.0F, 0.0F);
        this.leftarmbones.setTextureSize(64, 32);
        this.leftarmbones.mirror = true;
        this.setRotation(this.leftarmbones, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.neckbone.render(var7);
        this.neck.render(var7);
        this.headbone.render(var7);
        this.rightarmbones.render(var7);
        this.leftarmbones.render(var7);
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
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
    }
}
