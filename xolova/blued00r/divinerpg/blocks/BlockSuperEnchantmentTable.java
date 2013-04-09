package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySuperEnchantmentTable;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class BlockSuperEnchantmentTable extends BlockContainer
{
    public BlockSuperEnchantmentTable(int var1)
    {
        super(var1, 166, Material.rock);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        this.setLightOpacity(0);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        super.randomDisplayTick(var1, var2, var3, var4, var5);

        for (int var6 = var2 - 2; var6 <= var2 + 2; ++var6)
        {
            for (int var7 = var4 - 2; var7 <= var4 + 2; ++var7)
            {
                if (var6 > var2 - 2 && var6 < var2 + 2 && var7 == var4 - 1)
                {
                    var7 = var4 + 2;
                }

                if (var5.nextInt(16) == 0)
                {
                    for (int var8 = var3; var8 <= var3 + 1; ++var8)
                    {
                        var1.spawnParticle("enchantmenttable", (double)var2 + 0.5D, (double)var3 + 2.0D, (double)var4 + 0.5D, (double)((float)(var6 - var2) + var5.nextFloat()) - 0.5D, (double)((float)(var8 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var7 - var4) + var5.nextFloat()) - 0.5D);
                    }
                }
            }
        }
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return this.getBlockTextureFromSide(var1);
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return var1 == 0 ? 166 : (var1 == 1 ? 165 : 167);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntitySuperEnchantmentTable();
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else
        {
            TileEntitySuperEnchantmentTable var10 = (TileEntitySuperEnchantmentTable)var1.getBlockTileEntity(var2, var3, var4);

            if (var10 != null && !var5.isSneaking())
            {
                var5.addStat(AchievementPageDivineRPG.perfectlyCorrupted, 1);
                var5.openGui(DivineRPG.instance, 0, var1, var2, var3, var4);
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
