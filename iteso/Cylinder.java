package iteso;

public class Cylinder extends Shape3D 
{
    // Atributos Únicos
    protected double radio;
    protected double altura;
    
    Cylinder(int x, int y, int z, double radio, double altura)
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
        setAltura(altura);

    }

    // Getters
    public double getArea()
    {
        return 2 * Math.PI * this.radio * (this.altura + this.radio);
    }

    public double getVolume()
    {
        return Math.PI * Math.pow(this.radio, 2) * this.altura;
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

    public void setAltura(double altura)
    {
        if (altura >= 0 && altura < 100)
        {
            this.altura = altura;
        } else this.altura = 1;
    }

    public String toString()
    {
        return String.format("CILINDRO\nÁrea: %.2f. Superficie: %.2f\n%s", getArea(), getVolume(), super.toString());
    }
}
