package ArrayProgram.com;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        int[][] arr=new int[n][m];
        int[][] ans=new int[n][m];
        int[][] arr1 =new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                int z = sc.nextInt();
                arr[i][j] = z;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                int z = sc.nextInt();
                arr1[i][j] = z;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=0;
                for(int k=0;k<m;k++){
                    sum+=(arr[i][k]*arr[k][i]);
                }
                ans[i][j]=sum;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
