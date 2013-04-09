package xolova.blued00r.divinerpg.misc;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import xolova.blued00r.divinerpg.client.misc.LanguageHelper;

public class CommonProxy
{
    public void renderRegistry() {}

    public void soundRegistry() {}

    public int addArmor(String var1)
    {
        return 0;
    }

    public void registerTickHandlers()
    {
        TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
    }

    public int getRenderID()
    {
        return 0;
    }

    public void addNames()
    {
        LanguageHelper.addNames();
    }

    public void addAchievements() {}

    public void addBlocks()
    {
        ModBlocks.init();
    }

    public void addCraftingMaterials()
    {
        CraftingMaterial.setMaterials();
    }

    public void defineEntities()
    {
        EntityHelper.defineEntities();
    }

    public void addEntities()
    {
        EntityHelper.addEntities();
    }

    public void addRecipes()
    {
        RecipeHelper.addRecipes();
    }
}
