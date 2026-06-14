import java.util.Calendar;

public class TestCalendar
{
    public static void main(String[] args)
    {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();

        d2.set(2021, Calendar.SEPTEMBER, 23);

        if (d1.getTimeInMillis() < d2.getTimeInMillis())
        {
            System.out.println("La fecha d1 es más antigua");
        } else
        {
            System.out.println("La fecha d2 es más antigua"); // Se va a imprimir esto
        }

        d1.add(Calendar.WEEK_OF_YEAR, 2);
        d1.add(Calendar.YEAR, -4);

        Calendar t1 = Calendar.getInstance();
        Calendar dt1 = Calendar.getInstance();
        dt1.set(d2.get(Calendar.YEAR), d2.get(Calendar.MONTH), d2.get(Calendar.DATE));
        dt1.set(Calendar.HOUR_OF_DAY, t1.get(Calendar.HOUR_OF_DAY));

        System.out.println(dt1.toString());
    }
}