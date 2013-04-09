package xolova.blued00r.divinerpg.misc;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

public class ServerPacketHandler implements IPacketHandler
{
    public void onPacketData(INetworkManager var1, Packet250CustomPayload var2, Player var3)
    {
        new DataInputStream(new ByteArrayInputStream(var2.data));
        EntityPlayer var4 = (EntityPlayer)var3;
    }

    public static void sendArcanaPacket(int var0, EntityPlayer var1)
    {
        int var2 = var0;
        ByteArrayOutputStream var3 = new ByteArrayOutputStream(8);
        DataOutputStream var4 = new DataOutputStream(var3);

        try
        {
            var4.writeInt(var2);
        }
        catch (Exception var6)
        {
            var6.printStackTrace();
        }

        Packet250CustomPayload var5 = new Packet250CustomPayload();
        var5.channel = "Arcana";
        var5.data = var3.toByteArray();
        var5.length = var3.size();
        PacketDispatcher.sendPacketToPlayer(var5, (Player)var1);
    }
}
