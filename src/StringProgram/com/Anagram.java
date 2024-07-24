package StringProgram.com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String string_1= sc.nextLine();
        String string_2= sc.nextLine();

        char[] ss=string_1.toCharArray();
        char[] ss2=string_2.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(ss2);

     for(int i=0;i< ss.length;i++)   {
        // System.out.println(ss[i]+" "+ss2[i]);
            if (ss[i] != ss2[i]) {
                System.out.println("Noooo");
                return;
            }
        }
        System.out.println("yess its a Anagram");

    }
}
