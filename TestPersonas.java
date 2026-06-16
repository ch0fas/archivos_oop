import iteso.Persona;
import iteso.Estudiante;
import iteso.Profesor;

public class TestPersonas
{
    public static void main(String[] args)
    {
        Persona p1 = new Persona();
        Estudiante e1 = new Estudiante();
        Profesor prof1 = new Profesor();
        Persona p2;
        Estudiante e2;
        Profesor prof2;

        try
        {
            p2 = prof1;
            System.out.println("Apunte de p2 a prof1 exitoso!");
        } catch (Exception e)
        {
            System.out.println("Hubo un error apuntando p2 a prof1");
        }

        try
        {
            prof2 = p1;
            System.out.println("Apunte de prof2 a p1 exitoso!");
        } catch (Exception e)
        {
            System.out.println("Hubo un error apuntando prof2 a p1");
        }

        try
        {
            prof2 = e1;
            System.out.println("Apunte de prof2 a e1 exitoso!");
        } catch (Exception e)
        {
            System.out.println("Hubo un error apuntando prof2 a e1");
        }
    }
}