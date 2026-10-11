import java.util.*;  //package
public class Calculator {
    public static void main(String[] args) {
        //Variables and Data Types
        System.out.println("Enter the values  a and b");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt();         //4byte for 64-bit system
        int difference= a-b;
        int divide= a/b;
        int multiply= a*b;
        int add = a+b;
        System.out.println("--------Calculator-----------");
        System.out.println("Difference between two values: "+difference);
        System.out.println("Multiplying two values: "+multiply);
        System.out.println("Dividing two values: "+divide);
        System.out.println("Adding two values: "+add);

        sc.close();
    }
    
}

