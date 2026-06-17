package iteso;
import iteso.Date;
import java.util.Calendar;

public class DateTime extends Date
{
    // Exclusive attributes
    protected int hour;
    protected int minute;
    protected int second;

    public DateTime(int year, int month, int day, int hour, int minute, int second)
    {
        super(year, month, day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public DateTime(int hour, int minute, int second)
    {
        Calendar cal = Calendar.getInstance();
        super(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH+1),cal.get(Calendar.DATE));
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public DateTime()
    {
        Calendar cal = Calendar.getInstance();
        super(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH+1),cal.get(Calendar.DATE));
        setHour(cal.get(Calendar.HOUR_OF_DAY));
        setMinute(cal.get(Calendar.MINUTE));
        setSecond(cal.get(Calendar.SECOND));
    }

    public DateTime(Date d)
    {
        Calendar cal = Calendar.getInstance();
        super(d.getYear(), d.getMonth(), d.getDay());
        setHour(cal.get(Calendar.HOUR_OF_DAY));
        setMinute(cal.get(Calendar.MINUTE));
        setSecond(cal.get(Calendar.SECOND));
    }


    // Getters
    public int getHour()
    {
        return this.hour;
    }

    public int getMinute()
    {
        return this.minute;
    }

    public int getSecond()
    {
        return this.second;
    }

    // Setters
    public void setHour(int hour)
    {
        if (hour >= 0 && hour < 24)
        {
            this.hour = hour;
        } else this.hour = 0;
    }

    public void setMinute(int minute)
    {
        if (minute >= 0 && minute <= 59)
        {
            this.minute = minute;
        } else this.minute = 0;
    }

    public void setSecond(int second)
    {
        if (second >= 0 && second <= 59)
        {
            this.second = second;
        } else this.second = 0;
    }

    // Additional Methods
    public void next()
    {
        setSecond(this.second++);
    }

    public DateTime clone()
    {
        return new DateTime(getYear(), getMonth(), getDay(), getHour(), getMinute(), getSecond());
    }

    public Date toDate()
    {
        Date d1 = new Date(getYear(), getMonth(), getDay());
        return d1;
    }

    @Override public String toString()
    {
        return String.format("Fecha y Hora!\n%d/%d/%d\n%d:%d:%d", getDay(), getMonth(), getYear(), getHour(), getMinute(), getSecond());
    }

    @Override public boolean equals(Object o)
    {
        if (o instanceof DateTime)
        {
            DateTime b = (DateTime) o;
            return super.equals(o) && b.getHour() == this.hour && b.getMinute() == this.minute && b.getSecond() == this.second;   
        } else return false;
    }
}
