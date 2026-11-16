package Functions.Imp_Questions;
import java.util.*;
public class Average {
    public static int calculateAverage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c= sc.nextInt();

        System.out.println("The average is : "+ calculateAverage(a, b, c));
        sc.close();
    }
}
