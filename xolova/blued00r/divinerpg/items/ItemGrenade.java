package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityGrenade;

public class ItemGrenade extends Item
{
    private int damage;
    private int firetick;
    private int firemax;
    private String firesound;
    private String reloadsound;

    public ItemGrenade(int var1, int var2)
    {
        super(var1);
        this.firemax = var2;
        this.firetick = 0;
        this.setMaxStackSize(64);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = false;

        if (var3.capabilities.isCreativeMode)
        {
            var4 = true;
        }

        if (!var2.isRemote && (var4 || var3.inventory.hasItem(DivineRPG.grenade.itemID)))
        {
            if (this.firetick == 0)
            {
                var2.playSoundAtEntity(var3, "xolovon.LaVekor", 2.0F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                var2.spawnEntityInWorld(new EntityGrenade(var2, var3));

                if (!var4)
                {
                    var3.inventory.consumeInventoryItem(DivineRPG.grenade.itemID);
                }

                this.firetick = this.firemax;
            }
            else
            {
                --this.firetick;
            }
        }

        return var1;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.none;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.firetick = 0;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Explosive projectile");
        var3.add("Ammo: Grenade");
        var3.add("Infinite Uses");
    }
}
