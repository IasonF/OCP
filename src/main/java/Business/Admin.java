package Business;

public class Admin extends Employee {
    public Admin(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println();
    }
}
