package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ISpecialArmor;

public class ItemVetheanArmor extends ItemArmor implements ISpecialArmor
{
    private int type;
    private int reductionAmount;
    private String specialty;
    private String ability;
    private static EnumArmorMaterial vethea = EnumHelper.addArmorMaterial("vethea", -1, new int[] {0, 0, 0, 0}, 0);

    public ItemVetheanArmor(int var1, int var2, int var3, int var4, String var5, String var6)
    {
        super(var1, vethea, var2, var3);
        this.type = var3;
        this.reductionAmount = var4;
        this.specialty = var5;
        this.ability = var6;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        double var7;

        switch (var6)
        {
            case 0:
                var7 = 0.2D;
                break;

            case 1:
                var7 = 0.4D;
                break;

            case 2:
                var7 = 0.3D;
                break;

            case 3:
                var7 = 0.1D;
                break;

            default:
                var7 = 0.0D;
        }

        return new ISpecialArmor.ArmorProperties(0, (double)(this.reductionAmount / 100) * var7, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return 2;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        if (this.type == 0)
        {
            var3.add((double)this.reductionAmount * 0.2D + "% Damage Reduction");

            if (this.specialty != "")
            {
                var3.add("Adds 15% " + this.specialty + " Damage Reduction");
                var3.add("is split among each armor peice.");
            }

            if (this.ability != "")
            {
                var3.add("Full set: " + this.ability);
            }
        }
        else if (this.type == 1)
        {
            var3.add((double)this.reductionAmount * 0.4D + "% Damage Reduction");
        }
        else if (this.type == 2)
        {
            var3.add((double)this.reductionAmount * 0.3D + "% Damage Reduction");
        }
        else if (this.type == 3)
        {
            var3.add((double)this.reductionAmount * 0.2D + "% Damage Reduction");
        }

        var3.add("Infinite Uses");
        var3.add("\u00a72Vethean");
    }
}
