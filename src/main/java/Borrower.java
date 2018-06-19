import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> book;

    public Borrower(){
        this.book = new ArrayList<Book>();
    }

    public void borrowBook(Book book){
         this.book.add(book);
    }

    public int bookCount() {
        return this.book.size();
    }
}