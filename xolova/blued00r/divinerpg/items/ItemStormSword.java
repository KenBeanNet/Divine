package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemStormSword extends ItemSword
{
    public ItemStormSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (ArcanaList.get(var3.username).arcanaUse(20))
        {
            this.createLightning(var2, var3);
        }

        var3.addStat(AchievementPageDivineRPG.allHellLoose, 1);
        return super.onItemRightClick(var1, var2, var3);
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return 5;
    }

    public boolean onLeftClickEntity(ItemStack var1, EntityPlayer var2, Entity var3)
    {
        if (ArcanaList.get(var2.username).arcanaUse(20))
        {
            this.createLightning(var2.worldObj, var2);
        }

        var2.addStat(AchievementPageDivineRPG.allHellLoose, 1);
        return false;
    }

    public void createLightning(World var1, EntityPlayer var2)
    {
        for (int var3 = 2; var3 < 5; var3 += 2)
        {
            for (double var4 = 0.0D; var4 < (Math.PI * 2D); var4 += 0.39269908169872414D)
            {
                int var6 = (int)Math.round(Math.sin(var4) * (double)var3);
                int var7 = (int)Math.round(Math.cos(var4) * (double)var3);
                var1.spawnEntityInWorld(new EntityLightningBolt(var1, var2.posX + (double)var6, var2.posY, var2.posZ + (double)var7));
            }
        }
    }
}
