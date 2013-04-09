package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanArrow;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanArrow2;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanWarArrow;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanWrathArrow;

public class ItemVetheanBow extends ItemBow
{
    private double damageModifier;
    private Item arrow;
    private int lastDamage = -1;

    public ItemVetheanBow(int var1, double var2, Item var4)
    {
        super(var1);
        this.damageModifier = var2;
        this.arrow = var4;
        this.setMaxDamage(-1);
        this.setTextureFile("/Xolovon4.png");
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        ArrowLooseEvent var6 = new ArrowLooseEvent(var3, var1, var5);
        MinecraftForge.EVENT_BUS.post(var6);

        if (!var6.isCanceled())
        {
            var5 = var6.charge;
            boolean var7 = var3.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) > 0;

            if (var7 || var3.inventory.hasItem(this.arrow.itemID))
            {
                float var8 = (float)var5 / 20.0F;
                var8 = (var8 * var8 + var8 * 2.0F) / 3.0F;

                if ((double)var8 < 0.1D)
                {
                    return;
                }

                if (var8 > 1.0F)
                {
                    var8 = 1.0F;
                }

                var2.playSoundAtEntity(var3, "xolovon.VetheaBow", 1.0F, 1.0F);
                Object var9 = null;

                if (this.arrow == DivineRPG.vetheanArrow)
                {
                    var9 = new EntityVetheanArrow(var2, var3, var8 * 2.0F);
                }
                else if (this.arrow == DivineRPG.vetheanArrow2)
                {
                    var9 = new EntityVetheanArrow2(var2, var3, var8 * 2.0F);
                }
                else if (this.arrow == DivineRPG.vetheanWarArrow)
                {
                    var9 = new EntityVetheanWarArrow(var2, var3, var8 * 2.0F);
                }
                else if (this.arrow == DivineRPG.vetheanWrathArrow)
                {
                    var9 = new EntityVetheanWrathArrow(var2, var3, var8 * 2.0F);
                }
                else
                {
                    var9 = new EntityArrow(var2, var3, var8 * 2.0F);
                }

                if (var8 == 1.0F)
                {
                    ((EntityArrow)var9).setIsCritical(true);
                }

                int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

                if (var10 > 0)
                {
                    ((EntityArrow)var9).setDamage((((EntityArrow)var9).getDamage() + (double)var10 * 0.5D + 0.5D) * this.damageModifier);
                }
                else
                {
                    ((EntityArrow)var9).setDamage(((EntityArrow)var9).getDamage() * this.damageModifier);
                }

                int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

                if (var11 > 0)
                {
                    ((EntityArrow)var9).setKnockbackStrength(var11);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
                {
                    ((EntityArrow)var9).setFire(100);
                }

                var1.damageItem(1, var3);
                var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);

                if (var7)
                {
                    ((EntityArrow)var9).canBePickedUp = 2;
                }
                else
                {
                    var3.inventory.consumeInventoryItem(Item.arrow.itemID);
                }

                if (!var2.isRemote)
                {
                    var2.spawnEntityInWorld((Entity)var9);
                }
            }
        }
    }

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            float var6 = (float)(var4.getMaxItemUseDuration() - var3.getItemInUseCount());

            if (var6 >= 40.0F)
            {
                return this.iconIndex + 3;
            }

            if (var6 >= 18.0F)
            {
                return this.iconIndex + 2;
            }

            if (var6 > 13.0F)
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
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(this.arrow.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add(Math.ceil(10.0D * this.damageModifier) + " Ranged Damage");
        var3.add("Ammo: " + this.arrow.getItemName());

        if (var1.getMaxDamage() != -1)
        {
            var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
        }
        else
        {
            var3.add("Infinite Uses");
        }

        var3.add("\u00a72Vethean");
    }
}
