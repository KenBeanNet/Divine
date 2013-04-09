package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpinarusTail extends ModelBase
{
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer part3;

    public SpinarusTail()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.part1 = new ModelRenderer(this, 0, 0);
        this.part1.addBox(-5.0F, -2.0F, -10.0F, 10, 4, 10);
        this.part1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part1.setTextureSize(64, 32);
        this.part1.mirror = true;
        this.setRotation(this.part1, 0.0F, 0.0F, 0.0F);
        this.part2 = new ModelRenderer(this, 0, 14);
        this.part2.addBox(-4.0F, -1.0F, 0.0F, 8, 3, 5);
        this.part2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.part2.setTextureSize(64, 32);
        this.part2.mirror = true;
        this.setRotation(this.part2, 0.0F, 0.0F, 0.0F);
        this.part3 = new ModelRenderer(this, 0, 22);
        this.part3.addBox(-4.0F, -1.0F, 0.0F, 6, 1, 5);
        this.part3.setRotationPoint(1.0F, 1.0F, 5.0F);
        this.part3.setTextureSize(64, 32);
        this.part3.mirror = true;
        this.setRotation(this.part3, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.part1.render(var7);
        this.part2.render(var7);
        this.part3.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6) {}
}
