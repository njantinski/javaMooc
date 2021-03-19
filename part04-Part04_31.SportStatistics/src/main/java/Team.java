/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class Team {
    private String name;
    private int gamesPlayed;
    private int wins;

    public Team(String name) {
        this.name = name;
        gamesPlayed = 0;
        wins = 0;
    }

    public String getName() {
        return name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getWins() {
        return wins;
    }
    
    public void playGame(){
        gamesPlayed++;
    }
    
    public void winGame(){
        wins++;
    }
    public int getLostGames(){
        return gamesPlayed - wins;
    }
    
    public String toString(){
        return "Games: " + gamesPlayed + "\nWins: " + wins + "\nLosses: " + (gamesPlayed - wins);
    }
    
}
