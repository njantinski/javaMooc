
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println(String.format("%d is greater than %d",num1,num2));
        } else if (num2 > num1){
            System.out.println(String.format("%d is smaller than %d",num1,num2));
        } else {
            System.out.println(String.format("%d is equal to %d",num1,num2));
        }
    }   
}
