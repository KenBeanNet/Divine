package xolova.blued00r.divinerpg.client.misc;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ClientPacketHandler implements IPacketHandler
{
    public void onPacketData(INetworkManager var1, Packet250CustomPayload var2, Player var3)
    {
        new DataInputStream(new ByteArrayInputStream(var2.data));

        if (var2.channel.equals("Arcana"))
        {
            this.handleArcana(var2);
        }
    }

    private void handleArcana(Packet250CustomPayload var1)
    {
        DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(var1.data));
        int var3;

        try
        {
            var3 = var2.readInt();
        }
        catch (IOException var5)
        {
            var5.printStackTrace();
            return;
        }

        ArcanaList.get(Minecraft.getMinecraft().thePlayer.username).setArcana(var3);
    }
}
