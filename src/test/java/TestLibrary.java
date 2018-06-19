import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
    }

    @Test
    public void findLibraryBookCount(){
       assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.add(book);
        assertEquals(1, library.getBookCount());
    }


}

