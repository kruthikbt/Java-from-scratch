package Patterns.Half_180deg_Inverted;

public class Inverted_2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //inner loop->Space print
            for(int j=1;j<n-i;j++){
                System.out.println(" ");

            }
            //inner loop-> coloumns/star
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
