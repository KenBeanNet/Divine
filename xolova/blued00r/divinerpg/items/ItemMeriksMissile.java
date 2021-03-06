package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityMerikMissile;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemMeriksMissile extends ItemBow
{
    private int lastDamage = -1;

    public ItemMeriksMissile(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
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
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(DivineRPG.meriksMissile.itemID))
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
        ArrowLooseEvent var6 = new ArrowLooseEvent(var3, var1, var5);
        MinecraftForge.EVENT_BUS.post(var6);

        if (!var6.isCanceled())
        {
            var5 = var6.charge;
            boolean var10000;

            if (!var3.capabilities.isCreativeMode && EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) <= 0)
            {
                var10000 = false;
            }
            else
            {
                var10000 = true;
            }

            if (ArcanaList.get(var3.username).arcanaUse(5 * var5 / 25 * 10))
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

                EntityMerikMissile var9 = new EntityMerikMissile(var2, var3, 0.6F, var5);
                int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

                if (var10 > 0)
                {
                    var9.setDamage((int)(((double)var8 * (double)var10 * 0.5D + 0.5D) * 2.0D));
                }

                var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);

                if (!var2.isRemote)
                {
                    var2.spawnEntityInWorld(var9);
                }
            }
        }
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.none;
    }

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if ((float)var6 >= 40.0F * DivineRPG.increaseBowTime)
            {
                return this.iconIndex + 3;
            }

            if ((float)var6 >= 18.0F * DivineRPG.increaseBowTime)
            {
                return this.iconIndex + 2;
            }

            if ((float)var6 > 13.0F * DivineRPG.increaseBowTime)
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

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("2 Arcana Minimum");
        var3.add("Explosive homing projectile");
    }
}
