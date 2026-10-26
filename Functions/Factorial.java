package Functions;
import java.util.*;
public class Factorial {

public static void printFact(int n){
    if( n <0){
        System.out.println("Invalid Number");
        return ;
    }
    else if(n == 0){
        System.out.println("1");
        return;
    }
    else{
        int fact = 1;
        for(int i=1;i <=n;i++){
            fact = fact *i;
    }
    System.out.println( "Factorial of " + n + ":" + fact);
    }
    return ;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n =sc.nextInt();
         printFact(n);
        sc.close();
    }

}
