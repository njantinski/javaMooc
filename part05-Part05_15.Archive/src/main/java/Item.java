/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Item)){
            return false;
        }
        Item otherItem = (Item) o;
        
        return this.id.equals(otherItem.id);
    }
    
    public String toString(){
        return id + ": " + name;
    }
    
}
