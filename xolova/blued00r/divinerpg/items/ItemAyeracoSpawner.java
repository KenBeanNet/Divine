package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAyeracoBlue;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAyeracoGreen;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAyeracoPurple;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAyeracoRed;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAyeracoYellow;

public class ItemAyeracoSpawner extends Item
{
    private World worldObj;
    private int spawnTick;

    public ItemAyeracoSpawner(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.spawnTick = 600;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.bow;
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

            if (var7 == 1 && var11 == Block.fence.blockID || var11 == Block.netherFence.blockID)
            {
                var12 = 0.5D;
            }

            if (var3.provider.dimensionId == 1)
            {
                if (this.spawnTick == 600)
                {
                    var3.playSoundAtEntity(var2, "mob.RPG.AyeracoSpawn", 20.0F, 1.0F);
                    var2.sendChatToPlayer("The Green Ayeraco had been called upon!");
                }
                else if (this.spawnTick == 430)
                {
                    var2.sendChatToPlayer("The Blue Ayeraco had been called upon!");
                }
                else if (this.spawnTick == 280)
                {
                    var2.sendChatToPlayer("The Red Ayeraco had been called upon!");
                }
                else if (this.spawnTick == 210)
                {
                    var2.sendChatToPlayer("The Yellow Ayeraco had been called upon!");
                }
                else if (this.spawnTick == 145)
                {
                    var2.sendChatToPlayer("The Purple Ayeraco had been called upon!");
                }
                else if (this.spawnTick == 0 && this.spawnCreature(var3, var2, (double)var4, (double)var5, (double)var6))
                {
                    var2.sendChatToPlayer("The Ayeraco Horde has arrived!");
                    var2.inventory.consumeInventoryItem(this.itemID);
                    return true;
                }

                this.spawnTick -= 5;
            }
            else
            {
                var2.sendChatToPlayer("The Ayeraco Horde can only be spawned in the End");
            }

            return false;
        }
    }

    public boolean spawnCreature(World var1, EntityPlayer var2, double var3, double var5, double var7)
    {
        EntityAyeracoBlue var9 = new EntityAyeracoBlue(var1);
        EntityAyeracoGreen var10 = new EntityAyeracoGreen(var1);
        EntityAyeracoRed var11 = new EntityAyeracoRed(var1);
        EntityAyeracoYellow var12 = new EntityAyeracoYellow(var1);
        EntityAyeracoPurple var13 = new EntityAyeracoPurple(var1);
        var9.setLocationAndAngles(var3 + 15.0D, var5 + 4.0D, var7, var1.rand.nextFloat() * 360.0F, 0.0F);
        var10.setLocationAndAngles(var3 + 8.0D, var5 + 4.0D, var7 + 8.0D, var1.rand.nextFloat() * 360.0F, 0.0F);
        var11.setLocationAndAngles(var3 + 5.0D, var5 + 4.0D, var7 - 12.0D, var1.rand.nextFloat() * 360.0F, 0.0F);
        var12.setLocationAndAngles(var3 - 5.0D, var5 + 4.0D, var7 - 12.0D, var1.rand.nextFloat() * 360.0F, 0.0F);
        var13.setLocationAndAngles(var3 - 8.0D, var5 + 4.0D, var7 + 8.0D, var1.rand.nextFloat() * 360.0F, 0.0F);
        var1.setBlockWithNotify((int)(var3 + 15.0D), (int)var5, (int)var7, DivineRPG.ayeracoBeamBlue.blockID);
        var1.setBlockWithNotify((int)(var3 + 8.0D), (int)var5, (int)(var7 + 8.0D), DivineRPG.ayeracoBeamGreen.blockID);
        var1.setBlockWithNotify((int)(var3 + 5.0D), (int)var5, (int)(var7 - 12.0D), DivineRPG.ayeracoBeamRed.blockID);
        var1.setBlockWithNotify((int)(var3 - 5.0D), (int)var5, (int)(var7 - 12.0D), DivineRPG.ayeracoBeamYellow.blockID);
        var1.setBlockWithNotify((int)(var3 - 8.0D), (int)var5, (int)(var7 + 8.0D), DivineRPG.ayeracoBeamPurple.blockID);
        var9.initOthers(var10, var11, var12, var13);
        var10.initOthers(var9, var11, var12, var13);
        var11.initOthers(var9, var10, var12, var13);
        var12.initOthers(var9, var10, var11, var13);
        var13.initOthers(var9, var10, var11, var12);
        var9.setBeamLocation((int)(var3 + 15.0D), (int)var5, (int)var7);
        var10.setBeamLocation((int)(var3 + 8.0D), (int)var5, (int)(var7 + 8.0D));
        var11.setBeamLocation((int)(var3 + 5.0D), (int)var5, (int)(var7 - 12.0D));
        var12.setBeamLocation((int)(var3 - 5.0D), (int)var5, (int)(var7 - 12.0D));
        var13.setBeamLocation((int)(var3 - 8.0D), (int)var5, (int)(var7 + 8.0D));
        var1.spawnEntityInWorld(var9);
        var1.spawnEntityInWorld(var10);
        var1.spawnEntityInWorld(var11);
        var1.spawnEntityInWorld(var12);
        var1.spawnEntityInWorld(var13);
        return true;
    }

    public String getTextureFile()
    {
        return "/Xolovon.png";
    }
}
