package AbstractBank;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankOperations {
    public List<Customer> customers = new ArrayList<Customer>();

    private String name;
    private String surname;
    private Branch branch;
    private int numberOfCustomers = 0;

    public void addCustomer(String name, String surname, Branch branch) {
        numberOfCustomers++;
        customers.add(new Customer(name, surname, branch));
    }

    public Customer getCustomer(int i) {
        return customers.get(i);
    }

    @Override
    public void generateReport(Customer customer) {

    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
}
