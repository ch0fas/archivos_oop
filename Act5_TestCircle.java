import geometry.shapes2d.Circle;

public class Act5_TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c1.setRadio(2.5);
        c2.setRadio(6.6);
        c3.setRadio(7.5);

        c1.print();
        c2.print();
        c3.print();
    }
}
