
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int max = 0;
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] csv = input.split(",");
            int age = Integer.valueOf(csv[1]);
            if(max < age){
                max = age;
            }
        }
        System.out.println("Age of the oldest: " + max);

    }
}
