package Patterns.Solid_Rectangle;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
    //     for(int i=1;i<=4;i++){
    //         for(int j=1;j<=5;j++){
    //         System.out.print("*");
            
    //     }
    //     System.out.print("\n");
    // }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of 'a' and 'b' as rows and coloumns : ");
        int a=sc.nextInt();
        int b= sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
            System.out.print("*");
            
        }
        System.out.print("\n");
    }
        sc.close();
        
    }
}
