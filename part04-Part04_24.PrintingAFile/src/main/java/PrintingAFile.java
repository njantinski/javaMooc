
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(Paths.get("data.txt"))){
            String row;
            while(true){
                row = sc.nextLine();
                if(row.equals("") || row.equals(null)){
                    break;
                }
                System.out.println(row);
            }
            
            
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
