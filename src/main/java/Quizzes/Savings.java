package Quizzes;

public class Savings extends Account {

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw from savings account");
    }
}
