import java.util.Scanner;

public class TotalIncom {
    public static void main(String[] args) {

        double salary;
        double bonus;

        Scanner input = new Scanner(System.in);

        salary = input.nextDouble();
        bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + totalIncome
        );

        input.close();
    }
}
