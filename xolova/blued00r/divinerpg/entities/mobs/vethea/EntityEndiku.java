package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityEndiku extends EntityMob
{
    private static final double spawnLayer = 3.0D;
    public int eatX;
    public int eatY;
    public int eatZ;
    public int[] edible;
    private boolean isEaten;
    private int ability;

    public EntityEndiku(World var1)
    {
        super(var1);
        this.edible = new int[] {Block.wood.blockID, DivineRPG.firewood.blockID, DivineRPG.mintwood.blockID, DivineRPG.hyrewood.blockID, DivineRPG.dreamwood.blockID};
        this.texture = "/mob/Endiku.png";
        this.moveSpeed = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * 3.0D && this.posY > 64.0D * (3.0D - 1.0D) && super.getCanSpawnHere();
    }

    protected void updateAITasks()
    {
        System.out.println(this.health);

        if ((double)this.health < (double)this.getMaxHealth() * 0.2D && !this.isEaten)
        {
            for (int var1 = (int)this.posX - 2; var1 < (int)this.posX + 16; ++var1)
            {
                for (int var2 = (int)this.posZ - 2; var2 < (int)this.posZ + 16; ++var2)
                {
                    for (int var3 = (int)this.posY - 2; var3 < (int)this.posY + 2; ++var3)
                    {
                        boolean var4 = this.worldObj.getBlockMaterial(var1, (int)this.posY, var2) == Material.wood;
                        if (var4)
                        {
                            this.isEaten = true;
                            this.eatX = var1;
                            this.eatY = (int)this.posY;
                            this.eatZ = var2;
                        }
                    }
                }
            }
        }

        super.updateAITasks();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.isEaten && this.ability == 0)
        {
            if (this.getDistance((double)this.eatX, (double)this.eatY, (double)this.eatZ) < 2.0D)
            {
                this.heal(this.getMaxHealth() / 8);
                this.worldObj.setBlockWithNotify(this.eatX, this.eatY, this.eatZ, 0);
                this.isEaten = false;
                this.ability = 5;
            }
            else
            {
                this.getMoveHelper().setMoveTo((double)this.eatX, (double)this.eatY, (double)this.eatZ, this.moveSpeed);
                this.getLookHelper().setLookPosition((double)this.eatX, (double)this.eatY, (double)this.eatZ, 15.0F, 15.0F);
                this.moveEntityWithHeading(0.0F, this.moveSpeed / 4.0F);
            }
        }
        else if (this.isEaten && this.ability > 0)
        {
            --this.ability;
        }
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 17;
    }

    public int getMaxHealth()
    {
        return 70;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.7F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Endiku";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.EndikuHit";
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(DivineRPG.polishedPearls.itemID, 1);
    }
}
