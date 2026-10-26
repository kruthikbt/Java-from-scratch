package Functions;
import java.util.Scanner;


public class shoppingDiscount {

    public static double printDiscount(double price,double discount){
    double totalBill = (price * discount)/100 ;
    return  totalBill;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of the Product: ");
        double price = sc.nextDouble();
        double discount = 10;

        System.out.println("====Bill Summary=====");
        System.err.print("\nActual Amount: "+ price);
        System.out.print("\nDiscount Applied: " + discount +"%");
        System.out.print("\nFinal Price : " + printDiscount(price, discount));
        sc.close();
    }
}
