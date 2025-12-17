import java.util.Scanner;

public class Bmi2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        number = sc.nextInt(); // number of persons

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double heightMeter = height / 100;
            double bmi = weight / (heightMeter * heightMeter);

            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " Weight: " + personData[i][0] +
                            " Height: " + personData[i][1] +
                            " BMI: " + personData[i][2] +
                            " Status: " + weightStatus[i]
            );
        }

        sc.close();
    }
}
