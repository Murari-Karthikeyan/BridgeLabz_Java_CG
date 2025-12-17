import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int number;
        int originalNumber;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        // Store the original number
        originalNumber = number;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Get last digit
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check Armstrong condition
        if (sum == number) {
            System.out.println("The number " + number + " is an Armstrong Number");
        } else {
            System.out.println("The number " + number + " is not an Armstrong Number");
        }

        sc.close();
    }
}
