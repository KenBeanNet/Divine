package xolova.blued00r.divinerpg.client.misc;

import java.util.logging.Level;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler
{
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent var1)
    {
        SoundManager var2 = var1.manager;
        System.out.println("[DivineRPG] Trying to Load Sounds");
        String[] var3 = Sounds.soundFiles;
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5)
        {
            String var6 = var3[var5];

            try
            {
                var2.soundPoolSounds.addSound(var6, this.getClass().getResource("/DivineRPG/sounds/" + var6));
            }
            catch (Exception var8)
            {
                LogHelper.log(Level.WARNING, "[DivineRPG] Failed loading sound file: " + var6);
            }
        }
    }
}
