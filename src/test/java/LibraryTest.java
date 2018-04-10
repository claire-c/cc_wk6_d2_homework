import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library myLibrary;

    @Before
    public void before(){
        book1 = new Book("Michael Crichton", "Jurassic Park", Genre.THRILLER);
        book2 = new Book("Stephen King", "It", Genre.HORROR);
        book3 = new Book("Ray Bradbury", "Fahrenheit 451", Genre.SCI_FI);
        myLibrary = new Library(5);
    }

    @Test
    public void getBookCount(){
        assertEquals(0, myLibrary.bookCount());
    }

    @Test
    public void canAddBook(){
        myLibrary.addBook(book1);
        assertEquals(1, myLibrary.bookCount());
    }

    @Test
    public void capacityNotFull(){
        assertTrue(myLibrary.checkCapacity());
    }

    @Test
    public void capacityFull(){
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        assertFalse(myLibrary.checkCapacity());
    }

    @Test
    public void canRemoveBook(){
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.removeBook();
        assertEquals(2, myLibrary.bookCount());
    }

    @Test
    public void cannotRemoveBook(){
        assertEquals(0, myLibrary.bookCount());
    }

    @Test
    public void canCountGenreList(){
        assertEquals(0, myLibrary.countGenreList());
    }

    @Test
    public void canAddBookToGenreList(){
        myLibrary.addBookToGenreList(book1);
        assertEquals(1, myLibrary.countGenreList());
    }

    @Test
    public void canCountGenreTotals(){
        myLibrary.addBookToGenreList(book1);
        assertEquals(1, myLibrary.countGenreTotals(Genre.THRILLER));
    }

    @Test
    public void genreTotalIsZero(){
        assertEquals(0, myLibrary.countGenreTotals(Genre.THRILLER));
    }

}
