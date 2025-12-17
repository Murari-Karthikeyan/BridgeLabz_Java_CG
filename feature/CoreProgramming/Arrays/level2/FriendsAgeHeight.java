import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {

        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex])
                youngestIndex = i;

            if (height[i] > height[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("Youngest friend is " + names[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex]);

        sc.close();
    }
}
