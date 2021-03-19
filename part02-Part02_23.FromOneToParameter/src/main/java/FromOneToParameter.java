
import java.util.Scanner;



public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        printUntilNumber(num);
    }
    public static void printUntilNumber(int num){
        for(int i= 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
