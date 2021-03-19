
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        double rootNum = Math.sqrt(num1 + num);
        
        System.out.println(rootNum);
    }
}
