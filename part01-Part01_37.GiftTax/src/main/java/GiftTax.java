
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = scan.nextInt();
        if (value < 4999){
            System.out.println("No tax!");
        } else if (value < 24999){
            System.out.println("Tax: " + (((value-5000) * 0.08) + 100));
        } else if (value < 54999){
            System.out.println("Tax: " + (((value-25000) * 0.1) + 1700));
        } else if (value < 199999){
            System.out.println("Tax: " + (((value-55000) * 0.12) + 4700));
        } else if (value < 999999){
            System.out.println("Tax: " + (((value-200000) * 0.15) + 22100));
        } else {
            System.out.println("Tax: " + (((value-1000000) * 0.17) + 142100));
        }

    }
}
