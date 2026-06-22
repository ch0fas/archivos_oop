package iteso;

public abstract class Shape3D
{
    // Atts
    protected int x;
    protected int y;
    protected int z;


    // Get Instances
    public static Shape3D getSphere(int x, int y, int z, double radio)
    {
        return new Sphere(x, y, z, radio);
    }

    public static Shape3D getCylinder(int x, int y, int z, double radio, double altura)
    {
        return new Cylinder(x, y, z, radio, altura);
    }

    public static Shape3D getBox(int x, int y, int z, double lado)
    {
        return new Box(x,y,z,lado);
    }

    // Métodos
    public abstract double getArea();
    public abstract double getVolume();

    public void move(int dx, int dy, int dz)
    {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    public String toString()
    {
        return String.format("Coordenadas: (%d, %d, %d)", this.x, this.y, this.z);
    }
}
