/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Cube {
    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
        this.volume = calculateVolume();
    }
    
    private int calculateVolume(){
        return (int) Math.pow(this.edgeLength,3);
    }
    public int volume(){
        return this.volume;
    }
    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume;
    
    }
}
