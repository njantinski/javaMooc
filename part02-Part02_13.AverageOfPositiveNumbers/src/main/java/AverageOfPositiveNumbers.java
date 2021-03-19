
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        int sum = 0;
        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input == 0){
                if(count == 0){
                    System.out.println("Cannot calculate average");
                }
                break;
            }
            if(input > 0){
                sum+=input;
                count++;
            }
        }
        double average = sum/ (double) count;
        System.out.println(average);

    }
}
