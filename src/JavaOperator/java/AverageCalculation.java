package JavaOperator.java;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average = "+(sum/5));
    }
}
