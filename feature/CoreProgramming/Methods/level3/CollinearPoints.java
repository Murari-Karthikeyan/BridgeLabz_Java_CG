import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Handle vertical line cases to avoid division by zero
        if ((x2 - x1) == 0 && (x3 - x2) == 0) {
            return true;
        }
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
            return false;
        }

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input points
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check using slope method
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope method");
        } else {
            System.out.println("Points are NOT collinear using slope method");
        }

        // Check using area method
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area method");
        } else {
            System.out.println("Points are NOT collinear using area method");
        }

        sc.close();
    }
}
