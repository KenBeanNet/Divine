package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntitySeimer;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemSeimerSpawner extends Item
{
    private World worldObj;

    public ItemSeimerSpawner(int var1)
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
        if (var3.isRemote)
        {
            return true;
        }
        else
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            var4 += Facing.offsetsXForSide[var7];
            var5 += Facing.offsetsYForSide[var7];
            var6 += Facing.offsetsZForSide[var7];
            double var12 = 0.0D;

            if (var7 == 1 && Block.blocksList[var11] != null && Block.blocksList[var11].getRenderType() == 11)
            {
                var12 = 0.5D;
            }

            if (spawnCreature(var3, var1.getItemDamage(), (double)var4 + 0.5D, (double)var5 + var12, (double)var6 + 0.5D, var2) != null && !var2.capabilities.isCreativeMode && ArcanaList.get(var2.username).arcanaUse(200))
            {
                var2.addStat(AchievementPageDivineRPG.littleCreature, 1);
                --var1.stackSize;
            }

            return true;
        }
    }

    public static Entity spawnCreature(World var0, int var1, double var2, double var4, double var6, EntityPlayer var8)
    {
        EntitySeimer var9 = new EntitySeimer(var0);
        var9.setLocationAndAngles(var2, var4, var6, MathHelper.wrapAngleTo180_float(var0.rand.nextFloat() * 360.0F), 0.0F);
        var9.rotationYawHead = var9.rotationYaw;
        var9.renderYawOffset = var9.rotationYaw;
        var9.initCreature();
        var0.spawnEntityInWorld(var9);
        var9.playLivingSound();
        return var9;
    }
}
