package iteso;

public class Battery
{
    protected int miliampers;
    protected double percentage;

    public Battery(int mAh, double percentage)
    {
        if (mAh >= 1500)
        {
            this.miliampers = mAh;
        } else this.miliampers = 1500;

        if (percentage >= 0 && percentage <= 100)
        {
            this.percentage = percentage;
        } else this.percentage = 50;
    }

    protected void charge()
    {
        System.out.println("Charging battery");
    }

    protected int getMiliampers()
    {
        return this.miliampers;
    }

    protected double getPercentage()
    {
        return this.percentage;
    }

}