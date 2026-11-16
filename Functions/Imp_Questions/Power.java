package Functions.Imp_Questions;
import java.util.*;
public class Power {

    public static double calculatePower(int x,int n){
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x= sc.nextInt();
        System.out.print("Enter the value of x: ");
        int n= sc.nextInt();
        sc.close();

        System.out.println("The power Value is: "+calculatePower(x, n));
    }
}
