package xolova.blued00r.divinerpg.items;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemTarBucket extends ItemBucket
{
    private int isFull;

    public ItemTarBucket(int var1, int var2)
    {
        super(var1, var2);
        this.isFull = var2;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        float var4 = 1.0F;
        double var5 = var3.prevPosX + (var3.posX - var3.prevPosX) * (double)var4;
        double var7 = var3.prevPosY + (var3.posY - var3.prevPosY) * (double)var4 + 1.62D - (double)var3.yOffset;
        double var9 = var3.prevPosZ + (var3.posZ - var3.prevPosZ) * (double)var4;
        boolean var11 = this.isFull == 0;
        MovingObjectPosition var12 = this.getMovingObjectPositionFromPlayer(var2, var3, var11);

        if (var12 == null)
        {
            return var1;
        }
        else
        {
            FillBucketEvent var13 = new FillBucketEvent(var3, var1, var2, var12);

            if (MinecraftForge.EVENT_BUS.post(var13))
            {
                return var1;
            }
            else if (var13.getResult() == Event.Result.ALLOW)
            {
                if (var3.capabilities.isCreativeMode)
                {
                    return var1;
                }
                else if (--var1.stackSize <= 0)
                {
                    return var13.result;
                }
                else
                {
                    if (!var3.inventory.addItemStackToInventory(var13.result))
                    {
                        var3.dropPlayerItem(var13.result);
                    }

                    return var1;
                }
            }
            else
            {
                if (var12.typeOfHit == EnumMovingObjectType.TILE)
                {
                    int var14 = var12.blockX;
                    int var15 = var12.blockY;
                    int var16 = var12.blockZ;

                    if (!var2.canMineBlock(var3, var14, var15, var16))
                    {
                        return var1;
                    }

                    if (this.isFull == 0)
                    {
                        if (!var3.canPlayerEdit(var14, var15, var16, var12.sideHit, var1))
                        {
                            return var1;
                        }

                        if (var2.getBlockMaterial(var14, var15, var16) == Material.water && var2.getBlockMetadata(var14, var15, var16) == 0)
                        {
                            var2.setBlockWithNotify(var14, var15, var16, 0);

                            if (var3.capabilities.isCreativeMode)
                            {
                                return var1;
                            }

                            if (--var1.stackSize <= 0)
                            {
                                return new ItemStack(Item.bucketWater);
                            }

                            if (!var3.inventory.addItemStackToInventory(new ItemStack(Item.bucketWater)))
                            {
                                var3.dropPlayerItem(new ItemStack(Item.bucketWater.itemID, 1, 0));
                            }

                            return var1;
                        }

                        if (var2.getBlockMaterial(var14, var15, var16) == Material.lava && var2.getBlockMetadata(var14, var15, var16) == 0 && var2.getBlockId(var14, var15, var16) == DivineRPG.tarStill.blockID)
                        {
                            var2.setBlockWithNotify(var14, var15, var16, 0);

                            if (var3.capabilities.isCreativeMode)
                            {
                                return var1;
                            }

                            if (--var1.stackSize <= 0)
                            {
                                return new ItemStack(DivineRPG.tarBucket);
                            }

                            if (!var3.inventory.addItemStackToInventory(new ItemStack(DivineRPG.tarBucket)))
                            {
                                var3.dropPlayerItem(new ItemStack(DivineRPG.tarBucket.itemID, 1, 0));
                            }

                            return var1;
                        }
                    }
                    else
                    {
                        if (this.isFull < 0)
                        {
                            return new ItemStack(DivineRPG.arcaniumBucket);
                        }

                        if (var12.sideHit == 0)
                        {
                            --var15;
                        }

                        if (var12.sideHit == 1)
                        {
                            ++var15;
                        }

                        if (var12.sideHit == 2)
                        {
                            --var16;
                        }

                        if (var12.sideHit == 3)
                        {
                            ++var16;
                        }

                        if (var12.sideHit == 4)
                        {
                            --var14;
                        }

                        if (var12.sideHit == 5)
                        {
                            ++var14;
                        }

                        if (!var3.canPlayerEdit(var14, var15, var16, var12.sideHit, var1))
                        {
                            return var1;
                        }

                        if (this.tryPlaceContainedLiquid(var2, var5, var7, var9, var14, var15, var16) && !var3.capabilities.isCreativeMode)
                        {
                            return new ItemStack(DivineRPG.arcaniumBucket);
                        }
                    }
                }

                return var1;
            }
        }
    }
}
