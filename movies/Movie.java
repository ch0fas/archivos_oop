public class Movie
{
    // Atributos
    private String title = "";
    private String director = "";
    private int duration = 0;
    private int year = 0;

    // Setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public void setDuration(int duration)
    {
        if (duration > 0)
        {
            this.duration = duration;
        }
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
