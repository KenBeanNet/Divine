package xolova.blued00r.divinerpg.misc;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;

public class ArcanaList
{
    private static ArrayList arcanaList = new ArrayList(0);

    public static void add(String var0)
    {
        arcanaList.ensureCapacity(arcanaList.size() + 1);
        arcanaList.add(new ArcanaBar(200, var0));
    }

    public static ArcanaBar get(String var0)
    {
        for (int var1 = 0; var1 < arcanaList.size(); ++var1)
        {
            ArcanaBar var10000 = (ArcanaBar)arcanaList.get(var1);

            if (ArcanaBar.playerID == var0)
            {
                return (ArcanaBar)arcanaList.get(var1);
            }
        }

        add(var0);
        return get(var0);
    }

    public static void remove(String var0)
    {
        ArrayList var1 = arcanaList;

        for (int var2 = 0; var2 < var1.size(); ++var2)
        {
            ArcanaBar var10000 = (ArcanaBar)var1.get(var2);

            if (ArcanaBar.playerID == var0)
            {
                var1.remove(var2);
                var1.trimToSize();
            }
        }
    }

    public static void updateAllBars(List var0)
    {
        ArrayList var1 = arcanaList;

        for (int var2 = 0; var2 < var0.size(); ++var2)
        {
            for (int var3 = 0; var3 < var1.size(); ++var3)
            {
                for (int var4 = 0; var4 < 2; ++var4)
                {
                    ArcanaBar var10000 = (ArcanaBar)var1.get(var3);

                    if (ArcanaBar.playerID == ((EntityPlayer)var0.get(var2)).username && ((ArcanaBar)var1.get(var3)).getBarValue() < 200.0F)
                    {
                        ((ArcanaBar)var1.get(var3)).arcanaRegen(1);
                        ServerPacketHandler.sendArcanaPacket((int)((ArcanaBar)var1.get(var3)).getBarValue(), (EntityPlayer)var0.get(var2));
                    }
                }
            }
        }
    }
}
