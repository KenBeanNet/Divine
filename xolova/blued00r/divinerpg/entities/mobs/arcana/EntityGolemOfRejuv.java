package xolova.blued00r.divinerpg.entities.mobs.arcana;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityGolemOfRejuv extends EntityTameable
{
    private int healTimer;

    public EntityGolemOfRejuv(World var1)
    {
        super(var1);
        this.texture = "/mob/HealingGolem.png";
        this.moveSpeed = 0.3F;
        this.setSize(1.0F, 1.0F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIFollowOwner(this, this.moveSpeed, 4.0F, 2.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.healTimer = 0;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public void entityInit()
    {
        super.entityInit();
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Golem of Rejuvination";
    }

    public int getAttackStrength(Entity var1)
    {
        return 0;
    }

    public int getMaxHealth()
    {
        return 60;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Golem";
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        ItemStack var2 = var1.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (var2 != null && Item.itemsList[var2.itemID] instanceof ItemFood)
            {
                ItemFood var3 = (ItemFood)Item.itemsList[var2.itemID];

                if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
                {
                    if (!var1.capabilities.isCreativeMode)
                    {
                        --var2.stackSize;
                    }

                    this.heal(var3.getHealAmount());

                    if (var2.stackSize <= 0)
                    {
                        var1.inventory.setInventorySlotContents(var1.inventory.currentItem, (ItemStack)null);
                    }

                    return true;
                }
            }
        }
        else
        {
            this.setTamed(true);
            this.setOwner(var1.getEntityName());
        }

        return super.interact(var1);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (this.getOwner() != null)
        {
            if (this.healTimer == 4)
            {
                this.getOwner().heal(1);
                this.heal(1);
                this.healTimer = 0;
            }
            else
            {
                ++this.healTimer;
            }
        }
    }

    public void updateAITasks()
    {
        super.updateAITasks();
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    public EntityAgeable createChild(EntityAgeable var1)
    {
        return null;
    }
}
