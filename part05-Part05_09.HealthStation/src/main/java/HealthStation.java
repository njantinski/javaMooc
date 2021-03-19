
public class HealthStation {
    private int numsOfWeighing;
    
    public HealthStation(){
        this.numsOfWeighing = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        numsOfWeighing++;
        return person.getWeight();
    }
    public void feed(Person person){
        int w = person.getWeight();
        person.setWeight(w + 1);
    }

    public int weighings(){
        return this.numsOfWeighing;
    }
}
