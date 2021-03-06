package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.particles.EntityMythrilPortalFX;
import xolova.blued00r.divinerpg.teleporter.TeleporterVethea;

public class BlockPortalVethea extends BlockBreakable
{
    private int firetick = 0;
    private int firemax = 200;
    private NBTTagCompound data;

    public BlockPortalVethea(int var1, int var2)
    {
        super(var1, var2, Material.portal, false);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return null;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        float var5;
        float var6;

        if (var1.getBlockId(var2 - 1, var3, var4) != this.blockID && var1.getBlockId(var2 + 1, var3, var4) != this.blockID)
        {
            var5 = 0.125F;
            var6 = 0.5F;
            this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
        }
        else
        {
            var5 = 0.5F;
            var6 = 0.125F;
            this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
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
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean tryToCreatePortal(World var1, int var2, int var3, int var4)
    {
        byte var5 = 0;
        byte var6 = 0;

        if (var1.getBlockId(var2 - 1, var3, var4) == Block.blockSnow.blockID || var1.getBlockId(var2 + 1, var3, var4) == Block.blockSnow.blockID)
        {
            var5 = 1;
        }

        if (var1.getBlockId(var2, var3, var4 - 1) == Block.blockSnow.blockID || var1.getBlockId(var2, var3, var4 + 1) == Block.blockSnow.blockID)
        {
            var6 = 1;
        }

        if (var5 == var6)
        {
            return false;
        }
        else
        {
            if (var1.getBlockId(var2 - var5, var3, var4 - var6) == 0)
            {
                var2 -= var5;
                var4 -= var6;
            }

            int var7;
            int var8;

            for (var7 = -1; var7 <= 2; ++var7)
            {
                for (var8 = -1; var8 <= 3; ++var8)
                {
                    boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

                    if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3)
                    {
                        int var10 = var1.getBlockId(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);

                        if (var9)
                        {
                            if (var10 != Block.blockSnow.blockID)
                            {
                                return false;
                            }
                        }
                        else if (var10 != 0 && var10 != DivineRPG.blueFire.blockID)
                        {
                            return false;
                        }
                    }
                }
            }

            var1.editingBlocks = true;

            for (var7 = 0; var7 < 2; ++var7)
            {
                for (var8 = 0; var8 < 3; ++var8)
                {
                    var1.setBlockWithNotify(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, DivineRPG.iceikaPortal.blockID);
                }
            }

            var1.editingBlocks = false;
            return true;
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        byte var6 = 0;
        byte var7 = 1;

        if (var1.getBlockId(var2 - 1, var3, var4) == this.blockID || var1.getBlockId(var2 + 1, var3, var4) == this.blockID)
        {
            var6 = 1;
            var7 = 0;
        }

        int var8;

        for (var8 = var3; var1.getBlockId(var2, var8 - 1, var4) == this.blockID; --var8)
        {
            ;
        }

        if (var1.getBlockId(var2, var8 - 1, var4) != Block.blockSnow.blockID)
        {
            var1.setBlockWithNotify(var2, var3, var4, 0);
        }
        else
        {
            int var9;

            for (var9 = 1; var9 < 4 && var1.getBlockId(var2, var8 + var9, var4) == this.blockID; ++var9)
            {
                ;
            }

            if (var9 == 3 && var1.getBlockId(var2, var8 + var9, var4) == Block.blockSnow.blockID)
            {
                boolean var10 = var1.getBlockId(var2 - 1, var3, var4) == this.blockID || var1.getBlockId(var2 + 1, var3, var4) == this.blockID;
                boolean var11 = var1.getBlockId(var2, var3, var4 - 1) == this.blockID || var1.getBlockId(var2, var3, var4 + 1) == this.blockID;

                if (var10 && var11)
                {
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                }
                else if ((var1.getBlockId(var2 + var6, var3, var4 + var7) != Block.blockSnow.blockID || var1.getBlockId(var2 - var6, var3, var4 - var7) != this.blockID) && (var1.getBlockId(var2 - var6, var3, var4 - var7) != Block.blockSnow.blockID || var1.getBlockId(var2 + var6, var3, var4 + var7) != this.blockID))
                {
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                }
            }
            else
            {
                var1.setBlockWithNotify(var2, var3, var4, 0);
            }
        }
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (var1.getBlockId(var2, var3, var4) == this.blockID)
        {
            return false;
        }
        else
        {
            boolean var6 = var1.getBlockId(var2 - 1, var3, var4) == this.blockID && var1.getBlockId(var2 - 2, var3, var4) != this.blockID;
            boolean var7 = var1.getBlockId(var2 + 1, var3, var4) == this.blockID && var1.getBlockId(var2 + 2, var3, var4) != this.blockID;
            boolean var8 = var1.getBlockId(var2, var3, var4 - 1) == this.blockID && var1.getBlockId(var2, var3, var4 - 2) != this.blockID;
            boolean var9 = var1.getBlockId(var2, var3, var4 + 1) == this.blockID && var1.getBlockId(var2, var3, var4 + 2) != this.blockID;
            boolean var10 = var6 || var7;
            boolean var11 = var8 || var9;
            return var10 && var5 == 4 ? true : (var10 && var5 == 5 ? true : (var11 && var5 == 2 ? true : var11 && var5 == 3));
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return 1;
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        if (!var1.isRemote)
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                if (var5 instanceof EntityPlayerMP)
                {
                    WorldServer var6 = (WorldServer)var1;
                    EntityPlayerMP var7 = (EntityPlayerMP)var5;

                    if (var5.ridingEntity == null && var5.riddenByEntity == null && var5 instanceof EntityPlayer)
                    {
                        EntityPlayer var8 = (EntityPlayer)var5;
                        this.data = var8.getEntityData().getCompoundTag("PlayerPersisted");
                        NBTTagList var9;

                        if (var7.dimension != DivineRPG.vetheaID)
                        {
                            var7.mcServer.getConfigurationManager().transferPlayerToDimension(var7, DivineRPG.vetheaID, new TeleporterVethea(var7.mcServer.worldServerForDimension(DivineRPG.vetheaID)));
                            this.data.setTag("InventoryOverWorld", var8.inventory.writeToNBT(new NBTTagList()));
                            var8.getEntityData().setCompoundTag("PlayerPersisted", this.data);
                            var8.inventory.clearInventory(-1, -1);
                            var9 = this.data.getTagList("InventoryVethea");
                            var8.inventory.readFromNBT(var9);
                        }
                        else
                        {
                            var7.mcServer.getConfigurationManager().transferPlayerToDimension(var7, 0, new TeleporterVethea(var7.mcServer.worldServerForDimension(0)));
                            this.data.setTag("InventoryVethea", var8.inventory.writeToNBT(new NBTTagList()));
                            var8.getEntityData().setCompoundTag("PlayerPersisted", this.data);
                            var8.inventory.clearInventory(-1, -1);
                            var9 = this.data.getTagList("InventoryOverWorld");
                            var8.inventory.readFromNBT(var9);
                        }
                    }
                }

                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        for (int var6 = 0; var6 < 4; ++var6)
        {
            double var7 = (double)((float)var2 + var5.nextFloat());
            double var9 = (double)((float)var3 + var5.nextFloat());
            double var11 = (double)((float)var4 + var5.nextFloat());
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = var5.nextInt(2) * 2 - 1;
            var13 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
            var15 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
            var17 = ((double)var5.nextFloat() - 0.5D) * 0.5D;

            if (var1.getBlockId(var2 - 1, var3, var4) != this.blockID && var1.getBlockId(var2 + 1, var3, var4) != this.blockID)
            {
                var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
                var13 = (double)(var5.nextFloat() * 2.0F * (float)var19);
            }
            else
            {
                var11 = (double)var4 + 0.5D + 0.25D * (double)var19;
                var17 = (double)(var5.nextFloat() * 2.0F * (float)var19);
            }

            EntityMythrilPortalFX var20 = new EntityMythrilPortalFX(var1, var7, var9, var11, var13, var15, var17);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20, var20);
        }
    }
}
