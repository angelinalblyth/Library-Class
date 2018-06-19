import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void setup(){
        book = new Book("Harry Potter", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
