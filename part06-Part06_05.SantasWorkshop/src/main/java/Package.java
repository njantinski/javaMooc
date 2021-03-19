
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
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift g){
        gifts.add(g);
    }
    
    public int totalWeight(){
        if(gifts.isEmpty()){
            return 0;
        }
        return gifts.stream().mapToInt(a -> a.getWeight()).sum();
    }
}
