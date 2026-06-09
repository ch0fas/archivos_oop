package iteso;

public class Date
{
    // Atributos
    private int day;
    private int month;
    private int year;
    private String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private final int JANUARY=1, FEBRUARY = 2, MARCH=3, APRIL=4, MAY=5, JUNE=6, JULY=7, AUGUST=8, SEPTEMBER=9, OCTOBER=10, NOVEMBER=11, DECEMBER=12;
    private final int SUNDAY = 0, MONDAY=1, TUESDAY=2, WEDNESDAY=3, THURSDAY=4, FRIDAY=5, SATURDAY=6;
    private final int FIRST_DAY, FIRST_MONTH, FIRST_YEAR;

    // Constructores
    public Date()
    {
        this.day = 1;
        this.month = 1;
        this.year = 1970;

        this.FIRST_DAY = this.day;
        this.FIRST_MONTH = this.month;
        this.FIRST_YEAR = this.year;
    }

    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);

        this.FIRST_DAY = day;
        this.FIRST_MONTH = month;
        this.FIRST_YEAR = year;
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
}
