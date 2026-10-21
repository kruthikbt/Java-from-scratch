package Switch_Statements;
import java.util.*;
public class ATM_Menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("========ATM TRANSACTION MENU=========");
        System.out.println("1.Balance Enquiry.");
        System.out.println("2.Deposit.");
        System.out.println("3.Withdrawel money.");
        System.out.println("\n");
        System.out.print("Enter the Choice: ");
        int choice=sc.nextInt();
        double  balance=5000;
        int amount;

        switch (choice) {
            case 1:
                System.out.println("The present balance in the account is :"+balance);
                break;

            case 2:
                System.out.print("Enter the amount to be deposited: ");
                amount = sc.nextInt();
                if(amount > 0){
                    balance += amount;
                    System.out.println("The Updated Balance is "+balance);
                }
                else{
                    System.out.println("Invalid Amount!");
                }
                break;

            case 3:
                System.out.print("Enter the amount for Withdrawl: ");
                amount = sc.nextInt();
                if(balance > amount){
                    balance -= amount;
                    System.out.println("The present balance in the account is "+balance);
                }
                else if(amount > balance){
                    System.out.println("Insufficient Balance!!");
                }
                else{
                    System.out.println("Invalid Money..");
                }
                break;
        
            default:
                System.out.println("Invalid Choice...");
                break;
        }

        sc.close();
    }
}
