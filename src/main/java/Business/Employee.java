package Business;

import java.text.NumberFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {


    private int empId;
    private String name;
    private String ssn;
    private double salary;

    private BenefitsHelper helper = new BenefitsHelper();

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public Employee(String name, String role, String department, int salary) {
        empId = ThreadLocalRandom.current().nextInt();
        Employee e;
        if (role.equals("Business.Manager"))
            new Manager(empId, name, "", salary, department);
        else
            new Employee(empId,name,"", salary);
    }

    public void printEmployee() {
        System.out.println("Business.Employee type: " + getClass().getSimpleName());
        System.out.println("ID:" + getEmpId());
        System.out.println("Name:" + getName());
        System.out.println("SSN:" + getSsn());
        System.out.println("Salary:" + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }

    public void raiseSalary(double increase) {
        if (increase > 0)
            this.salary += increase;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public double getWithholding() {
        return helper.calcWithholding(salary);
    }

    public double getBonus() {
        return helper.calcBonus(salary);
    }

    @Override
    public String toString() {
        return "Business.Employee:" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + NumberFormat.getCurrencyInstance().format(getSalary());
    }

    private class BenefitsHelper {
        private final double bonusRate = 0.02;
        private double withholdingRate = 0.07;

        protected double calcBonus (double salary){
            return salary * bonusRate;
        }

        protected double calcWithholding (double salary) {
            return salary * withholdingRate;
        }
    }
}
