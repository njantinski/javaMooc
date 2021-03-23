
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class GradeStatisticsUI {
    private GradeStatistics gradeStatistics;
    private Scanner scanner;
    
    public GradeStatisticsUI(Scanner scanner){
        this.gradeStatistics = new GradeStatistics();
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int points = Integer.valueOf(scanner.nextLine());
            if(points == -1){
                break;
            }
            gradeStatistics.addNumber(points);
        }
        printSummary();
    }

    private void printSummary() {
        gradeStatistics.printAverage();
        gradeStatistics.printAveragePassed();
        gradeStatistics.printPassingPercentage();
        gradeStatistics.printDistribution();
    }
}
