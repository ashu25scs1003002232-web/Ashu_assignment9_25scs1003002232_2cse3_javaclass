class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    static double interestRate = 5.0;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account1 =
            new BankAccount("AC101", "Rahul", 25000);

        BankAccount account2 =
            new BankAccount("AC102", "Aman", 30000);

        BankAccount account3 =
            new BankAccount("AC103", "Priya", 40000);

        System.out.println("Before Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        BankAccount.interestRate = 7.5;

        System.out.println("\nAfter Changing Interest Rate:");
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}
