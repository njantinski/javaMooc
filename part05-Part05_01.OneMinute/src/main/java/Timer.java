/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Timer {
    private ClockHand hundrethSec;
    private ClockHand sec;
    
    public Timer(){
        this.hundrethSec = new ClockHand(100);
        this.sec = new ClockHand(60);
    }
    
    public void advance(){
        this.hundrethSec.advance();
        if(hundrethSec.value() == 0){
            this.sec.advance();
        }
    }
    
    public String toString(){
        return sec.toString() + ":" + hundrethSec.toString();
    
    }
}
