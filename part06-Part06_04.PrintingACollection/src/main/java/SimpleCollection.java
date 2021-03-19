
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        if(elements.isEmpty()){
          return "The collection " + name + " is empty.";
        }
        String toStringReturning = "";
        toStringReturning += "The collection " + name + " has " + elements.size() + " element";
        if(elements.size() > 1){
            toStringReturning +="s";
        }
        toStringReturning += ":\n";
        for(int i = 0; i < elements.size(); i++){
            
           toStringReturning += elements.get(i) ;
           if(i < elements.size() - 1){
                toStringReturning += "\n";
           }
             
        }
        
        return toStringReturning;
    }
}
