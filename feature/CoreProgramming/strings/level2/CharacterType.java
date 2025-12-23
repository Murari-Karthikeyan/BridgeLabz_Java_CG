import java.util.Scanner;

public class CharacterType {

    static String type(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyze(String text) {
        String[][] table = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            table[i][0] = String.valueOf(text.charAt(i));
            table[i][1] = type(text.charAt(i));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = analyze(text);
        System.out.println("Char\tType");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
