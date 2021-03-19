
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int max = 0;
        String name = "";
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] csv = input.split(",");
            int age = Integer.valueOf(csv[1]);
            if(max < age){
                max = age;
                name = csv[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
