package ArrayProgram.com;

public class ArrayReversal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,66,77,88,99,23};

        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int a=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=a;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
