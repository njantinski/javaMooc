
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    public static int sum(ArrayList<Integer> numbers){
        return numbers.stream().mapToInt(a -> a).sum();
    }
}
