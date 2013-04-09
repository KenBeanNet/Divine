package xolova.blued00r.divinerpg.entities.projectile.icieka;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityIce extends EntityThrowable
{
    private ItemStack potionDamage;

    public EntityIce(World var1)
    {
        super(var1);
    }

    public EntityIce(World var1, EntityLiving var2, int var3)
    {
        this(var1, var2, new ItemStack(Item.potion, 1, var3));
    }

    public EntityIce(World var1, EntityLiving var2, ItemStack var3)
    {
        super(var1, var2);
        this.potionDamage = var3;
    }

    @SideOnly(Side.CLIENT)
    public EntityIce(World var1, double var2, double var4, double var6, int var8)
    {
        this(var1, var2, var4, var6, new ItemStack(Item.potion, 1, var8));
    }

    public EntityIce(World var1, double var2, double var4, double var6, ItemStack var8)
    {
        super(var1, var2, var4, var6);
        this.potionDamage = var8;
    }

    protected float getGravityVelocity()
    {
        return 0.05F;
    }

    protected float func_70182_d()
    {
        return 0.5F;
    }

    protected float func_70183_g()
    {
        return -20.0F;
    }

    public void setPotionDamage(int var1)
    {
        if (this.potionDamage == null)
        {
            this.potionDamage = new ItemStack(Item.potion, 1, 0);
        }

        this.potionDamage.setItemDamage(var1);
    }

    public int getPotionDamage()
    {
        if (this.potionDamage == null)
        {
            this.potionDamage = new ItemStack(Item.potion, 1, 0);
        }

        return this.potionDamage.getItemDamage();
    }

    protected void onImpact(MovingObjectPosition var1)
    {
        if (!this.worldObj.isRemote)
        {
            List var2 = Item.potion.getEffects(this.potionDamage);

            if (var2 != null && !var2.isEmpty())
            {
                AxisAlignedBB var3 = this.boundingBox.expand(4.0D, 2.0D, 4.0D);
                List var4 = this.worldObj.getEntitiesWithinAABB(EntityLiving.class, var3);

                if (var4 != null && !var4.isEmpty())
                {
                    Iterator var5 = var4.iterator();

                    while (var5.hasNext())
                    {
                        EntityLiving var6 = (EntityLiving)var5.next();
                        double var7 = this.getDistanceSqToEntity(var6);

                        if (var7 < 16.0D)
                        {
                            double var9 = 1.0D - Math.sqrt(var7) / 4.0D;

                            if (var6 == var1.entityHit)
                            {
                                var9 = 1.0D;
                            }

                            Iterator var11 = var2.iterator();

                            while (var11.hasNext())
                            {
                                PotionEffect var12 = (PotionEffect)var11.next();
                                int var13 = var12.getPotionID();

                                if (Potion.potionTypes[var13].isInstant())
                                {
                                    Potion.potionTypes[var13].affectEntity(this.getThrower(), var6, 3, var9);
                                }
                                else
                                {
                                    int var14 = (int)(var9 * (double)var12.getDuration() + 0.5D);

                                    if (var14 > 20 && var6 != this.thrower)
                                    {
                                        var6.addPotionEffect(new PotionEffect(var13, 100, 4));
                                    }
                                }
                            }
                        }
                    }
                }
            }

            this.setDead();
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);

        if (var1.hasKey("Potion"))
        {
            this.potionDamage = ItemStack.loadItemStackFromNBT(var1.getCompoundTag("Potion"));
        }
        else
        {
            this.setPotionDamage(var1.getInteger("potionValue"));
        }

        if (this.potionDamage == null)
        {
            this.setDead();
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);

        if (this.potionDamage != null)
        {
            var1.setCompoundTag("Potion", this.potionDamage.writeToNBT(new NBTTagCompound()));
        }
    }
}
