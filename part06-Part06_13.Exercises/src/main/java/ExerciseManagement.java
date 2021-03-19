
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
      
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> listToReturn = new ArrayList<>();
        for(Exercise e : exercises){
            listToReturn.add(e.getName());
        }
        return listToReturn;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String completed) {
        for(Exercise e : exercises){
            if(e.getName().equals(completed)){
                e.setCompleted(true);
                break;
            }
        }
    }

    boolean isCompleted(String completed) {
        Exercise e = exercises.stream().filter(a -> a.getName().equals(completed)).findFirst().orElse(null);
        if(e == null){
            return false;
        }
        
        return e.isCompleted();
    }
}
