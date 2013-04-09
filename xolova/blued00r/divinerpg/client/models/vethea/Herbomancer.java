package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Herbomancer extends ModelBase
{
    ModelRenderer head1;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg6;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer head6;
    ModelRenderer head7;
    ModelRenderer head8;
    ModelRenderer head9;
    ModelRenderer head10;
    ModelRenderer head11;
    ModelRenderer head12;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;
    ModelRenderer body24;
    ModelRenderer body25;
    ModelRenderer body26;
    ModelRenderer body27;
    ModelRenderer body28;
    ModelRenderer body29;
    ModelRenderer body30;
    ModelRenderer body31;
    ModelRenderer leftarm2;
    ModelRenderer rightarm2;
    ModelRenderer leftarm3;
    ModelRenderer rightarm3;
    ModelRenderer leftarm4;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer leftarm5;
    ModelRenderer rightarm6;
    ModelRenderer leftarm6;
    ModelRenderer leftarm7;
    ModelRenderer rightarm7;
    ModelRenderer leftarm8;
    ModelRenderer rightarm8;
    ModelRenderer rightarm9;
    ModelRenderer rightarm10;
    ModelRenderer leftarm9;
    ModelRenderer leftarm10;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer leftleg4;
    ModelRenderer rightleg5;
    ModelRenderer rightleg6;
    ModelRenderer leftarm11;
    ModelRenderer leftarm12;
    ModelRenderer leftarm13;
    ModelRenderer leftarm14;
    ModelRenderer leftleg5;

    public Herbomancer()
    {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.head1 = new ModelRenderer(this, 7, 14);
        this.head1.addBox(-1.0F, -4.0F, -5.0F, 2, 1, 1);
        this.head1.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head1.setTextureSize(128, 32);
        this.head1.mirror = true;
        this.setRotation(this.head1, 0.0F, 0.0F, 0.0F);
        this.rightarm1 = new ModelRenderer(this, 82, 4);
        this.rightarm1.addBox(0.0F, -2.0F, -2.0F, 1, 12, 1);
        this.rightarm1.setRotationPoint(-14.0F, -3.0F, 0.0F);
        this.rightarm1.setTextureSize(128, 32);
        this.rightarm1.mirror = true;
        this.setRotation(this.rightarm1, 0.0F, 0.0F, 0.0F);
        this.leftarm1 = new ModelRenderer(this, 82, 4);
        this.leftarm1.addBox(-1.0F, -2.0F, -2.0F, 1, 12, 1);
        this.leftarm1.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm1.setTextureSize(128, 32);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0F, 0.0F, 0.0F);
        this.rightleg1 = new ModelRenderer(this, 74, 3);
        this.rightleg1.addBox(1.0F, 0.0F, 2.0F, 1, 12, 1);
        this.rightleg1.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.rightleg1.setTextureSize(128, 32);
        this.rightleg1.mirror = true;
        this.setRotation(this.rightleg1, 0.0F, 0.0F, 0.0F);
        this.leftleg6 = new ModelRenderer(this, 74, 3);
        this.leftleg6.addBox(-2.0F, 0.0F, 2.0F, 1, 12, 1);
        this.leftleg6.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.leftleg6.setTextureSize(128, 32);
        this.leftleg6.mirror = true;
        this.setRotation(this.leftleg6, 0.0F, 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 5);
        this.head2.addBox(-4.0F, -3.0F, -4.0F, 1, 3, 8);
        this.head2.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head2.setTextureSize(128, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, 0.0F, 0.0F);
        this.head3 = new ModelRenderer(this, 7, 6);
        this.head3.addBox(-4.0F, -8.0F, -5.0F, 8, 4, 1);
        this.head3.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head3.setTextureSize(128, 32);
        this.head3.mirror = true;
        this.setRotation(this.head3, 0.0F, 0.0F, 0.0F);
        this.head4 = new ModelRenderer(this, 7, 12);
        this.head4.addBox(-4.0F, -3.0F, -5.0F, 8, 3, 1);
        this.head4.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head4.setTextureSize(128, 32);
        this.head4.mirror = true;
        this.setRotation(this.head4, 0.0F, 0.0F, 0.0F);
        this.head5 = new ModelRenderer(this, 7, 12);
        this.head5.addBox(-4.0F, -4.0F, -5.0F, 1, 1, 1);
        this.head5.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head5.setTextureSize(128, 32);
        this.head5.mirror = true;
        this.setRotation(this.head5, 0.0F, 0.0F, 0.0F);
        this.head6 = new ModelRenderer(this, 7, 12);
        this.head6.addBox(3.0F, -4.0F, -5.0F, 1, 1, 1);
        this.head6.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head6.setTextureSize(128, 32);
        this.head6.mirror = true;
        this.setRotation(this.head6, 0.0F, 0.0F, 0.0F);
        this.head7 = new ModelRenderer(this, 1, 0);
        this.head7.addBox(-3.0F, -8.0F, -4.0F, 6, 8, 8);
        this.head7.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head7.setTextureSize(128, 32);
        this.head7.mirror = true;
        this.setRotation(this.head7, 0.0F, 0.0F, 0.0F);
        this.head8 = new ModelRenderer(this, 0, 0);
        this.head8.addBox(-4.0F, -8.0F, -4.0F, 1, 3, 8);
        this.head8.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head8.setTextureSize(128, 32);
        this.head8.mirror = true;
        this.setRotation(this.head8, 0.0F, 0.0F, 0.0F);
        this.head9 = new ModelRenderer(this, 6, 0);
        this.head9.addBox(3.0F, -8.0F, -4.0F, 1, 3, 8);
        this.head9.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head9.setTextureSize(128, 32);
        this.head9.mirror = true;
        this.setRotation(this.head9, 0.0F, 0.0F, 0.0F);
        this.head10 = new ModelRenderer(this, 9, 2);
        this.head10.addBox(-4.0F, -5.0F, 2.0F, 1, 2, 2);
        this.head10.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head10.setTextureSize(128, 32);
        this.head10.mirror = true;
        this.setRotation(this.head10, 0.0F, 0.0F, 0.0F);
        this.head11 = new ModelRenderer(this, 6, 5);
        this.head11.addBox(3.0F, -3.0F, -4.0F, 1, 3, 8);
        this.head11.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head11.setTextureSize(128, 32);
        this.head11.mirror = true;
        this.setRotation(this.head11, 0.0F, 0.0F, 0.0F);
        this.head12 = new ModelRenderer(this, 6, 4);
        this.head12.addBox(3.0F, -5.0F, 2.0F, 1, 2, 2);
        this.head12.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.head12.setTextureSize(128, 32);
        this.head12.mirror = true;
        this.setRotation(this.head12, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 16, 16);
        this.body2.addBox(-4.0F, 5.0F, -2.0F, 7, 2, 4);
        this.body2.setRotationPoint(4.0F, -11.0F, 0.0F);
        this.body2.setTextureSize(128, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 0.0F, 0.0F, 0.0F);
        this.body2.mirror = false;
        this.body3 = new ModelRenderer(this, 16, 16);
        this.body3.addBox(-4.0F, 5.0F, -2.0F, 7, 2, 4);
        this.body3.setRotationPoint(-3.0F, -11.0F, 0.0F);
        this.body3.setTextureSize(128, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, 0.0F, 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 104, 6);
        this.body4.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body4.setRotationPoint(3.0F, 0.0F, 4.0F);
        this.body4.setTextureSize(128, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.0F, 0.0F, 0.0F);
        this.body4.mirror = false;
        this.body5 = new ModelRenderer(this, 104, 6);
        this.body5.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body5.setRotationPoint(10.0F, 0.0F, 4.0F);
        this.body5.setTextureSize(128, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 0.0F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 103, 6);
        this.body6.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body6.setRotationPoint(3.0F, -8.0F, 4.0F);
        this.body6.setTextureSize(128, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 0.0F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 104, 6);
        this.body7.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body7.setRotationPoint(10.0F, -8.0F, 4.0F);
        this.body7.setTextureSize(128, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 0.0F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 16, 20);
        this.body8.addBox(-4.0F, 4.0F, -2.0F, 7, 8, 4);
        this.body8.setRotationPoint(-3.0F, -8.0F, 0.0F);
        this.body8.setTextureSize(128, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 0.0F, 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 89, 13);
        this.body9.addBox(-3.0F, 4.0F, -3.0F, 5, 2, 1);
        this.body9.setRotationPoint(-3.0F, 6.0F, 5.0F);
        this.body9.setTextureSize(128, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, 0.0F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 16, 20);
        this.body10.addBox(-4.0F, 4.0F, -2.0F, 7, 8, 4);
        this.body10.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.body10.setTextureSize(128, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 0.0F, 0.0F, 0.0F);
        this.body10.mirror = false;
        this.body11 = new ModelRenderer(this, 16, 20);
        this.body11.addBox(-4.0F, 4.0F, -2.0F, 7, 8, 4);
        this.body11.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.body11.setTextureSize(128, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, 0.0F, 0.0F, 0.0F);
        this.body12 = new ModelRenderer(this, 104, 6);
        this.body12.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body12.setRotationPoint(4.0F, 0.0F, 4.0F);
        this.body12.setTextureSize(128, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 0.0F, 0.0F, 0.0F);
        this.body13 = new ModelRenderer(this, 104, 6);
        this.body13.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body13.setRotationPoint(4.0F, -8.0F, 4.0F);
        this.body13.setTextureSize(128, 32);
        this.body13.mirror = true;
        this.setRotation(this.body13, 0.0F, 0.0F, 0.0F);
        this.body14 = new ModelRenderer(this, 104, 6);
        this.body14.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body14.setRotationPoint(-3.0F, 0.0F, 4.0F);
        this.body14.setTextureSize(128, 32);
        this.body14.mirror = true;
        this.setRotation(this.body14, 0.0F, 0.0F, 0.0F);
        this.body15 = new ModelRenderer(this, 104, 6);
        this.body15.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body15.setRotationPoint(-3.0F, -8.0F, 4.0F);
        this.body15.setTextureSize(128, 32);
        this.body15.mirror = true;
        this.setRotation(this.body15, 0.0F, 0.0F, 0.0F);
        this.body16 = new ModelRenderer(this, 16, 20);
        this.body16.addBox(-4.0F, 4.0F, -2.0F, 7, 8, 4);
        this.body16.setRotationPoint(4.0F, -8.0F, 0.0F);
        this.body16.setTextureSize(128, 32);
        this.body16.mirror = true;
        this.setRotation(this.body16, 0.0F, 0.0F, 0.0F);
        this.body17 = new ModelRenderer(this, 89, 13);
        this.body17.addBox(-3.0F, 4.0F, -3.0F, 5, 2, 1);
        this.body17.setRotationPoint(4.0F, 6.0F, 5.0F);
        this.body17.setTextureSize(128, 32);
        this.body17.mirror = true;
        this.setRotation(this.body17, 0.0F, 0.0F, 0.0F);
        this.body17.mirror = false;
        this.body18 = new ModelRenderer(this, 57, 22);
        this.body18.addBox(-4.0F, 4.0F, -3.0F, 7, 2, 1);
        this.body18.setRotationPoint(4.0F, -10.0F, 5.0F);
        this.body18.setTextureSize(128, 32);
        this.body18.mirror = true;
        this.setRotation(this.body18, 0.0F, 0.0F, 0.0F);
        this.body19 = new ModelRenderer(this, 57, 22);
        this.body19.addBox(-4.0F, 4.0F, -3.0F, 7, 2, 1);
        this.body19.setRotationPoint(-3.0F, -10.0F, 5.0F);
        this.body19.setTextureSize(128, 32);
        this.body19.mirror = true;
        this.setRotation(this.body19, 0.0F, 0.0F, 0.0F);
        this.body20 = new ModelRenderer(this, 104, 6);
        this.body20.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body20.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.body20.setTextureSize(128, 32);
        this.body20.mirror = true;
        this.setRotation(this.body20, 0.0F, 0.0F, 0.0F);
        this.body21 = new ModelRenderer(this, 104, 6);
        this.body21.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body21.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.body21.setTextureSize(128, 32);
        this.body21.mirror = true;
        this.setRotation(this.body21, 0.0F, 0.0F, 0.0F);
        this.body22 = new ModelRenderer(this, 104, 6);
        this.body22.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body22.setRotationPoint(-3.0F, -8.0F, -1.0F);
        this.body22.setTextureSize(128, 32);
        this.body22.mirror = true;
        this.setRotation(this.body22, 0.0F, 0.0F, 0.0F);
        this.body23 = new ModelRenderer(this, 89, 13);
        this.body23.addBox(-3.0F, 4.0F, -3.0F, 5, 2, 1);
        this.body23.setRotationPoint(-3.0F, 6.0F, 0.0F);
        this.body23.setTextureSize(128, 32);
        this.body23.mirror = true;
        this.setRotation(this.body23, 0.0F, 0.0F, 0.0F);
        this.body24 = new ModelRenderer(this, 104, 6);
        this.body24.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body24.setRotationPoint(10.0F, 0.0F, -1.0F);
        this.body24.setTextureSize(128, 32);
        this.body24.mirror = true;
        this.setRotation(this.body24, 0.0F, 0.0F, 0.0F);
        this.body25 = new ModelRenderer(this, 89, 13);
        this.body25.addBox(-3.0F, 4.0F, -3.0F, 5, 2, 1);
        this.body25.setRotationPoint(4.0F, 6.0F, 0.0F);
        this.body25.setTextureSize(128, 32);
        this.body25.mirror = true;
        this.setRotation(this.body25, 0.0F, 0.0F, 0.0F);
        this.body26 = new ModelRenderer(this, 104, 6);
        this.body26.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body26.setRotationPoint(4.0F, 0.0F, -1.0F);
        this.body26.setTextureSize(128, 32);
        this.body26.mirror = true;
        this.setRotation(this.body26, 0.0F, 0.0F, 0.0F);
        this.body27 = new ModelRenderer(this, 104, 6);
        this.body27.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body27.setRotationPoint(10.0F, -8.0F, -1.0F);
        this.body27.setTextureSize(128, 32);
        this.body27.mirror = true;
        this.setRotation(this.body27, 0.0F, 0.0F, 0.0F);
        this.body28 = new ModelRenderer(this, 104, 6);
        this.body28.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body28.setRotationPoint(4.0F, -8.0F, -1.0F);
        this.body28.setTextureSize(128, 32);
        this.body28.mirror = true;
        this.setRotation(this.body28, 0.0F, 0.0F, 0.0F);
        this.body29 = new ModelRenderer(this, 104, 6);
        this.body29.addBox(-4.0F, 4.0F, -2.0F, 1, 8, 1);
        this.body29.setRotationPoint(3.0F, -8.0F, -1.0F);
        this.body29.setTextureSize(128, 32);
        this.body29.mirror = true;
        this.setRotation(this.body29, 0.0F, 0.0F, 0.0F);
        this.body30 = new ModelRenderer(this, 59, 22);
        this.body30.addBox(-4.0F, 4.0F, -3.0F, 7, 2, 1);
        this.body30.setRotationPoint(4.0F, -10.0F, 0.0F);
        this.body30.setTextureSize(128, 32);
        this.body30.mirror = true;
        this.setRotation(this.body30, 0.0F, 0.0F, 0.0F);
        this.body31 = new ModelRenderer(this, 59, 22);
        this.body31.addBox(-4.0F, 4.0F, -3.0F, 7, 2, 1);
        this.body31.setRotationPoint(-3.0F, -10.0F, 0.0F);
        this.body31.setTextureSize(128, 32);
        this.body31.mirror = true;
        this.setRotation(this.body31, 0.0F, 0.0F, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 82, 19);
        this.leftarm2.addBox(-3.0F, -4.0F, -4.0F, 9, 4, 8);
        this.leftarm2.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm2.setTextureSize(128, 32);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0F, 0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 82, 19);
        this.rightarm2.addBox(-6.0F, -4.0F, -4.0F, 9, 4, 8);
        this.rightarm2.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm2.setTextureSize(128, 32);
        this.rightarm2.mirror = true;
        this.setRotation(this.rightarm2, 0.0F, 0.0F, 0.0F);
        this.leftarm3 = new ModelRenderer(this, 82, 4);
        this.leftarm3.addBox(0.0F, -2.0F, 2.0F, 1, 12, 1);
        this.leftarm3.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm3.setTextureSize(128, 32);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, 0.0F, 0.0F, 0.0F);
        this.rightarm3 = new ModelRenderer(this, 82, 4);
        this.rightarm3.addBox(-3.0F, -2.0F, 2.0F, 1, 12, 1);
        this.rightarm3.setRotationPoint(-10.0F, -3.0F, 0.0F);
        this.rightarm3.setTextureSize(128, 32);
        this.rightarm3.mirror = true;
        this.setRotation(this.rightarm3, 0.0F, 0.0F, 0.0F);
        this.leftarm4 = new ModelRenderer(this, 82, 4);
        this.leftarm4.addBox(3.0F, -2.0F, -3.0F, 1, 12, 1);
        this.leftarm4.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm4.setTextureSize(128, 32);
        this.leftarm4.mirror = true;
        this.setRotation(this.leftarm4, 0.0F, 0.0F, 0.0F);
        this.rightarm4 = new ModelRenderer(this, 82, 4);
        this.rightarm4.addBox(-1.0F, -2.0F, -3.0F, 1, 12, 1);
        this.rightarm4.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm4.setTextureSize(128, 32);
        this.rightarm4.mirror = true;
        this.setRotation(this.rightarm4, 0.0F, 0.0F, 0.0F);
        this.rightarm5 = new ModelRenderer(this, 82, 4);
        this.rightarm5.addBox(-4.0F, -2.0F, -3.0F, 1, 12, 1);
        this.rightarm5.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm5.setTextureSize(128, 32);
        this.rightarm5.mirror = true;
        this.setRotation(this.rightarm5, 0.0F, 0.0F, 0.0F);
        this.leftarm5 = new ModelRenderer(this, 82, 4);
        this.leftarm5.addBox(0.0F, -2.0F, -3.0F, 1, 12, 1);
        this.leftarm5.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm5.setTextureSize(128, 32);
        this.leftarm5.mirror = true;
        this.setRotation(this.leftarm5, 0.0F, 0.0F, 0.0F);
        this.rightarm6 = new ModelRenderer(this, 40, 16);
        this.rightarm6.addBox(-4.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm6.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm6.setTextureSize(128, 32);
        this.rightarm6.mirror = true;
        this.setRotation(this.rightarm6, 0.0F, 0.0F, 0.0F);
        this.leftarm6 = new ModelRenderer(this, 118, 17);
        this.leftarm6.addBox(1.0F, 2.0F, -9.0F, 2, 13, 2);
        this.leftarm6.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm6.setTextureSize(128, 32);
        this.leftarm6.mirror = true;
        this.setRotation(this.leftarm6, 1.396263F, 0.0F, 0.0F);
        this.leftarm7 = new ModelRenderer(this, 82, 4);
        this.leftarm7.addBox(3.0F, -2.0F, 2.0F, 1, 12, 1);
        this.leftarm7.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm7.setTextureSize(128, 32);
        this.leftarm7.mirror = true;
        this.setRotation(this.leftarm7, 0.0F, 0.0F, 0.0F);
        this.rightarm7 = new ModelRenderer(this, 82, 4);
        this.rightarm7.addBox(0.0F, -2.0F, 2.0F, 1, 12, 1);
        this.rightarm7.setRotationPoint(-10.0F, -3.0F, 0.0F);
        this.rightarm7.setTextureSize(128, 32);
        this.rightarm7.mirror = true;
        this.setRotation(this.rightarm7, 0.0F, 0.0F, 0.0F);
        this.leftarm8 = new ModelRenderer(this, 82, 4);
        this.leftarm8.addBox(-1.0F, -2.0F, 1.0F, 1, 12, 1);
        this.leftarm8.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm8.setTextureSize(128, 32);
        this.leftarm8.mirror = true;
        this.setRotation(this.leftarm8, 0.0F, 0.0F, 0.0F);
        this.rightarm8 = new ModelRenderer(this, 82, 4);
        this.rightarm8.addBox(0.0F, -2.0F, 1.0F, 1, 12, 1);
        this.rightarm8.setRotationPoint(-14.0F, -3.0F, 0.0F);
        this.rightarm8.setTextureSize(128, 32);
        this.rightarm8.mirror = true;
        this.setRotation(this.rightarm8, 0.0F, 0.0F, 0.0F);
        this.rightarm9 = new ModelRenderer(this, 82, 4);
        this.rightarm9.addBox(0.0F, -2.0F, 1.0F, 1, 12, 1);
        this.rightarm9.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm9.setTextureSize(128, 32);
        this.rightarm9.mirror = true;
        this.setRotation(this.rightarm9, 0.0F, 0.0F, 0.0F);
        this.rightarm10 = new ModelRenderer(this, 82, 4);
        this.rightarm10.addBox(0.0F, -2.0F, -2.0F, 1, 12, 1);
        this.rightarm10.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.rightarm10.setTextureSize(128, 32);
        this.rightarm10.mirror = true;
        this.setRotation(this.rightarm10, 0.0F, 0.0F, 0.0F);
        this.leftarm9 = new ModelRenderer(this, 82, 4);
        this.leftarm9.addBox(4.0F, -2.0F, 1.0F, 1, 12, 1);
        this.leftarm9.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm9.setTextureSize(128, 32);
        this.leftarm9.mirror = true;
        this.setRotation(this.leftarm9, 0.0F, 0.0F, 0.0F);
        this.leftarm10 = new ModelRenderer(this, 82, 4);
        this.leftarm10.addBox(4.0F, -2.0F, -2.0F, 1, 12, 1);
        this.leftarm10.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm10.setTextureSize(128, 32);
        this.leftarm10.mirror = true;
        this.setRotation(this.leftarm10, 0.0F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 0, 16);
        this.leftleg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg2.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.leftleg2.setTextureSize(128, 32);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, 0.0F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 0, 16);
        this.rightleg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg2.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.rightleg2.setTextureSize(128, 32);
        this.rightleg2.mirror = true;
        this.setRotation(this.rightleg2, 0.0F, 0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 74, 3);
        this.leftleg3.addBox(-2.0F, 0.0F, -3.0F, 1, 12, 1);
        this.leftleg3.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.leftleg3.setTextureSize(128, 32);
        this.leftleg3.mirror = true;
        this.setRotation(this.leftleg3, 0.0F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 74, 3);
        this.rightleg3.addBox(-2.0F, 0.0F, 2.0F, 1, 12, 1);
        this.rightleg3.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.rightleg3.setTextureSize(128, 32);
        this.rightleg3.mirror = true;
        this.setRotation(this.rightleg3, 0.0F, 0.0F, 0.0F);
        this.leftleg4 = new ModelRenderer(this, 74, 3);
        this.leftleg4.addBox(1.0F, 0.0F, -3.0F, 1, 12, 1);
        this.leftleg4.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.leftleg4.setTextureSize(128, 32);
        this.leftleg4.mirror = true;
        this.setRotation(this.leftleg4, 0.0F, 0.0F, 0.0F);
        this.rightleg5 = new ModelRenderer(this, 74, 3);
        this.rightleg5.addBox(1.0F, 0.0F, -3.0F, 1, 12, 1);
        this.rightleg5.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.rightleg5.setTextureSize(128, 32);
        this.rightleg5.mirror = true;
        this.setRotation(this.rightleg5, 0.0F, 0.0F, 0.0F);
        this.rightleg6 = new ModelRenderer(this, 74, 3);
        this.rightleg6.addBox(-2.0F, 0.0F, -3.0F, 1, 12, 1);
        this.rightleg6.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.rightleg6.setTextureSize(128, 32);
        this.rightleg6.mirror = true;
        this.setRotation(this.rightleg6, 0.0F, 0.0F, 0.0F);
        this.leftarm11 = new ModelRenderer(this, 40, 16);
        this.leftarm11.addBox(0.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm11.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm11.setTextureSize(128, 32);
        this.leftarm11.mirror = true;
        this.setRotation(this.leftarm11, 0.0F, 0.0F, 0.0F);
        this.leftarm12 = new ModelRenderer(this, 110, 5);
        this.leftarm12.addBox(0.0F, -20.0F, -10.0F, 4, 4, 4);
        this.leftarm12.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm12.setTextureSize(128, 32);
        this.leftarm12.mirror = true;
        this.setRotation(this.leftarm12, 1.396263F, 0.0F, 0.0F);
        this.leftarm13 = new ModelRenderer(this, 118, 18);
        this.leftarm13.addBox(1.0F, -9.0F, -9.0F, 2, 13, 2);
        this.leftarm13.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm13.setTextureSize(128, 32);
        this.leftarm13.mirror = true;
        this.setRotation(this.leftarm13, 1.396263F, 0.0F, 0.0F);
        this.leftarm14 = new ModelRenderer(this, 118, 18);
        this.leftarm14.addBox(1.0F, -19.0F, -9.0F, 2, 10, 2);
        this.leftarm14.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.leftarm14.setTextureSize(128, 32);
        this.leftarm14.mirror = true;
        this.setRotation(this.leftarm14, 1.396263F, 0.0F, 0.0F);
        this.leftleg5 = new ModelRenderer(this, 74, 3);
        this.leftleg5.addBox(1.0F, 0.0F, 2.0F, 1, 12, 1);
        this.leftleg5.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.leftleg5.setTextureSize(128, 32);
        this.leftleg5.mirror = true;
        this.setRotation(this.leftleg5, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head1.render(var7);
        this.rightarm1.render(var7);
        this.leftarm1.render(var7);
        this.rightleg1.render(var7);
        this.leftleg6.render(var7);
        this.head2.render(var7);
        this.head3.render(var7);
        this.head4.render(var7);
        this.head5.render(var7);
        this.head6.render(var7);
        this.head7.render(var7);
        this.head8.render(var7);
        this.head9.render(var7);
        this.head10.render(var7);
        this.head11.render(var7);
        this.head12.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body5.render(var7);
        this.body6.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
        this.body9.render(var7);
        this.body10.render(var7);
        this.body11.render(var7);
        this.body12.render(var7);
        this.body13.render(var7);
        this.body14.render(var7);
        this.body15.render(var7);
        this.body16.render(var7);
        this.body17.render(var7);
        this.body18.render(var7);
        this.body19.render(var7);
        this.body20.render(var7);
        this.body21.render(var7);
        this.body22.render(var7);
        this.body23.render(var7);
        this.body24.render(var7);
        this.body25.render(var7);
        this.body26.render(var7);
        this.body27.render(var7);
        this.body28.render(var7);
        this.body29.render(var7);
        this.body30.render(var7);
        this.body31.render(var7);
        this.leftarm2.render(var7);
        this.rightarm2.render(var7);
        this.leftarm3.render(var7);
        this.rightarm3.render(var7);
        this.leftarm4.render(var7);
        this.rightarm4.render(var7);
        this.rightarm5.render(var7);
        this.leftarm5.render(var7);
        this.rightarm6.render(var7);
        this.leftarm6.render(var7);
        this.leftarm7.render(var7);
        this.rightarm7.render(var7);
        this.leftarm8.render(var7);
        this.rightarm8.render(var7);
        this.rightarm9.render(var7);
        this.rightarm10.render(var7);
        this.leftarm9.render(var7);
        this.leftarm10.render(var7);
        this.leftleg2.render(var7);
        this.rightleg2.render(var7);
        this.leftleg3.render(var7);
        this.rightleg3.render(var7);
        this.leftleg4.render(var7);
        this.rightleg5.render(var7);
        this.rightleg6.render(var7);
        this.leftarm11.render(var7);
        this.leftarm12.render(var7);
        this.leftarm13.render(var7);
        this.leftarm14.render(var7);
        this.leftleg5.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leftleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg6.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm6.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm7.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm8.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm9.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarm10.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm5.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm6.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 1.396263F;
        this.leftarm7.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm8.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm9.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm10.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm11.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarm12.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 1.396263F;
        this.leftarm13.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 1.396263F;
        this.leftarm14.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F + 1.396263F;
    }
}
