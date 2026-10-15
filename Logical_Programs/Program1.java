package Lab_Programs;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n=sc.nextInt();
        int a[][]= new int[n][n];
        int b[][]= new int[n][n];
        int sum[][]=new int [n][n]; 
        
        
        System.out.println("Enter the elements of first Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n\nEnter the elements of second Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n\nSum of these two arrays are:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
         sc.close();
    }
   
}
