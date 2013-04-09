package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemHoeXolovon extends ItemHoe
{
    private EnumToolMaterial field_40439_b;

    public ItemHoeXolovon(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.maxStackSize = 1;
        this.field_40439_b = var2;
        this.setMaxDamage(var2.getMaxUses());
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
    }
}
