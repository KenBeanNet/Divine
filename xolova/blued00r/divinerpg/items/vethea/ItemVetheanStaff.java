package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemVetheanStaff extends Item
{
    protected int damage;
    protected int cost;

    public ItemVetheanStaff(int var1, int var2, int var3)
    {
        super(var1);
        this.maxStackSize = 1;
        this.damage = var2;
        this.cost = var3;
    }

    @SideOnly(Side.CLIENT)
    public String getTextureFile()
    {
        return "/Xolovon4.png";
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Consumes " + this.cost + " Arcana");
        var3.add("\u00a72Vethean");
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && ArcanaList.get(var3.getEntityName()).arcanaUse(this.cost))
        {
            var2.playSoundAtEntity(var3, "xolovon.Staff", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityBouncingProjectile(var2, var3, this.damage));
        }

        return var1;
    }
}
