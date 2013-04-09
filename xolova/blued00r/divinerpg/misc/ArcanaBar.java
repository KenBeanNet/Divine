package xolova.blued00r.divinerpg.misc;

public class ArcanaBar
{
    public static String playerID;
    private int arcana = 0;
    private int regenDelay = 0;

    public ArcanaBar(int var1, String var2)
    {
        this.arcana = var1;
        this.regenDelay = 0;
        playerID = var2;
    }

    public void arcanaRegen(int var1)
    {
        if (this.regenDelay == 0)
        {
            this.arcana += var1;
        }
        else
        {
            --this.regenDelay;
        }
    }

    public void arcanaAdd(int var1)
    {
        this.arcana += var1;
    }

    public boolean arcanaUse(int var1)
    {
        if (this.arcana < var1)
        {
            this.regenDelay = 30;
            return false;
        }
        else
        {
            this.arcana -= var1;
            this.regenDelay = 30;
            return true;
        }
    }

    public float getBarValue()
    {
        return (float)this.arcana;
    }

    public void setArcana(int var1)
    {
        this.arcana = var1;
    }
}
