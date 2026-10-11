package Conditional_Stat;
import java.util.*;
public class Voter_Eligibility {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    System.out.println("Enter your Age: ");
    int age =sc.nextInt();
    if( age <= 18){
        System.out.println("You are Elegible  not for voting!");
    }
    else{
        System.out.println("You are not Eligible for the voting!");
    }
    sc.close();
    }
}
