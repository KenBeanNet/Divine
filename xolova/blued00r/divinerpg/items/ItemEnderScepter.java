package xolova.blued00r.divinerpg.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemEnderScepter extends Item
{
    private Random rand = new Random();

    public ItemEnderScepter(int var1)
    {
        super(var1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        float var4 = var3.rotationPitch;
        float var5 = var3.rotationYaw;
        double var6 = var3.posX;
        double var8 = var3.posY + 1.62D - (double)var3.yOffset;
        double var10 = var3.posZ;
        Vec3 var12 = var2.getWorldVec3Pool().getVecFromPool(var6, var8, var10);
        float var13 = MathHelper.cos(-var5 * 0.01745329F - (float)Math.PI);
        float var14 = MathHelper.sin(-var5 * 0.01745329F - (float)Math.PI);
        float var15 = -MathHelper.cos(-var4 * 0.01745329F);
        float var16 = MathHelper.sin(-var4 * 0.01745329F);
        float var17 = var14 * var15;
        float var18 = var13 * var15;
        double var19 = 30.0D;
        Vec3 var21 = var12.addVector((double)var17 * var19, (double)var16 * var19, (double)var18 * var19);
        MovingObjectPosition var22 = var2.rayTraceBlocks_do(var12, var21, false);

        if (var22 == null)
        {
            return var1;
        }
        else
        {
            if (var22.typeOfHit == EnumMovingObjectType.TILE)
            {
                int var23 = var22.blockX;
                int var24 = var22.blockY;
                int var25 = var22.blockZ;
                int var26 = var22.sideHit;

                if (var26 == 0)
                {
                    --var24;
                }

                if (var26 == 1)
                {
                    ++var24;
                }

                if (var26 == 2)
                {
                    --var25;
                }

                if (var26 == 3)
                {
                    ++var25;
                }

                if (var26 == 4)
                {
                    --var23;
                }

                if (var26 == 5)
                {
                    ++var23;
                }

                if (ArcanaList.get(var3.username).arcanaUse(75))
                {
                    var3.getLook(1.0F);
                    this.teleportTo(var3, var2, (double)var23, (double)var24, (double)var25);
                }
            }

            return var1;
        }
    }

    protected void teleportTo(EntityPlayer var1, World var2, double var3, double var5, double var7)
    {
        var1.setPosition(var3, var5, var7);
        var2.playSoundAtEntity(var1, "mob.endermen.portal", 1.0F, 1.0F);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
        var3.add("75 Arcana");
        var3.add("On use: Teleports the player");
    }
}
