
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolaj
 */
public class JokeManager {
    private ArrayList<String> jokesRepository;
    
    public JokeManager(){
        jokesRepository = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokesRepository.add(joke);
    }
    
    public String drawJoke(){
        if(jokesRepository.size() == 0){
            return noJokes();
        }
        Random ranNum = new Random();
        return jokesRepository.get(ranNum.nextInt(jokesRepository.size()));
    }
    
    public void printJokes(){
        if(jokesRepository.size() == 0){
            System.out.println(noJokes());
        }
        for(String s : jokesRepository){
            System.out.println(s);
        }
    }
    private String noJokes(){
        return "Jokes are in short supply.";
    }
}
