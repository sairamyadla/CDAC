class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount of $" + amount + " is deposited successfully.");
        } else {
            System.out.println("Enter a valid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount of $" + amount + " is withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void getAccountDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double limit;

    public SavingsAccount(String name, double initialBalance, double limit) {
        super(name, initialBalance); 
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > limit) {
            System.out.println("Withdrawal amount exceeds the limit of $" + limit);
        } else {
            super.withdraw(amount); 
        }
    }

    public void getWithdrawalLimit() {
        System.out.println("Withdrawal Limit: $" + limit);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sai Ram", 1000);
        account1.deposit(500);
        account1.withdraw(300);
        account1.getAccountDetails();

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount("Sai Ram", 2000, 500);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(700); 
        savingsAccount.withdraw(400); 
        savingsAccount.getAccountDetails();
        savingsAccount.getWithdrawalLimit();
    }
}
