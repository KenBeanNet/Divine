package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer1 extends EntityGive
{
    public int spawnLayer = 1;

    public EntityMysteriousManLayer1(World var1)
    {
        super(var1, DivineRPG.teakerLump, 3);
        this.texture = "/mob/MysteriousManLayer.png";
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
                        var1.addChatMessage("Mysterious Man: You look new around here. Be careful.");
                        break;

                    case 1:
                        var1.addChatMessage("Mysterious Man: Take these, use them at an infusion table.");
                        break;

                    case 2:
                        var1.addChatMessage("Mysterious Man: Don\'t tell anybody you saw me.");
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
