package iteso;
import iteso.LibraryDatabase;

public class LibraryBook
{
    // Attributes
    private String name;
    private String author;
    private int year_of_release;
    private final String isbn;
    private boolean is_borrowed = false;

    // Constructors
    public LibraryBook()
    {
        this.name = "Frankenstein";
        this.author = "Mary Shelley";
        this.year_of_release = 1818;
        this.isbn = "FOOBARFOOBAR";
    }

    public LibraryBook(String name, String author, int year, String isbn)
    {
        this.name = name; this.author = author; this.year_of_release = year; this.isbn = isbn;
    }

    public LibraryBook clone()
    {
        return new LibraryBook(this.name, this.author, this.year_of_release, this.isbn);
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public int getYear()
    {
        return this.year_of_release;
    }

    public String getISBN()
    {
        return this.isbn;
    }

    public boolean getBorrowed()
    {
        return this.is_borrowed;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setYear(int year)
    {
        this.year_of_release = year;
    }

    // Additional Methods
    public void borrowBook(LibraryDatabase db)
    {
        if (this.is_borrowed == false)
        {
            this.is_borrowed = true;
            db.add_book();
            System.out.printf("%s successfully borrowed!\n", getName());
        } else System.out.println("This book is already borrowed");
    }

    public void returnBook(LibraryDatabase db)
    {
        if (this.is_borrowed == true)
        {
            this.is_borrowed = false;
            db.remove_book();
            System.out.printf("%s successfully returned!\n", getName());
        } else System.out.println("This book has not been borrowed yet!");
    }

    public String toString()
    {
        return String.format("Book Name: %s.\nAuthor: %s.\nYear Of Release: %d\nISBN: %s\nIs Borrowed? %s\n", getName(), getAuthor(), getYear(), getISBN(), getBorrowed());
    }

    protected void finalize()
    {
        System.out.printf("Libro %s eliminado", getName());
    }



}