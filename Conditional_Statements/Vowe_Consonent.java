package Conditional_Stat;
import java.util.*;
public class Vowe_Consonent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the Alphabet to check its nature : ");
        char ch=sc.next().charAt(0);

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The enter alpabet"+ ch + "is Vowel");
            System.out.println("\n");
        }
        else{
            System.out.println("The enter alpabet"+" "+ ch +" "+ "is Consonent");
        }
        sc.close();
    }
}
