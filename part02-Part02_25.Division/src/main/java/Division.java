
import java.util.Scanner;



public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        Scanner sc = new Scanner(System.in);
        int numerator = Integer.valueOf(sc.nextLine());
        int denominator = Integer.valueOf(sc.nextLine());
        
        division(numerator,denominator);
    }

    // implement the method here
    
    public static void division(int numerator, int denominator){
        System.out.println(numerator / (double) denominator);
    }
}
