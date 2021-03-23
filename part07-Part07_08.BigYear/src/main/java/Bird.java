/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Bird {
    private String name;
    private String latinName;
    private int seenNum;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.seenNum = 0;
    }
    
    public void observe(){
        seenNum++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getSeenNum() {
        return seenNum;
    }
    
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Bird)){
            return false;
        }
        Bird other= (Bird) o;
        return this.name.equals(other.name) && this.latinName.equals(other.latinName);
    
    }
    
    public String toString(){
    
        return String.format("%s (%s): %d",name,latinName,seenNum);
    }
    
}
