package ArrayProgram.com;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,65,65,4,5,3,5,35,44,443,35};
        int maxi=MIN_VALUE;
        int mini=MAX_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>maxi)
                maxi=arr[i];
            else if(arr[i]<mini)
                mini=arr[i];
        }
        System.out.println("Max Value = "+maxi +" Min Value = "+mini);
    }
}
