package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityJungleSpider extends EntitySpider
{
    public EntityJungleSpider(World var1)
    {
        super(var1);
        this.texture = "/mob/junglespider.png";
        this.setSize(1.4F, 0.9F);
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 16;
    }

    public int getMaxHealth()
    {
        return 120;
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        int var2 = this.getAttackStrength(var1);

        if (this.isPotionActive(Potion.damageBoost))
        {
            var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }

        if (this.isPotionActive(Potion.weakness))
        {
            var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }

        int var3 = 0;

        if (var1 instanceof EntityLiving)
        {
            var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLiving)var1);
            var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLiving)var1);
        }

        boolean var4 = var1.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
            if (var3 > 0)
            {
                var1.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            ((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 20, 0));
            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                var1.setFire(var5 * 4);
            }
        }

        return var4;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.JungleSpider";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.greenShard.itemID;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(2 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(DivineRPG.greenShard.itemID, 1);
        }

        var3 = this.rand.nextInt(2 + var2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(DivineRPG.greenShard.itemID, 2);
        }
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
}
