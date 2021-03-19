
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
           
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i = 0; i < height; i++){
            printSpaces(height-(1) - i);
            int numToAdd = i * 2; 
            printStars(1 + numToAdd);   
        }
        printBase(height);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    private static void printBase(int height) {
        for(int i = 0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
