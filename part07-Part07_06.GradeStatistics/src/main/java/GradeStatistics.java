
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class GradeStatistics {
    private ArrayList<Integer> grades;
    
    public GradeStatistics(){
        grades = new ArrayList<>();
    }
    
    public void printAverage(){
        double avg = grades.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println("Point average (all): " + avg);
    
    }
    
    public void printAveragePassed(){
        double avg = grades.stream().mapToInt(a -> a)
                .filter(a-> a >= 50).average().orElse(0);
       System.out.println("Point average (passing): " + avg); 
    }
    
    public void printPassingPercentage(){
        int passed = (int) grades.stream().mapToInt(a -> a).filter(a -> a >= 50).count();
        double passPercent = (double) passed / grades.size() * 100;
        System.out.println("Pass percentage: "+ passPercent);
    
    }
    public void addNumber(int num){
        if(num < 0 || num > 100){
            return;
        }
        grades.add(num);    
    }
    
    public void printDistribution(){
        System.out.println("Grade distribution");
        for(int i = 5; i >= 0; i--){
            int numOfGrades = getNumOfGrades(i);
            System.out.print(i + ": " + printStars(numOfGrades));
            System.out.println("");
        }
    }

    private int getNumOfGrades(int grade) {
       int counter=0;
       for(Integer points : grades){
           if(grade == 5){
               if(points >= 90){
                   counter++;
               }
           }
           else if(grade == 0){
               if(points < 50){
                   counter++;
               }
               
           } else{
               if(points >= 50 + ((grade-1)*10) && points < 50 + (grade*10)){
                   counter++;
               }
           }
       }
       return counter;
    }

    private String printStars(int starNum) {
        String stars ="";
        for(int i = 0; i < starNum; i++){
            stars += "*";
        }
        return stars;
    }
}
