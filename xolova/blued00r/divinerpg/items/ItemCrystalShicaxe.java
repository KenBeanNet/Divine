package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemCrystalShicaxe extends ItemTool
{
    private static Block[] blocksEffectiveAgainst = Block.blocksList;
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemCrystalShicaxe(int var1, EnumToolMaterial var2)
    {
        super(var1, 2, var2, blocksEffectiveAgainst);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(12000);
        this.weaponDamage = 0 + var2.getDamageVsEntity();
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block var1)
    {
        return var1 == Block.obsidian ? this.toolMaterial.getHarvestLevel() >= 3 : (var1 != Block.snow && var1 != Block.blockDiamond && var1 != Block.oreDiamond ? (var1 != Block.oreEmerald && var1 != Block.blockEmerald ? (var1 != Block.blockGold && var1 != Block.oreGold ? (var1 != Block.blockSteel && var1 != Block.oreIron ? (var1 != Block.blockLapis && var1 != Block.oreLapis ? (var1 != Block.oreRedstone && var1 != Block.oreRedstoneGlowing ? (var1.blockMaterial == Material.rock ? true : (var1.blockMaterial == Material.iron ? true : var1.blockMaterial == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2 != null && (var2.blockMaterial == Material.wood || var2.blockMaterial == Material.iron || var2.blockMaterial == Material.anvil || var2.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(var1, var2);
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
            UseHoeEvent var11 = new UseHoeEvent(var2, var1, var3, var4, var5, var6);

            if (MinecraftForge.EVENT_BUS.post(var11))
            {
                return false;
            }
            else if (var11.getResult() == Event.Result.ALLOW)
            {
                var1.damageItem(1, var2);
                return true;
            }
            else
            {
                int var12 = var3.getBlockId(var4, var5, var6);
                int var13 = var3.getBlockId(var4, var5 + 1, var6);

                if ((var7 == 0 || var13 != 0 || var12 != Block.grass.blockID) && var12 != Block.dirt.blockID)
                {
                    return false;
                }
                else
                {
                    Block var14 = Block.tilledField;
                    var3.playSoundEffect((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var14.stepSound.getStepSound(), (var14.stepSound.getVolume() + 1.0F) / 2.0F, var14.stepSound.getPitch() * 0.8F);

                    if (var3.isRemote)
                    {
                        return true;
                    }
                    else
                    {
                        var3.setBlockWithNotify(var4, var5, var6, var14.blockID);
                        var1.damageItem(1, var2);
                        return true;
                    }
                }
            }
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("Efficiency: " + this.field_40439_b.getEfficiencyOnProperMaterial());

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
