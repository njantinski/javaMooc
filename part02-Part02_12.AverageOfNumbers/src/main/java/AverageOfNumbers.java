
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            sum+=input;
            count++;
        }
        double average = sum/ (double) count;
        System.out.println(String.format("Average of the numbers: %f",average));
    }
}
