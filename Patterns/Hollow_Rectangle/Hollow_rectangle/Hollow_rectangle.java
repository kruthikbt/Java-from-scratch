package Patterns.Hollow_rectangle;

import java.util.Scanner;

public class Hollow_rectangle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of 'a' and 'b' as rows and coloumns : ");
        int a=sc.nextInt();
        int b= sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        sc.close();

    }
}
