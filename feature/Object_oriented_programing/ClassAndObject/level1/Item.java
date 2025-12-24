class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10;

        item.displayItemDetails();
        System.out.println("Total Cost for 5 items: " + item.calculateTotalCost(5));
    }
}
