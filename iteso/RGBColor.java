package iteso;

public class RGBColor
{
    // Attributes
    private int red;
    private int green;
    private int blue;

    // Constructores
    public RGBColor()
    {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    public RGBColor(int red, int green, int blue)
    {
        if (red >= 0 && red <= 255)
        {
            this.red = red;
        } else this.red = 0;

        if (green >= 0 && green <= 255)
        {
            this.green = green;
        } else this.green = 0;

        if (blue >= 0 && blue <= 255)
        {
            this.blue = blue;
        } else this.blue = 0;

    }

    // Getters
    public int getRed()
    {
        return this.red;
    }

    public int getGreen()
    {
        return this.green;
    }

    public int getBlue()
    {
        return this.blue;
    }

    // Setters
    public void setRed(int red)
    {
        this.red = red;
    }

    public void setGreen(int green)
    {
        this.green = green;
    }

    public void setBlue(int blue)
    {
        this.blue = blue;
    }

    // Métodos Adicionales
    public String toString()
    {
        return String.format("Color: {\"red\": %d, \"green\": %d, \"blue\": %d}", getRed(), getGreen(), getBlue());
    }

    public boolean equals(Object o)
    {
        if (o instanceof RGBColor)
        {
            RGBColor c = (RGBColor) o;
            return this.getRed() == c.getRed() && this.getGreen() == c.getGreen() && this.getBlue() == c.getBlue();
        } else return false;
    }

    public RGBColor clone()
    {
        return new RGBColor(this.red, this.green, this.blue);
    }
}
