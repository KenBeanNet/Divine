package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.IRegistry;
import net.minecraft.dispenser.PositionImpl;
import net.minecraft.dispenser.RegistryDefaulted;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityKarosCannonShot;

public class BlockKarosCannon extends BlockContainer
{
    public static final IRegistry dispenseBehaviorRegistry = new RegistryDefaulted(new BehaviorDefaultDispenseItem());
    private Random random = new Random();

    public BlockKarosCannon(int var1, int var2, Material var3)
    {
        super(var1, var2, var3);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 4;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return DivineRPG.karosCannon.blockID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);
        this.setDispenserDefaultDirection(var1, var2, var3, var4);
    }

    private void setDispenserDefaultDirection(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            int var5 = var1.getBlockId(var2, var3, var4 - 1);
            int var6 = var1.getBlockId(var2, var3, var4 + 1);
            int var7 = var1.getBlockId(var2 - 1, var3, var4);
            int var8 = var1.getBlockId(var2 + 1, var3, var4);
            byte var9 = 3;

            if (Block.opaqueCubeLookup[var5] && !Block.opaqueCubeLookup[var6])
            {
                var9 = 3;
            }

            if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var5])
            {
                var9 = 2;
            }

            if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var8])
            {
                var9 = 5;
            }

            if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var7])
            {
                var9 = 4;
            }

            var1.setBlockMetadataWithNotify(var2, var3, var4, var9);
        }
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
            TileEntityDispenser var10 = (TileEntityDispenser)var1.getBlockTileEntity(var2, var3, var4);

            if (var10 != null)
            {
                var5.displayGUIDispenser(var10);
            }

            return true;
        }
    }

    public void dispense(World var1, int var2, int var3, int var4)
    {
        this.setDispenserDefaultDirection(var1, var2, var3, var4);
        this.func_82486_a(var1, 0, EnumFacing.getFront(var1.getBlockMetadata(var2, var3, var4)), var2, var3, var4);
    }

    public void func_82486_a(World var1, int var2, EnumFacing var3, int var4, int var5, int var6)
    {
        double var7 = (double)var4;
        double var9 = (double)var5;
        double var11 = (double)var6;
        EntityKarosCannonShot var13 = new EntityKarosCannonShot(var1, var7 + 0.5D + (double)var3.getFrontOffsetX(), var9 + 0.5D, var11 + 0.5D + (double)var3.getFrontOffsetZ());
        double var14 = var1.rand.nextDouble() * 0.1D + 0.9D;
        var13.motionX = (double)var3.getFrontOffsetX() * var14;
        var13.motionY = 0.0D;
        var13.motionZ = (double)var3.getFrontOffsetZ() * var14;
        var13.motionX += var1.rand.nextGaussian() * 0.007499999832361937D * (double)var2;
        var13.motionY += 0.0D;
        var13.motionZ += var1.rand.nextGaussian() * 0.007499999832361937D * (double)var2;
        var1.spawnEntityInWorld(var13);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (var5 > 0 && Block.blocksList[var5].canProvidePower())
        {
            boolean var6 = var1.isBlockIndirectlyGettingPowered(var2, var3, var4) || var1.isBlockIndirectlyGettingPowered(var2, var3 + 1, var4);

            if (var6)
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && (var1.isBlockIndirectlyGettingPowered(var2, var3, var4) || var1.isBlockIndirectlyGettingPowered(var2, var3 + 1, var4)))
        {
            this.dispense(var1, var2, var3, var4);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityDispenser();
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (var6 == 0)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 2);
        }

        if (var6 == 1)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 5);
        }

        if (var6 == 2)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 3);
        }

        if (var6 == 3)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 4);
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        TileEntityDispenser var7 = (TileEntityDispenser)var1.getBlockTileEntity(var2, var3, var4);

        if (var7 != null)
        {
            for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
            {
                ItemStack var9 = var7.getStackInSlot(var8);

                if (var9 != null)
                {
                    float var10 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var11 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var12 = this.random.nextFloat() * 0.8F + 0.1F;

                    while (var9.stackSize > 0)
                    {
                        int var13 = this.random.nextInt(21) + 10;

                        if (var13 > var9.stackSize)
                        {
                            var13 = var9.stackSize;
                        }

                        var9.stackSize -= var13;
                        EntityItem var14 = new EntityItem(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));

                        if (var9.hasTagCompound())
                        {
                            var14.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                        }

                        float var15 = 0.05F;
                        var14.motionX = (double)((float)this.random.nextGaussian() * var15);
                        var14.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                        var14.motionZ = (double)((float)this.random.nextGaussian() * var15);
                        var1.spawnEntityInWorld(var14);
                    }
                }
            }
        }

        super.breakBlock(var1, var2, var3, var4, var5, var6);
    }

    public static IPosition func_82525_a(IBlockSource var0)
    {
        EnumFacing var1 = EnumFacing.getFront(var0.func_82620_h());
        double var2 = var0.getX() + 0.7D * (double)var1.getFrontOffsetX();
        double var4 = var0.getY();
        double var6 = var0.getZ() + 0.7D * (double)var1.getFrontOffsetZ();
        return new PositionImpl(var2, var4, var6);
    }
}
