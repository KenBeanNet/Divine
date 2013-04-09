package xolova.blued00r.divinerpg.teleporter;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import xolova.blued00r.divinerpg.DivineRPG;

public class TeleporterMythril extends Teleporter
{
    protected WorldServer myWorld;

    public TeleporterMythril(WorldServer var1)
    {
        super(var1);
        this.myWorld = var1;
    }

    /**
     * Place an entity in a nearby portal which already exists.
     */
    public boolean placeInExistingPortal(Entity var1, double var2, double var4, double var6, float var8)
    {
        short var9 = 200;
        double var10 = -1.0D;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = MathHelper.floor_double(var1.posX);
        int var16 = MathHelper.floor_double(var1.posZ);
        double var17;

        for (int var19 = var15 - var9; var19 <= var15 + var9; ++var19)
        {
            double var20 = (double)var19 + 0.5D - var1.posX;

            for (int var22 = var16 - var9; var22 <= var16 + var9; ++var22)
            {
                double var23 = (double)var22 + 0.5D - var1.posZ;

                for (int var25 = 127; var25 >= 0; --var25)
                {
                    if (this.isBlockPortal(this.myWorld, var19, var25, var22))
                    {
                        while (this.isBlockPortal(this.myWorld, var19, var25 - 1, var22))
                        {
                            --var25;
                        }

                        var17 = (double)var25 + 0.5D - var1.posY;
                        double var26 = var20 * var20 + var17 * var17 + var23 * var23;

                        if (var10 < 0.0D || var26 < var10)
                        {
                            var10 = var26;
                            var12 = var19;
                            var13 = var25;
                            var14 = var22;
                        }
                    }
                }
            }
        }

        if (var10 >= 0.0D)
        {
            double var28 = (double)var12 + 0.5D;
            double var21 = (double)var13 + 0.5D;
            var17 = (double)var14 + 0.5D;

            if (this.isBlockPortal(this.myWorld, var12 - 1, var13, var14))
            {
                var28 -= 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12 + 1, var13, var14))
            {
                var28 += 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12, var13, var14 - 1))
            {
                var17 -= 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12, var13, var14 + 1))
            {
                var17 += 0.5D;
            }

            var1.setLocationAndAngles(var28, var21 + 1.0D, var17 + 1.0D, var1.rotationYaw, 0.0F);
            var1.motionX = var1.motionY = var1.motionZ = 0.0D;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isBlockPortal(World var1, int var2, int var3, int var4)
    {
        return var1.getBlockId(var2, var3, var4) == DivineRPG.mythrilPortal.blockID;
    }

    public boolean func_85188_a(Entity var1)
    {
        double var2 = this.myWorld.provider.dimensionId == 0 ? 2.0D : 0.5D;
        byte var4 = 16;
        double var5 = -1.0D;
        int var7 = MathHelper.floor_double(var1.posX);
        int var8 = MathHelper.floor_double(var1.posY * var2);
        int var9 = MathHelper.floor_double(var1.posZ);
        int var10 = var7;
        int var11 = var8;
        int var12 = var9;
        int var13 = 0;
        int var14 = this.myWorld.rand.nextInt(4);
        int var15;
        double var16;
        double var18;
        int var21;
        int var20;
        int var23;
        int var22;
        int var25;
        int var24;
        int var27;
        int var26;
        int var29;
        int var28;
        double var30;
        int var34;
        double var32;

        for (var15 = var7 - var4; var15 <= var7 + var4; ++var15)
        {
            var16 = (double)var15 + 0.5D - var1.posX;

            for (var20 = var9 - var4; var20 <= var9 + var4; ++var20)
            {
                var18 = (double)var20 + 0.5D - var1.posZ;
                label176:

                for (var21 = 127; var21 >= 0; --var21)
                {
                    if (this.myWorld.isAirBlock(var15, var21, var20))
                    {
                        while (var21 > 0 && this.myWorld.isAirBlock(var15, var21 - 1, var20))
                        {
                            --var21;
                        }

                        for (var23 = var14; var23 < var14 + 4; ++var23)
                        {
                            var22 = var23 % 2;
                            var25 = 1 - var22;

                            if (var23 % 4 >= 2)
                            {
                                var22 = -var22;
                                var25 = -var25;
                            }

                            for (var24 = 0; var24 < 3; ++var24)
                            {
                                for (var27 = 0; var27 < 4; ++var27)
                                {
                                    for (var26 = -1; var26 < 4; ++var26)
                                    {
                                        var29 = var15 + (var27 - 1) * var22 + var24 * var25;
                                        var28 = var21 + var26;
                                        var34 = var20 + (var27 - 1) * var25 - var24 * var22;

                                        if (var26 < 0 && !this.myWorld.getBlockMaterial(var29, var28, var34).isSolid() || var26 >= 0 && !this.myWorld.isAirBlock(var29, var28, var34))
                                        {
                                            continue label176;
                                        }
                                    }
                                }
                            }

                            var30 = (double)var21 + 0.5D - var1.posY * var2;
                            var32 = var16 * var16 + var30 * var30 + var18 * var18;

                            if (var5 < 0.0D || var32 < var5)
                            {
                                var5 = var32;
                                var10 = var15;
                                var11 = var21;
                                var12 = var20;
                                var13 = var23 % 4;
                            }
                        }
                    }
                }
            }
        }

        if (var5 < 0.0D)
        {
            for (var15 = var7 - var4; var15 <= var7 + var4; ++var15)
            {
                var16 = (double)var15 + 0.5D - var1.posX;

                for (var20 = var9 - var4; var20 <= var9 + var4; ++var20)
                {
                    var18 = (double)var20 + 0.5D - var1.posZ;
                    label124:

                    for (var21 = 127; var21 >= 0; --var21)
                    {
                        if (this.myWorld.isAirBlock(var15, var21, var20))
                        {
                            while (var21 > 0 && this.myWorld.isAirBlock(var15, var21 - 1, var20))
                            {
                                --var21;
                            }

                            for (var23 = var14; var23 < var14 + 2; ++var23)
                            {
                                var22 = var23 % 2;
                                var25 = 1 - var22;

                                for (var24 = 0; var24 < 4; ++var24)
                                {
                                    for (var27 = -1; var27 < 4; ++var27)
                                    {
                                        var26 = var15 + (var24 - 1) * var22;
                                        var29 = var21 + var27;
                                        var28 = var20 + (var24 - 1) * var25;

                                        if (var27 < 0 && !this.myWorld.getBlockMaterial(var26, var29, var28).isSolid() || var27 >= 0 && !this.myWorld.isAirBlock(var26, var29, var28))
                                        {
                                            continue label124;
                                        }
                                    }
                                }

                                var30 = (double)var21 + 0.5D - var1.posY * var2;
                                var32 = var16 * var16 + var30 * var30 + var18 * var18;

                                if (var5 < 0.0D || var32 < var5)
                                {
                                    var5 = var32;
                                    var10 = var15;
                                    var11 = var21;
                                    var12 = var20;
                                    var13 = var23 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }

        var34 = var13 % 2;
        int var35 = 1 - var34;

        if (var13 % 4 >= 2)
        {
            var34 = -var34;
            var35 = -var35;
        }

        this.makePortalAt(this.myWorld, var10, var11, var12);
        return true;
    }

    private void makePortalAt(World var1, int var2, int var3, int var4)
    {
        if (var3 < 30)
        {
            var3 = 30;
        }

        var1.getClass();

        if (var3 > 118)
        {
            var1.getClass();
            var3 = 118;
        }

        --var3;
        var1.editingBlocks = true;
        var1.setBlock(var2 + 0, var3 + 0, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 1, var3 + 0, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 2, var3 + 0, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 - 1, var3 + 0, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 0, var3 + 0, var4 + 2, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 1, var3 + 0, var4 + 2, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 0, var3 + 0, var4 + 0, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 1, var3 + 0, var4 + 0, DivineRPG.energyBlock.blockID);

        for (int var5 = -1; var5 <= 2; ++var5)
        {
            for (int var6 = -1; var6 <= 2; ++var6)
            {
                for (int var7 = 1; var7 <= 5; ++var7)
                {
                    var1.setBlock(var2 + var5, var3 + var7, var4 + var6, 0);
                }
            }
        }

        var1.setBlock(var2 + 0, var3 + 1, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 + 1, var3 + 1, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 + 0, var3 + 2, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 + 1, var3 + 2, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 + 0, var3 + 3, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 + 1, var3 + 3, var4 + 1, DivineRPG.mythrilPortal.blockID);
        var1.setBlock(var2 - 1, var3 + 1, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 2, var3 + 1, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 - 1, var3 + 2, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 2, var3 + 2, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 - 1, var3 + 3, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 2, var3 + 3, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 0, var3 + 4, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 1, var3 + 4, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 + 2, var3 + 4, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.setBlock(var2 - 1, var3 + 4, var4 + 1, DivineRPG.energyBlock.blockID);
        var1.editingBlocks = false;
    }
}
