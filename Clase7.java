import geometry.shapes2d.Rectangle;

public class Clase7
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.setBase(20);
        r1.setHeight(10);
        System.out.printf("Area: %.3fm²\n", r1.getArea());
        System.out.printf("Perimetro: %.3fm\n", r1.getPerimeter());

        Rectangle r2 = new Rectangle();
        r2.setBase(-10);
        r2.setHeight(2);
        System.out.printf("Area: %.3fm²\n", r2.getArea());
        System.out.printf("Perimetro: %.3fm\n", r2.getPerimeter());
        System.out.printf("Base: %.3fm\n", r2.getBase());
        System.out.printf("Altura: %.3fm\n", r2.getHeight());
    }
}
