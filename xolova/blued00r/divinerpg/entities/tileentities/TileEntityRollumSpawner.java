package xolova.blued00r.divinerpg.entities.tileentities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.WeightedRandom;
import net.minecraft.world.World;

public class TileEntityRollumSpawner extends TileEntityMobSpawner
{
    /** The stored delay before a new spawn. */
    public int delay = -1;
    private String mobID = "DivineRPG.rollum";
    private List field_92016_e = null;
    private MobSpawnerData2 spawnerTags = null;
    public double yaw;
    public double yaw2 = 0.0D;
    private int minSpawnDelay = 200;
    private int maxSpawnDelay = 800;
    private int spawnCount = 4;
    private Entity spawnedMob;

    /** Maximum number of entities for limiting mob spawning */
    private int maxNearbyEntities = 6;

    /** Required player range for mob spawning to occur */
    private int requiredPlayerRange = 16;

    /** Range for spawning new entities with mob spawners */
    private int spawnRange = 4;

    public TileEntityRollumSpawner()
    {
        this.delay = 20;
    }

    public String getMobID()
    {
        return this.spawnerTags == null ? this.mobID : this.spawnerTags.field_92033_c;
    }

    public void setMobID(String var1)
    {
        this.mobID = var1;
    }

    /**
     * Returns true if there is a player in range (using World.getClosestPlayer)
     */
    public boolean anyPlayerInRange()
    {
        return this.worldObj.getClosestPlayer((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D, (double)this.requiredPlayerRange) != null;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        if (this.anyPlayerInRange())
        {
            double var1;

            if (this.worldObj.isRemote)
            {
                double var3 = (double)((float)this.xCoord + this.worldObj.rand.nextFloat());
                double var5 = (double)((float)this.yCoord + this.worldObj.rand.nextFloat());
                var1 = (double)((float)this.zCoord + this.worldObj.rand.nextFloat());
                this.worldObj.spawnParticle("smoke", var3, var5, var1, 0.0D, 0.0D, 0.0D);
                this.worldObj.spawnParticle("flame", var3, var5, var1, 0.0D, 0.0D, 0.0D);

                if (this.delay > 0)
                {
                    --this.delay;
                }

                this.yaw2 = this.yaw;
                this.yaw = (this.yaw + (double)(1000.0F / ((float)this.delay + 200.0F))) % 360.0D;
            }
            else
            {
                if (this.delay == -1)
                {
                    this.updateDelay();
                }

                if (this.delay > 0)
                {
                    --this.delay;
                    return;
                }

                boolean var12 = false;

                for (int var4 = 0; var4 < this.spawnCount; ++var4)
                {
                    Entity var13 = EntityList.createEntityByName(this.getMobID(), this.worldObj);

                    if (var13 == null)
                    {
                        return;
                    }

                    int var6 = this.worldObj.getEntitiesWithinAABB(var13.getClass(), AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand((double)(this.spawnRange * 2), 4.0D, (double)(this.spawnRange * 2))).size();

                    if (var6 >= this.maxNearbyEntities)
                    {
                        this.updateDelay();
                        return;
                    }

                    if (var13 != null)
                    {
                        var1 = (double)this.xCoord + (this.worldObj.rand.nextDouble() - this.worldObj.rand.nextDouble()) * (double)this.spawnRange;
                        double var7 = (double)(this.yCoord + this.worldObj.rand.nextInt(3) - 1);
                        double var9 = (double)this.zCoord + (this.worldObj.rand.nextDouble() - this.worldObj.rand.nextDouble()) * (double)this.spawnRange;
                        EntityLiving var11 = var13 instanceof EntityLiving ? (EntityLiving)var13 : null;
                        var13.setLocationAndAngles(var1, var7, var9, this.worldObj.rand.nextFloat() * 360.0F, 0.0F);

                        if (var11 == null || var11.getCanSpawnHere())
                        {
                            this.writeNBTTagsTo(var13);
                            this.worldObj.spawnEntityInWorld(var13);
                            this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);

                            if (var11 != null)
                            {
                                var11.spawnExplosionParticle();
                            }

                            var12 = true;
                        }
                    }
                }

                if (var12)
                {
                    this.updateDelay();
                }
            }

            super.updateEntity();
        }
    }

    public void writeNBTTagsTo(Entity var1)
    {
        if (this.spawnerTags != null)
        {
            NBTTagCompound var2 = new NBTTagCompound();
            var1.addEntityID(var2);
            Iterator var3 = this.spawnerTags.field_92032_b.getTags().iterator();

            while (var3.hasNext())
            {
                NBTBase var4 = (NBTBase)var3.next();
                var2.setTag(var4.getName(), var4.copy());
            }

            var1.readFromNBT(var2);
        }
        else if (var1 instanceof EntityLiving && var1.worldObj != null)
        {
            ((EntityLiving)var1).initCreature();
        }
    }

    private void updateDelay()
    {
        if (this.maxSpawnDelay <= this.minSpawnDelay)
        {
            this.delay = this.minSpawnDelay;
        }
        else
        {
            this.delay = this.minSpawnDelay + this.worldObj.rand.nextInt(this.maxSpawnDelay - this.minSpawnDelay);
        }

        if (this.field_92016_e != null && this.field_92016_e.size() > 0)
        {
            this.spawnerTags = (MobSpawnerData2)WeightedRandom.getRandomItem(this.worldObj.rand, this.field_92016_e);
            this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
        }

        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID, 1, 0);
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound var1)
    {
        super.readFromNBT(var1);
        this.mobID = var1.getString("EntityId");
        this.delay = var1.getShort("Delay");

        if (var1.hasKey("SpawnPotentials"))
        {
            this.field_92016_e = new ArrayList();
            NBTTagList var2 = var1.getTagList("SpawnPotentials");

            for (int var3 = 0; var3 < var2.tagCount(); ++var3)
            {
                this.field_92016_e.add(new MobSpawnerData2(this, (NBTTagCompound)var2.tagAt(var3)));
            }
        }
        else
        {
            this.field_92016_e = null;
        }

        if (var1.hasKey("SpawnData"))
        {
            this.spawnerTags = new MobSpawnerData2(this, var1.getCompoundTag("SpawnData"), this.mobID);
        }
        else
        {
            this.spawnerTags = null;
        }

        if (var1.hasKey("MinSpawnDelay"))
        {
            this.minSpawnDelay = var1.getShort("MinSpawnDelay");
            this.maxSpawnDelay = var1.getShort("MaxSpawnDelay");
            this.spawnCount = var1.getShort("SpawnCount");
        }

        if (var1.hasKey("MaxNearbyEntities"))
        {
            this.maxNearbyEntities = var1.getShort("MaxNearbyEntities");
            this.requiredPlayerRange = var1.getShort("RequiredPlayerRange");
        }

        if (var1.hasKey("SpawnRange"))
        {
            this.spawnRange = var1.getShort("SpawnRange");
        }

        if (this.worldObj != null && this.worldObj.isRemote)
        {
            this.spawnedMob = null;
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound var1)
    {
        super.writeToNBT(var1);
        var1.setString("EntityId", this.getMobID());
        var1.setShort("Delay", (short)this.delay);
        var1.setShort("MinSpawnDelay", (short)this.minSpawnDelay);
        var1.setShort("MaxSpawnDelay", (short)this.maxSpawnDelay);
        var1.setShort("SpawnCount", (short)this.spawnCount);
        var1.setShort("MaxNearbyEntities", (short)this.maxNearbyEntities);
        var1.setShort("RequiredPlayerRange", (short)this.requiredPlayerRange);
        var1.setShort("SpawnRange", (short)this.spawnRange);

        if (this.spawnerTags != null)
        {
            var1.setCompoundTag("SpawnData", (NBTTagCompound)this.spawnerTags.field_92032_b.copy());
        }

        if (this.spawnerTags != null || this.field_92016_e != null && this.field_92016_e.size() > 0)
        {
            NBTTagList var2 = new NBTTagList();

            if (this.field_92016_e != null && this.field_92016_e.size() > 0)
            {
                Iterator var3 = this.field_92016_e.iterator();

                while (var3.hasNext())
                {
                    MobSpawnerData2 var4 = (MobSpawnerData2)var3.next();
                    var2.appendTag(var4.func_92030_a());
                }
            }
            else
            {
                var2.appendTag(this.spawnerTags.func_92030_a());
            }

            var1.setTag("SpawnPotentials", var2);
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * will create the entity from the internalID the first time it is accessed
     */
    public Entity getMobEntity()
    {
        if (this.spawnedMob == null)
        {
            Entity var1 = EntityList.createEntityByName(this.getMobID(), (World)null);
            this.writeNBTTagsTo(var1);
            this.spawnedMob = var1;
        }

        return this.spawnedMob;
    }

    /**
     * Overriden in a sign to provide the text.
     */
    public Packet getDescriptionPacket()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        var1.removeTag("SpawnPotentials");
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, var1);
    }

    /**
     * Called when a client event is received with the event number and argument, see World.sendClientEvent
     */
    public void receiveClientEvent(int var1, int var2)
    {
        if (var1 == 1 && this.worldObj.isRemote)
        {
            this.delay = this.minSpawnDelay;
        }
    }
}
