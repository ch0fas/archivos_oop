import iteso.Shape3D;

public class PruebasAct14
{
    public static void main(String[] args)
    {
        Shape3D esfera = Shape3D.getSphere(1, 1, 1, 20);
        System.out.println(esfera);
        Shape3D cilindro = Shape3D.getCylinder(1, 1, 1, 2, 10);
        System.out.println(cilindro);
        Shape3D caja = Shape3D.getBox(1, 1, 1, 1);
        System.out.println(caja);
    }
}