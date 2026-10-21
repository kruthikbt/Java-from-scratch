package Switch_Statements;
import java.util.*;
public class Hotel_Menu {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the Choice: ");
       int choice=sc.nextInt();
        System.out.println("========PRODUCT MENU==========");
        System.out.println("1.IDLI");
        System.out.println("2.DOSA");
        System.out.println("3.MEALS");
        System.out.println("4.COFEE");


        
       switch (choice) {
        case 1:
            System.out.println("Item = Idli");
            System.out.println("Price = 10$");
            break;
        case 2:
            System.out.println("Item = Dosa");
            System.out.println("Price = 15$");
            break;
        case 3:
            System.out.println("Item = Meals");
            System.out.println("Price = 30$");
            break;
        case 4:
            System.out.println("Item = Cofee");
            System.out.println("Price = 2$");
            break;
       
        default:
            System.out.println("No Item Found ,Sorry!");
            break;
       }
       sc.close(); 
    }
}
