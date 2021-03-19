/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Fitbyte {
    private int age;
    private int restingHR;
    
    public Fitbyte(int age, int restingHR){
        this.age = age;
        this.restingHR = restingHR;
    }
    public double targetHeartRate(double percentageOfMaximum){
        return ((getMaxHeartRate() - this.restingHR) * percentageOfMaximum) + this.restingHR;
    
    }
    
    private double getMaxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
}
