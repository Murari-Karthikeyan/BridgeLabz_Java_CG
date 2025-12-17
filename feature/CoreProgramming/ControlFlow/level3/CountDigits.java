import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int number;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        // Handle the case when the number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase count
            }
        }

        System.out.println("The number of digits is " + count);

        sc.close();
    }
}
