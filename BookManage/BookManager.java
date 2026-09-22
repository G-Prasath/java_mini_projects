package BookManage;

import java.util.*;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    // Add a new book to the collection
    public void addBook(Book book) {
        // Check if the book already exists based on ID
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Book ID already exists!");

                return;
            }
        }

        books.add(book);
    }

    // View all Books

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found!");
            return;
        }

        System.out.println();
        System.out.println("========== BOOK LIST ==========");

        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Search Books
    public void searchBook(int id) {
        // check ID
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println();
                System.out.println("Book found!");

                book.displayBookInfo();

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Update book
    public void updateBook(
            int id,
            String title,
            String author,
            String category,
            double price,
            int quantity) {

        for (Book book : books) {

            if (book.getId() == id) {

                book.setTitle(title);
                book.setAuthor(author);
                book.setCategory(category);
                book.setPrice(price);
                book.setQuantity(quantity);

                System.out.println("Book updated successfully!");

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Delete Book
    public void deleteBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {

                books.remove(book);

                System.out.println("Book deleted successfully!");

                return;
            }
        }

        System.out.println("Book not found!");
    }
}
