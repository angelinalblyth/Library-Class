import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    Library library;
    Book book1;


    @Before
    public void setUp() throws Exception {
        library = new Library();
        library.addBook(book1);

        book1 = new Book("Murder on the Orient Express","Agatha Christie", "Crime");
        book1 = new Book("Harry Potter","JK Rowling", "Fantasy");
        book1 = new Book("The Handmaid's Tale","Margaret Artwood", "Sci Fi");

        borrower = new Borrower();
    }

    @Test
    public void borrowHasNoBooksToBeginWith(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void testBorrowFrom(){
        borrower.borrowFrom(library book1);
        assertEquals(0, library.getBookCount());
        assertEquals(1, borrower.bookCount());
    }
}
