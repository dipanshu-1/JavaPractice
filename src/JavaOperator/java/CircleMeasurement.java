package JavaOperator.java;

import java.util.Scanner;

public class CircleMeasurement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        double area=  ((3.14)*r*r);
        double perimeter = 2*(3.14)*r;

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
    }
}
