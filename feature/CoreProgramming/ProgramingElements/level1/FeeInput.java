import java.util.Scanner;

class FeeInput {
    public static void main(String[] args) {

        int fee;
        int discountPercent;

        Scanner input = new Scanner(System.in);

        fee = input.nextInt();              // Student Fee
        discountPercent = input.nextInt();  // Discount Percentage

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}
