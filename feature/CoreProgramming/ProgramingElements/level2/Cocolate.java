import java.util.Scanner;

public class Cocolate{
    public static void main(String[] args) {

        int numberOfChocolates;
        int numberOfChildren;

        Scanner input = new Scanner(System.in);

        numberOfChocolates = input.nextInt();
        numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println(
                "The number of chocolates each child gets is " + chocolatesPerChild +
                        " and the number of remaining chocolates are " + remainingChocolates
        );

        input.close();
    }
}
