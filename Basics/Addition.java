import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int sum=number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        scanner.close();     
    }
}