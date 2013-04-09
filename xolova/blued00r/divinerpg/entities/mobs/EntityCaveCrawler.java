package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityCaveCrawler extends EntityMob
{
    public EntityCaveCrawler(World var1)
    {
        super(var1);
        this.texture = "/mob/crawler.png";
        this.setSize(1.5F, 2.0F);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Crawler";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.CrawlerHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.CrawlerHit";
    }

    public int getMaxHealth()
    {
        return 30;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return !this.worldObj.isRemote && this.worldObj.difficultySetting > 0 ? 12 : 12;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.realmiteIngot.itemID;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(1))
        {
            case 0:
                this.entityDropItem(new ItemStack(Item.potion.itemID, 1, 8196), 0.0F);

            default:
        }
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
        return this.posY < 35.0D && super.getCanSpawnHere();
    }
}
