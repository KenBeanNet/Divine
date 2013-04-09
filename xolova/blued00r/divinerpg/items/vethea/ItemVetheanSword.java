package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemVetheanSword extends ItemSword
{
    public ItemVetheanSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setMaxDamage(-1);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add(var1.getDamageVsEntity(var2) + " Melee Damage");

        if (var1.getMaxDamage() != -1)
        {
            var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
        }
        else
        {
            var3.add("Infinite Uses");
        }

        if (this instanceof ItemVetheanClaw)
        {
            var3.add("Can not Block");
        }

        var3.add("\u00a72Vethean");
    }
}
