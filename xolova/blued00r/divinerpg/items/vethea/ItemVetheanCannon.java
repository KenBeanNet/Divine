package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanCannonShot;

public class ItemVetheanCannon extends Item
{
    protected int damage;

    public ItemVetheanCannon(int var1, int var2, String var3)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.damage = var2;
        this.setItemName(var3);
        this.setTextureFile("/Xolovon4.png");
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && (var3.capabilities.isCreativeMode || var3.inventory.consumeInventoryItem(DivineRPG.acidfire.itemID)))
        {
            var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityVetheanCannonShot(var2, var3, this.damage));
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

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add(this.damage + " Ranged Damage");
        var3.add("Ammo: " + this.getItemDisplayName(new ItemStack(DivineRPG.acidfire)));
        var3.add("\u00a72Vethean");
    }
}
