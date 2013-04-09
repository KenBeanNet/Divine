package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityCryptKeeper extends EntityGive
{
    public EntityCryptKeeper(World var1)
    {
        super(var1, DivineRPG.amthrimisLump, 5);
        this.texture = "/mob/TempleGuardian.png";
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

                switch (this.rand.nextInt(5))
                {
                    case 0:
                        var1.addChatMessage("Crypt Keeper: You are safer down here.");
                        break;

                    case 1:
                        var1.addChatMessage("Crypt Keeper: Beware of the higher layers.");
                        break;

                    case 2:
                        var1.addChatMessage("Crypt Keeper: Take this reward, use it wisely.");
                        break;

                    case 3:
                        var1.addChatMessage("Crypt Keeper: What the future holds is dark.");
                        break;

                    case 4:
                        var1.addChatMessage("Crypt Keeper: This isn\'t a nice world.");
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
