
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Item i : items){
            sum += i.getWeight();
        }
        return sum;
    }
    
    public void addItem(Item item){
        if(totalWeight() + item.getWeight() > maxWeight){
            return;
        }
        items.add(item);
    }
    
    public String toString(){
        if(items.size() == 0){
            return String.format("no items (%d kg)",totalWeight());
        }
        String toReturn = String.format("%d item", items.size());
        if(items.size() > 1){
            toReturn += "s";
        }
        toReturn += String.format("(%d kg)", totalWeight());
        
        return toReturn;
    }
    
    
    public void printItems(){
        System.out.println("The suitcase has the following items:");
        for(Item i : items){
            System.out.println(i);
        }
        System.out.println("Total weight: " + totalWeight() + " kg");
    }
    
    public Item heaviestItem(){
        if(items.size() == 0){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item i: items){
            if(heaviest.getWeight() < i.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
