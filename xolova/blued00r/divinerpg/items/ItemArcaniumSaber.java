package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemArcaniumSaber extends ItemSword
{
    private int weaponDamage;

    public ItemArcaniumSaber(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 28;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLiving var6)
    {
        if (ArcanaList.get(((EntityPlayer)var6).username).arcanaUse(12))
        {
            var6.worldObj.playSoundAtEntity(var6, "xolovon.ArcaniumSaber", 1.0F, 1.0F);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }

    public boolean onLeftClickEntity(ItemStack var1, EntityPlayer var2, Entity var3)
    {
        if (ArcanaList.get(var2.username).arcanaUse(12))
        {
            var2.worldObj.playSoundAtEntity(var2, "xolovon.ArcaniumSaber", 1.0F, 1.0F);
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (ArcanaList.get(var3.username).arcanaUse(12))
        {
            var3.worldObj.playSoundAtEntity(var3, "xolovon.ArcaniumSaber", 1.0F, 1.0F);
            var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("12 Arcana");
        var3.add("28 Melee Damage");
    }
}
