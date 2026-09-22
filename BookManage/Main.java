package BookManage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crate Book Manager Obj
        BookManager manager = new BookManager();;

        int choice;

        do{
            // Display menu
            System.out.println();
            System.out.println("================================");
            System.out.println("       BOOK MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Choose Option : ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                // =========================
                // ADD BOOK
                // =========================
                case 1:

                    System.out.println();
                    System.out.println("========== ADD BOOK ==========");

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category : ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();

                    sc.nextLine();

                    // Create Book object
                    Book book = new Book(
                            id,
                            title,
                            author,
                            category,
                            price,
                            quantity
                    );

                    // Add book
                    manager.addBook(book);

                    break;

                // =========================
                // VIEW BOOKS
                // =========================
                case 2:

                    manager.viewBooks();

                    break;

                // =========================
                // SEARCH BOOK
                // =========================
                case 3:

                    System.out.println();
                    System.out.println("========== SEARCH BOOK ==========");

                    System.out.print("Enter Book ID : ");
                    int searchId = sc.nextInt();

                    sc.nextLine();

                    manager.searchBook(searchId);

                    break;

                // =========================
                // UPDATE BOOK
                // =========================
                case 4:

                    System.out.println();
                    System.out.println("========== UPDATE BOOK ==========");

                    System.out.print("Enter Book ID : ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Title : ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author : ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Category : ");
                    String newCategory = sc.nextLine();

                    System.out.print("Enter New Price : ");
                    double newPrice = sc.nextDouble();

                    System.out.print("Enter New Quantity : ");
                    int newQuantity = sc.nextInt();

                    sc.nextLine();

                    manager.updateBook(
                            updateId,
                            newTitle,
                            newAuthor,
                            newCategory,
                            newPrice,
                            newQuantity
                    );

                    break;

                // =========================
                // DELETE BOOK
                // =========================
                case 5:

                    System.out.println();
                    System.out.println("========== DELETE BOOK ==========");

                    System.out.print("Enter Book ID : ");
                    int deleteId = sc.nextInt();

                    sc.nextLine();

                    manager.deleteBook(deleteId);

                    break;

                // =========================
                // EXIT
                // =========================
                case 6:

                    System.out.println();
                    System.out.println(
                            "Thank you for using Book Management System!"
                    );

                    break;

                // =========================
                // INVALID OPTION
                // =========================
                default:

                    System.out.println();
                    System.out.println("Invalid option!");
                    System.out.println("Please choose between 1 and 6.");
            }
        }while(choice != 6);
        
            sc.close();
    }
}
