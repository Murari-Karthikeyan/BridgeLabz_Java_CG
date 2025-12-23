import java.util.Scanner;

public class ShortestLongestWord {

    static int length(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c++);
            }
        } catch (Exception e) {}
        return c;
    }

    static String[] split(String text) {
        int count = 1;
        for (char ch : text.toCharArray())
            if (ch == ' ') count++;

        String[] words = new String[count];
        int idx = 0;
        words[idx] = "";

        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                idx++;
                words[idx] = "";
            } else {
                words[idx] += ch;
            }
        }
        return words;
    }

    static int[] shortestLongest(String[] words) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minI = 0, maxI = 0;

        for (int i = 0; i < words.length; i++) {
            int l = length(words[i]);
            if (l < min) { min = l; minI = i; }
            if (l > max) { max = l; maxI = i; }
        }
        return new int[]{minI, maxI};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = split(text);
        int[] result = shortestLongest(words);

        System.out.println("Shortest: " + words[result[0]]);
        System.out.println("Longest: " + words[result[1]]);
    }
}
