import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        boolean result = (number % 5 == 0);

        System.out.println(
                "Is the number " + number + " divisible by 5? " + result
        );
        sc.close();
    }
}
