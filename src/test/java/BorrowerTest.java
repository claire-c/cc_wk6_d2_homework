import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower bookBorrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library myLibrary;

    @Before
    public void before(){
        book1 = new Book("Michael Crichton", "Jurassic Park");
        book2 = new Book("Stephen King", "It");
        book3 = new Book("Ray Bradbury", "Fahrenheit 451");
        myLibrary = new Library(5);
        bookBorrower = new Borrower("Claire");
    }

    @Test
    public void canGetBorrowerName(){
        assertEquals("Claire",bookBorrower.getName());
    }

    @Test
    public void canCountBorrowedBooks(){
        assertEquals(0, bookBorrower.countBorrowedBooks());
    }

    @Test
    public void canBorrowBook(){
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        bookBorrower.borrowBook(myLibrary);
        assertEquals(1, bookBorrower.countBorrowedBooks());
    }

    @Test
    public void cannotBorrowBook(){
        bookBorrower.borrowBook(myLibrary);
        assertEquals(0, bookBorrower.countBorrowedBooks());
    }
}
