package xolova.blued00r.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.teleporter.TeleporterArcana;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class BlockPortalArcana extends Block
{
    private int firetick;
    private int firemax = 200;

    public BlockPortalArcana(int var1, Material var2)
    {
        super(var1, 0, var2);
        this.setLightValue(1.0F);
        this.blockIndexInTexture = 183;
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
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity var7) {}

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        if (this.firetick == this.firemax && this.firemax != 0)
        {
            if (var5 instanceof EntityPlayerMP && var5.ridingEntity == null && var5.riddenByEntity == null && !var1.isRemote)
            {
                EntityPlayerMP var6 = (EntityPlayerMP)var5;
                var6.addStat(AchievementPageDivineRPG.liesWithin, 1);
                var1.playSound((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "xolovon.ArcanaPortal", 0.5F, ((EntityPlayerMP)var5).getRNG().nextFloat() * 0.4F + 0.8F, false);

                if (var6.dimension != 10)
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, DivineRPG.arcanaID, new TeleporterArcana(var6.mcServer.worldServerForDimension(DivineRPG.arcanaID)));
                }
                else
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, 0, new TeleporterArcana(var6.mcServer.worldServerForDimension(0)));
                }
            }

            this.firetick = 0;
        }
        else
        {
            ++this.firetick;
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        double var6 = (double)((float)var2 + var5.nextFloat());
        double var8 = (double)((float)var3 + 0.8F);
        double var10 = (double)((float)var4 + var5.nextFloat());
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = 0.0D;
        var1.spawnParticle("smoke", var6, var8, var10, var12, var14, var16);
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World var1, int var2, int var3, int var4)
    {
        return 0;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
