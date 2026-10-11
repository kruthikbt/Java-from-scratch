package Conditional_Stat;
import java.util.*;
public class Large_of_three {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    System.out.println("Enter the number a: ");
    int a= sc.nextInt();

    System.out.println("Enter the number b: ");
    int b= sc.nextInt();

    System.out.println("Enter the number c: ");
    int c= sc.nextInt();

    if(a>=b && a>=c ){
        System.out.println("Value of a is largest of all given value.");
    }
    else if(b>=a && b>=c){
        System.out.println("Value of b is largest of all given values.");
    }
    else{
        System.out.println("Value of c is largest of all given values.");
    }
    sc.close();
    
}
}