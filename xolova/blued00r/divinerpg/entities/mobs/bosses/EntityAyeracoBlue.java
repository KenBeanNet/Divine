package xolova.blued00r.divinerpg.entities.mobs.bosses;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityAyeracoBlue extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;
    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoBlue(World var1)
    {
        super(var1, "/mob/AyeracoBlue.png", "Blue");
    }

    public void initOthers(EntityAyeraco var1, EntityAyeraco var2, EntityAyeraco var3, EntityAyeraco var4)
    {
        this.aGreen = var1;
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
        return this.aGreen != null && this.aGreen.abilityActive();
    }

    protected void tickAbility()
    {
        this.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));

        if (this.aGreen != null && !this.aGreen.isDead)
        {
            this.aGreen.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }

        if (this.aYellow != null && !this.aYellow.isDead)
        {
            this.aYellow.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }

        if (this.aRed != null && !this.aRed.isDead)
        {
            this.aRed.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }

        if (this.aPurple != null && !this.aPurple.isDead)
        {
            this.aPurple.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }
    }

    protected boolean canTeleport()
    {
        return this.aPurple != null && this.aPurple.abilityActive();
    }

    protected void dropRareDrop(int var1)
    {
        this.dropItem(DivineRPG.enderSwordBlue.itemID, 1);
    }
}
