Homework
Create your own (TDD) library class with an internal collection of books.

helpful note - start by making your Book class first as your library takes in a collection of books. If you notice an import at the top of your test and/or library class which looks like this import java.awt.print.Book; delete it. This is not your Book class that you've created.

MVP
Write a method to count the number of books in the library.
Write a method to add a book to the library stock.
Add a capacity to the library and write a method to check if stock is full before adding a book.
Extensions:
Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.
Add a property for the genre of books. (e.g. thriller, crime, etc.)
Advanced Extension
The library wants to keep track of it's number of books by genre. Using a HashMap, store the Genre of each book as the key - and a count of how many books of that genre as the value.
