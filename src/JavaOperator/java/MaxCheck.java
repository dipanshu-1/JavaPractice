package JavaOperator.java;

import java.util.Scanner;

public class MaxCheck {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       int ans=sc.nextInt();
        int a= sc.nextInt();
       ans = (ans<a)?a:ans;
       int b= sc.nextInt();
       ans=(ans<b)?b:ans;

        System.out.println("Max among these three is : "+ans);
    }
}
