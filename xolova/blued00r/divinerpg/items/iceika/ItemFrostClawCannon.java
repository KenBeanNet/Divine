package xolova.blued00r.divinerpg.items.iceika;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFrostClaw;

public class ItemFrostClawCannon extends Item
{
    public ItemFrostClawCannon(int var1)
    {
        super(var1);
        this.setMaxDamage(10000);
        this.setCreativeTab(DivineRPG.tabRanged);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(Block.cactus.blockID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(var3, "xolovon.FrostclawCannon", 1.0F, 1.0F);
            var3.inventory.consumeInventoryItem(Block.cactus.blockID);
            var2.spawnEntityInWorld(new EntityFrostClaw(var2, var3));
            var1.damageItem(1, var3);
            return var1;
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("21 Ranged Damage");

        if (var1.getMaxDamage() != -1)
        {
            var3.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
        }
        else
        {
            var3.add("Infinite Uses");
        }
    }
}
