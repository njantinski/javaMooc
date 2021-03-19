
import java.util.ArrayList;
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
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner sc;
   

    public UserInterface(JokeManager jokeManager, Scanner sc) {
        this.jokeManager = jokeManager;
        this.sc = sc;
        
    }
    
    public void start(){
        String command;
        while(true){
            printCommands();
            command = sc.nextLine();
            if(command.equals("X")){
                break;
            }
            executeCommand(command);
        }
    }
    
    private void printCommands(){
        System.out.println("Commands");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    private void executeCommand(String command) {
        int num = Integer.valueOf(command);
        switch(num){
            case 1: addJoke();
                break;
            case 2: drawJoke();
                break;
            case 3: listJokes();
                break;
        }
    
    }

    private void addJoke() {
        System.out.println("Write a joke to be added:");
        String addJoke = sc.nextLine();
        jokeManager.addJoke(addJoke);      
    }

    private void drawJoke() {
        System.out.println(jokeManager.drawJoke());
        
    }

    private void listJokes() {
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }
    
}
