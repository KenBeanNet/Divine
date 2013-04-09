package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemDonatorArmor extends ItemArmor implements IArmorTextureProvider
{
    public ItemDonatorArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.donatorHead.itemID && var1.itemID != DivineRPG.donatorBody.itemID && var1.itemID != DivineRPG.donatorBoots.itemID ? (var1.itemID == DivineRPG.donatorLegs.itemID ? "/armor/donator_2.png" : "/armor/donator_1.png") : "/armor/donator_1.png";
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("0% Damage Reduction");
        var3.add("Infinite Uses");
    }
}
