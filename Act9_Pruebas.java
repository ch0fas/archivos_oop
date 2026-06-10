import iteso.Date;

public class Act9_Pruebas
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        Date d2 = new Date(2026, 6, 10);
        System.out.println(Date.DECEMBER);

        System.out.println(Date.dayOfWeek(2026, 6, 10));
        System.out.println(Date.dayOfWeekName(Date.dayOfWeek(2026, 6, 10)));
    }
}