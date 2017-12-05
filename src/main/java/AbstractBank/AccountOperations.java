package AbstractBank;

public interface AccountOperations {
    boolean withdraw (double amount);

    boolean deposit (double amount);

    String getDescription();

    double getBalance();
}
