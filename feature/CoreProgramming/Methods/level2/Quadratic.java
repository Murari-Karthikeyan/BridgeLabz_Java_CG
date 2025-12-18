import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    // Returns:
    // - array of size 2 if two roots exist
    // - array of size 1 if one root exists
    // - empty array if no real roots
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta > 0 → two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // If delta == 0 → one real root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta < 0 → no real roots
        return new double[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two roots exist:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root exists:");
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots exist");
        }

        sc.close();
    }
}
