import java.util.Scanner;

public class TrimWithoutTrim {

    static int[] trimIndex(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static String substring(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++)
            r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String userTrim = substring(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Result same? " + userTrim.equals(builtIn));
    }
}
