package xolova.blued00r.divinerpg.items.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemStaffOfEnrichment extends Item
{
    public ItemStaffOfEnrichment(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(100);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var2.canPlayerEdit(var4, var5, var6, var7, var1))
        {
            return false;
        }
        else
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            var3.getBlockId(var4, var5 + 1, var6);

            if (var11 == DivineRPG.arcaniteDirt.blockID)
            {
                Block var13 = DivineRPG.arcaniteGrass;
                var3.playSoundEffect((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var13.stepSound.getStepSound(), (var13.stepSound.getVolume() + 1.0F) / 2.0F, var13.stepSound.getPitch() * 0.8F);

                if (var3.isRemote)
                {
                    return true;
                }
                else
                {
                    var3.setBlockWithNotify(var4, var5, var6, var13.blockID);
                    var1.damageItem(1, var2);
                    var2.addStat(AchievementPageDivineRPG.enrichment, 1);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }
}
