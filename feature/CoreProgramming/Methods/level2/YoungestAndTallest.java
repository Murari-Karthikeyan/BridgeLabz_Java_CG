import java.util.Scanner;

public class YoungestAndTallest {

    static int youngest(int[] age){
        int youngestIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    static int tallest(float[] height){
        int tallestIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        float[] height=new float[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextFloat();
        }
        int young = youngest(age);
        int tall = tallest(height);
        System.out.println("The youngest friend is " + names[young]);
        System.out.println("The tallest friend is " + names[tall]);
    }
}