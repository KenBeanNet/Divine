package xolova.blued00r.divinerpg.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;
import xolova.blued00r.divinerpg.entities.mobs.EntityKingCrab;

public class RenderKingCrab extends RenderLiving
{
    private float scale;

    public RenderKingCrab(ModelBase var1, float var2, float var3)
    {
        super(var1, var2 * var3);
        this.scale = var3;
    }

    protected void preRenderScale(EntityKingCrab var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        this.preRenderScale((EntityKingCrab)var1, var2);
    }
}
