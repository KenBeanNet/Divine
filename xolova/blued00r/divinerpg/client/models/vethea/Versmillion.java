package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Versmillion extends ModelBase
{
    ModelRenderer Part1;
    ModelRenderer LegR1;
    ModelRenderer Tail1;
    ModelRenderer Part2;
    ModelRenderer Part3;
    ModelRenderer Part4;
    ModelRenderer Part5;
    ModelRenderer Part6;
    ModelRenderer Part7;
    ModelRenderer Part8;
    ModelRenderer Part9;
    ModelRenderer LegR2;
    ModelRenderer LegR3;
    ModelRenderer LegR4;
    ModelRenderer LegR5;
    ModelRenderer LegR6;
    ModelRenderer LegR7;
    ModelRenderer LegRF1;
    ModelRenderer LegRF2;
    ModelRenderer LegRF3;
    ModelRenderer LegRF4;
    ModelRenderer LegRF5;
    ModelRenderer LegRF6;
    ModelRenderer LegRF7;
    ModelRenderer Part10;
    ModelRenderer Part11;
    ModelRenderer LegLF1;
    ModelRenderer LegLF2;
    ModelRenderer LegLF3;
    ModelRenderer LegL1;
    ModelRenderer LegL2;
    ModelRenderer LegL3;
    ModelRenderer LegLF4;
    ModelRenderer LegLF5;
    ModelRenderer LegLF6;
    ModelRenderer LegLF7;
    ModelRenderer LegL4;
    ModelRenderer LegL5;
    ModelRenderer LegL6;
    ModelRenderer LegL7;
    ModelRenderer Part12;
    ModelRenderer Part13;
    ModelRenderer Part14;
    ModelRenderer Part15;
    ModelRenderer Part16;
    ModelRenderer Part17;
    ModelRenderer Part18;
    ModelRenderer Part19;
    ModelRenderer Part20;
    ModelRenderer Part21;
    ModelRenderer Part22;
    ModelRenderer Part23;
    ModelRenderer Part24;
    ModelRenderer Part25;
    ModelRenderer Tail3;
    ModelRenderer Tail2;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Tail7;
    ModelRenderer Tail8;
    ModelRenderer Tail9;
    ModelRenderer Tail10;
    ModelRenderer Tail12;
    ModelRenderer Tail11;
    ModelRenderer Tail13;
    ModelRenderer Tail14;
    ModelRenderer Tail15;

    public Versmillion()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Part1 = new ModelRenderer(this, 0, 22);
        this.Part1.addBox(3.0F, -4.0F, 0.0F, 2, 3, 2);
        this.Part1.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part1.setTextureSize(64, 32);
        this.Part1.mirror = true;
        this.setRotation(this.Part1, 0.0F, 0.0F, 0.0F);
        this.LegR1 = new ModelRenderer(this, 24, 7);
        this.LegR1.addBox(-6.0F, 6.0F, 3.0F, 8, 2, 2);
        this.LegR1.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR1.setTextureSize(64, 32);
        this.LegR1.mirror = true;
        this.setRotation(this.LegR1, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.Tail1 = new ModelRenderer(this, 46, 20);
        this.Tail1.addBox(-6.0F, 16.0F, -1.0F, 3, 2, 2);
        this.Tail1.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail1.setTextureSize(64, 32);
        this.Tail1.mirror = true;
        this.setRotation(this.Tail1, 1.130069F, 0.0F, 0.0F);
        this.Part2 = new ModelRenderer(this, 19, 15);
        this.Part2.addBox(-4.0F, -7.0F, -3.0F, 5, 6, 6);
        this.Part2.setRotationPoint(3.0F, 12.0F, 3.0F);
        this.Part2.setTextureSize(64, 32);
        this.Part2.mirror = true;
        this.setRotation(this.Part2, 1.745329F, 0.0F, 0.0F);
        this.Part3 = new ModelRenderer(this, 18, 14);
        this.Part3.addBox(-4.0F, -2.0F, -3.0F, 6, 6, 4);
        this.Part3.setRotationPoint(0.0F, 12.0F, -4.0F);
        this.Part3.setTextureSize(64, 32);
        this.Part3.mirror = true;
        this.setRotation(this.Part3, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Part4 = new ModelRenderer(this, 18, 14);
        this.Part4.addBox(-4.0F, -2.0F, -3.0F, 6, 6, 6);
        this.Part4.setRotationPoint(-3.0F, 12.0F, 12.0F);
        this.Part4.setTextureSize(64, 32);
        this.Part4.mirror = true;
        this.setRotation(this.Part4, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Part5 = new ModelRenderer(this, 19, 15);
        this.Part5.addBox(-4.0F, -7.0F, -3.0F, 5, 6, 6);
        this.Part5.setRotationPoint(-2.0F, 12.0F, 3.0F);
        this.Part5.setTextureSize(64, 32);
        this.Part5.mirror = true;
        this.setRotation(this.Part5, 1.745329F, 0.0F, 0.0F);
        this.Part6 = new ModelRenderer(this, 19, 15);
        this.Part6.addBox(-4.0F, 6.0F, -2.0F, 4, 6, 6);
        this.Part6.setRotationPoint(-1.0F, 12.0F, 14.0F);
        this.Part6.setTextureSize(64, 32);
        this.Part6.mirror = true;
        this.setRotation(this.Part6, 1.22173F, 0.0F, 0.0F);
        this.Part7 = new ModelRenderer(this, 19, 15);
        this.Part7.addBox(-4.0F, 6.0F, -2.0F, 4, 6, 6);
        this.Part7.setRotationPoint(3.0F, 12.0F, 14.0F);
        this.Part7.setTextureSize(64, 32);
        this.Part7.mirror = true;
        this.setRotation(this.Part7, 1.22173F, 0.0F, 0.0F);
        this.Part8 = new ModelRenderer(this, 19, 15);
        this.Part8.addBox(-4.0F, 1.0F, -3.0F, 5, 6, 6);
        this.Part8.setRotationPoint(-2.0F, 12.0F, 14.0F);
        this.Part8.setTextureSize(64, 32);
        this.Part8.mirror = true;
        this.setRotation(this.Part8, 1.396263F, 0.0F, 0.0F);
        this.Part9 = new ModelRenderer(this, 19, 15);
        this.Part9.addBox(-4.0F, 1.0F, -3.0F, 5, 6, 6);
        this.Part9.setRotationPoint(3.0F, 12.0F, 14.0F);
        this.Part9.setTextureSize(64, 32);
        this.Part9.mirror = true;
        this.setRotation(this.Part9, 1.396263F, 0.0F, 0.0F);
        this.LegR2 = new ModelRenderer(this, 28, 2);
        this.LegR2.addBox(-8.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegR2.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR2.setTextureSize(64, 32);
        this.LegR2.mirror = true;
        this.setRotation(this.LegR2, 0.0F, 0.0F, 0.0F);
        this.LegR3 = new ModelRenderer(this, 24, 7);
        this.LegR3.addBox(-6.0F, 6.0F, -3.0F, 8, 2, 2);
        this.LegR3.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR3.setTextureSize(64, 32);
        this.LegR3.mirror = true;
        this.setRotation(this.LegR3, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegR4 = new ModelRenderer(this, 28, 0);
        this.LegR4.addBox(-2.0F, -2.0F, -3.0F, 4, 8, 2);
        this.LegR4.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR4.setTextureSize(64, 32);
        this.LegR4.mirror = true;
        this.setRotation(this.LegR4, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegR5 = new ModelRenderer(this, 28, 0);
        this.LegR5.addBox(-2.0F, -2.0F, 3.0F, 4, 8, 2);
        this.LegR5.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR5.setTextureSize(64, 32);
        this.LegR5.mirror = true;
        this.setRotation(this.LegR5, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegR6 = new ModelRenderer(this, 28, 0);
        this.LegR6.addBox(-6.0F, 3.0F, -1.0F, 4, 8, 4);
        this.LegR6.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR6.setTextureSize(64, 32);
        this.LegR6.mirror = true;
        this.setRotation(this.LegR6, 0.0F, 0.0F, 0.0F);
        this.LegR7 = new ModelRenderer(this, 28, 2);
        this.LegR7.addBox(-2.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegR7.setRotationPoint(-5.5F, 13.0F, 15.0F);
        this.LegR7.setTextureSize(64, 32);
        this.LegR7.mirror = true;
        this.setRotation(this.LegR7, 0.0F, 0.0F, 0.0F);
        this.LegRF1 = new ModelRenderer(this, 28, 2);
        this.LegRF1.addBox(-2.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegRF1.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF1.setTextureSize(64, 32);
        this.LegRF1.mirror = true;
        this.setRotation(this.LegRF1, 0.0F, 0.0F, 0.0F);
        this.LegRF2 = new ModelRenderer(this, 28, 2);
        this.LegRF2.addBox(-8.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegRF2.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF2.setTextureSize(64, 32);
        this.LegRF2.mirror = true;
        this.setRotation(this.LegRF2, 0.0F, 0.0F, 0.0F);
        this.LegRF3 = new ModelRenderer(this, 28, 0);
        this.LegRF3.addBox(-6.0F, 3.0F, -1.0F, 4, 8, 4);
        this.LegRF3.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF3.setTextureSize(64, 32);
        this.LegRF3.mirror = true;
        this.setRotation(this.LegRF3, 0.0F, 0.0F, 0.0F);
        this.LegRF4 = new ModelRenderer(this, 24, 7);
        this.LegRF4.addBox(-6.0F, 6.0F, -3.0F, 8, 2, 2);
        this.LegRF4.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF4.setTextureSize(64, 32);
        this.LegRF4.mirror = true;
        this.setRotation(this.LegRF4, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegRF5 = new ModelRenderer(this, 28, 0);
        this.LegRF5.addBox(-2.0F, -2.0F, -3.0F, 4, 8, 2);
        this.LegRF5.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF5.setTextureSize(64, 32);
        this.LegRF5.mirror = true;
        this.setRotation(this.LegRF5, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegRF6 = new ModelRenderer(this, 28, 0);
        this.LegRF6.addBox(-2.0F, -2.0F, 3.0F, 4, 8, 2);
        this.LegRF6.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF6.setTextureSize(64, 32);
        this.LegRF6.mirror = true;
        this.setRotation(this.LegRF6, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.LegRF7 = new ModelRenderer(this, 24, 7);
        this.LegRF7.addBox(-6.0F, 6.0F, 3.0F, 8, 2, 2);
        this.LegRF7.setRotationPoint(-5.5F, 13.0F, 1.0F);
        this.LegRF7.setTextureSize(64, 32);
        this.LegRF7.mirror = true;
        this.setRotation(this.LegRF7, 0.0F, 0.0F, ((float)Math.PI / 4F));
        this.Part10 = new ModelRenderer(this, 44, 13);
        this.Part10.addBox(-1.0F, -2.0F, -3.0F, 6, 9, 1);
        this.Part10.setRotationPoint(-3.0F, 8.0F, 16.0F);
        this.Part10.setTextureSize(64, 32);
        this.Part10.mirror = true;
        this.setRotation(this.Part10, 1.919862F, 0.0F, 0.0F);
        this.Part11 = new ModelRenderer(this, 18, 14);
        this.Part11.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
        this.Part11.setRotationPoint(3.0F, 12.0F, 3.0F);
        this.Part11.setTextureSize(64, 32);
        this.Part11.mirror = true;
        this.setRotation(this.Part11, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.LegLF1 = new ModelRenderer(this, 28, 2);
        this.LegLF1.addBox(6.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegLF1.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF1.setTextureSize(64, 32);
        this.LegLF1.mirror = true;
        this.setRotation(this.LegLF1, 0.0F, 0.0F, 0.0F);
        this.LegLF2 = new ModelRenderer(this, 28, 2);
        this.LegLF2.addBox(0.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegLF2.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF2.setTextureSize(64, 32);
        this.LegLF2.mirror = true;
        this.setRotation(this.LegLF2, 0.0F, 0.0F, 0.0F);
        this.LegLF3 = new ModelRenderer(this, 28, 0);
        this.LegLF3.addBox(2.0F, 3.0F, -1.0F, 4, 8, 4);
        this.LegLF3.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF3.setTextureSize(64, 32);
        this.LegLF3.mirror = true;
        this.setRotation(this.LegLF3, 0.0F, 0.0F, 0.0F);
        this.LegL1 = new ModelRenderer(this, 28, 2);
        this.LegL1.addBox(6.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegL1.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL1.setTextureSize(64, 32);
        this.LegL1.mirror = true;
        this.setRotation(this.LegL1, 0.0F, 0.0F, 0.0F);
        this.LegL2 = new ModelRenderer(this, 28, 2);
        this.LegL2.addBox(0.0F, 9.0F, -5.0F, 2, 2, 7);
        this.LegL2.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL2.setTextureSize(64, 32);
        this.LegL2.mirror = true;
        this.setRotation(this.LegL2, 0.0F, 0.0F, 0.0F);
        this.LegL3 = new ModelRenderer(this, 28, 0);
        this.LegL3.addBox(2.0F, 3.0F, -1.0F, 4, 8, 4);
        this.LegL3.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL3.setTextureSize(64, 32);
        this.LegL3.mirror = true;
        this.setRotation(this.LegL3, 0.0F, 0.0F, 0.0F);
        this.LegLF4 = new ModelRenderer(this, 24, 7);
        this.LegLF4.addBox(-2.0F, 6.0F, -3.0F, 8, 2, 2);
        this.LegLF4.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF4.setTextureSize(64, 32);
        this.LegLF4.mirror = true;
        this.setRotation(this.LegLF4, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegLF5 = new ModelRenderer(this, 28, 0);
        this.LegLF5.addBox(-2.0F, -2.0F, -3.0F, 4, 8, 2);
        this.LegLF5.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF5.setTextureSize(64, 32);
        this.LegLF5.mirror = true;
        this.setRotation(this.LegLF5, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegLF6 = new ModelRenderer(this, 28, 0);
        this.LegLF6.addBox(-2.0F, -2.0F, 3.0F, 4, 8, 2);
        this.LegLF6.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF6.setTextureSize(64, 32);
        this.LegLF6.mirror = true;
        this.setRotation(this.LegLF6, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegLF7 = new ModelRenderer(this, 24, 7);
        this.LegLF7.addBox(-2.0F, 6.0F, 3.0F, 8, 2, 2);
        this.LegLF7.setRotationPoint(3.5F, 13.0F, 1.0F);
        this.LegLF7.setTextureSize(64, 32);
        this.LegLF7.mirror = true;
        this.setRotation(this.LegLF7, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegL4 = new ModelRenderer(this, 24, 7);
        this.LegL4.addBox(-2.0F, 6.0F, -3.0F, 8, 2, 2);
        this.LegL4.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL4.setTextureSize(64, 32);
        this.LegL4.mirror = true;
        this.setRotation(this.LegL4, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegL5 = new ModelRenderer(this, 28, 0);
        this.LegL5.addBox(-2.0F, -2.0F, -3.0F, 4, 8, 2);
        this.LegL5.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL5.setTextureSize(64, 32);
        this.LegL5.mirror = true;
        this.setRotation(this.LegL5, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegL6 = new ModelRenderer(this, 28, 0);
        this.LegL6.addBox(-2.0F, -2.0F, 3.0F, 4, 8, 2);
        this.LegL6.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL6.setTextureSize(64, 32);
        this.LegL6.mirror = true;
        this.setRotation(this.LegL6, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.LegL7 = new ModelRenderer(this, 24, 7);
        this.LegL7.addBox(-2.0F, 6.0F, 3.0F, 8, 2, 2);
        this.LegL7.setRotationPoint(3.5F, 13.0F, 15.0F);
        this.LegL7.setTextureSize(64, 32);
        this.LegL7.mirror = true;
        this.setRotation(this.LegL7, 0.0F, 0.0F, -((float)Math.PI / 4F));
        this.Part12 = new ModelRenderer(this, 18, 14);
        this.Part12.addBox(-4.0F, -2.0F, -3.0F, 6, 6, 6);
        this.Part12.setRotationPoint(3.0F, 12.0F, 12.0F);
        this.Part12.setTextureSize(64, 32);
        this.Part12.mirror = true;
        this.setRotation(this.Part12, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Part13 = new ModelRenderer(this, 0, 0);
        this.Part13.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
        this.Part13.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part13.setTextureSize(64, 32);
        this.Part13.mirror = true;
        this.setRotation(this.Part13, 0.0F, 0.0F, 0.0F);
        this.Part14 = new ModelRenderer(this, 0, 26);
        this.Part14.addBox(3.0F, -6.0F, -2.0F, 2, 2, 4);
        this.Part14.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part14.setTextureSize(64, 32);
        this.Part14.mirror = true;
        this.setRotation(this.Part14, 0.0F, 0.0F, 0.0F);
        this.Part15 = new ModelRenderer(this, 0, 26);
        this.Part15.addBox(-5.0F, -6.0F, -2.0F, 2, 2, 4);
        this.Part15.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part15.setTextureSize(64, 32);
        this.Part15.mirror = true;
        this.setRotation(this.Part15, 0.0F, 0.0F, 0.0F);
        this.Part16 = new ModelRenderer(this, 0, 22);
        this.Part16.addBox(-5.0F, -4.0F, 0.0F, 2, 3, 2);
        this.Part16.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part16.setTextureSize(64, 32);
        this.Part16.mirror = true;
        this.setRotation(this.Part16, 0.0F, 0.0F, 0.0F);
        this.Part17 = new ModelRenderer(this, 0, 22);
        this.Part17.addBox(3.0F, 1.0F, 0.0F, 2, 3, 2);
        this.Part17.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part17.setTextureSize(64, 32);
        this.Part17.mirror = true;
        this.setRotation(this.Part17, 0.0F, 0.0F, 0.0F);
        this.Part18 = new ModelRenderer(this, 0, 26);
        this.Part18.addBox(3.0F, 4.0F, -2.0F, 2, 2, 4);
        this.Part18.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part18.setTextureSize(64, 32);
        this.Part18.mirror = true;
        this.setRotation(this.Part18, 0.0F, 0.0F, 0.0F);
        this.Part19 = new ModelRenderer(this, 0, 22);
        this.Part19.addBox(-5.0F, 1.0F, 0.0F, 2, 3, 2);
        this.Part19.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part19.setTextureSize(64, 32);
        this.Part19.mirror = true;
        this.setRotation(this.Part19, 0.0F, 0.0F, 0.0F);
        this.Part20 = new ModelRenderer(this, 0, 26);
        this.Part20.addBox(-5.0F, 4.0F, -2.0F, 2, 2, 4);
        this.Part20.setRotationPoint(-1.0F, 13.5F, -8.0F);
        this.Part20.setTextureSize(64, 32);
        this.Part20.mirror = true;
        this.setRotation(this.Part20, 0.0F, 0.0F, 0.0F);
        this.Part21 = new ModelRenderer(this, 18, 14);
        this.Part21.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
        this.Part21.setRotationPoint(-3.0F, 12.0F, 3.0F);
        this.Part21.setTextureSize(64, 32);
        this.Part21.mirror = true;
        this.setRotation(this.Part21, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Part22 = new ModelRenderer(this, 45, 14);
        this.Part22.addBox(-1.0F, -2.0F, -3.0F, 6, 9, 1);
        this.Part22.setRotationPoint(-3.0F, 8.0F, -4.0F);
        this.Part22.setTextureSize(64, 32);
        this.Part22.mirror = true;
        this.setRotation(this.Part22, 2.70526F, 0.0F, 0.0F);
        this.Part23 = new ModelRenderer(this, 45, 18);
        this.Part23.addBox(-1.0F, -2.0F, -3.0F, 6, 9, 1);
        this.Part23.setRotationPoint(-3.0F, 8.0F, 1.0F);
        this.Part23.setTextureSize(64, 32);
        this.Part23.mirror = true;
        this.setRotation(this.Part23, 2.70526F, 0.0F, 0.0F);
        this.Part24 = new ModelRenderer(this, 48, 18);
        this.Part24.addBox(-1.0F, -2.0F, -3.0F, 6, 9, 1);
        this.Part24.setRotationPoint(-3.0F, 8.0F, 6.0F);
        this.Part24.setTextureSize(64, 32);
        this.Part24.mirror = true;
        this.setRotation(this.Part24, 2.70526F, 0.0F, 0.0F);
        this.Part25 = new ModelRenderer(this, 48, 12);
        this.Part25.addBox(-1.0F, -2.0F, -3.0F, 6, 9, 1);
        this.Part25.setRotationPoint(-3.0F, 8.0F, 11.0F);
        this.Part25.setTextureSize(64, 32);
        this.Part25.mirror = true;
        this.setRotation(this.Part25, 2.443461F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 46, 20);
        this.Tail3.addBox(3.0F, 16.0F, -1.0F, 3, 2, 2);
        this.Tail3.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail3.setTextureSize(64, 32);
        this.Tail3.mirror = true;
        this.setRotation(this.Tail3, 1.130069F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 9, 18);
        this.Tail2.addBox(-3.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Tail2.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail2.setTextureSize(64, 32);
        this.Tail2.mirror = true;
        this.setRotation(this.Tail2, 1.130069F, 0.0F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 9, 18);
        this.Tail4.addBox(1.0F, 0.0F, -1.0F, 2, 8, 2);
        this.Tail4.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail4.setTextureSize(64, 32);
        this.Tail4.mirror = true;
        this.setRotation(this.Tail4, 1.130069F, 0.0F, 0.0F);
        this.Tail5 = new ModelRenderer(this, 9, 18);
        this.Tail5.addBox(-3.0F, 10.0F, -1.0F, 2, 8, 2);
        this.Tail5.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail5.setTextureSize(64, 32);
        this.Tail5.mirror = true;
        this.setRotation(this.Tail5, 1.130069F, 0.0F, 0.0F);
        this.Tail6 = new ModelRenderer(this, 9, 18);
        this.Tail6.addBox(1.0F, 10.0F, -1.0F, 2, 8, 2);
        this.Tail6.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail6.setTextureSize(64, 32);
        this.Tail6.mirror = true;
        this.setRotation(this.Tail6, 1.130069F, 0.0F, 0.0F);
        this.Tail7 = new ModelRenderer(this, 46, 20);
        this.Tail7.addBox(-4.0F, 8.0F, -1.0F, 3, 2, 2);
        this.Tail7.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail7.setTextureSize(64, 32);
        this.Tail7.mirror = true;
        this.setRotation(this.Tail7, 1.130069F, 0.0F, 0.0F);
        this.Tail8 = new ModelRenderer(this, 46, 20);
        this.Tail8.addBox(1.0F, 8.0F, -1.0F, 3, 2, 2);
        this.Tail8.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail8.setTextureSize(64, 32);
        this.Tail8.mirror = true;
        this.setRotation(this.Tail8, 1.130069F, 0.0F, 0.0F);
        this.Tail9 = new ModelRenderer(this, 46, 20);
        this.Tail9.addBox(-1.0F, 16.0F, -1.0F, 2, 2, 2);
        this.Tail9.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail9.setTextureSize(64, 32);
        this.Tail9.mirror = true;
        this.setRotation(this.Tail9, 1.130069F, 0.0F, 0.0F);
        this.Tail10 = new ModelRenderer(this, 46, 20);
        this.Tail10.addBox(3.0F, 11.0F, -1.0F, 2, 2, 2);
        this.Tail10.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail10.setTextureSize(64, 32);
        this.Tail10.mirror = true;
        this.setRotation(this.Tail10, 1.130069F, 0.0F, 0.0F);
        this.Tail12 = new ModelRenderer(this, 46, 20);
        this.Tail12.addBox(-5.0F, 5.0F, -1.0F, 2, 2, 2);
        this.Tail12.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail12.setTextureSize(64, 32);
        this.Tail12.mirror = true;
        this.setRotation(this.Tail12, 1.130069F, 0.0F, 0.0F);
        this.Tail11 = new ModelRenderer(this, 46, 20);
        this.Tail11.addBox(3.0F, 5.0F, -1.0F, 2, 2, 2);
        this.Tail11.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail11.setTextureSize(64, 32);
        this.Tail11.mirror = true;
        this.setRotation(this.Tail11, 1.130069F, 0.0F, 0.0F);
        this.Tail13 = new ModelRenderer(this, 46, 20);
        this.Tail13.addBox(-6.0F, 2.0F, -1.0F, 3, 2, 2);
        this.Tail13.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail13.setTextureSize(64, 32);
        this.Tail13.mirror = true;
        this.setRotation(this.Tail13, 1.130069F, 0.0F, 0.0F);
        this.Tail14 = new ModelRenderer(this, 46, 20);
        this.Tail14.addBox(3.0F, 2.0F, -1.0F, 3, 2, 2);
        this.Tail14.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail14.setTextureSize(64, 32);
        this.Tail14.mirror = true;
        this.setRotation(this.Tail14, 1.130069F, 0.0F, 0.0F);
        this.Tail15 = new ModelRenderer(this, 46, 20);
        this.Tail15.addBox(-5.0F, 11.0F, -1.0F, 2, 2, 2);
        this.Tail15.setRotationPoint(-1.0F, 15.0F, 25.0F);
        this.Tail15.setTextureSize(64, 32);
        this.Tail15.mirror = true;
        this.setRotation(this.Tail15, 1.130069F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.Part1.render(var7);
        this.LegR1.render(var7);
        this.Tail1.render(var7);
        this.Part2.render(var7);
        this.Part3.render(var7);
        this.Part4.render(var7);
        this.Part5.render(var7);
        this.Part6.render(var7);
        this.Part7.render(var7);
        this.Part8.render(var7);
        this.Part9.render(var7);
        this.LegR2.render(var7);
        this.LegR3.render(var7);
        this.LegR4.render(var7);
        this.LegR5.render(var7);
        this.LegR6.render(var7);
        this.LegR7.render(var7);
        this.LegRF1.render(var7);
        this.LegRF2.render(var7);
        this.LegRF3.render(var7);
        this.LegRF4.render(var7);
        this.LegRF5.render(var7);
        this.LegRF6.render(var7);
        this.LegRF7.render(var7);
        this.Part10.render(var7);
        this.Part11.render(var7);
        this.LegLF1.render(var7);
        this.LegLF2.render(var7);
        this.LegLF3.render(var7);
        this.LegL1.render(var7);
        this.LegL2.render(var7);
        this.LegL3.render(var7);
        this.LegLF4.render(var7);
        this.LegLF5.render(var7);
        this.LegLF6.render(var7);
        this.LegLF7.render(var7);
        this.LegL4.render(var7);
        this.LegL5.render(var7);
        this.LegL6.render(var7);
        this.LegL7.render(var7);
        this.Part12.render(var7);
        this.Part13.render(var7);
        this.Part14.render(var7);
        this.Part15.render(var7);
        this.Part16.render(var7);
        this.Part17.render(var7);
        this.Part18.render(var7);
        this.Part19.render(var7);
        this.Part20.render(var7);
        this.Part21.render(var7);
        this.Part22.render(var7);
        this.Part23.render(var7);
        this.Part24.render(var7);
        this.Part25.render(var7);
        this.Tail3.render(var7);
        this.Tail2.render(var7);
        this.Tail4.render(var7);
        this.Tail5.render(var7);
        this.Tail6.render(var7);
        this.Tail7.render(var7);
        this.Tail8.render(var7);
        this.Tail9.render(var7);
        this.Tail10.render(var7);
        this.Tail12.render(var7);
        this.Tail11.render(var7);
        this.Tail13.render(var7);
        this.Tail14.render(var7);
        this.Tail15.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.LegL1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL7.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegL6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegR1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR6.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegR7.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegLF1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF7.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegLF6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.LegRF1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF6.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.LegRF7.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    }
}
