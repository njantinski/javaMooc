
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int i = 1;
        int max = list.get(0);
        while(i < list.size()){
            int iterator;
            if(max < (iterator = list.get(i))){
                max = iterator;
            }
            i++;
        }
        
        System.out.println(max);
    }
}
