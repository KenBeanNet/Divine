package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityAnchorClaw;

public class ItemClawAnchor extends Item
{
    private int weaponDamage;

    public ItemClawAnchor(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 9;
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(DivineRPG.clawAnchor.itemID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityAnchorClaw(var2, var3));
            var1.damageItem(1, var3);
            return var1;
        }
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
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
        return DivineRPG.textureFile1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("4 Ranged Damage");
    }
}
