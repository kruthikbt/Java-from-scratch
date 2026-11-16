package Functions.Imp_Questions;
import java.util.*;
public class Circumference {
    public static double circumference(int r){
        return 2 * 3.14* r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        int r= sc.nextInt();
        sc.close();
        System.out.println("The Circumference is :"+ circumference(r));
    }
}
