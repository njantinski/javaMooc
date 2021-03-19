
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int to;
        int from;
        System.out.println("Where to?");
        to = scanner.nextInt();
        System.out.println("Where from?");
        from = scanner.nextInt();
        for(int i = from; i <= to; i++){
            System.out.println(i);
        }
    
    }
}
