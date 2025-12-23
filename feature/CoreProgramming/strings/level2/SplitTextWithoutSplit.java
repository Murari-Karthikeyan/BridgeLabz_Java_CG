import java.util.Scanner;

public class SplitTextWithoutSplit {

    // Method to find length without using length()
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split text into words using charAt()
    static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                spaceIndex[index++] = i;
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = "";
            for (int j = start; j < spaceIndex[i]; j++) {
                words[i] += text.charAt(j);
            }
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += text.charAt(i);
        }

        return words;
    }

    // Method to compare two string arrays
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("Are both splits same? " + result);

        sc.close();
    }
}
