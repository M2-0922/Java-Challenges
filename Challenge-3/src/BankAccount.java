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
        double amountResult =balance -= amount;
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
            option = scanner.next().charAt(0);
            System.out.println();

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
                    double amount = scanner.nextDouble();
                    System.out.println("==================================");
                    deposit(amount);
                    System.out.println("Result: $" + amount + " has been deposited");
                    System.out.println("Total Balance: $" + balance);
                    System.out.println();
                    break;
                case '3':
                    // If the balance is $0, go back to the main menu
                    if(balance<=0.0){
                        System.out.println("Your current balance is $0.0.");
                        System.out.println("Return to the main menu.");
                        break;
                    }

                    System.out.println("==================================");
                    System.out.print("Enter an amount to withdraw: $");
                    double amount2 = scanner.nextDouble();
                    System.out.println("==================================");

                    // If the amount is over the balance
                    boolean flag=true;
                    while(balance-amount2<0 && flag){
                        System.out.println("Your available amount is: $"+ balance);
                        System.out.println("DO you want to continue this transaction?: ");
                        System.out.println("================================");
                        System.out.print("Yes: Enter 1 / No : Enter 0 : ");
                        option = scanner.next().charAt(0);
                        switch (option) {
                            case '1':
                                System.out.print("Enter an amount to withdraw: $");
                                amount2 = scanner.nextDouble();
                                break;
                            case '0':
                                flag = false;
                                break;
                            default:
                                System.out.println("==================================");
                                System.out.println("Invalid number was entered.");
                                System.out.println("Please try again.");
                                System.out.println("==================================");
                                break;
                        }
                    }

                    if(balance - amount2>=0 && flag){
                        withdraw(amount2);
                        System.out.println("Result: $" + amount2 + " has been withdrawn");
                        System.out.println("Total Balance: $" + balance);
                        System.out.println();
                    }

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
