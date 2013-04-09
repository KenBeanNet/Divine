package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntitySpinebackCannonShot;

public class ItemSpinebackCannon extends ItemVetheanCannon
{
    private int counter = 20;

    public ItemSpinebackCannon(int var1, int var2, String var3)
    {
        super(var1, var2, var3);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (this.counter == 0)
        {
            if (!var2.isRemote && (var3.capabilities.isCreativeMode || var3.inventory.consumeInventoryItem(DivineRPG.rockChunks.itemID)))
            {
                var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
                var2.spawnEntityInWorld(new EntitySpinebackCannonShot(var2, var3, this.damage));
                this.counter = 20;
            }
        }
        else if (this.counter > 0)
        {
            --this.counter;
        }

        return var1;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        super.onPlayerStoppedUsing(var1, var2, var3, var4);
        this.counter = 20;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add(this.damage + " Ranged Damage");
        var3.add("Ammo: " + DivineRPG.rockChunks.getItemName());
        var3.add("\u00a72Vethean");
    }
}
