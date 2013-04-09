package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityIceikaChest;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class BlockIceikaChest extends BlockContainer
{
    private Random random = new Random();

    public BlockIceikaChest(int var1)
    {
        super(var1, Material.wood);
        this.blockIndexInTexture = 205;
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (var5 == 1)
        {
            return 204;
        }
        else if (var5 == 0)
        {
            return 204;
        }
        else
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            return var5 != var6 ? this.blockIndexInTexture : this.blockIndexInTexture + 1;
        }
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        return var1 == 1 ? 204 : (var1 == 0 ? 204 : (var1 == 3 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture));
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        TileEntityIceikaChest var7 = (TileEntityIceikaChest)var1.getBlockTileEntity(var2, var3, var4);
        ArrayList var8 = (ArrayList)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        Iterator var9 = var8.iterator();

        if (var7 != null)
        {
            for (int var10 = 0; var10 < var7.getSizeInventory(); ++var10)
            {
                ItemStack var11 = var7.getStackInSlot(var10);

                if (var11 != null)
                {
                    float var12 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var13 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem var14;

                    for (float var15 = this.random.nextFloat() * 0.8F + 0.1F; var11.stackSize > 0; var1.spawnEntityInWorld(var14))
                    {
                        int var16 = this.random.nextInt(21) + 10;

                        if (var16 > var11.stackSize)
                        {
                            var16 = var11.stackSize;
                        }

                        var11.stackSize -= var16;
                        var14 = new EntityItem(var1, (double)((float)var2 + var12), (double)((float)var3 + var13), (double)((float)var4 + var15), new ItemStack(var11.itemID, var16, var11.getItemDamage()));
                        float var17 = 0.05F;
                        var14.motionX = (double)((float)this.random.nextGaussian() * var17);
                        var14.motionY = (double)((float)this.random.nextGaussian() * var17 + 0.2F);
                        var14.motionZ = (double)((float)this.random.nextGaussian() * var17);

                        if (var11.hasTagCompound())
                        {
                            var14.getEntityItem().setTagCompound((NBTTagCompound)var11.getTagCompound().copy());

                            while (var9.hasNext())
                            {
                                EntityPlayerMP var18 = (EntityPlayerMP)var9.next();
                                var18.addStat(AchievementPageDivineRPG.frozenGoods, 1);
                            }
                        }
                    }
                }
            }
        }

        super.breakBlock(var1, var2, var3, var4, var5, var6);
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
            var5.displayGUIChest((TileEntityIceikaChest)var1.getBlockTileEntity(var2, var3, var4));
            return true;
        }
    }

    protected int getSeedItem()
    {
        return DivineRPG.iceikaChest2.blockID;
    }

    protected int getCropItem()
    {
        return DivineRPG.snowFlake.itemID;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World var1, int var2, int var3, int var4, int var5, float var6, int var7)
    {
        super.dropBlockAsItemWithChance(var1, var2, var3, var4, var5, var6, 0);
    }

    public ArrayList getBlockDropped(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        ArrayList var7 = super.getBlockDropped(var1, var2, var3, var4, var5, var6);

        if (var5 >= 0)
        {
            for (int var8 = 1; var8 < 3 + var6; ++var8)
            {
                if (var1.rand.nextInt(15) <= var5)
                {
                    var7.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return var7;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return var1 == 0 ? this.getCropItem() : this.getSeedItem();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityIceikaChest();
    }
}
