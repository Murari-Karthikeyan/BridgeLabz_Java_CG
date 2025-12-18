import java.util.Scanner;

public class LeapYearCheck {
    static void LeapYear(int year){
        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("Its not a Leap Year");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year<1582){
            System.out.println("enter valid year");
        }
        else{
        LeapYear(year);
    }
}}