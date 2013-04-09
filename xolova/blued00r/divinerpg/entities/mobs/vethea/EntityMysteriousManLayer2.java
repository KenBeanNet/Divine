package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer2 extends EntityGive
{
    public int spawnLayer = 2;

    public EntityMysteriousManLayer2(World var1)
    {
        super(var1, DivineRPG.darvenLump, 6);
        this.texture = "/mob/MysteriousManLayer2.png";
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

                switch (this.rand.nextInt(4))
                {
                    case 0:
                        var1.addChatMessage("Mysterious Man: You\'re progressing, good good.");
                        break;

                    case 1:
                        var1.addChatMessage("Mysterious Man: Can you hear the screams and roars from above?");
                        break;

                    case 2:
                        var1.addChatMessage("Mysterious Man: Everytime you infuse something, the gods become stronger.");
                        break;

                    case 3:
                        var1.addChatMessage("Mysterious Man: The gods are using your dreams as a battlefield.");
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
