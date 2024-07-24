package ArrayProgram.com;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        int[][] arr=new int[n][m];
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
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] += arr1[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
