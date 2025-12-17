import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        double celsius;
        Scanner input = new Scanner(System.in);

        celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println(
                "The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit"
        );

        input.close();
    }
}
