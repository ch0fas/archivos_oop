package iteso;

public class Book
{
    // Attributes
    private String name = "Frankenstein";
    private String author = "Mary Shelley";
    private int year = 1818;

    public String toString()
    {
        return String.format("Book: %s\nAuthor: %s\nYear of Release: %d\n", this.name, this.author, this.year);
    }

}