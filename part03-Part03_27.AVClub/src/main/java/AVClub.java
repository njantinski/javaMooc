
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] splittedLine = line.split("\\s+");
            for(String s: splittedLine){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
        }
        

    }
}
