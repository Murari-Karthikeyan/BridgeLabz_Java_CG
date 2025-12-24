class Vehicle {

    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ramesh", "Car");
        Vehicle v2 = new Vehicle("Sita", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(6000);

        v2.displayVehicleDetails();
    }
}
