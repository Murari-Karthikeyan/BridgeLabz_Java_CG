import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0)
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
        }

        sc.close();
    }
}
