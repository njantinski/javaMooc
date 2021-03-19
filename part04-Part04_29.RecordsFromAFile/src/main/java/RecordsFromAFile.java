
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(fileName))){
            String input;
            while(sc.hasNextLine()){
                input = sc.nextLine();
                String[] parts = input.split(",");
                String output = parts[0] + ", " + "age: " + parts[1] + " year";
                int age = Integer.valueOf(parts[1]);
                if(age != 1){
                    output += "s";
                }
                
                System.out.println(output);
            }
            
        } catch (IOException ex) {
            
        }
    }
}
