/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        increase(1);
    }
    
    public void increase(int n){
        if(n > 0){
            value +=n;
        }
    }
    
    public void decrease(){
        decrease(1);
    }
    
    public void decrease(int n){
        if(n > 0){
            value -= n;     
        }
    }
}
