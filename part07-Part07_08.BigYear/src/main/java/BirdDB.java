
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class BirdDB {
    private ArrayList<Bird> birds;
    
    public BirdDB(){
        birds = new ArrayList<>();
    }
    
    public void observe(String bird){
        if(!containsBird(bird)){
            return;
        }
        incrementBird(bird);
    
    }

    private boolean validateBird(String bird) {
        return true;
    }

    private boolean containsBird(String bird) {
        String found = birds.stream().filter(b -> b.getName().equals(bird)).map(b -> b.getName()).findAny().orElse(null);
        return found != null;
    }

    private void incrementBird(String bird) {
        birds.stream().filter(b -> b.getName().equals(bird)).forEach(Bird::observe);
    }
    
    public void addBird(Bird b){
        if(!birds.contains(b)){
            birds.add(b);
        }
    }
    
    public void printAll(){
        birds.stream().forEach(System.out::println);    
    }
    
    public void printBird(String bird){
        birds.stream().filter(b -> b.getName().equals(bird)).forEach(System.out::println);
    }
    public boolean contains(String bird){
        return birds.stream().filter(b-> b.getName().equals(bird)).findFirst().orElse(null) != null;
    }
}
