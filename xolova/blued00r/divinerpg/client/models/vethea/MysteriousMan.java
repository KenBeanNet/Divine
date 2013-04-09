package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class MysteriousMan extends ModelBase
{
    ModelRenderer head;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer body;
    ModelRenderer neck;
    ModelRenderer facemask1;
    ModelRenderer facemask2;
    ModelRenderer facemask3;
    ModelRenderer facemask4;

    public MysteriousMan()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 20, 18);
        this.neck.addBox(-4.0F, 0.0F, -2.0F, 4, 2, 4);
        this.neck.setRotationPoint(2.0F, -2.0F, 0.0F);
        this.neck.setTextureSize(64, 32);
        this.neck.mirror = true;
        this.setRotation(this.neck, 0.0F, 0.0F, 0.0F);
        this.facemask1 = new ModelRenderer(this, 37, 3);
        this.facemask1.addBox(-4.0F, 0.0F, -2.0F, 8, 2, 0);
        this.facemask1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.facemask1.setTextureSize(64, 32);
        this.facemask1.mirror = true;
        this.setRotation(this.facemask1, 0.0F, 0.0F, 0.0F);
        this.facemask2 = new ModelRenderer(this, 37, 3);
        this.facemask2.addBox(-4.0F, 0.0F, -2.0F, 8, 2, 0);
        this.facemask2.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.facemask2.setTextureSize(64, 32);
        this.facemask2.mirror = true;
        this.setRotation(this.facemask2, 0.0F, 0.0F, 0.0F);
        this.facemask3 = new ModelRenderer(this, 37, 3);
        this.facemask3.addBox(4.0F, 0.0F, -2.0F, 0, 2, 8);
        this.facemask3.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.facemask3.setTextureSize(64, 32);
        this.facemask3.mirror = true;
        this.setRotation(this.facemask3, 0.0F, 0.0F, 0.0F);
        this.facemask4 = new ModelRenderer(this, 37, 3);
        this.facemask4.addBox(-4.0F, 0.0F, -2.0F, 0, 2, 8);
        this.facemask4.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.facemask4.setTextureSize(64, 32);
        this.facemask4.mirror = true;
        this.setRotation(this.facemask4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.rightarm.render(var7);
        this.leftarm.render(var7);
        this.rightleg.render(var7);
        this.leftleg.render(var7);
        this.body.render(var7);
        this.neck.render(var7);
        this.facemask1.render(var7);
        this.facemask2.render(var7);
        this.facemask3.render(var7);
        this.facemask4.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
    }
}
