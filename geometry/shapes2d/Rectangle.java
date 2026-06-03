package geometry.shapes2d;

public class Rectangle
{
    public double base = 0.0;
    public double height = 0.0;
    private int posX = 0;
    private int posY = 0;

    // Setters, métodos para establecer valores válidos de atributos
    public void setBase(double base)
    {
        if (base > 0)
        {
            this.base = base; // this.base es el atributo base del objeto, no la variable llamada base
        }
    }
    public void setHeight(double h)
    {
        if (h > 0)
        {
            height = h;
        }
    }

    public void setPosX(int posX)
    {
        if (posX >= 0 && posX <= 1920)
        {
            this.posX = posX;
        }
    }
    public void setPosY(int posY)
    {
        if (posY >= 0 && posY <= 1080)
        {
            this.posY = posY;
        }
    }

    public void move(int dx, int dy)
    {
        this.posX = this.posX+dx;
        this.posY = this.posY+dy;
    }

    //Getters
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return base*height;
    }
    public double getPerimeter()
    {
        return (base*2.0) + (height*2.0);
    }

    public int getPosX()
    {
        return posX;
    }
    public int getPosY()
    {
        return posY;
    }
}
