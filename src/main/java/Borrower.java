import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }



    public int bookCount() {
        return this.books.size();
    }
    
    public int borrowFrom(Library library, Book book){
        // get the book from the library
        Book book = library.findBook(book);
        // if the book is found add to the borrower's book
        if(book != null){
            this.books.add(book);
        }
    }
}