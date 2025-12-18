import java.util.Scanner;
public class NaturalSum {
    static int nsum(int n){
        if(n==1){
            return 1;
        }
        return n+ nsum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = nsum(n);
        System.out.println("Sum by recursive method "+ sum);
        System.out.println("Sum by formula method "+ n*(n+1)/2);

    }
}