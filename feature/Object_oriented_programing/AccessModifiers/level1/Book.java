class Book {

    public String ISBN;
    protected String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    // Getter & Setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass accessing public and protected members
class EBook extends Book {

    EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);        // public
        System.out.println("Title: " + title);      // protected
        System.out.println("Author: " + getAuthor());// private via method
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-1234", "Java Basics", "James");
        eb.displayDetails();
    }
}
