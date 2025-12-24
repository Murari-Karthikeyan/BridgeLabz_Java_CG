class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel +
                " | Days: " + rentalDays +
                " | Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Suresh", "Swift", 4);
        cr.display();
    }
}
