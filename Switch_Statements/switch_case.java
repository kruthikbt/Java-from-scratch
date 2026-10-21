package Switch_Statements;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice:");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                if(choice == 1){
                    System.out.println("Namaste");
                }
                break;
            case 2:
                if(choice == 2){
                    System.out.println("Hello World!");
                }
                break;
            case 3:
                if(choice == 3){
                    System.out.println("Banjour");
                }
                break;
            default:
            
                System.out.println("Invalid Choice...");
                break;
                


        }


        sc.close();
    }

}
