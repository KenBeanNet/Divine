package xolova.blued00r.divinerpg.items.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntitySpinebackStaffShot;

public class ItemSpinebackStaff extends ItemVetheanStaff
{
    public ItemSpinebackStaff(int var1, int var2, int var3)
    {
        super(var1, var2, var3);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Large explosive shot");
        super.addInformation(var1, var2, var3, var4);
    }

    protected void shoot(World var1, EntityPlayer var2)
    {
        var1.playSoundAtEntity(var2, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        var1.spawnEntityInWorld(new EntitySpinebackStaffShot(var1, var2));
    }
}
