import java.util.HashMap;

public class Act20_Ejer3 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("uno", 1);
        hm1.put("dos", 2);
        hm1.put("tres", 3);
        hm1.put("cuatro", 4);
        hm1.put("cinco", 5);

        System.out.println(hm1.get("tres"));
        System.out.println(hm1.get("siete")); // Imprime "null" ya que no existe

    }    
}
