import iteso.LibraryBook;
import iteso.LibraryDatabase;

public class PreEx2
{
    public static void main (String[] args)
    {
        LibraryDatabase db = LibraryDatabase.getInstance();
        LibraryDatabase db2 = LibraryDatabase.getInstance();

        System.out.println(db == db2);
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Meet Me In The Bathroom", "Lizzy Goodman", 2017, "978-0-06-223309-7");
        LibraryBook b3 = b2.clone();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.borrowBook(db);
        b1.returnBook(db);
        b2.borrowBook(db);
        b3.borrowBook(db);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.printf("Books currently borrowed: %d", LibraryDatabase.getBorrowedBooks());
    }
}