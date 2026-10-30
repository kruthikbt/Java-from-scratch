// Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a Java main 
// method to illustrate Stack operations. 

package Lab_Programs;
import java.util.*;
public class Stack {
Scanner sc= new Scanner(System.in);
    int MAX = 10;
    int stack[]= new int[MAX];
    int top =-1;

    void push(){
        if( top == MAX - 1 ){
            System.out.println("Stack Overflow! Stack is full");
        }
        else{
            System.out.print("Enter the Elelment to Add/Push to the stack: ");
            int x =sc.nextInt();
            stack[++top]= x;
            System.out.println("Element Added Successfully...\n");
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Underflow! the Stack is Empty");
        }
        else{
            System.out.printf("Deleted Element: %d\n", stack[top--]);
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Underflow !");
        }else{
            for(int i= top;i >=0 ;i--){
                System.out.println("Stack Elements: " + stack[i]+"\n");
            }
        }
    }
    

    public static void main(String[] args) {
    Stack stackProgram = new Stack();  //Class Creation
    Scanner sc = stackProgram.sc;
    int choice;
    do{
        System.out.println("==== Stack Operations ======");
        System.out.print("\n1.Push");
        System.out.print("\n2.Pop");
        System.out.print("\n3.Display");
        System.out.println("\n4.Exit");
        System.out.print("Enter the choice out of 4: ");
        choice = sc.nextInt();

    switch(choice){
        case 1:
            stackProgram.push();
            break;

        case 2:
            stackProgram.pop();
            break;

        case 3:
            stackProgram.display();
            break;
            
        case 4:
            System.out.println("Exiting the Program...");;
            break;

        default:
            System.out.println("Invalid Choice...");
            break;
    }
    }while( choice != 4);
        
    sc.close();
    }
    
}
