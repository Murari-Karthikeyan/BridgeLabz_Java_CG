import java.util.Scanner;

class StudentGradeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();

        double[] physics = new double[numberOfStudents];
        double[] chemistry = new double[numberOfStudents];
        double[] maths = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        // Input marks
        for (int i = 0; i < numberOfStudents; i++) {

            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter positive values.");
                i--;  // retry input
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Display result
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " Percentage: " + percentage[i] +
                            " Grade: " + grade[i]
            );
        }

        sc.close();
    }
}
