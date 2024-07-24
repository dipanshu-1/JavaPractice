package StringProgram.com;

import java.util.Scanner;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        int n=input.length();
      int ans=0;
        for(int j=0;j<n;j++) {
            int[] alpha = new int[26];
            for (int i = j; i < n; i++) {
                char r = input.charAt(i);
                int z = r - 'a';

                alpha[z] += 1;
                if(alpha[z]>1){
                    if((i-j+1)>ans)
                        ans=(i-j+1);
                    break;
                }
            }
        }
        System.out.println(ans);
//        for(int i=0;i<26;i++){
//            if(alpha[i]>0){
//                char z= (char) ('a'+i);
//                System.out.println(z + " " +alpha[i]);
//            }
//        }
    }
}
