import java.util.Scanner;

public class Rounds {
    public static void main(String[] args) {

        double side1, side2, side3;
        Scanner input = new Scanner(System.in);

        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();

        // Perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run = 5 km = 5000 meters
        double totalDistance = 5000;

        // Number of rounds
        double rounds = totalDistance / perimeter;

        System.out.println(
                "The total number of rounds the athlete will run is " + rounds + " to complete 5 km"
        );

        input.close();
    }
}
