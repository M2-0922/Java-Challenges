import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

/*
 * @author kubilaycakmak
 * @date Oct 21, 2022
 * @version 1.0
 */
 
public class BankAccount<s1, s2> {
    
    // Field section
    // private final s1 accountNumber;
    private final String accountNumber;
    private final s2 accountHolderName;

    double balance;
    double prevTransaction;

    s2 accountType;
    s2 accountStatus;

    public BankAccount(s2 accountHolderName, double balance) {
        // this.accountNumber = accountNumber;
        this.accountNumber = UUID.randomUUID().toString();
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // public s1 getAccountNumber() {
    //     return accountNumber;
    // }
    public String getAccountNumber(){
        return accountNumber;
    }

    public s2 getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public double getPrevTransaction() {
        return prevTransaction;
    }

    public s2 getAccountType() {
        return accountType;
    }

    public s2 getAccountStatus() {
        return accountStatus;
    }

    public void deposit(double amount){
        if(amount != 0){
            balance += amount;
            prevTransaction = amount;
        }
    }

    public void withdraw(double amount){
        if(amount != 0){
            balance -= amount;
            prevTransaction = -amount;
        }
    }

    public void showMenu(){
        
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Welcome " + accountHolderName);
        System.out.println("Your account number is " + accountNumber);

        do {
            System.out.println("==================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous Transaction");
            System.out.println("5. Exit");
            System.out.println("==================================");

            System.out.print("Enter an option: ");

            try{
                option = scanner.next().charAt(0);
                System.out.println();
            }catch(InputMismatchException e){
                System.out.println("You have to enter a number. Please start again.");
            //another exception
            }catch(Exception e){
                System.out.println("Something went wrong. Please start again.");
            }
            
            switch (option) {
                case '1':
                    System.out.println("==================================");
                    System.out.println("Balance: $" + balance);
                    System.out.println("==================================");
                    System.out.println();
                    break;
                case '2':
                    System.out.println("==================================");
                    System.out.print("Enter an amount to deposit: ");
                    
                    // OPTION 1
                    // double amount = -1;
                   
                    // try{
                    //    amount = scanner.nextDouble();
                       
                    // }catch(InputMismatchException e){
                    //     scanner.next();
                    //     System.out.println("You should put number istead of letters!");
                        
                    // }

                    // OPTION 2 
                    double amount = 0;

                    while(true){
                        try {
                            amount = scanner.nextDouble();

                            break;
                        } catch (Exception e) {
                            scanner.next();
                            System.out.print("Please enter a double value: ");

                        }
                    }

                    // you need do some validation to check amount variable 
                    // if amount is not like you want
                    // you need to get again
                    
                    System.out.println("==================================");

                    //if amount is less than 0
                    while(amount < 0){
                        System.out.println("Amount should not be a minus number.");
                        System.out.print("Enter an amount again: ");
                        amount = scanner.nextDouble();
                    }
                    deposit(amount);

                    System.out.println("Result: $" + amount + " has been deposited");
                    System.out.println("Total Balance: $" + balance);
                    System.out.println();
                    break;
                case '3':
                    System.out.println("==================================");
                    System.out.print("Enter an amount to withdraw: ");

                    double amount2 = 0;

                    while(true){
                        try {
                            amount2 = scanner.nextDouble();
                            break;
                        } catch (Exception e) {
                            scanner.next();
                            System.out.print("Please enter a double value: ");

                        }
                    }

                    //if withdraw amount is less than 0
                    while(amount2<0){
                        System.out.println("Amount should not be a minus number.");
                        System.out.print("Enter an amount again: ");
                        amount2 = scanner.nextDouble();
                    }

                    //if withdraw amount is more than balance
                    while(amount2>balance){
                        System.out.println("Insufficient Balance");
                        System.out.print("Enter an amount again: ");
                        amount2 = scanner.nextDouble();
                    }

                    withdraw(amount2);
                    System.out.println("Result: $" + amount2 + " has been withdrawn");
                    System.out.println("Total Balance: $" + balance);
                    System.out.println();
                    break;
                case '4':
                    System.out.println("==================================");
                    System.out.println("Previous Transaction = $ " + prevTransaction);
                    System.out.println("==================================");
                    System.out.println();
                    break;
                case '5':
                    System.out.println("==================================");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option! Please enter again.");
                    break;
            }
            
            }while(option != '5');
                System.out.println();
                System.out.println("Thank you for using our services!");
    }
}