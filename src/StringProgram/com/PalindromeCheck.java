package StringProgram.com;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                System.out.println("Not a palindrome");
                return ;
            }
        }
        System.out.println("yess its a Palindrome");

    }
}
