package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityFrostShard;

public class ItemFrostCannon extends Item
{
    public ItemFrostCannon(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(15000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(Item.snowball.itemID))
        {
            return var1;
        }
        else
        {
            if (!var2.isRemote)
            {
                var2.playSoundAtEntity(var3, "xolovon.Frostcannon", 1.0F, 1.0F);
                var3.inventory.consumeInventoryItem(Item.snowball.itemID);
                var2.spawnEntityInWorld(new EntityFrostShard(var2, var3));
                var1.damageItem(1, var3);
            }

            return var1;
        }
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
        return DivineRPG.textureFile2;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("8 Ranged Damage");
        var3.add("Ammo: Snowballs");
        var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
    }
}
