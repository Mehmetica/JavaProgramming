package day_31_Constructor;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }





    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Available balance is : " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid data");
            return;
        }
        balance += amount;

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Invalid data");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid data");
            return;
        }
        balance -= amount;
    }
}
