package AbstractBank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String surname;
    private List<Account> accounts = new ArrayList<>();
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;
    private Branch branch;

    public Customer(String name, String surname, Branch branch) {
        this.name = name;
        this.surname = surname;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " " + surname ;
    }

    public void addAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void addAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public CheckingAccount getCheckingAccount() {
        if (checkingAccount!=null)
            return checkingAccount;
        else
            return new CheckingAccount(0.0);
    }
}
