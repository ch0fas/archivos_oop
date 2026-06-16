import iteso.Persona;
import iteso.Estudiante;
import iteso.Profesor;

public class Act11 
{
    public static void main(String[] args) 
    {
        Persona p1 = new Persona();
        System.out.println(p1);
        Persona p2 = new Persona("Ana", "Martin", "Vasquez", "Mujer", 21);
        System.out.println(p2);
        System.out.println();

        Estudiante e1 = new Estudiante();
        System.out.println(e1);
        Estudiante e2 = new Estudiante("Ana", "Martin", "Vasquez", "Mujer", 21, "Arquitectura", 65, 6);
        System.out.println(e2);
        System.out.println();
    }    
}
