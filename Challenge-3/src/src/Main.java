/*
 * @author kubilaycakmak
 * @date Oct 21, 2022
 * @version 1.0
 */

// ATM Machine CLI
 
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the ATM machine");

        BankAccount<Integer, String> myAccount = 
            new BankAccount<>(
                "John Doe", 
                100);

        myAccount.showMenu();
        
    }
    
}
