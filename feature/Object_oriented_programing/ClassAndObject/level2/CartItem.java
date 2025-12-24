class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity = qty;
        System.out.println("Item added to cart");
    }

    void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart");
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.addItem("Laptop", 55000, 1);
        cart.displayTotalCost();

        cart.removeItem();
        cart.displayTotalCost();
    }
}
