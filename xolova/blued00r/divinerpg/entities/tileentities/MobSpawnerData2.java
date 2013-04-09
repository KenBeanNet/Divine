package xolova.blued00r.divinerpg.entities.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.WeightedRandomItem;

class MobSpawnerData2 extends WeightedRandomItem
{
    public final NBTTagCompound field_92032_b;
    public final String field_92033_c;
    final TileEntityRollumSpawner field_92031_d;

    public MobSpawnerData2(TileEntityRollumSpawner var1, NBTTagCompound var2)
    {
        super(var2.getInteger("Weight"));
        this.field_92031_d = var1;
        this.field_92032_b = var2.getCompoundTag("Properties");
        this.field_92033_c = var2.getString("Type");
    }

    public MobSpawnerData2(TileEntityRollumSpawner var1, NBTTagCompound var2, String var3)
    {
        super(1);
        this.field_92031_d = var1;
        this.field_92032_b = var2;
        this.field_92033_c = var3;
    }

    public NBTTagCompound func_92030_a()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        var1.setCompoundTag("Properties", this.field_92032_b);
        var1.setString("Type", this.field_92033_c);
        var1.setInteger("Weight", this.itemWeight);
        return var1;
    }
}
