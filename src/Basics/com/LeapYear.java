package Basics.com;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year>10000||year<1000)
            System.out.println("Enter 4 digit number only");
        else{
            if(year%4==0&&year%400==0)
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }
    }
}
