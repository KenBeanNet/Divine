package xolova.blued00r.divinerpg.client.models.entities.mobs.iceika;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHastreus extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer plate1;
    ModelRenderer plate2;
    ModelRenderer plate3;
    ModelRenderer plate4;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer head2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer connector1;
    ModelRenderer connector2;
    ModelRenderer connector3;
    ModelRenderer connector4;
    ModelRenderer horn5;
    ModelRenderer horn6;
    ModelRenderer horn7;
    ModelRenderer horn8;
    ModelRenderer leg4;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg1;
    ModelRenderer leg3cap;
    ModelRenderer leg1cap;
    ModelRenderer leg4cap;
    ModelRenderer leg2cap;
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
    ModelRenderer body31;
    ModelRenderer body23;
    ModelRenderer body24;
    ModelRenderer body25;
    ModelRenderer body26;
    ModelRenderer body27;
    ModelRenderer body28;
    ModelRenderer body29;
    ModelRenderer body30;

    public ModelHastreus()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head.setRotationPoint(7.0F, 4.0F, -8.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 18, 4);
        this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body.setRotationPoint(6.0F, 5.0F, 20.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.plate1 = new ModelRenderer(this, 28, 19);
        this.plate1.addBox(3.0F, -4.0F, -3.0F, 1, 5, 6);
        this.plate1.setRotationPoint(-17.0F, 12.0F, 24.0F);
        this.plate1.setTextureSize(64, 32);
        this.plate1.mirror = true;
        this.setRotation(this.plate1, 0.0F, 0.0F, 0.0F);
        this.plate2 = new ModelRenderer(this, 28, 19);
        this.plate2.addBox(-4.0F, -4.0F, -3.0F, 1, 5, 6);
        this.plate2.setRotationPoint(17.0F, 12.0F, 24.0F);
        this.plate2.setTextureSize(64, 32);
        this.plate2.mirror = true;
        this.setRotation(this.plate2, 0.0F, 0.0F, 0.0F);
        this.plate3 = new ModelRenderer(this, 28, 19);
        this.plate3.addBox(3.0F, -4.0F, -4.0F, 1, 5, 6);
        this.plate3.setRotationPoint(-17.0F, 12.0F, -5.0F);
        this.plate3.setTextureSize(64, 32);
        this.plate3.mirror = true;
        this.setRotation(this.plate3, 0.0F, 0.0F, 0.0F);
        this.plate4 = new ModelRenderer(this, 28, 19);
        this.plate4.addBox(-4.0F, -4.0F, -4.0F, 1, 5, 6);
        this.plate4.setRotationPoint(17.0F, 12.0F, -5.0F);
        this.plate4.setTextureSize(64, 32);
        this.plate4.mirror = true;
        this.setRotation(this.plate4, 0.0F, 0.0F, 0.0F);
        this.horn1 = new ModelRenderer(this, 22, 0);
        this.horn1.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn1.setRotationPoint(7.0F, 2.0F, -9.0F);
        this.horn1.setTextureSize(64, 32);
        this.horn1.mirror = true;
        this.setRotation(this.horn1, 0.0F, 0.0F, 0.0F);
        this.horn2 = new ModelRenderer(this, 22, 0);
        this.horn2.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn2.setRotationPoint(7.0F, 2.0F, -9.0F);
        this.horn2.setTextureSize(64, 32);
        this.horn2.mirror = true;
        this.setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 18, 4);
        this.body2.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body2.setRotationPoint(6.0F, 5.0F, 2.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 18, 4);
        this.body3.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body3.setRotationPoint(-6.0F, 5.0F, 20.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 30, 9);
        this.body4.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body4.setRotationPoint(-13.0F, 8.0F, 24.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, -2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
        this.head2.setRotationPoint(-7.0F, 4.0F, -8.0F);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, 0.0F, 0.0F);
        this.horn3 = new ModelRenderer(this, 22, 0);
        this.horn3.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn3.setRotationPoint(-7.0F, 2.0F, -9.0F);
        this.horn3.setTextureSize(64, 32);
        this.horn3.mirror = true;
        this.setRotation(this.horn3, 0.0F, 0.0F, 0.0F);
        this.horn4 = new ModelRenderer(this, 22, 0);
        this.horn4.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn4.setRotationPoint(-7.0F, 2.0F, -9.0F);
        this.horn4.setTextureSize(64, 32);
        this.horn4.mirror = true;
        this.setRotation(this.horn4, 0.0F, 0.0F, 0.0F);
        this.connector1 = new ModelRenderer(this, 28, 17);
        this.connector1.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4);
        this.connector1.setRotationPoint(12.0F, 9.0F, 22.0F);
        this.connector1.setTextureSize(64, 32);
        this.connector1.mirror = true;
        this.setRotation(this.connector1, 0.0F, 0.0F, 0.0F);
        this.connector2 = new ModelRenderer(this, 28, 17);
        this.connector2.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4);
        this.connector2.setRotationPoint(12.0F, 9.0F, -8.0F);
        this.connector2.setTextureSize(64, 32);
        this.connector2.mirror = true;
        this.setRotation(this.connector2, 0.0F, 0.0F, 0.0F);
        this.connector3 = new ModelRenderer(this, 28, 17);
        this.connector3.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4);
        this.connector3.setRotationPoint(-20.0F, 9.0F, 22.0F);
        this.connector3.setTextureSize(64, 32);
        this.connector3.mirror = true;
        this.setRotation(this.connector3, 0.0F, 0.0F, 0.0F);
        this.connector4 = new ModelRenderer(this, 28, 17);
        this.connector4.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4);
        this.connector4.setRotationPoint(-20.0F, 9.0F, -8.0F);
        this.connector4.setTextureSize(64, 32);
        this.connector4.mirror = true;
        this.setRotation(this.connector4, 0.0F, 0.0F, 0.0F);
        this.horn5 = new ModelRenderer(this, 22, 0);
        this.horn5.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn5.setRotationPoint(-7.0F, 2.0F, -7.0F);
        this.horn5.setTextureSize(64, 32);
        this.horn5.mirror = true;
        this.setRotation(this.horn5, 0.0F, 0.0F, 0.0F);
        this.horn6 = new ModelRenderer(this, 22, 0);
        this.horn6.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn6.setRotationPoint(-7.0F, 2.0F, -7.0F);
        this.horn6.setTextureSize(64, 32);
        this.horn6.mirror = true;
        this.setRotation(this.horn6, 0.0F, 0.0F, 0.0F);
        this.horn7 = new ModelRenderer(this, 22, 0);
        this.horn7.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn7.setRotationPoint(7.0F, 2.0F, -7.0F);
        this.horn7.setTextureSize(64, 32);
        this.horn7.mirror = true;
        this.setRotation(this.horn7, 0.0F, 0.0F, 0.0F);
        this.horn8 = new ModelRenderer(this, 22, 0);
        this.horn8.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
        this.horn8.setRotationPoint(7.0F, 2.0F, -7.0F);
        this.horn8.setTextureSize(64, 32);
        this.horn8.mirror = true;
        this.setRotation(this.horn8, 0.0F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
        this.leg4.setRotationPoint(17.0F, 12.0F, -5.0F);
        this.leg4.setTextureSize(64, 32);
        this.leg4.mirror = true;
        this.setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg2.setRotationPoint(17.0F, 12.0F, 24.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
        this.leg3.setRotationPoint(-17.0F, 12.0F, -5.0F);
        this.leg3.setTextureSize(64, 32);
        this.leg3.mirror = true;
        this.setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leg1.setRotationPoint(-17.0F, 12.0F, 24.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
        this.leg3cap = new ModelRenderer(this, 28, 19);
        this.leg3cap.addBox(-4.0F, -4.0F, -4.0F, 6, 5, 6);
        this.leg3cap.setRotationPoint(-17.0F, 12.0F, -5.0F);
        this.leg3cap.setTextureSize(64, 32);
        this.leg3cap.mirror = true;
        this.setRotation(this.leg3cap, 0.0F, 0.0F, 0.0F);
        this.leg1cap = new ModelRenderer(this, 28, 19);
        this.leg1cap.addBox(-4.0F, -4.0F, -3.0F, 6, 5, 6);
        this.leg1cap.setRotationPoint(-17.0F, 12.0F, 24.0F);
        this.leg1cap.setTextureSize(64, 32);
        this.leg1cap.mirror = true;
        this.setRotation(this.leg1cap, 0.0F, 0.0F, 0.0F);
        this.leg4cap = new ModelRenderer(this, 28, 19);
        this.leg4cap.addBox(-2.0F, -4.0F, -4.0F, 6, 5, 6);
        this.leg4cap.setRotationPoint(17.0F, 12.0F, -5.0F);
        this.leg4cap.setTextureSize(64, 32);
        this.leg4cap.mirror = true;
        this.setRotation(this.leg4cap, 0.0F, 0.0F, 0.0F);
        this.leg2cap = new ModelRenderer(this, 28, 19);
        this.leg2cap.addBox(-2.0F, -4.0F, -3.0F, 6, 5, 6);
        this.leg2cap.setRotationPoint(17.0F, 12.0F, 24.0F);
        this.leg2cap.setTextureSize(64, 32);
        this.leg2cap.mirror = true;
        this.setRotation(this.leg2cap, 0.0F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 18, 4);
        this.body5.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
        this.body5.setRotationPoint(-6.0F, 5.0F, 2.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 18, 4);
        this.body6.addBox(-13.0F, -10.0F, -2.0F, 4, 22, 6);
        this.body6.setRotationPoint(11.0F, -2.0F, 24.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, 2.530727F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 30, 9);
        this.body7.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body7.setRotationPoint(-13.0F, 8.0F, 13.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, -2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.body8 = new ModelRenderer(this, 18, 4);
        this.body8.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body8.setRotationPoint(-6.0F, -2.0F, 24.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, 2.530727F, 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 18, 4);
        this.body9.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body9.setRotationPoint(-6.0F, -2.0F, 2.0F);
        this.body9.setTextureSize(64, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, 2.530727F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 18, 4);
        this.body10.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body10.setRotationPoint(-6.0F, -2.0F, 13.0F);
        this.body10.setTextureSize(64, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 2.530727F, 0.0F, 0.0F);
        this.body11 = new ModelRenderer(this, 30, 9);
        this.body11.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body11.setRotationPoint(-13.0F, 8.0F, 2.0F);
        this.body11.setTextureSize(64, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, -2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.body12 = new ModelRenderer(this, 18, 4);
        this.body12.addBox(-13.0F, -10.0F, -2.0F, 4, 22, 6);
        this.body12.setRotationPoint(11.0F, -2.0F, 2.0F);
        this.body12.setTextureSize(64, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 2.530727F, 0.0F, 0.0F);
        this.body13 = new ModelRenderer(this, 18, 4);
        this.body13.addBox(-13.0F, -10.0F, -2.0F, 4, 22, 6);
        this.body13.setRotationPoint(11.0F, -2.0F, 13.0F);
        this.body13.setTextureSize(64, 32);
        this.body13.mirror = true;
        this.setRotation(this.body13, 2.530727F, 0.0F, 0.0F);
        this.body14 = new ModelRenderer(this, 18, 4);
        this.body14.addBox(-4.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body14.setRotationPoint(7.0F, -2.0F, 2.0F);
        this.body14.setTextureSize(64, 32);
        this.body14.mirror = true;
        this.setRotation(this.body14, 2.530727F, 0.0F, 0.0F);
        this.body15 = new ModelRenderer(this, 18, 4);
        this.body15.addBox(-4.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body15.setRotationPoint(7.0F, -2.0F, 13.0F);
        this.body15.setTextureSize(64, 32);
        this.body15.mirror = true;
        this.setRotation(this.body15, 2.530727F, 0.0F, 0.0F);
        this.body16 = new ModelRenderer(this, 18, 4);
        this.body16.addBox(-4.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body16.setRotationPoint(7.0F, -2.0F, 24.0F);
        this.body16.setTextureSize(64, 32);
        this.body16.mirror = true;
        this.setRotation(this.body16, 2.530727F, 0.0F, 0.0F);
        this.body17 = new ModelRenderer(this, 18, 4);
        this.body17.addBox(-13.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body17.setRotationPoint(7.0F, -2.0F, 2.0F);
        this.body17.setTextureSize(64, 32);
        this.body17.mirror = true;
        this.setRotation(this.body17, 2.530727F, 0.0F, 0.0F);
        this.body18 = new ModelRenderer(this, 18, 4);
        this.body18.addBox(-13.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body18.setRotationPoint(7.0F, -2.0F, 13.0F);
        this.body18.setTextureSize(64, 32);
        this.body18.mirror = true;
        this.setRotation(this.body18, 2.530727F, 0.0F, 0.0F);
        this.body19 = new ModelRenderer(this, 18, 4);
        this.body19.addBox(-13.0F, -10.0F, -2.0F, 3, 19, 6);
        this.body19.setRotationPoint(7.0F, -2.0F, 24.0F);
        this.body19.setTextureSize(64, 32);
        this.body19.mirror = true;
        this.setRotation(this.body19, 2.530727F, 0.0F, 0.0F);
        this.body20 = new ModelRenderer(this, 18, 4);
        this.body20.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body20.setRotationPoint(11.0F, -2.0F, 13.0F);
        this.body20.setTextureSize(64, 32);
        this.body20.mirror = true;
        this.setRotation(this.body20, 2.530727F, 0.0F, 0.0F);
        this.body21 = new ModelRenderer(this, 39, 10);
        this.body21.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body21.setRotationPoint(-12.0F, -3.0F, 20.0F);
        this.body21.setTextureSize(64, 32);
        this.body21.mirror = true;
        this.setRotation(this.body21, 2.530727F, ((float)Math.PI / 2F), 0.0F);
        this.body22 = new ModelRenderer(this, 18, 4);
        this.body22.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body22.setRotationPoint(11.0F, -2.0F, 24.0F);
        this.body22.setTextureSize(64, 32);
        this.body22.mirror = true;
        this.setRotation(this.body22, 2.530727F, 0.0F, 0.0F);
        this.body31 = new ModelRenderer(this, 30, 9);
        this.body31.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body31.setRotationPoint(13.0F, 8.0F, 13.0F);
        this.body31.setTextureSize(64, 32);
        this.body31.mirror = true;
        this.setRotation(this.body31, 2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.body23 = new ModelRenderer(this, 30, 9);
        this.body23.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body23.setRotationPoint(13.0F, 8.0F, 24.0F);
        this.body23.setTextureSize(64, 32);
        this.body23.mirror = true;
        this.setRotation(this.body23, 2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.body24 = new ModelRenderer(this, 30, 9);
        this.body24.addBox(-4.0F, -8.0F, 0.0F, 2, 15, 6);
        this.body24.setRotationPoint(13.0F, 8.0F, 2.0F);
        this.body24.setTextureSize(64, 32);
        this.body24.mirror = true;
        this.setRotation(this.body24, 2.530727F, 0.0F, ((float)Math.PI / 2F));
        this.body25 = new ModelRenderer(this, 18, 4);
        this.body25.addBox(-4.0F, -10.0F, -2.0F, 3, 15, 6);
        this.body25.setRotationPoint(11.0F, -2.0F, 2.0F);
        this.body25.setTextureSize(64, 32);
        this.body25.mirror = true;
        this.setRotation(this.body25, 2.530727F, 0.0F, 0.0F);
        this.body26 = new ModelRenderer(this, 39, 10);
        this.body26.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body26.setRotationPoint(-12.0F, -3.0F, -2.0F);
        this.body26.setTextureSize(64, 32);
        this.body26.mirror = true;
        this.setRotation(this.body26, 2.530727F, ((float)Math.PI / 2F), 0.0F);
        this.body27 = new ModelRenderer(this, 39, 10);
        this.body27.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body27.setRotationPoint(-12.0F, -3.0F, 9.0F);
        this.body27.setTextureSize(64, 32);
        this.body27.mirror = true;
        this.setRotation(this.body27, 2.530727F, ((float)Math.PI / 2F), 0.0F);
        this.body28 = new ModelRenderer(this, 39, 10);
        this.body28.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body28.setRotationPoint(12.0F, -3.0F, 5.0F);
        this.body28.setTextureSize(64, 32);
        this.body28.mirror = true;
        this.setRotation(this.body28, 2.530727F, -((float)Math.PI / 2F), 0.0F);
        this.body29 = new ModelRenderer(this, 39, 10);
        this.body29.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body29.setRotationPoint(12.0F, -3.0F, 16.0F);
        this.body29.setTextureSize(64, 32);
        this.body29.mirror = true;
        this.setRotation(this.body29, 2.530727F, -((float)Math.PI / 2F), 0.0F);
        this.body30 = new ModelRenderer(this, 39, 10);
        this.body30.addBox(-4.0F, -9.0F, -2.0F, 1, 13, 2);
        this.body30.setRotationPoint(12.0F, -3.0F, 27.0F);
        this.body30.setTextureSize(64, 32);
        this.body30.mirror = true;
        this.setRotation(this.body30, 2.530727F, -((float)Math.PI / 2F), 0.0F);
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
        this.plate1.render(var7);
        this.plate2.render(var7);
        this.plate3.render(var7);
        this.plate4.render(var7);
        this.horn1.render(var7);
        this.horn2.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.head2.render(var7);
        this.horn3.render(var7);
        this.horn4.render(var7);
        this.connector1.render(var7);
        this.connector2.render(var7);
        this.connector3.render(var7);
        this.connector4.render(var7);
        this.horn5.render(var7);
        this.horn6.render(var7);
        this.horn7.render(var7);
        this.horn8.render(var7);
        this.leg4.render(var7);
        this.leg2.render(var7);
        this.leg3.render(var7);
        this.leg1.render(var7);
        this.leg3cap.render(var7);
        this.leg1cap.render(var7);
        this.leg4cap.render(var7);
        this.leg2cap.render(var7);
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
        this.body31.render(var7);
        this.body23.render(var7);
        this.body24.render(var7);
        this.body25.render(var7);
        this.body26.render(var7);
        this.body27.render(var7);
        this.body28.render(var7);
        this.body29.render(var7);
        this.body30.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.leg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg1cap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leg2cap.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg3cap.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leg4cap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    }
}
