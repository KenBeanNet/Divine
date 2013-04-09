package xolova.blued00r.divinerpg.items.iceika;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFrostyMusic;

public class ItemSoundOfCarols extends Item
{
    public ItemSoundOfCarols(int var1)
    {
        super(var1);
        this.setMaxDamage(4000);
        this.maxStackSize = 1;
        this.setCreativeTab(DivineRPG.tabRanged);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote)
        {
            var2.playSoundAtEntity(var3, "xolovon.SoundOfCarols", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityFrostyMusic(var2, var3));
            var1.damageItem(1, var3);
        }

        return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("16 Ranged Damage");
        var3.add("4000 Uses");
    }
}
