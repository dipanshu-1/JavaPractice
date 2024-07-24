package LogicalProgram.com;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<2) {
            System.out.println(n-1);
            return;
        }
        int a=0,b=1;
        for(int i=2;i<n;i++){
            System.out.print(a+b + " ");
            int r=b;
            b=a+b;
            a=r;
        }

    }
}
