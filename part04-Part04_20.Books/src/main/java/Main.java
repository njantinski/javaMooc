import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        String title;
        int pages;
        int year;
        List<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            title = sc.nextLine();
            
            if(title.equals("")){
                break;
            }
            System.out.println("Pages:");
            pages = Integer.valueOf(sc.nextLine());
            System.out.println("Publication year:");
            year = Integer.parseInt(sc.nextLine());
            books.add(new Book(title,pages,year));
        }
        
        System.out.println("What information will be printed?");
        String input = sc.nextLine();
        if(input.equals("everything")){
            for(Book b : books){
                System.out.println(b);
            }
        } else {
            for(Book b: books){
                System.out.println(b.getTitle());
            }
        }
    }
}
