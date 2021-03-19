
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        List<Integer> list = new ArrayList<>();
        int input;
        while((input = Integer.valueOf(scanner.nextLine())) != -1){
            list.add(input);
        }
        
        int sum = 0;
        for(Integer i : list){
            sum+= i;
        }
        System.out.println("Average: " + (sum/ (double) list.size()));
        
        
    }
}
