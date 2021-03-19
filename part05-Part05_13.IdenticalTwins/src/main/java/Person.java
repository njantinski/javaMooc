
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object otherPerson){
        if(this == otherPerson){
            return true;
        }
        if(!(otherPerson instanceof Person)){
            return false;
        }
        Person comparingPerson = (Person) otherPerson;
        return this.name.equals(comparingPerson.name) && this.birthday.equals(comparingPerson.birthday) 
                && this.height == comparingPerson.height && this.weight == comparingPerson.weight;
    }
}
