package Business;

import java.text.NumberFormat;

public class Director extends Manager {
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, Double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println("Budget: " + budget);
    }

    @Override
    public String toString() {
        return super.toString() + " Budget= " + NumberFormat.getCurrencyInstance().format(getBudget());
    }
}
