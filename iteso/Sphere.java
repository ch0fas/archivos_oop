package iteso;

public class Sphere extends Shape3D
{
    // Atts unicos
    protected double radio;

    Sphere(int x, int y, int z, double radio)
    {
        if (x >= 0)
        {
            this.x = x;
        }
        if (y >= 0)
        {
            this.y = y;
        }
        if (z >= 0)
        {
            this.z = z;
        }
        setRadio(radio);

    }

    // Getters
    public double getArea()
    {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double getVolume()
    {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    public double getRadio()
    {
        return this.radio;
    }

    // Setters
    public void setRadio(double radio)
    {
        if (radio >= 0 && radio < 100)
        {
            this.radio = radio;
        } else this.radio = 1;
    }

    @Override public String toString()
    {
        return String.format("ESFERA\nRadio: %.2f\nArea: %.2f, Volumen: %.2f\n%s", getRadio(), getArea(), getVolume(), super.toString());
    }
}
