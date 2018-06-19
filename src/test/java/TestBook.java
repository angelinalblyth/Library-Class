import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void setup(){
        book = new Book( "Fantasy");
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
