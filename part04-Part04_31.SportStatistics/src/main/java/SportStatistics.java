
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        List<Team> teams = new ArrayList<>();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String[] parts = sc.nextLine().split(",");
                Game game = new Game(parts[0],parts[1],Integer.valueOf(parts[2]),Integer.valueOf(parts[3]));
                boolean winningFound = false;
                boolean losingFound = false;
                for(Team t : teams){
                    if(t.getName().equals(game.getWinningTeam())){
                        winningFound = true;
                        t.winGame();
                        t.playGame();
                        if(losingFound == true){
                            break;
                        }    
                    }
                    else if(t.getName().equals(game.getLosingTeam())){
                        losingFound = true;
                        t.playGame();
                        if(winningFound == true){
                            break;
                        }
                    }
                
                }
                if(!winningFound){
                    Team t = new Team(game.getWinningTeam());
                    t.winGame();
                    t.playGame();
                    teams.add(t);
                }
                if(!losingFound){
                    Team t = new Team(game.getLosingTeam());
                    t.playGame();
                    teams.add(t);
                }
               
            }
        } catch (Exception e){}
        
        System.out.println("Team:");
        String team = scan.nextLine();
        boolean found = false;
        for(Team t : teams){
            if(t.getName().equals(team)){
                System.out.println(t);
                found = true;
            }
        }
        if(!found){
            System.out.println("Games: 0" );
            System.out.println("Wins: 0" );
            System.out.println("Losses: 0" );
        }
    }

}
