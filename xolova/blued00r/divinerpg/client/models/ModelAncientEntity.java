package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAncientEntity extends ModelBase
{
    ModelRenderer head;
    ModelRenderer legr;
    ModelRenderer legl;
    ModelRenderer legL2B;
    ModelRenderer body2;
    ModelRenderer body;
    ModelRenderer legR2B;
    ModelRenderer legL2T;
    ModelRenderer legR2T;
    ModelRenderer legR2M;
    ModelRenderer legL2M;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer hornbottoml;
    ModelRenderer horntopl;
    ModelRenderer hornbottomr;
    ModelRenderer horntopr;

    public ModelAncientEntity()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(0.0F, -13.0F, -19.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.legr = new ModelRenderer(this, 0, 16);
        this.legr.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.legr.setRotationPoint(-7.0F, 12.0F, 4.0F);
        this.legr.setTextureSize(64, 32);
        this.legr.mirror = true;
        this.setRotation(this.legr, 0.0F, 0.0F, 0.0F);
        this.legl = new ModelRenderer(this, 0, 16);
        this.legl.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
        this.legl.setRotationPoint(7.0F, 12.0F, 4.0F);
        this.legl.setTextureSize(64, 32);
        this.legl.mirror = true;
        this.setRotation(this.legl, 0.0F, 0.0F, 0.0F);
        this.legL2B = new ModelRenderer(this, 0, 19);
        this.legL2B.addBox(-1.0F, 24.0F, -2.0F, 3, 9, 2);
        this.legL2B.setRotationPoint(7.0F, -9.0F, -16.0F);
        this.legL2B.setTextureSize(64, 32);
        this.legL2B.mirror = true;
        this.setRotation(this.legL2B, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 18, 4);
        this.body2.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body2.setRotationPoint(0.0F, -7.6F, -10.7F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 4);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.legR2B = new ModelRenderer(this, 0, 19);
        this.legR2B.addBox(-2.0F, 24.0F, -2.0F, 3, 9, 2);
        this.legR2B.setRotationPoint(-7.0F, -9.0F, -16.0F);
        this.legR2B.setTextureSize(64, 32);
        this.legR2B.mirror = true;
        this.setRotation(this.legR2B, 0.0F, 0.0F, 0.0F);
        this.legL2T = new ModelRenderer(this, 0, 14);
        this.legL2T.addBox(-1.0F, 0.0F, -4.0F, 6, 12, 6);
        this.legL2T.setRotationPoint(7.0F, -9.0F, -16.0F);
        this.legL2T.setTextureSize(64, 32);
        this.legL2T.mirror = true;
        this.setRotation(this.legL2T, 0.0F, 0.0F, 0.0F);
        this.legR2T = new ModelRenderer(this, 0, 14);
        this.legR2T.addBox(-5.0F, 0.0F, -4.0F, 6, 12, 6);
        this.legR2T.setRotationPoint(-7.0F, -9.0F, -16.0F);
        this.legR2T.setTextureSize(64, 32);
        this.legR2T.mirror = true;
        this.setRotation(this.legR2T, 0.0F, 0.0F, 0.0F);
        this.legR2M = new ModelRenderer(this, 0, 16);
        this.legR2M.addBox(-3.0F, 12.0F, -3.0F, 4, 12, 4);
        this.legR2M.setRotationPoint(-7.0F, -9.0F, -16.0F);
        this.legR2M.setTextureSize(64, 32);
        this.legR2M.mirror = true;
        this.setRotation(this.legR2M, 0.0F, 0.0F, 0.0F);
        this.legL2M = new ModelRenderer(this, 0, 16);
        this.legL2M.addBox(-1.0F, 12.0F, -3.0F, 4, 12, 4);
        this.legL2M.setRotationPoint(7.0F, -9.0F, -16.0F);
        this.legL2M.setTextureSize(64, 32);
        this.legL2M.mirror = true;
        this.setRotation(this.legL2M, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 34, 4);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape1.setRotationPoint(-3.0F, 9.0F, 1.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 2.119181F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 34, 4);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape2.setRotationPoint(-3.0F, 6.0F, -1.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 2.119181F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 34, 4);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape3.setRotationPoint(-3.0F, 3.0F, -3.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 2.119181F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 34, 4);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape4.setRotationPoint(-3.0F, 0.0F, -5.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 2.119181F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 34, 4);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape5.setRotationPoint(-3.0F, -3.0F, -7.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 2.119181F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 34, 4);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape6.setRotationPoint(-3.0F, -6.0F, -9.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 2.119181F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 34, 4);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape7.setRotationPoint(-3.0F, -9.0F, -11.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 2.119181F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 34, 4);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape8.setRotationPoint(-3.0F, -15.0F, -15.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 2.119181F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 34, 4);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 6, 11, 1);
        this.Shape9.setRotationPoint(-3.0F, -12.0F, -13.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 2.119181F, 0.0F, 0.0F);
        this.hornbottoml = new ModelRenderer(this, 33, 17);
        this.hornbottoml.addBox(0.0F, 0.0F, -6.0F, 1, 1, 6);
        this.hornbottoml.setRotationPoint(4.0F, -19.0F, -20.0F);
        this.hornbottoml.setTextureSize(64, 32);
        this.hornbottoml.mirror = true;
        this.setRotation(this.hornbottoml, 0.9666439F, 0.0F, 0.0F);
        this.horntopl = new ModelRenderer(this, 33, 17);
        this.horntopl.addBox(0.0F, 0.0F, -12.0F, 1, 1, 12);
        this.horntopl.setRotationPoint(4.0F, -19.0F, -20.0F);
        this.horntopl.setTextureSize(64, 32);
        this.horntopl.mirror = true;
        this.setRotation(this.horntopl, 0.0F, 0.0F, 0.0F);
        this.hornbottomr = new ModelRenderer(this, 33, 17);
        this.hornbottomr.addBox(0.0F, 0.0F, -6.0F, 1, 1, 6);
        this.hornbottomr.setRotationPoint(-5.0F, -19.0F, -20.0F);
        this.hornbottomr.setTextureSize(64, 32);
        this.hornbottomr.mirror = true;
        this.setRotation(this.hornbottomr, 0.9666439F, 0.0F, 0.0F);
        this.horntopr = new ModelRenderer(this, 33, 17);
        this.horntopr.addBox(0.0F, 0.0F, -12.0F, 1, 1, 12);
        this.horntopr.setRotationPoint(-5.0F, -19.0F, -20.0F);
        this.horntopr.setTextureSize(64, 32);
        this.horntopr.mirror = true;
        this.setRotation(this.horntopr, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.legr.render(var7);
        this.legl.render(var7);
        this.legL2B.render(var7);
        this.body2.render(var7);
        this.body.render(var7);
        this.legR2B.render(var7);
        this.legL2T.render(var7);
        this.legR2T.render(var7);
        this.legR2M.render(var7);
        this.legL2M.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
        this.Shape7.render(var7);
        this.Shape8.render(var7);
        this.Shape9.render(var7);
        this.hornbottoml.render(var7);
        this.horntopl.render(var7);
        this.hornbottomr.render(var7);
        this.horntopr.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.legr.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.legR2B.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.legR2M.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.legR2T.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.legl.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.legL2B.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.legL2M.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.legL2T.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
    }
}
