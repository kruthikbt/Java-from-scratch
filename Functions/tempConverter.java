package Functions;

import java.util.Scanner;

public class tempConverter {

public static void printTemp(float Celsius){
    float farenheit = ( 9/5 * Celsius) + 32;
    System.out.println("Converted temp in Farenheit:"+ farenheit);
}
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the temp in degree Celsius: ");
    float Celsius = sc.nextFloat();

    printTemp(Celsius);
    sc.close();
    }
}
