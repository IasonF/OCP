package AbstractBank;

public interface BankOperations {
    void addCustomer(String name, String surname, Branch branch);

    Customer getCustomer(int i);

    void generateReport(Customer customer);
}
