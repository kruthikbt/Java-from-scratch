package Functions;
import java.util.Scanner;
public class electricityBill {

    public static void printBill(float units){
        float rate = 5;
        float fixedCharges = 50;
        float totalBill= (rate * units ) + fixedCharges;
        System.out.println("Final Amount : Rupees " + totalBill);
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        float  units = sc.nextFloat();

        printBill(units);
    sc.close();
    }
}
