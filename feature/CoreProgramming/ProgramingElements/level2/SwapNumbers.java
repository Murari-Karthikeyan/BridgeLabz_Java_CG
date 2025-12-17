import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        number1 = input.nextInt();
        number2 = input.nextInt();

        // Swapping using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(
                "The swapped numbers are " + number1 + " and " + number2
        );

        input.close();
    }
}
