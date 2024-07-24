package ArrayProgram.com;

import java.util.ArrayList;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int[] arr ={1,-2,3,-45,65,-65,4,5,-3,-5,35,44,443,-35};
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for(int z:arr){
            if(z>0)
                positive.add(z);
            else
                negative.add(z);
        }
        System.out.print("Positive values are: ");
        for(int z:positive)
            System.out.print(z+" ");
        System.out.println();
        System.out.print("Negative values are: ");
        for(int z:negative)
            System.out.print(z+" ");


    }
}
