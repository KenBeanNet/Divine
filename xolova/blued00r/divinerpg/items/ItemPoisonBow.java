package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityPoisonArrow;

public class ItemPoisonBow extends ItemBow
{
    public ItemPoisonBow(int var1)
    {
        super(var1);
        this.setMaxDamage(2500);
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        boolean var5 = var3.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) > 0;

        if (var5 || var3.inventory.hasItem(Item.arrow.itemID))
        {
            int var6 = this.getMaxItemUseDuration(var1) - var4;
            float var7 = (float)var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if ((double)var7 < 0.1D)
            {
                return;
            }

            boolean var8 = false;

            if (var7 > 1.0F)
            {
                if (var7 > 9.0F)
                {
                    var8 = true;
                }

                var7 = 1.0F;
            }

            EntityPoisonArrow var9 = new EntityPoisonArrow(var2, var3, var7 * 2.0F);

            if (var7 >= 1.0F)
            {
                var9.arrowCritical = true;
            }

            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

            if (var10 > 0)
            {
                var9.setDamage(var9.getDamage() + (double)var10 * 0.5D + 0.5D);
            }

            int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

            if (var11 > 0)
            {
                var9.setKnockbackStrength(var11);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
            {
                var9.setFire(100);
            }

            var1.damageItem(1, var3);
            var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

            if (!var5)
            {
                var3.inventory.consumeInventoryItem(Item.arrow.itemID);
            }
            else
            {
                var9.doesArrowBelongToPlayer = false;
            }

            if (!var2.isRemote)
            {
                var2.spawnEntityInWorld(var9);
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
                return 24;
            }

            if (var6 >= 18)
            {
                return 21;
            }

            if (var6 > 13)
            {
                return 23;
            }

            if (var6 > 0)
            {
                return 25;
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
        var3.add("2 Ranged Damage");
        var3.add("Poisonous");
        var3.add("Ammo: Arrow");
        var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
    }
}
