import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int number;
        int[] result = new int[4];
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            result[idx++] = number * i;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[idx++]);
        }
        sc.close();
    }
}
