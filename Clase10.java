import iteso.Date;

public class Clase10
{
    public static void main(String[] args)
    {
        Date d1 = new Date(2005, 4, 17);
        d1.setDay(11);
        d1.setMonth(11);
        d1.setYear(2011);

        System.out.println(d1);
        System.out.printf("Fecha Original: %d de %d de %d", d1.getFirstDay(), d1.getFirstMonth() ,d1.getFirstYear());

    }
}
