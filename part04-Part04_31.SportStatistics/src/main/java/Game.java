/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Game {
    private String firstTeam;
    private String secondTeam;
    private int firstTeamGoals;
    private int secondTeamGoals;

    public Game(String firstTeam, String secondTeam, int firstTeamGoals, int secondTeamGoals) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamGoals = firstTeamGoals;
        this.secondTeamGoals = secondTeamGoals;
    }
    
    public String getWinningTeam(){
        if(firstTeamGoals > secondTeamGoals){
            return firstTeam;
        } else{
            return secondTeam;
        }
    }
    
    public String getLosingTeam(){
    if(firstTeamGoals > secondTeamGoals){
            return secondTeam;
        } else{
            return firstTeam;
        }
    }
    
    public int getWinningTeamGoals(){
        if(firstTeamGoals > secondTeamGoals){
            return firstTeamGoals;
        } else{
            return secondTeamGoals;
        }
    }
    
    public int getLosingTeamGoals(){
        if(firstTeamGoals > secondTeamGoals){
            return secondTeamGoals;
        } else{
            return firstTeamGoals;
        }
    }
}
