
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Stack {
    ArrayList<String> stackElements;
    
    public Stack(){
        stackElements = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stackElements.isEmpty();
    }
            
    public void add(String value){
        stackElements.add(value);
    }
    
    public ArrayList<String> values(){
        return new ArrayList(stackElements);
    }
    
    public String take(){
        String returnStr = stackElements.get(stackElements.size() - 1);
        stackElements.remove(returnStr);
        return returnStr;
    }
}
