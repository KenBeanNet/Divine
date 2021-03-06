package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntitySerenityArrow;

public class ItemBowAzurite extends ItemBow
{
    private int lastDamage = -1;

    public ItemBowAzurite(int var1)
    {
        super(var1);
        this.setMaxDamage(-1);
        this.setCreativeTab(CreativeTabs.tabCombat);
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
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(DivineRPG.azuriteArrow.itemID))
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
        this.lastDamage = -1;
        boolean var5 = var3.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) > 0;

        if (var5 || var3.inventory.hasItem(DivineRPG.azuriteArrow.itemID))
        {
            int var6 = this.getMaxItemUseDuration(var1) - var4;
            float var7 = (float)var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if ((double)var7 < 0.05D)
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

            EntitySerenityArrow var9 = new EntitySerenityArrow(var2, var3, var7 * 2.0F);

            if (var7 >= 1.0F)
            {
                var9.field_70135_K = true;
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
                var3.inventory.consumeInventoryItem(DivineRPG.azuriteArrow.itemID);
            }
            else
            {
                var9.field_70135_K = false;
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

            if ((float)var6 >= 40.0F * DivineRPG.decreaseBowTime)
            {
                return this.iconIndex + 2;
            }

            if ((float)var6 >= 18.0F * DivineRPG.decreaseBowTime)
            {
                return this.iconIndex - 1;
            }

            if ((float)var6 > 13.0F * DivineRPG.decreaseBowTime)
            {
                return this.iconIndex + 1;
            }

            if (var6 > 0)
            {
                return this.iconIndex;
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

    @SideOnly(Side.CLIENT)
    public void onUsingItemTick(ItemStack var1, EntityPlayer var2, int var3)
    {
        super.onUsingItemTick(var1, var2, var3);
        int var4 = var1.getMaxItemUseDuration() - var2.getItemInUseCount();

        if (var4 > 100 && (new Random()).nextInt(100) == 0)
        {
            var1.damageItem(var4 / 100, var2);
        }

        if (var1.getItemDamage() < this.lastDamage)
        {
            this.onPlayerStoppedUsing(var1, ModLoader.getMinecraftInstance().theWorld, var2, var2.getItemInUseCount());
            var2.setItemInUse((ItemStack)null, 0);
            var2.inventory.setInventorySlotContents(var2.inventory.currentItem, (ItemStack)null);
        }
        else
        {
            this.lastDamage = var1.getItemDamage();
        }
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
        var3.add("10 Ranged Damage");
        var3.add("2 Times Faster");
        var3.add("Ammo: Azurite Arrow");
    }
}
