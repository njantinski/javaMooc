
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance){
        this.balance = balance;
    }
    
    public void addMoney(double money){
        if(money <= 0){
            return;
        }
        
        if((this.balance + money) > 150.0){
            this.balance = 150;
        } else {
            this.balance += money;
        }
    }
    
    @Override
    public String toString(){
        
        return "The card has a balance of " + balance +" euros";
    
    }
    
    public void eatAffordably() {
    // write code here
        if((this.balance - 2.60) >= 0){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
    // write code here
        if((this.balance - 4.60) >= 0){
            this.balance -= 4.60;
        }
    }
    
}
