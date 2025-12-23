import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindromeIter(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    static boolean isPalindromeRec(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRec(s, i + 1, j - 1);
    }

    static boolean isPalindromeReverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeIter(text));
        System.out.println(isPalindromeRec(text, 0, text.length() - 1));
        System.out.println(isPalindromeReverse(text));
    }
}
