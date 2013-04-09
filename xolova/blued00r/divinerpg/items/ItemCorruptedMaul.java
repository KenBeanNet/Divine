package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;

public class ItemCorruptedMaul extends ItemSwordXolovon
{
    private int weaponDamage = 18;

    public ItemCorruptedMaul(int var1, EnumToolMaterial var2)
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
