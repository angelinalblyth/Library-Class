import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    Book book;


    @Before
    public void before(){
        book = new Book("Harry Potter", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.bookCount());
    }





}
