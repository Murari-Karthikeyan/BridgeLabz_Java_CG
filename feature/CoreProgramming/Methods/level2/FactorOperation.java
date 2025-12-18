import java.util.Scanner;

public class FactorOperation {
    static int[] factors(int number){
        int count=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        int[] fact=new int[count];
        int index=0;
        for(int i=1;i<number;i++){
            if(number%i==0) {
                fact[index++] = i;
            }
        }
        return fact;
    }

    public static int sum(int[] fact){
        int sum=0;
        for(int fac:fact){
            sum+=fac;
        }
        return sum;
    }
    public static int product(int[] fact){
        int product=1;
        for(int fac:fact){
            product*=fac;
        }
        return product;
    }
    public static int squaresum(int[] fact){
        int squaresum=1;
        for(int fac:fact){
            squaresum+= Math.pow(fac,2);
        }
        return squaresum;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int[] fact = factors(number);
        for(int fac:fact){
            System.out.print(fac+" ");
        }
        System.out.println("The sum of the factors is "+ sum(fact)+"\n");
        System.out.println("The Product of the factors is "+ product(fact)+"\n");
        System.out.println("The Squaresum of the factors is "+ squaresum(fact));

    }

}