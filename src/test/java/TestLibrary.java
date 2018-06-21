import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library();

        book1 = new Book("Murder on the Orient Express","Agatha Christie", "Crime");
        book2 = new Book("1084","Haruki Marakam", "SciFi");
        book3 = new Book("The Handmaid's Tale","Margaret Artwood", "SciFi");
    }

    @Test
    public void findLibraryBookCount(){
       assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(1, library.getCapacity());
    }


    @Test
    public void libraryHasReachedCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book3);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canCountGenres(){
        library.setCapacity(100);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("Crime", 1);
        expected.put("SciFi", 2);

        assertEquals(expected, library.genreCount());
    }


}

