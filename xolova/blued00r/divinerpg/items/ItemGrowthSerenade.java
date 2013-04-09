package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockStem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.BonemealEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemGrowthSerenade extends Item
{
    public ItemGrowthSerenade(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var2.canPlayerEdit(var4, var5, var6, var7, var1))
        {
            return false;
        }
        else
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            BonemealEvent var13 = new BonemealEvent(var2, var3, var11, var4, var5, var6);

            if (MinecraftForge.EVENT_BUS.post(var13))
            {
                return false;
            }
            else if (var13.getResult() == Event.Result.ALLOW)
            {
                return true;
            }
            else if (var11 == Block.sapling.blockID)
            {
                if (!var3.isRemote)
                {
                    ((BlockSapling)Block.sapling).growTree(var3, var4, var5, var6, var3.rand);
                    --var1.stackSize;
                }

                return true;
            }
            else if (var11 != Block.mushroomBrown.blockID && var11 != Block.mushroomRed.blockID)
            {
                if (var11 != Block.melonStem.blockID && var11 != Block.pumpkinStem.blockID)
                {
                    if (var11 > 0 && Block.blocksList[var11] instanceof BlockCrops)
                    {
                        if (var3.getBlockMetadata(var4, var5, var6) == 7)
                        {
                            return false;
                        }
                        else
                        {
                            if (!var3.isRemote)
                            {
                                ((BlockCrops)Block.blocksList[var11]).fertilize(var3, var4, var5, var6);
                                --var1.stackSize;
                            }

                            return true;
                        }
                    }
                    else if (var11 == Block.cocoaPlant.blockID)
                    {
                        if (!var3.isRemote)
                        {
                            var3.setBlockMetadataWithNotify(var4, var5, var6, 8 | BlockDirectional.getDirection(var3.getBlockMetadata(var4, var5, var6)));
                            --var1.stackSize;
                        }

                        return true;
                    }
                    else if (var11 != Block.grass.blockID)
                    {
                        return false;
                    }
                    else
                    {
                        if (!var3.isRemote)
                        {
                            --var1.stackSize;
                            label92:

                            for (int var12 = 0; var12 < 128; ++var12)
                            {
                                int var14 = var4;
                                int var15 = var5 + 1;
                                int var16 = var6;

                                for (int var17 = 0; var17 < var12 / 16; ++var17)
                                {
                                    var14 += itemRand.nextInt(3) - 1;
                                    var15 += (itemRand.nextInt(3) - 1) * itemRand.nextInt(3) / 2;
                                    var16 += itemRand.nextInt(3) - 1;

                                    if (var3.getBlockId(var14, var15 - 1, var16) != Block.grass.blockID || var3.isBlockNormalCube(var14, var15, var16))
                                    {
                                        continue label92;
                                    }
                                }

                                if (var3.getBlockId(var14, var15, var16) == 0)
                                {
                                    if (itemRand.nextInt(10) != 0)
                                    {
                                        if (Block.tallGrass.canBlockStay(var3, var14, var15, var16))
                                        {
                                            var3.setBlockAndMetadataWithNotify(var14, var15, var16, Block.tallGrass.blockID, 1);
                                        }
                                    }
                                    else
                                    {
                                        ForgeHooks.plantGrass(var3, var14, var15, var16);
                                    }
                                }
                            }
                        }

                        return true;
                    }
                }
                else if (var3.getBlockMetadata(var4, var5, var6) == 7)
                {
                    return false;
                }
                else
                {
                    if (!var3.isRemote)
                    {
                        ((BlockStem)Block.blocksList[var11]).fertilizeStem(var3, var4, var5, var6);
                        --var1.stackSize;
                    }

                    return true;
                }
            }
            else
            {
                if (!var3.isRemote && ((BlockMushroom)Block.blocksList[var11]).fertilizeMushroom(var3, var4, var5, var6, var3.rand))
                {
                    --var1.stackSize;
                }

                return true;
            }
        }
    }

    public boolean hasEffect(ItemStack var1)
    {
        return true;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
