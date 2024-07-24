package StringProgram.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        char[] arr=a.toCharArray();
        HashMap<Character,Integer> mp=new HashMap<>();

        for (char z : arr) {
            if (mp.containsKey(z))
                mp.put(z, mp.get(z) + 1);
            else
                mp.put(z, 1);
        }
        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
