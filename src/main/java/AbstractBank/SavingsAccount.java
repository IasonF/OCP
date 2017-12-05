package AbstractBank;

public class SavingsAccount implements AccountOperations {
    private double balance;

    public SavingsAccount(double amount) {
        this.balance = amount;
    }

    public void deposit(int i) {
        this.balance += i;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
