package xolova.blued00r.divinerpg.client.render.bosses;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import xolova.blued00r.divinerpg.entities.mobs.bosses.EntityVamacheron;

@SideOnly(Side.CLIENT)
public class RenderVamacheron extends RenderLiving
{
    public RenderVamacheron(ModelBase var1, float var2)
    {
        super(var1, var2);
    }

    public void renderCow(EntityVamacheron var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.func_82824_a(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityVamacheron)var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityVamacheron)var1, var2, var4, var6, var8, var9);
    }
}
