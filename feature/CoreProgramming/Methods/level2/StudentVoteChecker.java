import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();

        // Take input for 10 students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            boolean canVote = checker.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) +
                        " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) +
                        " with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
