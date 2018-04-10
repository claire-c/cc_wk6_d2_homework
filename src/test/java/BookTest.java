import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Michael Crichton", "Jurassic Park", Genre.THRILLER);
        book2 = new Book("Stephen King", "It", Genre.HORROR);
        book3 = new Book("Ray Bradbury", "Fahrenheit 451", Genre.SCI_FI);
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Michael Crichton",book1.getAuthor());
        assertEquals("Stephen King",book2.getAuthor());
        assertEquals("Ray Bradbury",book3.getAuthor());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Jurassic Park", book1.getTitle());
        assertEquals("It", book2.getTitle());
        assertEquals("Fahrenheit 451", book3.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals(Genre.THRILLER, book1.getGenre());
    }
}
