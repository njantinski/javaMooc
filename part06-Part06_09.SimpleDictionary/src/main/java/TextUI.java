
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class TextUI {
    private Scanner sc;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner sc, SimpleDictionary simpleDictionary){
        this.sc = sc;   
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){
        System.out.println("Command: ");
        while(true){
            String command = sc.nextLine();
            if(endCommand(command)){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                addWord(sc);
            }
            if(command.equals("search")){
                translateWord(sc);
            }
            System.out.println("Unknown command");
        }
    }

    private boolean endCommand(String command) {
        return command.equals("end");
    }

    private void addWord(Scanner sc) {
        System.out.println("Word:");
        String word = sc.nextLine();
        System.out.println("Translation: ");
        String translation = sc.nextLine();
        simpleDictionary.add(word, translation); 
    }

    private void translateWord(Scanner sc) {
        System.out.println("Word:");
        String word = sc.nextLine();
        String translation = simpleDictionary.translate(word);
        if(translation == null){
            System.out.println(String.format("Word %s was not found",word));
            return;
        } 
        System.out.println("Translation: " + translation);
    }

   
}
