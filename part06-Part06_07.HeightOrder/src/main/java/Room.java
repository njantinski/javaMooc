
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Room {
    ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return persons.size() == 0;
    }
    
    public ArrayList<Person> getPersons(){
       // persons.sort((p1,p2) -> Integer.compare(p1.getHeight(),p2.getHeight()));
        return new ArrayList(persons);
    }
    
    public void add(Person p){
        persons.add(p);
    }
    
    
    public Person shortest(){
        return persons.stream().min(Comparator.comparing(Person::getHeight)).orElse(null);
    }
    
    public Person take(){
        Person p = shortest();
        persons.remove(p);
        return p;
    }
}
