import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        double[][] marks = new double[students][3]; // Physics, Chemistry, Maths
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            marks[i][0] = sc.nextDouble(); // Physics
            marks[i][1] = sc.nextDouble(); // Chemistry
            marks[i][2] = sc.nextDouble(); // Maths

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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

        for (int i = 0; i < students; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " Percentage: " + percentage[i] +
                            " Grade: " + grade[i]
            );
        }

        sc.close();
    }
}
