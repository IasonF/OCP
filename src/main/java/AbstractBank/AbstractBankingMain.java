package AbstractBank;

public class AbstractBankingMain {


    public AbstractBankingMain() {
        Bank bank = new Bank();

        bank.addCustomer("Will", "Smith", Branch.BOSTON);
        Customer customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Brandley", "Cooper", Branch.BOSTON);
        bank.getCustomer(1);
        SavingsAccount sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Jane", "Simms", Branch.LA);
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant", Branch.LA);
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley", Branch.MUMBAI);
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley", Branch.MUMBAI);
        customer = bank.getCustomer(5);
        CheckingAccount chkAcct = new CheckingAccount(100.00);
        customer.addAccount(chkAcct);
        if (chkAcct.withdraw(10.00)) {
            customer.addAccount(chkAcct);
            System.out.println("Withdraw is successful " + chkAcct.getBalance());
        }

        for (Customer i : bank.customers) {
            System.out.println();
            System.out.println(i.toString());
            System.out.println("Branch: " + i.getBranch() + ", " + i.getBranch().getServiceLevel());
            System.out.println("    " + i.getCheckingAccount().toString());
        }
    }
}
