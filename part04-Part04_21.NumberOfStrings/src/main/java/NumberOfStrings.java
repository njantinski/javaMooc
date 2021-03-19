
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int i =0;
        while(!(input = scanner.nextLine()).equals("end")){
            i++;
        }
        System.out.println(i);
    }
}
