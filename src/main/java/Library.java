import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;

    public Library(){
        this.book = new ArrayList<Book>();
    }


    public int getBookCount(){
        return this.book.size();
    }

    public void add(Book book) {
        this.book.add(book);
    }
}
