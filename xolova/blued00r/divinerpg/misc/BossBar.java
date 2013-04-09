package xolova.blued00r.divinerpg.misc;

public class BossBar
{
    public int health;

    public BossBar(int var1)
    {
        this.health = var1;
    }

    public float getBarValue()
    {
        return (float)this.health;
    }

    public void setHealth(int var1)
    {
        this.health = var1;
    }
}
