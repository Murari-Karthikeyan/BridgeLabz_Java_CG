import java.util.Scanner;

public class BMICalculator2D {

    // Method to calculate BMI and populate the 3rd column of the array
    public static void calculateBMI(double[][] personData) {

        for (int i = 0; i < personData.length; i++) {

            double weight = personData[i][0];   // in kg
            double heightCm = personData[i][1]; // in cm

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            personData[i][2] = bmi;
        }
    }

    // Method to determine BMI status for all persons
    public static String[] determineBMIStatus(double[][] personData) {

        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 persons, 3 columns → weight, height, BMI
        double[][] personData = new double[10][3];

        // Input weight and height
        for (int i = 0; i < 10; i++) {

            personData[i][0] = sc.nextDouble(); // weight in kg
            personData[i][1] = sc.nextDouble(); // height in cm

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--; // re-enter data for this person
            }
        }

        // Calculate BMI
        calculateBMI(personData);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(personData);

        // Display result
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " Height(cm): " + personData[i][1] +
                            " Weight(kg): " + personData[i][0] +
                            " BMI: " + personData[i][2] +
                            " Status: " + bmiStatus[i]
            );
        }

        sc.close();
    }
}
