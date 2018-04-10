import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library myLibrary;

    @Before
    public void before(){
        book1 = new Book("Michael Crichton", "Jurassic Park");
        book2 = new Book("Stephen King", "It");
        book3 = new Book("Ray Bradbury", "Fahrenheit 451");
        myLibrary = new Library();
    }

    @Test
    public void getBookCount(){
        assertEquals(0, myLibrary.bookCount());
    }

}