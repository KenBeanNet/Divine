package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemRealmiteArmor extends ItemArmor implements IArmorTextureProvider, ISpecialArmor
{
    public ItemRealmiteArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
        this.setMaxDamage(5000);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.realmiteHead.itemID && var1.itemID != DivineRPG.realmiteBody.itemID && var1.itemID != DivineRPG.realmiteBoots.itemID ? (var1.itemID == DivineRPG.realmiteLegs.itemID ? "/armor/real_2.png" : "/armor/real_1.png") : "/armor/real_1.png";
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ISpecialArmor.ArmorProperties(0, 0.0825D, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return 5;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5)
    {
        var2.damageItem(1, var1);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("8.25% Damage Reduction");
        var3.add("5000 Uses");
    }
}
