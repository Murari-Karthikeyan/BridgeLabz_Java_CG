import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        double base;
        double height;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();   // base in inches
        height = input.nextDouble(); // height in inches

        // Area in square inches
        double areaInSqInches = 0.5 * base * height;

        // Convert square inches to square centimeters
        // 1 inch = 2.54 cm → 1 sq inch = 2.54 * 2.54 sq cm
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;

        System.out.println(
                "The area of the triangle is " + areaInSqInches +
                        " square inches and " + areaInSqCm + " square centimeters"
        );

        input.close();
    }
}
