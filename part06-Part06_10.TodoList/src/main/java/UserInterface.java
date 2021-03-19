
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
public class UserInterface {
    private TodoList todoList;
    private Scanner sc;

    public UserInterface(TodoList todoList, Scanner sc) {
        this.todoList = todoList;
        this.sc = sc;
    }
    
    public void start(){
        String command;
        while(true){
            System.out.println("Command:");
            command = sc.nextLine();
            if(command.equals("stop")){
                break;
            }
            executeCommand(command);
        }
    
    
    }

    private void executeCommand(String command) {
        if(command.equals("add")){
            System.out.println("To add:");
            todoList.add(sc.nextLine());
        } else if (command.equals("list")){
            todoList.print();
        } else if (command.equals("remove")){
            System.out.println("Which one is removed?");
            int toRemove = Integer.valueOf(sc.nextLine());
            todoList.remove(toRemove);
        }
    }
    
    
}
