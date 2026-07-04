import java.util.ArrayList;

public class Act20_Ejer1
{
    public static void main(String[] args) 
    {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("uno");
        l1.add("dos");
        l1.add("tres");
        l1.add("cuatro");
        l1.add("cinco");
        l1.add("seis");

        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }

        l1.set(3, "dos");
        System.out.println(l1.indexOf("dos"));
        System.out.println(l1.indexOf("cuatro")); // -1 porque "cuatro" ya no está en el arreglo

        l1.replaceAll(n -> n.toUpperCase()); // replaceAll permite hacer cambios en masa con funciones Lambda
        for (int i = 0; i < l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }

        l1.removeAll(l1); // Esto de nuevo nos permite quitar todos los elementos directamente
        // Para quitarlos uno por uno se puede hacer con esto:

        /* 
        while (l1.size() > 0)
        {
            l1.remove(0);
        }
        */
        
    }
}