package iteso;
import java.util.Calendar;
import java.util.Random;

public class Date
{
    // Atributos
    private int day;
    private int month;
    private int year;
    private static final String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private static final String[] days_week = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    public static final int JANUARY=1, FEBRUARY = 2, MARCH=3, APRIL=4, MAY=5, JUNE=6, JULY=7, AUGUST=8, SEPTEMBER=9, OCTOBER=10, NOVEMBER=11, DECEMBER=12;
    public static final int SUNDAY = 0, MONDAY=1, TUESDAY=2, WEDNESDAY=3, THURSDAY=4, FRIDAY=5, SATURDAY=6;
    private final int FIRST_DAY, FIRST_MONTH, FIRST_YEAR;
    private static int equals_calls;
    private static int hc_calls;

    public static int instances_count;

    // Constructores
    public Date()
    {
        Calendar cal = Calendar.getInstance();
        this.day = cal.get(Calendar.DATE);
        this.month = cal.get(Calendar.MONTH + 1); // Porque en mi clase Date el mes empieza en 1 pero en Calendar el mes empieza en cero
        this.year = cal.get(Calendar.YEAR);

        this.FIRST_DAY = this.day;
        this.FIRST_MONTH = this.month;
        this.FIRST_YEAR = this.year;

        instances_count++;
    }

    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);

        this.FIRST_DAY = day;
        this.FIRST_MONTH = month;
        this.FIRST_YEAR = year;

        instances_count++;
    }

    // Métodos de Clase
    public static int getInstancesCount()
    {
        return instances_count;
    }

    public static int dayOfWeek(int year, int month, int day)
    {
        Date d = new Date(year, month, day);

        // Aprovechando la función daysSinceEpoch, el 01/01/1970 fue un jueves
        if (!d.isValid())
        {
            return -1;
        }

        int epochWeekday = THURSDAY;

        return (epochWeekday + d.daysSinceEpoch()) % 7;
    }

    public static String dayOfWeekName(int day)
    {
        if (day >= 0 && day <= 6)
        {
            return days_week[day];
        } else return null;
    }

    public static String classMonthName(int month)
    {
        if (month >= 1 && month <= 12)
        {
            return months[month-1];
        } else return null;
    }

    public static boolean classLeap(int year)
    {
        return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true: false;
    }

    public static boolean classValid(int year, int month, int day)
    {
        switch (month)
        {
            case FEBRUARY:
            if (classLeap(year))
            {
                return day <= 29;
            } else
            {
                return day <= 28;
            }
            case JANUARY,MARCH,MAY,JULY,AUGUST,OCTOBER,DECEMBER:
            return day <= 31;
            case APRIL, JUNE, SEPTEMBER,NOVEMBER:
            return day <= 30;
            default:
            return false;

        }
    }

    //Setters
    public void setDay(int day)
    {
        if (day > 0 && day < 32)
        {
            this.day = day;
        } else this.day = 1;
    }

    public void setMonth(int month)
    {
        if (month > 0 && month < 13)
        {
            this.month = month;
        } else this.month = 1;
    }

    public void setYear(int year)
    {
        if (year < 9999 && year >= 0)
        {
            this.year = year;
        } else this.year = 2005;
    }


    //Getters
    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getFirstDay()
    {
        return this.FIRST_DAY;
    }

    public int getFirstMonth()
    {
        return this.FIRST_MONTH;
    }

    public int getFirstYear()
    {
        return this.FIRST_YEAR;
    }

    public String monthName()
    {
        return months[this.month - 1];
    }

    public int getEqualsCalls() { return equals_calls; }
    public int getHcCalls() { return hc_calls; }

    public boolean isValid()
    {
        switch (this.month)
        {
            case FEBRUARY:
            if (isBisiesto(this.year))
            {
                return this.day <= 29;
            } else
            {
                return this.day <= 28;
            }
            case JANUARY,MARCH,MAY,JULY,AUGUST,OCTOBER,DECEMBER:
            return this.day <= 31;
            case APRIL, JUNE, SEPTEMBER,NOVEMBER:
            return this.day <= 30;
            default:
            return false;

        }
    }

    public int daysSinceEpoch()
    {
        int days_counter = 0;
        for (int i = 1970; i < this.year; i++)
        {
            if (isBisiesto(i))
            {
                days_counter += 366;
            } else days_counter += 365;
        }

        for (int i = 1; i < this.month; i++)
        {
            switch (i)
            {
                case FEBRUARY:
                if (isBisiesto(this.year))
                {
                    days_counter += 29;
                    break;
                } else
                {
                    days_counter += 28;
                    break;
                }
                case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER:
                days_counter += 31;
                break;
                default:
                days_counter += 30;
                break;
            }
        }
        for (int i = 1; i < this.day; i++)
        {
            days_counter++;
        }

        return days_counter; // NOTA: Este contador no incluye el día actual en el cálculo, para que si pones 2/1/1970 te cuente que ha sido un (1) día desde el epoch y no dos (2)
    }

    // Métodos Adicionales
    public String toString()
    {
        return String.format("Date: {\"Day\": %d, \"Month\": %d, \"Year\": %d}", getDay(), getMonth(), getYear());
    }

    public boolean equals(Object o)
    {
        equals_calls++;
        if (o instanceof Date)
        {
            Date c = (Date) o;
            return this.getDay() == c.getDay() && this.getMonth() == c.getMonth() && this.getYear() == c.getYear();
        } else return false;
    }

    public Date clone()
    {
        return new Date(this.year, this.month, this.day);
    }

    //Helper Functions
    private boolean isBisiesto(int year)
    {
        return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true: false;
    }

    public static Date randomDate()
    {
        Random r = new Random();
        int day = r.nextInt(28-1+1) + 1;
        int month = r.nextInt(12-1+1) + 1;
        int year = r.nextInt(2100-1900+1) + 1900;

        hc_calls++;

        return new Date(year, month, day);
    }

    public int hashCode()
    {
        return 366 * year + month << 5 + day;
    }
}
