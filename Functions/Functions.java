package Functions;
import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println("Your name is : "+ name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.next();
        
        printMyName(name);
        sc.close();
    }
}
