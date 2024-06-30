
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account tristanAccount = new Account("Tristan's account", 100.0);
        
        tristanAccount.deposit(20.0);
        
        System.out.println(tristanAccount);
    }
}
