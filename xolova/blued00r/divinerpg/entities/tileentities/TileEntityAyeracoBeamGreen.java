package xolova.blued00r.divinerpg.entities.tileentities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAyeracoBeamGreen extends TileEntity
{
    @SideOnly(Side.CLIENT)
    private long field_82137_b;
    @SideOnly(Side.CLIENT)
    private float field_82138_c;
    private boolean field_82135_d;

    @SideOnly(Side.CLIENT)
    public float func_82125_v_()
    {
        int var1 = (int)(this.worldObj.getTotalWorldTime() - this.field_82137_b);
        this.field_82137_b = this.worldObj.getTotalWorldTime();

        if (var1 > 1)
        {
            this.field_82138_c -= (float)var1 / 40.0F;

            if (this.field_82138_c < 0.0F)
            {
                this.field_82138_c = 0.0F;
            }
        }

        this.field_82138_c += 0.025F;

        if (this.field_82138_c > 1.0F)
        {
            this.field_82138_c = 1.0F;
        }

        return this.field_82138_c;
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 3, var1);
    }

    @SideOnly(Side.CLIENT)
    public double func_82115_m()
    {
        return 65536.0D;
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
    }
}
