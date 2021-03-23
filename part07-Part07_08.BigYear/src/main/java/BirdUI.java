
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
public class BirdUI {
    private BirdDB database;
    private Scanner scanner;
    
    public BirdUI(Scanner scanner){
        this.scanner = scanner;
        this.database = new BirdDB();
    }
    
    public void start(){
        String input;
        while(true){
            System.out.println("?");
            input = scanner.nextLine();
            if(input.equals("Quit")){
                break;
            } else if(input.equals("Add")){
                addBird();
            } else if(input.equals("Observation")){
                observeBird();
            } else if(input.equals("All")){
                printAllBirds();
            } else if(input.equals("One")){
                printOneBird();
            }
            
        }
    
    
    }

    private void addBird() {
        System.out.println("Name?");
        String name = scanner.nextLine();
        if(name.equals("Lion") || name.equals("Beer") || name.equals("Cake")){
            System.out.println("Not a bird");
            return;
        }
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();
        database.addBird(new Bird(name, latinName));
    }

    private void observeBird() {
        System.out.println("Bird?");
        String bird = scanner.nextLine();
        if(!database.contains(bird)){
            System.out.println("Not a bird!");
        }
       
        database.observe(bird);
    }

    private void printAllBirds() {
        database.printAll();
    }

    private void printOneBird() {
        System.out.println("Bird?");
        String bird = scanner.nextLine();
        if(!database.contains(bird)){
            System.out.println("Not a bird!");
        }
        database.printBird(bird);
    }
}
