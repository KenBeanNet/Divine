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

public class ItemBedrockArmor extends ItemArmor implements IArmorTextureProvider, ISpecialArmor
{
    public ItemBedrockArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ISpecialArmor.ArmorProperties(0, 0.1875D, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return var3 != 0 && var3 != 2 ? (var3 == 1 ? 7 : (var3 == 3 ? 6 : 7)) : 6;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.bedrockHead.itemID && var1.itemID != DivineRPG.bedrockBody.itemID && var1.itemID != DivineRPG.bedrockBoots.itemID ? (var1.itemID == DivineRPG.bedrockLegs.itemID ? "/armor/bedrock_2.png" : "/armor/bedrock_1.png") : "/armor/bedrock_1.png";
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("18.75% Damage Reduction");
        var3.add("Infinite Uses");
        var3.add("Full set: Explosive Protection");
        var3.add("Full set: Fire Protection");
        var3.add("Full set: Lava Protection");
    }
}
