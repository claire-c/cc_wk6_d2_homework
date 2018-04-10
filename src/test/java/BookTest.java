import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Michael Crichton", "Jurassic Park");
        book2 = new Book("Stephen King", "It");
        book3 = new Book("Ray Bradbury", "Fahrenheit 451");
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Michael Crichton",book1.author());
        assertEquals("Stephen King",book2.author());
        assertEquals("Ray Bradbury",book3.author());
    }

//    @Test
//    public void canGetTitle(){
//        assertEquals("Jurassic Park", book1.title());
//        assertEquals("It", book2.title());
//        assertEquals("Fahrenheit 451", book3.title());
//    }

}
