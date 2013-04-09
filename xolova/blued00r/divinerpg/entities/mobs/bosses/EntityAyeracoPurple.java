package xolova.blued00r.divinerpg.entities.mobs.bosses;

import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityAyeracoPurple extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;
    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoPurple(World var1)
    {
        super(var1, "/mob/AyeracoPurple.png", "Purple");
    }

    public void initOthers(EntityAyeraco var1, EntityAyeraco var2, EntityAyeraco var3, EntityAyeraco var4)
    {
        this.aGreen = var1;
        this.aBlue = var2;
        this.aRed = var3;
        this.aYellow = var4;
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
        return this.aGreen != null && this.aGreen.abilityActive();
    }

    protected boolean canTeleport()
    {
        return true;
    }

    protected void dropRareDrop(int var1)
    {
        this.dropItem(DivineRPG.enderSword.itemID, 1);
    }
}
