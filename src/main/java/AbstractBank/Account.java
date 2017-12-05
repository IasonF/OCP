package AbstractBank;

public abstract class Account {
    public double balance;

    @Override
    public String toString() {
        return "Account: " + balance ;
    }

    public Account(double balance) {
        this.balance = balance;
    }
}
