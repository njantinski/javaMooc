
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean found = false;
        boolean notEntered = false;
       
        try(Scanner sc = new Scanner(Paths.get(file))){
            notEntered = true;
            while(sc.hasNextLine()){
                if(sc.nextLine().equals(searchedFor)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Found!");
            }else {
                System.out.println("Not found!");
            }
            
        } catch (IOException ex) {
           
        }
        if(!notEntered){
            System.out.println("Reading the file " + file +" failed.");
        }

    }
}
