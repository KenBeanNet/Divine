package xolova.blued00r.divinerpg.misc;

import java.util.Arrays;
import java.util.HashMap;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class RecipesInfusionTable
{
    public static HashMap recipes = new HashMap();
    public static HashMap numbero = new HashMap();

    public RecipesInfusionTable()
    {
        recipes();
    }

    public static void recipes()
    {
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 4, new ItemStack(DivineRPG.teakerBow));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisBow));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 6, new ItemStack(DivineRPG.darvenBow));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 8, new ItemStack(DivineRPG.cermileBow));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalBow));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticBow));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 18, new ItemStack(DivineRPG.karosBow));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisBow));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeBow));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 2, new ItemStack(DivineRPG.teakerClaw));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 3, new ItemStack(DivineRPG.amthrimisClaw));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 4, new ItemStack(DivineRPG.darvenClaw));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 6, new ItemStack(DivineRPG.cermileClaw));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 8, new ItemStack(DivineRPG.pardimalClaw));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 10, new ItemStack(DivineRPG.quadroticClaw));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 16, new ItemStack(DivineRPG.karosClaw));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 17, new ItemStack(DivineRPG.heliosisClaw));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 21, new ItemStack(DivineRPG.arksianeClaw));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 4, new ItemStack(DivineRPG.teakerDisk));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisDisk));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 6, new ItemStack(DivineRPG.darvenDisk));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 8, new ItemStack(DivineRPG.cermileDisk));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalDisk));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticDisk));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 18, new ItemStack(DivineRPG.karosDisk));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisDisk));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeDisk));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 4, new ItemStack(DivineRPG.teakerSword));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisSword));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 6, new ItemStack(DivineRPG.darvenSword));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 8, new ItemStack(DivineRPG.cermileSword));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalSword));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticSword));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 18, new ItemStack(DivineRPG.karosSword));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisSword));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeSword));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 7, new ItemStack(DivineRPG.teakerHammer));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 9, new ItemStack(DivineRPG.amthrimisHammer));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 11, new ItemStack(DivineRPG.darvenHammer));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 14, new ItemStack(DivineRPG.cermileHammer));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 17, new ItemStack(DivineRPG.pardimalHammer));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 19, new ItemStack(DivineRPG.quadroticHammer));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 22, new ItemStack(DivineRPG.karosHammer));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 27, new ItemStack(DivineRPG.heliosisHammer));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 31, new ItemStack(DivineRPG.arksianeHammer));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 7, new ItemStack(DivineRPG.teakerCannon));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 9, new ItemStack(DivineRPG.amthrimisCannon));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 11, new ItemStack(DivineRPG.darvenCannon));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 14, new ItemStack(DivineRPG.cermileCannon));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 17, new ItemStack(DivineRPG.pardimalCannon));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 19, new ItemStack(DivineRPG.quadroticCannon));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 22, new ItemStack(DivineRPG.karosCannon));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 27, new ItemStack(DivineRPG.heliosisCannon));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 31, new ItemStack(DivineRPG.arksianeCannon));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 7, new ItemStack(DivineRPG.teakerStaff));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 9, new ItemStack(DivineRPG.amthrimisStaff));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 11, new ItemStack(DivineRPG.darvenStaff));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 14, new ItemStack(DivineRPG.cermileStaff));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 17, new ItemStack(DivineRPG.pardimalStaff));
        addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 19, new ItemStack(DivineRPG.quadroticStaff));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 22, new ItemStack(DivineRPG.karosStaff));
        addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 27, new ItemStack(DivineRPG.heliosisStaff));
        addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanStaffTemplate.itemID, 31, new ItemStack(DivineRPG.arksianeStaff));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 7, new ItemStack(DivineRPG.degradedHelmetMelee));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 9, new ItemStack(DivineRPG.degradedHelmetRanged));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 6, new ItemStack(DivineRPG.degradedHelmetArcana));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 5, new ItemStack(DivineRPG.degradedBoots));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 8, new ItemStack(DivineRPG.degradedLegs));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 10, new ItemStack(DivineRPG.degradedChest));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 9, new ItemStack(DivineRPG.finishedHelmetMelee));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 11, new ItemStack(DivineRPG.finishedHelmetRanged));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 6, new ItemStack(DivineRPG.finishedHelmetArcana));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 8, new ItemStack(DivineRPG.finishedBoots));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 10, new ItemStack(DivineRPG.finishedLegs));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 12, new ItemStack(DivineRPG.finishedChest));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 14, new ItemStack(DivineRPG.glisteningHelmetMelee));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 16, new ItemStack(DivineRPG.glisteningHelmetRanged));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 13, new ItemStack(DivineRPG.glisteningHelmetArcana));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 12, new ItemStack(DivineRPG.glisteningBoots));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 15, new ItemStack(DivineRPG.glisteningLegs));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 17, new ItemStack(DivineRPG.glisteningChest));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 22, new ItemStack(DivineRPG.demonizedHelmetMelee));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 26, new ItemStack(DivineRPG.demonizedHelmetRanged));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 20, new ItemStack(DivineRPG.demonizedHelmetArcana));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 18, new ItemStack(DivineRPG.demonizedBoots));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 24, new ItemStack(DivineRPG.demonizedLegs));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 28, new ItemStack(DivineRPG.demonizedChest));
        addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 26, new ItemStack(DivineRPG.tormentedHelmetMelee));
        addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 32, new ItemStack(DivineRPG.tormentedHelmetRanged));
        addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 23, new ItemStack(DivineRPG.tormentedHelmetArcana));
        addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 20, new ItemStack(DivineRPG.tormentedBoots));
        addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 29, new ItemStack(DivineRPG.tormentedLegs));
        addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 35, new ItemStack(DivineRPG.tormentedChest));
    }

    public static void addRecipe(int var0, int var1, int var2, ItemStack var3)
    {
        if (var0 != 0 && var3 != null)
        {
            recipes.put(Arrays.asList(new Integer[] {Integer.valueOf(var0), Integer.valueOf(var1), (Integer)numbero.put(Arrays.asList(new Integer[]{Integer.valueOf(var0), Integer.valueOf(var1)}), Integer.valueOf(var2))}), var3);
        }
    }

    public static ItemStack getResult(int var0, int var1)
    {
        ItemStack var2 = (ItemStack)recipes.get(Arrays.asList(new Integer[] {Integer.valueOf(var0), Integer.valueOf(var1), (Integer)numbero.get(Arrays.asList(new Integer[]{Integer.valueOf(var0), Integer.valueOf(var1)}))}));
        return var2 != null ? var2 : null;
    }

    public static int getStackSize(int var0, int var1)
    {
        int var2 = ((Integer)numbero.get(Arrays.asList(new Integer[] {Integer.valueOf(var0), Integer.valueOf(var1)}))).intValue();
        return var2 != 0 ? var2 : 0;
    }
}
