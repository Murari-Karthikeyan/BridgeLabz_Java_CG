import java.util.Scanner;

public class Kgtopound {
    public static void main(String[] args) {

        double weightInPounds;
        Scanner input = new Scanner(System.in);

        weightInPounds = input.nextDouble();

        double weightInKg = weightInPounds / 2.2;

        System.out.println(
            "The weight of the person in pound is " + weightInPounds +
            " and in kg is " + weightInKg
        );

        input.close();
    }
}
