package Functions.Imp_Questions;
import java.util.*;
public class Sumofodd {
    public static void oddSum(int n){
        int sum =0;
        for(int i= 1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("The sum of  first "+ n +  " odd numbers is: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        sc.close();

        oddSum(n);
    }
}
