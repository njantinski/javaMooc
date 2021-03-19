
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        
        String line;
        String id;
        String name;
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            line = scanner.nextLine();
            if(checkEnding(line)){
                break;
            }
            id = line;
            System.out.println("Name? (empty will stop)");
            line = scanner.nextLine();
            if(checkEnding(line)){
                break;
            }
            
            name = line;
            Item newItem = new Item(id,name);
            if(!(items.contains(newItem))){
                items.add(newItem);
            }
        }
        if(!items.isEmpty()){
            System.out.println("==Items==");
            for(Item i : items){
                System.out.println(i);
            }
        }
    }
    private static boolean checkEnding(String line){
        return line.equals("");
    }
    
}
