import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity){
        this.book = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int getBookCount(){
        return this.book.size();
    }

    public void addBook(Book book) {
        if(this.book.size() < this.capacity) {
            this.book.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
