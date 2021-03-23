
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First",100);
        Container second = new Container("Second",100);

        while (true) {
            System.out.println(first);
            System.out.println(second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if(parts[0].equals("add")){
                first.add(Integer.valueOf(parts[1]));
            }
            else if(parts[0].equals("move")){
                int toMove = first.getNumLiters(Integer.valueOf(parts[1]));
                second.add(toMove);
            } else if(parts[0].equals("remove")){
                second.remove(Integer.valueOf(parts[1]));
                }
        }
    }  
}
