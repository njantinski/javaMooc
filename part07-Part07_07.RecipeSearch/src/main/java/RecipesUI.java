
import java.nio.file.Paths;
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
class RecipesUI {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public RecipesUI(Scanner scanner){
        this.scanner= scanner;
        this.recipes = new ArrayList<>();
    }
    public void start(){
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();
        processFile(fileToRead);
        String command;
        while(true){
            printCommands();
            System.out.println("Enter command:");
            command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            processCommand(command);
            
        }
    
    }

    private void processFile(String fileToRead) {
        try(Scanner sc = new Scanner(Paths.get(fileToRead))){
            while(sc.hasNextLine()){
                readRecipe(sc);
            }
        
        }
        catch(Exception e){
            System.out.println("File not foud");
        }
    }

    private void readRecipe(Scanner sc) {
        String name = sc.nextLine();
        int cookingTime = Integer.valueOf(sc.nextLine());
        ArrayList<String> ingredients = new ArrayList<>();
        String input;
        while(sc.hasNextLine()){
            input = sc.nextLine();
            if(input.equals("")){
               break;
           }
           ingredients.add(input);
        }
        recipes.add(new Recipe(name,cookingTime,ingredients));
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    private void processCommand(String command) {
        if(command.equals("list")){
            listRecipes();
        }
        else if(command.equals("find name")){
            findRecipeByName();
        }
        else if(command.equals("find cooking time")){
            findByCookingTime();
        } else if(command.equals("find ingredient")){
            findIngredient();
        }
    }

    private void listRecipes() {
        for(Recipe r: recipes){
            System.out.println(r);
        }
    }

    private void findRecipeByName() {
        System.out.println("Searched word:");
        String word = scanner.nextLine();
        recipes.stream().filter(recipe -> recipe.getName().contains(word)).forEach(System.out::println);
    }

    private void findByCookingTime() {
       System.out.println("Max cooking time:");
       int maxCookingTime = Integer.valueOf(scanner.nextLine());
       recipes.stream().filter(recipe -> recipe.getCookingTime() <= maxCookingTime).forEach(System.out::println);
    }

    private void findIngredient() {
        System.out.println("Ingredient:");
        String ingredient = scanner.nextLine();
        recipes.stream().filter(a -> a.getIngredients().contains(ingredient)).forEach(System.out::println);
    }

   
}
