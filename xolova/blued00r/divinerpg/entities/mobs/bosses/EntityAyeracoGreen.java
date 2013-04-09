package xolova.blued00r.divinerpg.entities.mobs.bosses;

import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityAyeracoGreen extends EntityAyeraco
{
    private EntityAyeraco aBlue;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;
    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoGreen(World var1)
    {
        super(var1, "/mob/AyeracoGreen.png", "Green");
    }

    public void initOthers(EntityAyeraco var1, EntityAyeraco var2, EntityAyeraco var3, EntityAyeraco var4)
    {
        this.aBlue = var1;
        this.aRed = var2;
        this.aYellow = var3;
        this.aPurple = var4;
    }

    public void setBeamLocation(int var1, int var2, int var3)
    {
        this.beamX = var1;
        this.beamY = var2;
        this.beamZ = var3;
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource var1)
    {
        super.onDeath(var1);
        this.worldObj.setBlockWithNotify(this.beamX, this.beamY, this.beamZ, 0);
    }

    protected boolean canBlockProjectiles()
    {
        return true;
    }

    protected boolean canTeleport()
    {
        return this.aPurple != null && this.aPurple.abilityActive();
    }

    protected void dropRareDrop(int var1)
    {
        this.dropItem(DivineRPG.enderSwordGreen.itemID, 1);
    }
}
