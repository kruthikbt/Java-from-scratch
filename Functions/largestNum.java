package Functions;

import java.util.Scanner;

public class largestNum{

public static void printlargestNum( int a,int b){
    if( a > b){
        System.out.println("a is greater than b");
    }
    else{
        System.out.println("b is greater than a");
    }
    return;
}
public static void main(String[] Args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a =sc.nextInt();

System.out.print("Enter the value of b: ");
int b =sc.nextInt();

    printlargestNum(a,b);
    sc.close();
}

}