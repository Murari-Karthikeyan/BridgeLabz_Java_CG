import java.util.Scanner;

public class StringLengthWithoutLength {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("User-defined length: " + userLength);
        System.out.println("Built-in length: " + builtInLength);

        sc.close();
    }
}
