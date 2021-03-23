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

    public Container(String name,int capacity) {
        this.name = name;
        this.currentLiters = 0;
        this.capacity = capacity;
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
    
    public int getNumLiters(int num){
        if(num < 0){
            return 0;
        } else if(num > this.currentLiters){
            int toReturn = this.currentLiters;
            this.currentLiters = 0;
            return toReturn;
        } else{
            this.currentLiters -= num;
            return num;
        }
    
    }
    
    public String toString(){
        return String.format("%s: %d/%d",name,currentLiters,capacity);
    }
    
    
}
