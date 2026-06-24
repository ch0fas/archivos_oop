package iteso;

public class Cpu
{
    // Atributos
    protected int model;
    protected int cores;
    protected double clock_speed;
    public static final int I3 = 1, I5 = 2, I7 = 3, I9 = 4, R3 = 5, R5 = 6, R7 = 7, R9 = 8;

    // Constructors
    public Cpu()
    {
        this.model = Cpu.R5;
        this.cores = 6;
        this.clock_speed = 3.6;
    }

    public Cpu(int model, int cores, double clock_speed)
    {
        setModel(model);
        setCores(cores);
        setSpeed(clock_speed);
    }


    // Getters
    public int getModel()
    {
        return this.model;
    }

    public int getCores()
    {
        return this.cores;
    }

    public double getSpeed()
    {
        return this.clock_speed;
    }

    // Setters
    public void setModel(int model)
    {
        if (model >= 1 && model <= 8)
        {
            this.model = model;
        } else this.model = Cpu.R5;
    }

    public void setCores(int cores)
    {
        if (cores >= 4 && cores <= 24)
        {
            this.cores = cores;
        } else this.cores = 6;
    }

    public void setSpeed(double speed)
    {
        if (speed >= 2.0 && speed <= 5.5)
        {
            this.clock_speed = speed;
        } else this.clock_speed = 3.6;
    }

}