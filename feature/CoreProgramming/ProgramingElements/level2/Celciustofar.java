import java.util.Scanner;

public class Celciustofar {
    public static void main(String[] args) {

        double fahrenheit;
        Scanner input = new Scanner(System.in);

        fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println(
                "The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius"
        );

        input.close();
    }
}
