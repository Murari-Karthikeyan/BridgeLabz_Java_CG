import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        double principal;
        double rate;
        double time;

        Scanner input = new Scanner(System.in);

        principal = input.nextDouble();
        rate = input.nextDouble();
        time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println(
                "The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );

        input.close();
    }
}
