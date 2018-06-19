import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(5);
    }

    @Test
    public void findLibraryBookCount(){
       assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }



    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }


    @Test
    public void libraryHasReachedCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getCapacity());
    }

}

