package BookManage;

public class Book {
    // Book Properties
    private int id;
    private String title;
    private String author;
    private String category;
    private double price;
    private int quantity;

    public Book(int id, String title, String author, String category, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display Book Information
    public void displayBookInfo() {
         System.out.println("--------------------------------");
        System.out.println("Book ID    : " + id);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Category   : " + category);
        System.out.println("Price      : " + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("--------------------------------");

    }
}
