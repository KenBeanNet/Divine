package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemFlamingFury extends ItemSwordXolovon
{
    public int weaponDamage = 32;

    public ItemFlamingFury(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setMaxDamage(6000);
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
        var2.setFire(30);
        var1.damageItem(1, var3);
        return true;
    }

    public String getTextureFile()
    {
        return "/Xolovon.png";
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }
}
