import geometry.shapes2d.Rectangle;

public class Clase9
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.base = 10;
        r1.height = 20;
        Rectangle r2 = r1;
        System.out.println(r2==r1);
    }
}
