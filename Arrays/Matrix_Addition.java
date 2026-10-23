package Arrays;
import java.util.*;
public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of 2-D Array");
        int n= sc.nextInt();
        
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int sum[][]=new int[n][n];

        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println();

        System.out.println("Matrix 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Sum of the matrices:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
