package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityFireArrow;

public class ItemInfernoBow extends ItemBow
{
    public ItemInfernoBow(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(10000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
        {
            return var4.result;
        }
        else
        {
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(DivineRPG.infernoBow.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        float var6 = (float)var5 / 20.0F;
        var6 = (var6 * var6 + var6 * 2.0F) / 3.0F;

        if ((double)var6 >= 0.1D)
        {
            boolean var7 = false;

            if (var6 > 1.0F)
            {
                if (var6 > 9.0F)
                {
                    var7 = true;
                }

                var6 = 1.0F;
            }

            EntityFireArrow var8 = new EntityFireArrow(var2, var3, var6 * 2.0F);

            if (var6 >= 1.0F)
            {
                var8.arrowCritical = true;
            }

            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

            if (var9 > 0)
            {
                var8.setDamage(var8.getDamage() + (double)var9 * 0.5D + 0.5D);
            }

            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

            if (var10 > 0)
            {
                var8.setKnockbackStrength(var10);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
            {
                var8.setFire(100);
            }

            var1.damageItem(1, var3);
            var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var6 * 0.5F);

            if (!var2.isRemote)
            {
                var2.spawnEntityInWorld(var8);
            }
        }
    }

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if (var6 >= 30)
            {
                return this.iconIndex + 4;
            }

            if (var6 >= 18)
            {
                return this.iconIndex + 3;
            }

            if (var6 > 13)
            {
                return this.iconIndex + 2;
            }

            if (var6 > 0)
            {
                return this.iconIndex + 1;
            }
        }

        return this.iconIndex;
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
        var3.add("2 Ranged Fire Damage");
    }
}
