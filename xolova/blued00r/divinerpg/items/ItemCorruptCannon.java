package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityCorruptShot;

public class ItemCorruptCannon extends Item
{
    private int damage;
    private int firetick;
    private int firemax;
    private String firesound;
    private String reloadsound;

    public ItemCorruptCannon(int var1, int var2, String var3, String var4)
    {
        super(var1);
        this.firemax = var2;
        this.firetick = this.firemax;
        this.firesound = var3;
        this.reloadsound = var4;
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
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

        if (!var2.isRemote && (var4 || var3.inventory.hasItem(DivineRPG.corruptBullet.itemID)))
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                for (int var5 = 0; var5 < 4; ++var5)
                {
                    var2.spawnEntityInWorld(new EntityCorruptShot(var2, var3, var5));
                }

                var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);

                if (!var4)
                {
                    var3.inventory.consumeInventoryItem(DivineRPG.corruptBullet.itemID);
                }

                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }
        }

        return var1;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.firetick = this.firemax;
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
        return DivineRPG.textureFile;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("14 x 4 Ranged Damage");
        var3.add("Ammo: Corrupted Bullet");
        var3.add("Infinite Uses");
    }
}
