package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityKaros;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityLadyLuna;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityQuadro;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityRaglok;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityWreck;

public class ItemDreamflint extends Item
{
    public ItemDreamflint(int var1)
    {
        super(var1);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var3.isRemote)
        {
            if (var7 != 1)
            {
                return false;
            }
            else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
            {
                int var11 = var3.getBlockId(var4, var5, var6);

                if (var11 == DivineRPG.wreckAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    var3.playSoundAtEntity(var2, "xolovon.WreckSpawn", 1.0F, 1.0F);
                    EntityWreck var16 = new EntityWreck(var3);
                    var16.setLocationAndAngles((double)var4, (double)((float)var5 + 1.0F), (double)var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(var16);
                    return true;
                }
                else if (var11 == DivineRPG.raglokAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    var3.playSoundAtEntity(var2, "xolovon.RaglokSpawn", 1.0F, 1.0F);
                    EntityRaglok var15 = new EntityRaglok(var3);
                    var15.setLocationAndAngles((double)var4, (double)((float)var5 + 1.0F), (double)var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(var15);
                    return true;
                }
                else if (var11 == DivineRPG.karosAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    var3.playSoundAtEntity(var2, "xolovon.KarosSpawn", 1.0F, 1.0F);
                    EntityKaros var14 = new EntityKaros(var3, var4 - 27, var5 - 2, var6 - 9);
                    var14.setLocationAndAngles((double)var4, (double)((float)var5 + 1.0F), (double)var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(var14);
                    return true;
                }
                else if (var11 == DivineRPG.quadroticAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    var3.playSoundAtEntity(var2, "xolovon.QuadroSpawn", 1.0F, 1.0F);
                    EntityQuadro var13 = new EntityQuadro(var3);
                    var13.setLocationAndAngles((double)var4, (double)((float)var5 + 1.0F), (double)var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(var13);
                    return true;
                }
                else if (var11 == DivineRPG.lunicAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    var3.playSoundAtEntity(var2, "xolovon.lunicSpawn", 1.0F, 1.0F);
                    EntityLadyLuna var12 = new EntityLadyLuna(var3);
                    var12.setLocationAndAngles((double)var4, (double)((float)var5 + 1.0F), (double)var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(var12);
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
