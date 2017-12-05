package Quizzes;

public class Checking extends Account {
    @Override
    public void withdraw(int amount) {
        System.out.println("Withdraw from checking account");
    }

}
