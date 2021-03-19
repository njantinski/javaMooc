
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.currentWeight() > maxWeight){
            return;
        }
        suitcases.add(suitcase);
    }
    
    private int currentWeight(){
        int sumWeight = 0;
        for(Suitcase s : suitcases){
            sumWeight += s.totalWeight();
        }
        
        return sumWeight;
    }
    
    public String toString(){
        String toReturn = suitcases.size() + " suitcase";
        if(suitcases.size() > 1){
            toReturn += "s";
        }
        toReturn += String.format("(%d kg)",this.currentWeight());
        return toReturn;
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for(Suitcase s : suitcases){
            s.printItems();
        }
    
    }
}
