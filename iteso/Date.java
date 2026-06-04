package iteso;

public class Date
{
    // Atributos
    private int day;
    private int month;
    private int year;
    private String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    // Constructores
    public Date()
    {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
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

    public String monthName()
    {
        return months[this.month - 1];
    }

    public boolean isValid()
    {
        switch (this.month)
        {
            case 2:
            if (isBisiesto())
            {
                return this.day <= 29;
            } else
            {
                return this.day <= 28;
            }
            case 1,3,5,7,8,10,12:
            return this.day <= 31;
            case 4, 6, 9,11:
            return this.day <= 30;
            default:
            return false;

        }
    }

    public String toString()
    {
        return String.format("%d de %s de %d", this.day, months[this.month - 1], this.year);
    }

    //Helper Functions
    private boolean isBisiesto()
    {
        return(this.year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true: false;
    }
}
