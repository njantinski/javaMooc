
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] splittedLine = line.split("\\s+");
            System.out.println(splittedLine[splittedLine.length - 1]);
        }

    }
}
