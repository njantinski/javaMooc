
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        List<Integer> list = new ArrayList<>();
        int input;
        while((input = Integer.valueOf(scanner.nextLine())) != 9999){
            list.add(input);
        }
        
        int min = 9999;
        for(int i = 0; i < list.size();i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println("Smallest number: " + min);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == min){
                System.out.println("Found at: " + i);
            }
        }
    }
}
