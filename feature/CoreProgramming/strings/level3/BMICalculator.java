import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for one person
    static String[] calculateBMI(double weight, double heightCm) {
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to compute BMI for all persons
    static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            String[] bmiResult = calculateBMI(data[i][0], data[i][1]);

            result[i][0] = String.valueOf(data[i][1]); // Height
            result[i][1] = String.valueOf(data[i][0]); // Weight
            result[i][2] = bmiResult[0];               // BMI
            result[i][3] = bmiResult[1];               // Status
        }
        return result;
    }

    // Display method
    static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight and height for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble(); // weight
            persons[i][1] = sc.nextDouble(); // height
        }

        String[][] result = processBMI(persons);
        display(result);

        sc.close();
    }
}
