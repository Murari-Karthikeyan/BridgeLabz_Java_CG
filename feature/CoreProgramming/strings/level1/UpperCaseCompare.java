import java.util.Scanner;

public class UpperCaseCompare {

    static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else
                result += ch;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = toUpperManual(text);
        String builtIn = text.toUpperCase();

        System.out.println(compare(manual, builtIn));

        sc.close();
    }
}
