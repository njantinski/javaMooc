/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Container {
    private String name;
    private int currentLiters;
    private int capacity;

    public Container() {
        this.currentLiters = 0;
        this.capacity = 100;
    }
    
    public void add(int liters){
        if(liters <= 0){
            return;
        }
        
        if(liters + this.currentLiters > capacity){
            this.currentLiters = capacity;
        } else{
            this.currentLiters += liters;
        }
    }
    
    public void remove(int liters){
        if(liters <= 0){
            return;
        }
        if(this.currentLiters - liters < 0){
            this.currentLiters = 0;
        } else {
          this.currentLiters -= liters;
        }
    }
    public int contains(){
        return currentLiters; 
    }
    
    public String toString(){
        return String.format("%d/%d",currentLiters,capacity);
    }
    
    
}
