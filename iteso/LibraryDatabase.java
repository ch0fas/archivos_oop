package iteso;

public class LibraryDatabase
{
    // Attributes
    private static LibraryDatabase instance = null;
    private static int total_books_borrowed = 0;

    private LibraryDatabase()
    {

    }

    public static LibraryDatabase getInstance()
    {
        if (instance == null) instance = new LibraryDatabase();
        return instance;
    }

    void add_book()
    {
        total_books_borrowed++;
    }

    void remove_book()
    {
        total_books_borrowed--;
    }

    public static int getBorrowedBooks()
    {
        return total_books_borrowed;
    }
}
