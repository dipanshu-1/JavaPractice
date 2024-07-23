package Basics.com;

import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>31||n<=0)
        {
            System.out.println("Enter Number between 1,31");
            return;
        }
        int a=2;
        for(int i=0;i<n;i++){
            System.out.println(a);
            a=a*2;
        }
    }
}
