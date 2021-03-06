package xolova.blued00r.divinerpg.entities.mobs.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityConstructor extends EntityZombie
{
    int angerLevel;

    public EntityConstructor(World var1)
    {
        super(var1);
        this.texture = "/mob/Constructor.png";
        this.moveSpeed = 0.23F;
        this.setSize(0.5F, 1.9F);
        this.angerLevel = 0;
        this.stepHeight = 1.0F;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 25;
    }

    public int getMaxHealth()
    {
        return 100;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return "/mob/Constructor.png";
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.entityToAttack != null)
        {
            this.faceEntity(this.entityToAttack, 100.0F, 100.0F);
        }

        if (!this.worldObj.isRemote && this.isEntityAlive() && this.entityToAttack != null && this.entityToAttack instanceof EntityPlayer && this.angerLevel < 3)
        {
            this.moveStrafing = this.moveForward = 0.0F;
            this.moveSpeed = 0.0F;
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.dungeonConstructorHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        switch (this.rand.nextInt(4))
        {
            case 0:
                return DivineRPG.key1.itemID;

            case 1:
                return DivineRPG.key2.itemID;

            case 2:
                return DivineRPG.key3.itemID;

            case 3:
                return DivineRPG.key4.itemID;

            default:
                return 0;
        }
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public void teleportToEntity(Entity var1, int var2, int var3, int var4)
    {
        this.setPosition(var1.posX, var1.posY, var1.posZ);
        this.findPlayerToAttack();
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkIfAABBIsClear(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty();
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        this.worldObj.playSoundAtEntity(this, "mob.RPG.dungeonConstructorPunch", 1.0F, 1.0F);
        return super.attackEntityAsMob(var1);
    }
}
