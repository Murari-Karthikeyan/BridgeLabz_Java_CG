class BookBorrow {
    String title;
    String author;
    double price;
    boolean available;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    void display() {
        System.out.println(title + " | " + author + " | Available: " + available);
    }

    public static void main(String[] args) {
        Book b = new Book("OOP Java", "Herbert", 500);
        b.display();
        b.borrowBook();
        b.display();
    }
}
