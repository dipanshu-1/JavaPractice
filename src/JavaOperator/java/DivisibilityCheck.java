package JavaOperator.java;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%5==0 &&n%7==0)
            System.out.println("yes its Divisible");
        else
            System.out.println("No");
    }
}
