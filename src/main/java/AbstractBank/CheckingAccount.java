package AbstractBank;

public class CheckingAccount extends Account implements AccountOperations {
    private final double overDraftLimit;
    private double balance;

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    @Override
    public String getDescription() {
        return "Checking account";
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
