package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityMeihurr;

public class ItemMeihurrSpawner extends Item
{
    public ItemMeihurrSpawner(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTransport);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        float var4 = 1.0F;
        float var5 = var3.prevRotationPitch + (var3.rotationPitch - var3.prevRotationPitch) * var4;
        float var6 = var3.prevRotationYaw + (var3.rotationYaw - var3.prevRotationYaw) * var4;
        double var7 = var3.prevPosX + (var3.posX - var3.prevPosX) * (double)var4;
        double var9 = var3.prevPosY + (var3.posY - var3.prevPosY) * (double)var4 + 1.62D - (double)var3.yOffset;
        double var11 = var3.prevPosZ + (var3.posZ - var3.prevPosZ) * (double)var4;
        Vec3 var13 = var2.getWorldVec3Pool().getVecFromPool(var7, var9, var11);
        float var14 = MathHelper.cos(-var6 * 0.017453292F - (float)Math.PI);
        float var15 = MathHelper.sin(-var6 * 0.017453292F - (float)Math.PI);
        float var16 = -MathHelper.cos(-var5 * 0.017453292F);
        float var17 = MathHelper.sin(-var5 * 0.017453292F);
        float var18 = var15 * var16;
        float var19 = var14 * var16;
        double var20 = 5.0D;
        Vec3 var22 = var13.addVector((double)var18 * var20, (double)var17 * var20, (double)var19 * var20);
        MovingObjectPosition var23 = var2.rayTraceBlocks_do(var13, var22, true);

        if (var23 == null)
        {
            return var1;
        }
        else
        {
            Vec3 var24 = var3.getLook(var4);
            boolean var25 = false;
            float var26 = 1.0F;
            List var27 = var2.getEntitiesWithinAABBExcludingEntity(var3, var3.boundingBox.addCoord(var24.xCoord * var20, var24.yCoord * var20, var24.zCoord * var20).expand((double)var26, (double)var26, (double)var26));
            int var28;

            for (var28 = 0; var28 < var27.size(); ++var28)
            {
                Entity var29 = (Entity)var27.get(var28);

                if (var29.canBeCollidedWith())
                {
                    float var30 = var29.getCollisionBorderSize();
                    AxisAlignedBB var31 = var29.boundingBox.expand((double)var30, (double)var30, (double)var30);

                    if (var31.isVecInside(var13))
                    {
                        var25 = true;
                    }
                }
            }

            if (var25)
            {
                return var1;
            }
            else
            {
                if (var23.typeOfHit == EnumMovingObjectType.TILE)
                {
                    var28 = var23.blockX;
                    int var34 = var23.blockY;
                    int var32 = var23.blockZ;

                    if (var2.getBlockId(var28, var34, var32) == Block.snow.blockID)
                    {
                        --var34;
                    }

                    EntityMeihurr var33 = new EntityMeihurr(var2, (double)((float)var28 + 0.5F), (double)((float)var34 + 1.0F), (double)((float)var32 + 0.5F));
                    var33.rotationYaw = (float)(((MathHelper.floor_double((double)(var3.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);

                    if (!var2.getCollidingBoundingBoxes(var33, var33.boundingBox.expand(-0.1D, -0.1D, -0.1D)).isEmpty())
                    {
                        return var1;
                    }

                    if (!var2.isRemote)
                    {
                        var2.spawnEntityInWorld(var33);
                    }

                    if (!var3.capabilities.isCreativeMode)
                    {
                        --var1.stackSize;
                    }
                }

                return var1;
            }
        }
    }
}
