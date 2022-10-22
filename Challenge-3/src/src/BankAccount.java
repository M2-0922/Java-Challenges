import java.security.MessageDigest;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

/*
 * @author kubilaycakmak
 * @date Oct 21, 2022
 * @version 1.0
 */
 
public class BankAccount<s2> {
    
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
        if(amount > 0){
            balance += amount;
            prevTransaction = amount;
            System.out.println("Result: $" + amount + " has been deposited");
            System.out.println("Total Balance: $" + balance);
        }else{
            System.out.println("Please enter an amount more than 0.");
        }
    }

    public void withdraw(double amount){
        if((amount > 0) && (amount <= balance)){
            balance -= amount;
            prevTransaction = -amount;
            System.out.println("Result: $" + amount + " has been withdrawn");
            System.out.println("Total Balance: $" + balance);
        }else if(amount > balance){
            System.out.println("Please enter an amount less than your balance.");
        }else{
            System.out.println("Please enter an amount more than 0.");
        }
    }

    public void showBalance(){
        System.out.println("==================================");
        System.out.println("Balance: $" + balance);
        System.out.println("==================================");
        System.out.println();
    }

    public void showMenuContent(){
        System.out.println("==================================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Previous Transaction");
        System.out.println("5. Exit");
        System.out.println("==================================");
        System.out.print("Enter an option: ");
    }

    public void showErrorMessage(String msg) {
        StringBuilder message = new StringBuilder("==================================\n");
        message.append(msg);
        System.out.println(message);
    }

    public void showMenu(){

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Welcome " + accountHolderName);
        System.out.println("Your account number is " + accountNumber);

        do {
            showMenuContent();
            try{
                option = scanner.next().charAt(0);
                System.out.println();

                switch (option) {
                    case '1':
                        showBalance();
                        break;

                    case '2':
                        System.out.println("==================================");
                        System.out.print("Enter an amount to deposit: ");
                        double amount = 0;
                        amount = scanner.nextDouble();
                        deposit(amount);
                        System.out.println("==================================");
                        System.out.println();
                        break;

                    case '3':
                        System.out.println("==================================");
                        System.out.print("Enter an amount to withdraw: ");
                        double amount2 = 0;
                        amount2 = scanner.nextDouble();
                        withdraw(amount2);
                        System.out.println("==================================");
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
            }catch(InputMismatchException  e){               
                showErrorMessage("You entered invalid amount. Please try again.");
                scanner.nextLine();
            }catch(IllegalStateException  e){               
                showErrorMessage("System error. Please try again.");
            }catch(NoSuchElementException e){                
                showErrorMessage("System error. Please try again.");
            }
        }while(option != '5');

        System.out.println();
        System.out.println("Thank you for using our services!");
    }
}
