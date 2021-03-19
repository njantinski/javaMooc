
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;
        int counter = 0;
        String longestName = "";
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] person = input.split(",");
            counter++;
            sum+=Integer.valueOf(person[1]);
            if(longestName.length() < person[0].length()){
                longestName = person[0];
            }
        }
        
        double avg = sum/ (double)counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years:" + avg);

    }
}
