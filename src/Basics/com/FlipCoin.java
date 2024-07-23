package Basics.com;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
       float headCount=0,tailCount=0;
        for(int i=0;i<n;i++){
            Random rand =new Random();
            if((double)Math.abs(rand.nextFloat())>0.5)
                headCount++;
            else
                tailCount++;


        }
        System.out.println((headCount/n)*100.00);
        System.out.println((tailCount/n)*100.00);
    }
}
