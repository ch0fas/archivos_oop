import iteso.Date;
import java.util.HashMap;

// Explicaciones más detalladas de las cosas que suceden en cada paso en las conclusiones, este solo es el código

public class Act23
{
    public static void main(String[] args)
    {
        HashMap<Integer, Date> hm1 = new HashMap<>();
        for (int i = 0; i < 10000000; i++)
        {
            Date temp_date = Date.randomDate();
            hm1.put(temp_date.hashCode(), temp_date);
        }

        Date date = new Date();
        System.out.println(date.getEqualsCalls());
        System.out.println(date.getHcCalls());

        System.out.println(hm1.size());
    }
}