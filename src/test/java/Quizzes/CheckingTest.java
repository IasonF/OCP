package Quizzes;

import org.junit.Test;

public class CheckingTest {
    @Test
    public void withdraw() {

        Account account = new Checking();
        account.withdraw(100);
        if (account instanceof Checking)
            System.out.println("It's a checking account");
        else
            System.out.println("It's a general account");
    }

    @Test
    public void exception() {
        Account account1 = new Checking();
        Account account2 = new Savings();
        try {
            Savings account3 = (Savings) account1;
        }
        catch (ClassCastException e){
            System.out.println("Cannot cast");
        };
    }
}