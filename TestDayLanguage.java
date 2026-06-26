import iteso.Days;
import iteso.Language;

public class TestDayLanguage
{
    public static void main(String[] args)
    {
        Days d1 = Days.MIERCOLES;

        d1.cambiarIdioma(Language.INGLES);

        System.out.println(d1);

        Days d2 = Days.SABADO;

        System.out.println(d2);

        for (Language e : Language.values())
        {
            for (Days d : Days.values()) { d.cambiarIdioma(e);
                System.out.print(d + " ");}
            System.out.println();}
    }
}

