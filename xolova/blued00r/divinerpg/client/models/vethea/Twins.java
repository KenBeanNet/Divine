package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityTwins;

public class Twins extends ModelBase
{
    ModelRenderer rightlegt;
    ModelRenderer leftlegt;
    ModelRenderer rotated1;
    ModelRenderer rotated2;
    ModelRenderer rotated3;
    ModelRenderer rotated4;
    ModelRenderer rotated5;
    ModelRenderer rotated6;
    ModelRenderer rotated7;
    ModelRenderer rotated8;
    ModelRenderer rotated9;
    ModelRenderer rotated10;
    ModelRenderer rotated11;
    ModelRenderer rotated12;
    ModelRenderer rotated13;
    ModelRenderer rotated14;
    ModelRenderer rotated15;
    ModelRenderer rotated16;
    ModelRenderer rotated17;
    ModelRenderer rotated18;
    ModelRenderer righttoe1;
    ModelRenderer lefttoe1;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer lefttoe2;
    ModelRenderer righttoe2;
    ModelRenderer rotated19;
    ModelRenderer rotated20;
    ModelRenderer rotated21;
    ModelRenderer rotated22;
    ModelRenderer rotated23;
    ModelRenderer rotated24;
    ModelRenderer rotated25;
    ModelRenderer rotated26;
    ModelRenderer rotated27;
    ModelRenderer rotated28;
    ModelRenderer rotated29;
    ModelRenderer rotated30;
    ModelRenderer rotated31;
    ModelRenderer rotated32;
    ModelRenderer rotated33;
    ModelRenderer rotated34;
    ModelRenderer rotated35;
    ModelRenderer rotated36;

    public Twins()
    {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.rightlegt = new ModelRenderer(this, 101, 16);
        this.rightlegt.addBox(-4.0F, -4.0F, -3.0F, 6, 4, 6);
        this.rightlegt.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightlegt.setTextureSize(128, 32);
        this.rightlegt.mirror = true;
        this.setRotation(this.rightlegt, 0.0F, 0.0F, 0.0F);
        this.leftlegt = new ModelRenderer(this, 101, 16);
        this.leftlegt.addBox(-3.0F, -4.0F, -3.0F, 6, 4, 6);
        this.leftlegt.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftlegt.setTextureSize(128, 32);
        this.leftlegt.mirror = true;
        this.setRotation(this.leftlegt, 0.0F, 0.0F, 0.0F);
        this.rotated1 = new ModelRenderer(this, 82, 16);
        this.rotated1.addBox(4.0F, -16.0F, -12.0F, 4, 12, 4);
        this.rotated1.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated1.setTextureSize(128, 32);
        this.rotated1.mirror = true;
        this.setRotation(this.rotated1, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotated2 = new ModelRenderer(this, 82, 16);
        this.rotated2.addBox(-8.0F, -15.0F, -12.0F, 4, 12, 4);
        this.rotated2.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated2.setTextureSize(128, 32);
        this.rotated2.mirror = true;
        this.setRotation(this.rotated2, -0.1745329F, -(float)Math.PI, 0.0F);
        this.rotated3 = new ModelRenderer(this, 34, 0);
        this.rotated3.addBox(-3.0F, -18.0F, -6.0F, 6, 12, 4);
        this.rotated3.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated3.setTextureSize(128, 32);
        this.rotated3.mirror = true;
        this.setRotation(this.rotated3, 0.2617994F, -(float)Math.PI, 0.0F);
        this.rotated4 = new ModelRenderer(this, 40, 16);
        this.rotated4.addBox(-6.0F, -15.0F, -9.0F, 4, 2, 2);
        this.rotated4.setRotationPoint(-1.0F, 12.0F, 0.0F);
        this.rotated4.setTextureSize(128, 32);
        this.rotated4.mirror = true;
        this.setRotation(this.rotated4, 0.0F, -(float)Math.PI, 0.0F);
        this.rotated5 = new ModelRenderer(this, 40, 16);
        this.rotated5.addBox(2.0F, -16.0F, -9.0F, 4, 2, 2);
        this.rotated5.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated5.setTextureSize(128, 32);
        this.rotated5.mirror = true;
        this.setRotation(this.rotated5, 0.0F, -(float)Math.PI, 0.0F);
        this.rotated6 = new ModelRenderer(this, 56, 1);
        this.rotated6.addBox(-4.0F, -10.0F, -7.0F, 8, 7, 6);
        this.rotated6.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated6.setTextureSize(128, 32);
        this.rotated6.mirror = true;
        this.setRotation(this.rotated6, 0.2617994F, -(float)Math.PI, 0.0F);
        this.rotated7 = new ModelRenderer(this, 0, 0);
        this.rotated7.addBox(-4.0F, -25.0F, -9.0F, 8, 8, 8);
        this.rotated7.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated7.setTextureSize(128, 32);
        this.rotated7.mirror = true;
        this.setRotation(this.rotated7, 0.1745329F, -(float)Math.PI, 0.0F);
        this.rotated8 = new ModelRenderer(this, 0, 0);
        this.rotated8.addBox(-4.0F, -25.0F, -10.0F, 8, 8, 8);
        this.rotated8.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated8.setTextureSize(128, 32);
        this.rotated8.mirror = true;
        this.setRotation(this.rotated8, 0.1745329F, 0.0F, 0.0F);
        this.rotated9 = new ModelRenderer(this, 82, 16);
        this.rotated9.addBox(4.0F, -16.0F, -13.0F, 4, 12, 4);
        this.rotated9.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated9.setTextureSize(128, 32);
        this.rotated9.mirror = true;
        this.setRotation(this.rotated9, -0.1745329F, 0.0F, 0.0F);
        this.rotated10 = new ModelRenderer(this, 40, 16);
        this.rotated10.addBox(-6.0F, -15.0F, -10.0F, 4, 2, 2);
        this.rotated10.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated10.setTextureSize(128, 32);
        this.rotated10.mirror = true;
        this.setRotation(this.rotated10, 0.0F, 0.0F, 0.0F);
        this.rotated11 = new ModelRenderer(this, 40, 16);
        this.rotated11.addBox(2.0F, -16.0F, -10.0F, 4, 2, 2);
        this.rotated11.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated11.setTextureSize(128, 32);
        this.rotated11.mirror = true;
        this.setRotation(this.rotated11, 0.0F, 0.0F, 0.0F);
        this.rotated12 = new ModelRenderer(this, 55, 22);
        this.rotated12.addBox(5.0F, -7.0F, -19.0F, 2, 2, 8);
        this.rotated12.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated12.setTextureSize(128, 32);
        this.rotated12.mirror = true;
        this.setRotation(this.rotated12, -0.1745329F, (float)Math.PI, 0.0F);
        this.rotated13 = new ModelRenderer(this, 59, 26);
        this.rotated13.addBox(-18.0F, -9.0F, -3.0F, 2, 2, 4);
        this.rotated13.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated13.setTextureSize(128, 32);
        this.rotated13.mirror = true;
        this.setRotation(this.rotated13, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated14 = new ModelRenderer(this, 86, 2);
        this.rotated14.addBox(-5.0F, -4.0F, 0.0F, 10, 4, 8);
        this.rotated14.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated14.setTextureSize(128, 32);
        this.rotated14.mirror = true;
        this.setRotation(this.rotated14, 0.0F, 0.0F, 0.0F);
        this.rotated15 = new ModelRenderer(this, 82, 16);
        this.rotated15.addBox(-8.0F, -15.0F, -13.0F, 4, 12, 4);
        this.rotated15.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated15.setTextureSize(128, 32);
        this.rotated15.mirror = true;
        this.setRotation(this.rotated15, -0.1745329F, 0.0F, 0.0F);
        this.rotated16 = new ModelRenderer(this, 34, 0);
        this.rotated16.addBox(-3.0F, -18.0F, -7.0F, 6, 12, 4);
        this.rotated16.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated16.setTextureSize(128, 32);
        this.rotated16.mirror = true;
        this.setRotation(this.rotated16, 0.2617994F, 0.0F, 0.0F);
        this.rotated17 = new ModelRenderer(this, 56, 1);
        this.rotated17.addBox(-4.0F, -10.0F, -8.0F, 8, 7, 6);
        this.rotated17.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated17.setTextureSize(128, 32);
        this.rotated17.mirror = true;
        this.setRotation(this.rotated17, 0.2617994F, 0.0F, 0.0F);
        this.rotated18 = new ModelRenderer(this, 86, 2);
        this.rotated18.addBox(-5.0F, -4.0F, -8.0F, 10, 4, 8);
        this.rotated18.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rotated18.setTextureSize(128, 32);
        this.rotated18.mirror = true;
        this.setRotation(this.rotated18, 0.0F, 0.0F, 0.0F);
        this.righttoe1 = new ModelRenderer(this, 19, 17);
        this.righttoe1.addBox(1.0F, 9.0F, -10.0F, 2, 3, 12);
        this.righttoe1.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.righttoe1.setTextureSize(128, 32);
        this.righttoe1.mirror = true;
        this.setRotation(this.righttoe1, 0.0F, 0.0F, 0.0F);
        this.lefttoe1 = new ModelRenderer(this, 19, 17);
        this.lefttoe1.addBox(2.0F, 9.0F, -10.0F, 2, 3, 12);
        this.lefttoe1.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.lefttoe1.setTextureSize(128, 32);
        this.lefttoe1.mirror = true;
        this.setRotation(this.lefttoe1, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(128, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(128, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.lefttoe2 = new ModelRenderer(this, 19, 17);
        this.lefttoe2.addBox(-4.0F, 9.0F, -10.0F, 2, 3, 12);
        this.lefttoe2.setRotationPoint(8.0F, 12.0F, 0.0F);
        this.lefttoe2.setTextureSize(128, 32);
        this.lefttoe2.mirror = true;
        this.setRotation(this.lefttoe2, 0.0F, 0.0F, 0.0F);
        this.righttoe2 = new ModelRenderer(this, 19, 17);
        this.righttoe2.addBox(-5.0F, 9.0F, -10.0F, 2, 3, 12);
        this.righttoe2.setRotationPoint(-7.0F, 12.0F, 0.0F);
        this.righttoe2.setTextureSize(128, 32);
        this.righttoe2.mirror = true;
        this.setRotation(this.righttoe2, 0.0F, 0.0F, 0.0F);
        this.rotated19 = new ModelRenderer(this, 55, 22);
        this.rotated19.addBox(-7.0F, -6.0F, -19.0F, 2, 2, 8);
        this.rotated19.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated19.setTextureSize(128, 32);
        this.rotated19.mirror = true;
        this.setRotation(this.rotated19, -0.1745329F, (float)Math.PI, 0.0F);
        this.rotated20 = new ModelRenderer(this, 59, 26);
        this.rotated20.addBox(-18.0F, -9.0F, 1.0F, 2, 2, 4);
        this.rotated20.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated20.setTextureSize(128, 32);
        this.rotated20.mirror = true;
        this.setRotation(this.rotated20, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated21 = new ModelRenderer(this, 58, 24);
        this.rotated21.addBox(-19.0F, -9.0F, -7.0F, 2, 2, 6);
        this.rotated21.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated21.setTextureSize(128, 32);
        this.rotated21.mirror = true;
        this.setRotation(this.rotated21, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated22 = new ModelRenderer(this, 61, 28);
        this.rotated22.addBox(-22.0F, -11.0F, -1.0F, 6, 2, 2);
        this.rotated22.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated22.setTextureSize(128, 32);
        this.rotated22.mirror = true;
        this.setRotation(this.rotated22, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated23 = new ModelRenderer(this, 55, 22);
        this.rotated23.addBox(5.0F, -7.0F, -21.0F, 2, 2, 8);
        this.rotated23.setRotationPoint(1.0F, 14.0F, 0.0F);
        this.rotated23.setTextureSize(128, 32);
        this.rotated23.mirror = true;
        this.setRotation(this.rotated23, -0.1745329F, 0.0F, 0.0F);
        this.rotated24 = new ModelRenderer(this, 55, 22);
        this.rotated24.addBox(-7.0F, -6.0F, -21.0F, 2, 2, 8);
        this.rotated24.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated24.setTextureSize(128, 32);
        this.rotated24.mirror = true;
        this.setRotation(this.rotated24, -0.1745329F, 0.0F, 0.0F);
        this.rotated25 = new ModelRenderer(this, 58, 24);
        this.rotated25.addBox(-19.0F, -9.0F, -1.0F, 2, 2, 6);
        this.rotated25.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated25.setTextureSize(128, 32);
        this.rotated25.mirror = true;
        this.setRotation(this.rotated25, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated26 = new ModelRenderer(this, 61, 28);
        this.rotated26.addBox(-22.0F, -11.0F, 1.0F, 6, 2, 2);
        this.rotated26.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated26.setTextureSize(128, 32);
        this.rotated26.mirror = true;
        this.setRotation(this.rotated26, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated27 = new ModelRenderer(this, 61, 28);
        this.rotated27.addBox(-23.0F, -11.0F, -7.0F, 6, 2, 2);
        this.rotated27.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated27.setTextureSize(128, 32);
        this.rotated27.mirror = true;
        this.setRotation(this.rotated27, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated28 = new ModelRenderer(this, 61, 28);
        this.rotated28.addBox(-23.0F, -11.0F, 2.0F, 6, 2, 2);
        this.rotated28.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated28.setTextureSize(128, 32);
        this.rotated28.mirror = true;
        this.setRotation(this.rotated28, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated29 = new ModelRenderer(this, 61, 28);
        this.rotated29.addBox(-22.0F, -13.0F, 1.0F, 6, 2, 2);
        this.rotated29.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated29.setTextureSize(128, 32);
        this.rotated29.mirror = true;
        this.setRotation(this.rotated29, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated30 = new ModelRenderer(this, 61, 28);
        this.rotated30.addBox(-22.0F, -13.0F, -1.0F, 6, 2, 2);
        this.rotated30.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated30.setTextureSize(128, 32);
        this.rotated30.mirror = true;
        this.setRotation(this.rotated30, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated31 = new ModelRenderer(this, 61, 28);
        this.rotated31.addBox(-23.0F, -7.0F, -7.0F, 6, 2, 2);
        this.rotated31.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated31.setTextureSize(128, 32);
        this.rotated31.mirror = true;
        this.setRotation(this.rotated31, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated32 = new ModelRenderer(this, 61, 28);
        this.rotated32.addBox(-23.0F, -7.0F, 2.0F, 6, 2, 2);
        this.rotated32.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated32.setTextureSize(128, 32);
        this.rotated32.mirror = true;
        this.setRotation(this.rotated32, 0.0F, -((float)Math.PI / 2F), 0.0F);
        this.rotated33 = new ModelRenderer(this, 61, 28);
        this.rotated33.addBox(-22.0F, -7.0F, 1.0F, 6, 2, 2);
        this.rotated33.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated33.setTextureSize(128, 32);
        this.rotated33.mirror = true;
        this.setRotation(this.rotated33, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated34 = new ModelRenderer(this, 61, 28);
        this.rotated34.addBox(-22.0F, -7.0F, -1.0F, 6, 2, 2);
        this.rotated34.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated34.setTextureSize(128, 32);
        this.rotated34.mirror = true;
        this.setRotation(this.rotated34, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated35 = new ModelRenderer(this, 61, 28);
        this.rotated35.addBox(-22.0F, -5.0F, -1.0F, 6, 2, 2);
        this.rotated35.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated35.setTextureSize(128, 32);
        this.rotated35.mirror = true;
        this.setRotation(this.rotated35, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.rotated36 = new ModelRenderer(this, 61, 28);
        this.rotated36.addBox(-22.0F, -5.0F, 1.0F, 6, 2, 2);
        this.rotated36.setRotationPoint(-1.0F, 13.0F, 0.0F);
        this.rotated36.setTextureSize(128, 32);
        this.rotated36.mirror = true;
        this.setRotation(this.rotated36, 0.0F, ((float)Math.PI / 2F), 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles((EntityTwins)var1, var2, var3, var4, var5, var6, var7);
        this.rightlegt.render(var7);
        this.leftlegt.render(var7);
        this.rotated1.render(var7);
        this.rotated2.render(var7);
        this.rotated3.render(var7);
        this.rotated4.render(var7);
        this.rotated5.render(var7);
        this.rotated6.render(var7);
        this.rotated7.render(var7);
        this.rotated8.render(var7);
        this.rotated9.render(var7);
        this.rotated10.render(var7);
        this.rotated11.render(var7);
        this.rotated12.render(var7);
        this.rotated13.render(var7);
        this.rotated14.render(var7);
        this.rotated15.render(var7);
        this.rotated16.render(var7);
        this.rotated17.render(var7);
        this.rotated18.render(var7);
        this.righttoe1.render(var7);
        this.lefttoe1.render(var7);
        this.leftleg.render(var7);
        this.rightleg.render(var7);
        this.lefttoe2.render(var7);
        this.righttoe2.render(var7);
        this.rotated19.render(var7);
        this.rotated20.render(var7);
        this.rotated21.render(var7);
        this.rotated22.render(var7);
        this.rotated23.render(var7);
        this.rotated24.render(var7);
        this.rotated25.render(var7);
        this.rotated26.render(var7);
        this.rotated27.render(var7);
        this.rotated28.render(var7);
        this.rotated29.render(var7);
        this.rotated30.render(var7);
        this.rotated31.render(var7);
        this.rotated32.render(var7);
        this.rotated33.render(var7);
        this.rotated34.render(var7);
        this.rotated35.render(var7);
        this.rotated36.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(EntityTwins var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        this.leftleg.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.leftlegt.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.lefttoe1.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.lefttoe2.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
        this.rightleg.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.rightleg.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.righttoe1.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;
        this.righttoe2.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float)Math.PI) * 1.4F * var3;

        if (EntityTwins.ability == 1 && (double)this.rotated1.rotateAngleY < Math.PI)
        {
            this.rotated1.rotateAngleY = (float)((double)this.rotated1.rotateAngleY + 0.15D);
            this.rotated2.rotateAngleY = (float)((double)this.rotated2.rotateAngleY + 0.15D);
            this.rotated3.rotateAngleY = (float)((double)this.rotated3.rotateAngleY + 0.15D);
            this.rotated4.rotateAngleY = (float)((double)this.rotated4.rotateAngleY + 0.15D);
            this.rotated5.rotateAngleY = (float)((double)this.rotated5.rotateAngleY + 0.15D);
            this.rotated6.rotateAngleY = (float)((double)this.rotated6.rotateAngleY + 0.15D);
            this.rotated7.rotateAngleY = (float)((double)this.rotated7.rotateAngleY + 0.15D);
            this.rotated8.rotateAngleY = (float)((double)this.rotated8.rotateAngleY + 0.15D);
            this.rotated9.rotateAngleY = (float)((double)this.rotated9.rotateAngleY + 0.15D);
            this.rotated10.rotateAngleY = (float)((double)this.rotated10.rotateAngleY + 0.15D);
            this.rotated11.rotateAngleY = (float)((double)this.rotated11.rotateAngleY + 0.15D);
            this.rotated12.rotateAngleY = (float)((double)this.rotated12.rotateAngleY + 0.15D);
            this.rotated13.rotateAngleY = (float)((double)this.rotated13.rotateAngleY + 0.15D);
            this.rotated14.rotateAngleY = (float)((double)this.rotated14.rotateAngleY + 0.15D);
            this.rotated15.rotateAngleY = (float)((double)this.rotated15.rotateAngleY + 0.15D);
            this.rotated16.rotateAngleY = (float)((double)this.rotated16.rotateAngleY + 0.15D);
            this.rotated17.rotateAngleY = (float)((double)this.rotated17.rotateAngleY + 0.15D);
            this.rotated18.rotateAngleY = (float)((double)this.rotated18.rotateAngleY + 0.15D);
            this.rotated19.rotateAngleY = (float)((double)this.rotated19.rotateAngleY + 0.15D);
            this.rotated20.rotateAngleY = (float)((double)this.rotated20.rotateAngleY + 0.15D);
            this.rotated21.rotateAngleY = (float)((double)this.rotated21.rotateAngleY + 0.15D);
            this.rotated22.rotateAngleY = (float)((double)this.rotated22.rotateAngleY + 0.15D);
            this.rotated23.rotateAngleY = (float)((double)this.rotated23.rotateAngleY + 0.15D);
            this.rotated24.rotateAngleY = (float)((double)this.rotated24.rotateAngleY + 0.15D);
            this.rotated25.rotateAngleY = (float)((double)this.rotated25.rotateAngleY + 0.15D);
            this.rotated26.rotateAngleY = (float)((double)this.rotated26.rotateAngleY + 0.15D);
            this.rotated27.rotateAngleY = (float)((double)this.rotated27.rotateAngleY + 0.15D);
            this.rotated28.rotateAngleY = (float)((double)this.rotated28.rotateAngleY + 0.15D);
            this.rotated29.rotateAngleY = (float)((double)this.rotated29.rotateAngleY + 0.15D);
            this.rotated30.rotateAngleY = (float)((double)this.rotated30.rotateAngleY + 0.15D);
            this.rotated31.rotateAngleY = (float)((double)this.rotated31.rotateAngleY + 0.15D);
            this.rotated32.rotateAngleY = (float)((double)this.rotated32.rotateAngleY + 0.15D);
            this.rotated33.rotateAngleY = (float)((double)this.rotated33.rotateAngleY + 0.15D);
            this.rotated34.rotateAngleY = (float)((double)this.rotated34.rotateAngleY + 0.15D);
            this.rotated35.rotateAngleY = (float)((double)this.rotated35.rotateAngleY + 0.15D);
            this.rotated36.rotateAngleY = (float)((double)this.rotated36.rotateAngleY + 0.15D);
        }
        else if (EntityTwins.ability == 0 && this.rotated1.rotateAngleY > 0.0F)
        {
            this.rotated1.rotateAngleY = (float)((double)this.rotated1.rotateAngleY - 0.15D);
            this.rotated2.rotateAngleY = (float)((double)this.rotated2.rotateAngleY - 0.15D);
            this.rotated3.rotateAngleY = (float)((double)this.rotated3.rotateAngleY - 0.15D);
            this.rotated4.rotateAngleY = (float)((double)this.rotated4.rotateAngleY - 0.15D);
            this.rotated5.rotateAngleY = (float)((double)this.rotated5.rotateAngleY - 0.15D);
            this.rotated6.rotateAngleY = (float)((double)this.rotated6.rotateAngleY - 0.15D);
            this.rotated7.rotateAngleY = (float)((double)this.rotated7.rotateAngleY - 0.15D);
            this.rotated8.rotateAngleY = (float)((double)this.rotated8.rotateAngleY - 0.15D);
            this.rotated9.rotateAngleY = (float)((double)this.rotated9.rotateAngleY - 0.15D);
            this.rotated10.rotateAngleY = (float)((double)this.rotated10.rotateAngleY - 0.15D);
            this.rotated11.rotateAngleY = (float)((double)this.rotated11.rotateAngleY - 0.15D);
            this.rotated12.rotateAngleY = (float)((double)this.rotated12.rotateAngleY - 0.15D);
            this.rotated13.rotateAngleY = (float)((double)this.rotated13.rotateAngleY - 0.15D);
            this.rotated14.rotateAngleY = (float)((double)this.rotated14.rotateAngleY - 0.15D);
            this.rotated15.rotateAngleY = (float)((double)this.rotated15.rotateAngleY - 0.15D);
            this.rotated16.rotateAngleY = (float)((double)this.rotated16.rotateAngleY - 0.15D);
            this.rotated17.rotateAngleY = (float)((double)this.rotated17.rotateAngleY - 0.15D);
            this.rotated18.rotateAngleY = (float)((double)this.rotated18.rotateAngleY - 0.15D);
            this.rotated19.rotateAngleY = (float)((double)this.rotated19.rotateAngleY - 0.15D);
            this.rotated20.rotateAngleY = (float)((double)this.rotated20.rotateAngleY - 0.15D);
            this.rotated21.rotateAngleY = (float)((double)this.rotated21.rotateAngleY - 0.15D);
            this.rotated22.rotateAngleY = (float)((double)this.rotated22.rotateAngleY - 0.15D);
            this.rotated23.rotateAngleY = (float)((double)this.rotated23.rotateAngleY - 0.15D);
            this.rotated24.rotateAngleY = (float)((double)this.rotated24.rotateAngleY - 0.15D);
            this.rotated25.rotateAngleY = (float)((double)this.rotated25.rotateAngleY - 0.15D);
            this.rotated26.rotateAngleY = (float)((double)this.rotated26.rotateAngleY - 0.15D);
            this.rotated27.rotateAngleY = (float)((double)this.rotated27.rotateAngleY - 0.15D);
            this.rotated28.rotateAngleY = (float)((double)this.rotated28.rotateAngleY - 0.15D);
            this.rotated29.rotateAngleY = (float)((double)this.rotated29.rotateAngleY - 0.15D);
            this.rotated30.rotateAngleY = (float)((double)this.rotated30.rotateAngleY - 0.15D);
            this.rotated31.rotateAngleY = (float)((double)this.rotated31.rotateAngleY - 0.15D);
            this.rotated32.rotateAngleY = (float)((double)this.rotated32.rotateAngleY - 0.15D);
            this.rotated33.rotateAngleY = (float)((double)this.rotated33.rotateAngleY - 0.15D);
            this.rotated34.rotateAngleY = (float)((double)this.rotated34.rotateAngleY - 0.15D);
            this.rotated35.rotateAngleY = (float)((double)this.rotated35.rotateAngleY - 0.15D);
            this.rotated36.rotateAngleY = (float)((double)this.rotated36.rotateAngleY - 0.15D);
        }
    }
}
