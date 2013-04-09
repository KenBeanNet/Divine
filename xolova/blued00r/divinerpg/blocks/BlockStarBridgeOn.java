package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockStarBridgeOn extends Block
{
    private boolean powered;
    private boolean altpowered;
    private boolean wiresProvidePower = true;
    private Set blocksNeedingUpdate = new HashSet();

    public BlockStarBridgeOn(int var1, boolean var2)
    {
        super(var1, Material.rock);
        this.powered = var2;
        this.blockIndexInTexture = 129;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return true;
    }

    private void updateAndPropagateCurrentStrength(World var1, int var2, int var3, int var4)
    {
        this.calculateCurrentChanges(var1, var2, var3, var4, var2, var3, var4);
        ArrayList var5 = new ArrayList(this.blocksNeedingUpdate);
        this.blocksNeedingUpdate.clear();
        Iterator var6 = var5.iterator();

        while (var6.hasNext())
        {
            ChunkPosition var7 = (ChunkPosition)var6.next();
            var1.notifyBlocksOfNeighborChange(var7.x, var7.y, var7.z, this.blockID);
        }
    }

    private void calculateCurrentChanges(World var1, int var2, int var3, int var4, int var5, int var6, int var7)
    {
        int var8 = var1.getBlockMetadata(var2, var3, var4);
        int var9 = 0;
        this.wiresProvidePower = false;
        boolean var10 = var1.isBlockIndirectlyGettingPowered(var2, var3, var4);
        this.wiresProvidePower = true;
        int var11;
        int var12;
        int var13;

        if (var10)
        {
            var9 = 15;
        }
        else
        {
            for (var11 = 0; var11 < 4; ++var11)
            {
                var12 = var2;
                var13 = var4;

                if (var11 == 0)
                {
                    var12 = var2 - 1;
                }

                if (var11 == 1)
                {
                    ++var12;
                }

                if (var11 == 2)
                {
                    var13 = var4 - 1;
                }

                if (var11 == 3)
                {
                    ++var13;
                }

                if (var12 != var5 || var3 != var6 || var13 != var7)
                {
                    var9 = this.getMaxCurrentStrength(var1, var12, var3, var13, var9);
                }

                if (var1.isBlockNormalCube(var12, var3, var13) && !var1.isBlockNormalCube(var2, var3 + 1, var4))
                {
                    if (var12 != var5 || var3 + 1 != var6 || var13 != var7)
                    {
                        var9 = this.getMaxCurrentStrength(var1, var12, var3 + 1, var13, var9);
                    }
                }
                else if (!var1.isBlockNormalCube(var12, var3, var13) && (var12 != var5 || var3 - 1 != var6 || var13 != var7))
                {
                    var9 = this.getMaxCurrentStrength(var1, var12, var3 - 1, var13, var9);
                }
            }

            if (var9 > 0)
            {
                --var9;
            }
            else
            {
                var9 = 0;
            }
        }

        if (var8 != var9)
        {
            var1.editingBlocks = true;
            var1.setBlockMetadataWithNotify(var2, var3, var4, var9);
            var1.markBlockRangeForRenderUpdate(var2, var3, var4, var2, var3, var4);
            var1.editingBlocks = false;

            for (var11 = 0; var11 < 4; ++var11)
            {
                var12 = var2;
                var13 = var4;
                int var14 = var3 - 1;

                if (var11 == 0)
                {
                    var12 = var2 - 1;
                }

                if (var11 == 1)
                {
                    ++var12;
                }

                if (var11 == 2)
                {
                    var13 = var4 - 1;
                }

                if (var11 == 3)
                {
                    ++var13;
                }

                if (var1.isBlockNormalCube(var12, var3, var13))
                {
                    var14 += 2;
                }

                boolean var15 = false;
                int var16 = this.getMaxCurrentStrength(var1, var12, var3, var13, -1);
                var9 = var1.getBlockMetadata(var2, var3, var4);

                if (var9 > 0)
                {
                    --var9;
                }

                if (var16 >= 0 && var16 != var9)
                {
                    this.calculateCurrentChanges(var1, var12, var3, var13, var2, var3, var4);
                }

                var16 = this.getMaxCurrentStrength(var1, var12, var14, var13, -1);
                var9 = var1.getBlockMetadata(var2, var3, var4);

                if (var9 > 0)
                {
                    --var9;
                }

                if (var16 >= 0 && var16 != var9)
                {
                    this.calculateCurrentChanges(var1, var12, var14, var13, var2, var3, var4);
                }
            }

            if (var8 < var9 || var9 == 0)
            {
                this.blocksNeedingUpdate.add(new ChunkPosition(var2, var3, var4));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2 - 1, var3, var4));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2 + 1, var3, var4));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2, var3 - 1, var4));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2, var3 + 1, var4));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2, var3, var4 - 1));
                this.blocksNeedingUpdate.add(new ChunkPosition(var2, var3, var4 + 1));
            }
        }
    }

    private void notifyWireNeighborsOfNeighborChange(World var1, int var2, int var3, int var4)
    {
        if (var1.getBlockId(var2, var3, var4) == this.blockID)
        {
            var1.notifyBlocksOfNeighborChange(var2, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                this.altpowered = true;
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.starBridgeOn.blockID);
            }
            else if (!this.powered && this.altpowered)
            {
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.starBridgeOn.blockID);
            }
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        super.breakBlock(var1, var2, var3, var4, var5, var6);

        if (!var1.isRemote)
        {
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            this.updateAndPropagateCurrentStrength(var1, var2, var3, var4);
            this.notifyWireNeighborsOfNeighborChange(var1, var2 - 1, var3, var4);
            this.notifyWireNeighborsOfNeighborChange(var1, var2 + 1, var3, var4);
            this.notifyWireNeighborsOfNeighborChange(var1, var2, var3, var4 - 1);
            this.notifyWireNeighborsOfNeighborChange(var1, var2, var3, var4 + 1);

            if (var1.isBlockNormalCube(var2 - 1, var3, var4))
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2 - 1, var3 + 1, var4);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2 - 1, var3 - 1, var4);
            }

            if (var1.isBlockNormalCube(var2 + 1, var3, var4))
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2 + 1, var3 + 1, var4);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2 + 1, var3 - 1, var4);
            }

            if (var1.isBlockNormalCube(var2, var3, var4 - 1))
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2, var3 + 1, var4 - 1);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2, var3 - 1, var4 - 1);
            }

            if (var1.isBlockNormalCube(var2, var3, var4 + 1))
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2, var3 + 1, var4 + 1);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(var1, var2, var3 - 1, var4 + 1);
            }
        }
    }

    private int getMaxCurrentStrength(World var1, int var2, int var3, int var4, int var5)
    {
        if (var1.getBlockId(var2, var3, var4) != this.blockID)
        {
            return var5;
        }
        else
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            return var6 > var5 ? var6 : var5;
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.isRemote)
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            boolean var7 = this.canPlaceBlockAt(var1, var2, var3, var4);

            if (var7)
            {
                this.updateAndPropagateCurrentStrength(var1, var2, var3, var4);
            }
            else
            {
                this.dropBlockAsItem(var1, var2, var3, var4, var6, 0);
                var1.setBlockWithNotify(var2, var3, var4, 0);
            }

            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                this.altpowered = true;
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.starBridgeOn.blockID);
            }
            else if (!this.powered && this.altpowered)
            {
                var1.setBlockWithNotify(var2, var3, var4, DivineRPG.starBridgeOn.blockID);
            }

            super.onNeighborBlockChange(var1, var2, var3, var4, var5);
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
        {
            var1.setBlockWithNotify(var2, var3, var4, DivineRPG.starBridge.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return Item.redstone.itemID;
    }

    public boolean isIndirectlyPoweringTo(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return !this.wiresProvidePower ? false : this.isPoweringTo(var1, var2, var3, var4, var5);
    }

    public boolean isPoweringTo(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (!this.wiresProvidePower)
        {
            return false;
        }
        else if (var1.getBlockMetadata(var2, var3, var4) == 0)
        {
            return false;
        }
        else if (var5 == 1)
        {
            return true;
        }
        else
        {
            boolean var6 = isPoweredOrRepeater(var1, var2 - 1, var3, var4, 1) || !var1.isBlockNormalCube(var2 - 1, var3, var4) && isPoweredOrRepeater(var1, var2 - 1, var3 - 1, var4, -1);
            boolean var7 = isPoweredOrRepeater(var1, var2 + 1, var3, var4, 3) || !var1.isBlockNormalCube(var2 + 1, var3, var4) && isPoweredOrRepeater(var1, var2 + 1, var3 - 1, var4, -1);
            boolean var8 = isPoweredOrRepeater(var1, var2, var3, var4 - 1, 2) || !var1.isBlockNormalCube(var2, var3, var4 - 1) && isPoweredOrRepeater(var1, var2, var3 - 1, var4 - 1, -1);
            boolean var9 = isPoweredOrRepeater(var1, var2, var3, var4 + 1, 0) || !var1.isBlockNormalCube(var2, var3, var4 + 1) && isPoweredOrRepeater(var1, var2, var3 - 1, var4 + 1, -1);

            if (!var1.isBlockNormalCube(var2, var3 + 1, var4))
            {
                if (var1.isBlockNormalCube(var2 - 1, var3, var4) && isPoweredOrRepeater(var1, var2 - 1, var3 + 1, var4, -1))
                {
                    var6 = true;
                }

                if (var1.isBlockNormalCube(var2 + 1, var3, var4) && isPoweredOrRepeater(var1, var2 + 1, var3 + 1, var4, -1))
                {
                    var7 = true;
                }

                if (var1.isBlockNormalCube(var2, var3, var4 - 1) && isPoweredOrRepeater(var1, var2, var3 + 1, var4 - 1, -1))
                {
                    var8 = true;
                }

                if (var1.isBlockNormalCube(var2, var3, var4 + 1) && isPoweredOrRepeater(var1, var2, var3 + 1, var4 + 1, -1))
                {
                    var9 = true;
                }
            }

            return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5 ? true : (var5 == 2 && var8 && !var6 && !var7 ? true : (var5 == 3 && var9 && !var6 && !var7 ? true : (var5 == 4 && var6 && !var8 && !var9 ? true : var5 == 5 && var7 && !var8 && !var9)));
        }
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return this.wiresProvidePower;
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        int var6 = var1.getBlockMetadata(var2, var3, var4);

        if (var6 > 0)
        {
            double var7 = (double)var2 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
            double var9 = (double)((float)var3 + 0.0625F);
            double var11 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
            float var13 = (float)var6 / 15.0F;
            float var14 = var13 * 0.6F + 0.4F;

            if (var6 == 0)
            {
                var14 = 0.0F;
            }

            float var15 = var13 * var13 * 0.7F - 0.5F;
            float var16 = var13 * var13 * 0.6F - 0.7F;

            if (var15 < 0.0F)
            {
                var15 = 0.0F;
            }

            if (var16 < 0.0F)
            {
                var16 = 0.0F;
            }

            var1.spawnParticle("reddust", var7, var9, var11, (double)var14, (double)var15, (double)var16);
        }
    }

    public static boolean isPowerProviderOrWire(IBlockAccess var0, int var1, int var2, int var3, int var4)
    {
        int var5 = var0.getBlockId(var1, var2, var3);

        if (var5 == DivineRPG.starBridge.blockID)
        {
            return true;
        }
        else if (var5 == 0)
        {
            return false;
        }
        else if (var5 != Block.redstoneRepeaterIdle.blockID && var5 != Block.redstoneRepeaterActive.blockID)
        {
            return Block.blocksList[var5] != null && Block.blocksList[var5].canConnectRedstone(var0, var1, var2, var3, var4);
        }
        else
        {
            int var6 = var0.getBlockMetadata(var1, var2, var3);
            return var4 == (var6 & 3) || var4 == Direction.footInvisibleFaceRemap[var6 & 3];
        }
    }

    public static boolean isPoweredOrRepeater(IBlockAccess var0, int var1, int var2, int var3, int var4)
    {
        if (isPowerProviderOrWire(var0, var1, var2, var3, var4))
        {
            return true;
        }
        else
        {
            int var5 = var0.getBlockId(var1, var2, var3);

            if (var5 == Block.redstoneRepeaterActive.blockID)
            {
                int var6 = var0.getBlockMetadata(var1, var2, var3);
                return var4 == (var6 & 3);
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
