package xolova.blued00r.divinerpg.blocks;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockPortalArcanaFrame extends Block
{
    public BlockPortalArcanaFrame(int var1)
    {
        super(var1, 159, Material.rock);
        this.blockIndexInTexture = 181;
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
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 26;
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity var7)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
        super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
        int var8 = var1.getBlockMetadata(var2, var3, var4);

        if (isEnderEyeInserted(var8))
        {
            this.setBlockBounds(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.addCollidingBlockToList(var1, var2, var3, var4, var5, var6, var7);
        }

        this.setBlockBoundsForItemRender();
    }

    public static boolean isEnderEyeInserted(int var0)
    {
        return (var0 & 4) != 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return 0;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = ((MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
        var1.setBlockMetadataWithNotify(var2, var3, var4, var6);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (var1.getBlockId(var2, var3, var4) == this.blockID && var1.getBlockId(var2, var3, var4 + 1) == this.blockID && var1.getBlockId(var2, var3, var4 + 2) == this.blockID && var1.getBlockId(var2 + 1, var3, var4 + 3) == this.blockID && var1.getBlockId(var2 + 2, var3, var4 + 3) == this.blockID && var1.getBlockId(var2 + 3, var3, var4 + 3) == this.blockID && var1.getBlockId(var2 + 4, var3, var4) == this.blockID && var1.getBlockId(var2 + 4, var3, var4 + 1) == this.blockID && var1.getBlockId(var2 + 4, var3, var4 + 2) == this.blockID && var1.getBlockId(var2 + 1, var3, var4 - 1) == this.blockID && var1.getBlockId(var2 + 2, var3, var4 - 1) == this.blockID && var1.getBlockId(var2 + 3, var3, var4 - 1) == this.blockID)
        {
            var1.setBlockWithNotify(var2 + 1, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 1, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 1, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
