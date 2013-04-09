package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemVetheanHammerSword extends ItemVetheanSword
{
    private static int weaponDamage;
    public static EnumToolMaterial enumz = EnumHelper.addToolMaterial("enumz", 0, -1, 0.0F, weaponDamage, 22);

    public ItemVetheanHammerSword(int var1, int var2, String var3, int var4)
    {
        super(var1, enumz);
        this.setIconIndex(var2);
        this.setItemName(var3);
        this.setTextureFile("/Xolovon4.png");
        weaponDamage = var4;
    }
}
