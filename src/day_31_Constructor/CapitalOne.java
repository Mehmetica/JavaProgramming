package day_31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet",321564,25000);
        account1.checkBalance();

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(24000);

        account1.withdraw(24000);
        account1.checkBalance();




    }
}
