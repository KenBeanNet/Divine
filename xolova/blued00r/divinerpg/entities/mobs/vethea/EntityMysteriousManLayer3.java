package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer3 extends EntityGive
{
    public int spawnLayer = 3;

    public EntityMysteriousManLayer3(World var1)
    {
        super(var1, DivineRPG.pardimalLump, 10);
        this.texture = "/mob/MysteriousManLayer3.png";
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * (double)this.spawnLayer && this.posY > 64.0D * (double)(this.spawnLayer - 1) && super.getCanSpawnHere();
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);

                switch (this.rand.nextInt(3))
                {
                    case 0:
                        var1.addChatMessage("Mysterious Man: Infuse this, I can feel the stength when you do.");
                        break;

                    case 1:
                        var1.addChatMessage("Mysterious Man: Thank you for aiding me in my plan.");
                        break;

                    case 2:
                        var1.addChatMessage("Mysterious Man: The surface is just above us.");
                }
            }

            return true;
        }
        else
        {
            return super.interact(var1);
        }
    }
}
