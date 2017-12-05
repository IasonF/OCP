package Business;

public class Manager extends Employee {
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println("Department:" + deptName);
    }

    @Override
    public String toString() {
        return super.toString() +
                " deptName= " + deptName ;
    }
}
