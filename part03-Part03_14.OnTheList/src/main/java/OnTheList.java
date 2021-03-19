
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for:");
        String searchingStr = scanner.nextLine();
        if(list.contains(searchingStr)){
            System.out.println(searchingStr + " was found!");
        } else{
            System.out.println(searchingStr + " was not found!");
        }
    }
}
