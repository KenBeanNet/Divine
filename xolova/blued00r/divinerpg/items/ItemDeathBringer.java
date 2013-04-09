package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;

public class ItemDeathBringer extends ItemSwordXolovon
{
    public int weaponDamage = 13;

    public ItemDeathBringer(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }
}
