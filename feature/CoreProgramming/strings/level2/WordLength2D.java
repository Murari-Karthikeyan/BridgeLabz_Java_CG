import java.util.Scanner;

public class WordLength2D {

    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    static String[] splitWords(String text) {
        int len = findLength(text);
        int words = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') words++;

        String[] arr = new String[words];
        int index = 0;
        arr[index] = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index++;
                arr[index] = "";
            } else {
                arr[index] += text.charAt(i);
            }
        }
        return arr;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
