package ArrayProgram.com;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,65,65,4,5,3,5,35,44,443,35};
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int n= arr.length;
        for (int z : arr) {
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
