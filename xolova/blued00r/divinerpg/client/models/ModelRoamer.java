package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRoamer extends ModelBase
{
    ModelRenderer Main_Body1;
    ModelRenderer Lower_Body;
    ModelRenderer Arm2;
    ModelRenderer Armtop1;
    ModelRenderer Armtop2;
    ModelRenderer Arm1;
    ModelRenderer Main_Body;
    ModelRenderer Mid_Body;
    ModelRenderer TopBody;
    ModelRenderer Legbottom1;
    ModelRenderer Legtop1;
    ModelRenderer Legbottom2;
    ModelRenderer Legtop2;

    public ModelRoamer()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Main_Body1 = new ModelRenderer(this, 0, 0);
        this.Main_Body1.addBox(0.0F, 0.0F, 0.0F, 10, 6, 10);
        this.Main_Body1.setRotationPoint(2.0F, -5.0F, 2.0F);
        this.Main_Body1.setTextureSize(64, 32);
        this.Main_Body1.mirror = true;
        this.setRotation(this.Main_Body1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Lower_Body = new ModelRenderer(this, 39, 20);
        this.Lower_Body.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.Lower_Body.setRotationPoint(-4.0F, -5.0F, 0.0F);
        this.Lower_Body.setTextureSize(64, 32);
        this.Lower_Body.mirror = true;
        this.setRotation(this.Lower_Body, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Arm2 = new ModelRenderer(this, 14, 18);
        this.Arm2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Arm2.setRotationPoint(5.0F, 4.0F, -2.0F);
        this.Arm2.setTextureSize(64, 32);
        this.Arm2.mirror = true;
        this.setRotation(this.Arm2, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.Armtop1 = new ModelRenderer(this, 0, 18);
        this.Armtop1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Armtop1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Armtop1.setTextureSize(64, 32);
        this.Armtop1.mirror = true;
        this.setRotation(this.Armtop1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Armtop2 = new ModelRenderer(this, 0, 25);
        this.Armtop2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Armtop2.setRotationPoint(-7.0F, 2.0F, -2.0F);
        this.Armtop2.setTextureSize(64, 32);
        this.Armtop2.mirror = true;
        this.setRotation(this.Armtop2, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Arm1 = new ModelRenderer(this, 14, 25);
        this.Arm1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Arm1.setRotationPoint(-5.0F, 4.0F, -2.0F);
        this.Arm1.setTextureSize(64, 32);
        this.Arm1.mirror = true;
        this.setRotation(this.Arm1, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.Main_Body = new ModelRenderer(this, 0, 0);
        this.Main_Body.addBox(0.0F, 0.0F, 0.0F, 10, 6, 10);
        this.Main_Body.setRotationPoint(-14.0F, -5.0F, 2.0F);
        this.Main_Body.setTextureSize(64, 32);
        this.Main_Body.mirror = true;
        this.setRotation(this.Main_Body, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Mid_Body = new ModelRenderer(this, 39, 20);
        this.Mid_Body.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.Mid_Body.setRotationPoint(-4.0F, 7.0F, 0.0F);
        this.Mid_Body.setTextureSize(64, 32);
        this.Mid_Body.mirror = true;
        this.setRotation(this.Mid_Body, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.TopBody = new ModelRenderer(this, 39, 20);
        this.TopBody.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.TopBody.setRotationPoint(-4.0F, 1.0F, 0.0F);
        this.TopBody.setTextureSize(64, 32);
        this.TopBody.mirror = true;
        this.setRotation(this.TopBody, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Legbottom1 = new ModelRenderer(this, 14, 25);
        this.Legbottom1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Legbottom1.setRotationPoint(-5.0F, 13.0F, -2.0F);
        this.Legbottom1.setTextureSize(64, 32);
        this.Legbottom1.mirror = true;
        this.setRotation(this.Legbottom1, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.Legtop1 = new ModelRenderer(this, 0, 25);
        this.Legtop1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Legtop1.setRotationPoint(-7.0F, 11.0F, -2.0F);
        this.Legtop1.setTextureSize(64, 32);
        this.Legtop1.mirror = true;
        this.setRotation(this.Legtop1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Legbottom2 = new ModelRenderer(this, 14, 18);
        this.Legbottom2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Legbottom2.setRotationPoint(5.0F, 13.0F, -2.0F);
        this.Legbottom2.setTextureSize(64, 32);
        this.Legbottom2.mirror = true;
        this.setRotation(this.Legbottom2, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.Legtop2 = new ModelRenderer(this, 0, 18);
        this.Legtop2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Legtop2.setRotationPoint(0.0F, 11.0F, -2.0F);
        this.Legtop2.setTextureSize(64, 32);
        this.Legtop2.mirror = true;
        this.setRotation(this.Legtop2, 0.0F, ((float)Math.PI / 2F), 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.Main_Body1.render(var7);
        this.Lower_Body.render(var7);
        this.Arm2.render(var7);
        this.Armtop1.render(var7);
        this.Armtop2.render(var7);
        this.Arm1.render(var7);
        this.Main_Body.render(var7);
        this.Mid_Body.render(var7);
        this.TopBody.render(var7);
        this.Legbottom1.render(var7);
        this.Legtop1.render(var7);
        this.Legbottom2.render(var7);
        this.Legtop2.render(var7);
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
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
    }
}
