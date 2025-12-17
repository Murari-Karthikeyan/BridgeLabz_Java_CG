import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args) {
        int number;
        int[] table = new int[10];
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        sc.close();
    }
}
