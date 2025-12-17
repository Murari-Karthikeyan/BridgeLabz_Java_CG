import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfPersons = sc.nextInt();

        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Input weight and height
        for (int i = 0; i < numberOfPersons; i++) {

            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;   // re-enter values
            }
        }

        // Calculate BMI and status
        for (int i = 0; i < numberOfPersons; i++) {

            double heightInMeters = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeters * heightInMeters);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Display result
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " Height: " + height[i] +
                            " Weight: " + weight[i] +
                            " BMI: " + bmi[i] +
                            " Status: " + status[i]
            );
        }

        sc.close();
    }
}
