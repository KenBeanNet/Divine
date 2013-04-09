package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityBatWing;

public class ItemScythe extends Item
{
    public ItemScythe(int var1)
    {
        super(var1);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (var4 || var3.inventory.hasItem(DivineRPG.scythe.itemID))
        {
            var2.playSoundEffect(var3.posX, var3.posY, var3.posZ, "xolovon.deeplaugh", 5.0F, 1.0F);
            EntityBatWing var5 = new EntityBatWing(var2, var3);

            if (var3.inventory.armorInventory[0] != null && var3.inventory.armorInventory[1] != null && var3.inventory.armorInventory[2] != null && var3.inventory.armorInventory[3] != null && var3.inventory.armorInventory[0].itemID == DivineRPG.jackOManBoots.itemID && var3.inventory.armorInventory[1].itemID == DivineRPG.jackOManLegs.itemID && var3.inventory.armorInventory[2].itemID == DivineRPG.jackOManBody.itemID && var3.inventory.armorInventory[3].itemID == DivineRPG.jackOManHead.itemID)
            {
                var5.damage = (byte)(var5.damage * 4);
            }

            var2.spawnEntityInWorld(var5);
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("4 Ranged Damage");
        var3.add("Confusion");
        var3.add("Infinite Uses");
    }
}
