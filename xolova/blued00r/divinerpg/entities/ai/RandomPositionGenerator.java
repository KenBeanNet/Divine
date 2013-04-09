package xolova.blued00r.divinerpg.entities.ai;

import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import xolova.blued00r.divinerpg.entities.mobs.EntityAmbientCreature;

public class RandomPositionGenerator
{
    private static Vec3 staticVector = Vec3.createVectorHelper(0.0D, 0.0D, 0.0D);

    public static Vec3 findRandomTarget(EntityAmbientCreature var0, int var1, int var2)
    {
        return findRandomTargetBlock(var0, var1, var2, (Vec3)null);
    }

    public static Vec3 findRandomTargetBlockTowards(EntityAmbientCreature var0, int var1, int var2, Vec3 var3)
    {
        staticVector.xCoord = var3.xCoord - var0.posX;
        staticVector.yCoord = var3.yCoord - var0.posY;
        staticVector.zCoord = var3.zCoord - var0.posZ;
        return findRandomTargetBlock(var0, var1, var2, staticVector);
    }

    public static Vec3 findRandomTargetBlockAwayFrom(EntityAmbientCreature var0, int var1, int var2, Vec3 var3)
    {
        staticVector.xCoord = var0.posX - var3.xCoord;
        staticVector.yCoord = var0.posY - var3.yCoord;
        staticVector.zCoord = var0.posZ - var3.zCoord;
        return findRandomTargetBlock(var0, var1, var2, staticVector);
    }

    private static Vec3 findRandomTargetBlock(EntityAmbientCreature var0, int var1, int var2, Vec3 var3)
    {
        Random var4 = var0.getRNG();
        boolean var5 = false;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var9 = -99999.0F;
        boolean var10;

        if (var0.hasHome())
        {
            double var11 = (double)(var0.getHomePosition().getDistanceSquared(MathHelper.floor_double(var0.posX), MathHelper.floor_double(var0.posY), MathHelper.floor_double(var0.posZ)) + 4.0F);
            double var13 = (double)(var0.getMaximumHomeDistance() + (float)var1);
            var10 = var11 < var13 * var13;
        }
        else
        {
            var10 = false;
        }

        for (int var16 = 0; var16 < 10; ++var16)
        {
            int var12 = var4.nextInt(2 * var1) - var1;
            int var17 = var4.nextInt(2 * var2) - var2;
            int var14 = var4.nextInt(2 * var1) - var1;

            if (var3 == null || (double)var12 * var3.xCoord + (double)var14 * var3.zCoord >= 0.0D)
            {
                var12 += MathHelper.floor_double(var0.posX);
                var17 += MathHelper.floor_double(var0.posY);
                var14 += MathHelper.floor_double(var0.posZ);

                if (!var10 || var0.isWithinHomeDistance(var12, var17, var14))
                {
                    float var15 = var0.getBlockPathWeight(var12, var17, var14);

                    if (var15 > var9)
                    {
                        var9 = var15;
                        var6 = var12;
                        var7 = var17;
                        var8 = var14;
                        var5 = true;
                    }
                }
            }
        }

        if (var5)
        {
            return var0.worldObj.getWorldVec3Pool().getVecFromPool((double)var6, (double)var7, (double)var8);
        }
        else
        {
            return null;
        }
    }
}
