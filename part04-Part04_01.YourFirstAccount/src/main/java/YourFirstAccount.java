
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account myFirstAccount = new Account("Nikolaj's account",100.00);
        
        System.out.println(myFirstAccount);
        
        myFirstAccount.deposit(20);
        System.out.println(myFirstAccount);
    }
}
