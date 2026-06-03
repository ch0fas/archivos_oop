package geometry.shapes2d;

public class Circle
{
    private double radio = 0.0;

    // Getters
    public double getArea()
    {
        return Math.PI * (Math.pow(this.radio, 2));
    }

    public double getPerimeter()
    {
        return (2*Math.PI) * this.radio;
    }

    //Setters
    public void setRadio(double radio)
    {
        if (radio > 0 && radio < 50) this.radio = radio;
    }

    // Print Method
    public void print()
    {
        System.out.printf("Radio: %.2f. Area: %.2f. Circunferencia: %.2f\n", this.radio, getArea(), getPerimeter());
    }
}
