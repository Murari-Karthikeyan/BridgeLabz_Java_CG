class Product {

    // Instance Variables
    String productName;
    double price;

    // Class Variable
    static int totalProducts = 0;

    // Constructor
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++; // increment when a product is created
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
