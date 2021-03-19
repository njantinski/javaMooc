
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        
        while(true){
            System.out.println("Give a number:");
            input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input < 0){
                System.out.println("Unsuitable number");
            } else {
                System.out.println(Math.pow(input, 2));
            }
        }
    }
}
