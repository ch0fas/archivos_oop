import iteso.Date;

public class Clase8
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        Date d2 = new Date(2020, 9, 10);
        Date d3 = new Date(2020, 13, 25);
        Date d4 = new Date(2021, 2, 29);

        if (!d4.isValid())
        {
            System.out.println("La fecha d4 es Inválida");
        }

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d2.monthName());
        System.out.println(d3.toString());

        //System.out.println((System.currentTimeMillis())/(24*60*60));
    }
}
