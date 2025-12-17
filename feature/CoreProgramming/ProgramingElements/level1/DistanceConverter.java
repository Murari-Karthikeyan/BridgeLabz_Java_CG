import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        double distanceInFeet;
        Scanner input = new Scanner(System.in);

        distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        System.out.println(
                "The distance in feet is " + distanceInFeet +
                        " while in yards is " + yards +
                        " and miles is " + miles
        );

        input.close();
    }
}
