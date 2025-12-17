import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height is " + mean);
        sc.close();
    }
}
