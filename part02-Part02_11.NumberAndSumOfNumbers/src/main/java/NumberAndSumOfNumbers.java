
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        
        while(true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            num++;
            sum+=input;
        }
        System.out.println(String.format("Number of numbers: %d",num));
        System.out.println(String.format("Sum of the numbers: %d",sum));
    }
}
