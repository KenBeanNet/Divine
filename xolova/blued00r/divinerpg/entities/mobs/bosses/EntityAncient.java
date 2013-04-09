package xolova.blued00r.divinerpg.entities.mobs.bosses;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityAncient extends EntityMob
{
    private int field_48119_b = 0;
    Village villageObj = null;
    private int field_48120_c;
    private int field_48118_d;

    public EntityAncient(World var1)
    {
        super(var1);
        this.texture = "/mob/ancientEntity.png";
        this.setSize(4.0F, 9.0F);
        this.isImmuneToFire = true;
        this.moveSpeed = 0.5F;
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "The Ancient Entity";
    }

    public int getDragonHealth()
    {
        return this.getHealth();
    }

    protected void entityInit()
    {
        super.entityInit();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 16;
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        super.attackEntityAsMob(var1);

        if (this.entityToAttack != null)
        {
            this.entityToAttack.addVelocity(this.motionX * 10.0D, 3.0D, this.motionZ * 10.0D);

            if (this.entityToAttack instanceof EntityLiving)
            {
                ((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0));
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    public int getMaxHealth()
    {
        return 4000;
    }

    /**
     * Decrements the entity's air supply when underwater
     */
    protected int decreaseAirSupply(int var1)
    {
        return var1;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "none";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.irongolem.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        byte var3 = 1;
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(DivineRPG.sandSlash.itemID, 1);
        }

        int var5 = 3 + this.rand.nextInt(4);

        for (var4 = 0; var4 < var5; ++var4)
        {
            this.dropItem(DivineRPG.yellowShard.itemID, 1);
        }

        if (this.rand.nextInt(3) == 0)
        {
            this.dropItem(DivineRPG.AEStatue.blockID, 1);
        }
    }

    /**
     * knocks back this entity
     */
    public void knockBack(Entity var1, int var2, double var3, double var5) {}
}
