import java.util.*;

public class Input {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Name: ");
    String name= sc.nextLine();

    System.out.println("Enter your Branch: ");
    String branch= sc.nextLine();

    System.out.println("Enter your USN: ");
    int usn =sc.nextInt();

    System.out.println("Enter your cgpa");
    float cgpa= sc.nextFloat();

    System.out.println("\n");
    System.out.println("======Student Final Details=======");
    System.out.println("Hello"+" "+  name+" "+ "Welcome to "+branch+" "+"Department"+"! ");
    System.out.println("You USN is "+" "+usn + " "+"and your current cgpa is "+cgpa);

    sc.close();
        
    }
}
