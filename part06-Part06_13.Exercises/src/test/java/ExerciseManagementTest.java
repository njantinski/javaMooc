
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;




public class ExerciseManagementTest {
    private ExerciseManagement managment ;
    
    @Before
    public void init(){
       this.managment = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmtpyAtTheBeggining(){
     
        assertEquals(0,managment.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne(){
      
        managment.add("write a test");
        assertEquals(1,managment.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        
        managment.add("write a test");
        assertTrue(managment.exerciseList().contains("write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        managment.add("New exercise");
        managment.markAsCompleted("New exercise");
        assertTrue(managment.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        managment.add("New exercise");
        managment.markAsCompleted("New exercise");
        assertFalse(managment.isCompleted("Some exercise"));
    }
}
