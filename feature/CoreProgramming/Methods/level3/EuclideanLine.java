import java.util.Scanner;

public class EuclideanLine {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );
    }

    // Method to find slope (m) and y-intercept (b)
    // Returns array: [m, b]
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        // Slope m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // y-intercept b = y1 - m*x1
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input points
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Line equation
        if (x2 != x1) {
            double[] line = findLineEquation(x1, y1, x2, y2);
            System.out.println("Slope (m) = " + line[0]);
            System.out.println("Y-intercept (b) = " + line[1]);
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        } else {
            System.out.println("Equation of line: x = " + x1 + " (Vertical Line)");
        }

        sc.close();
    }
}
