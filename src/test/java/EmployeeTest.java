import Business.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    public Engineer engineer = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
    public Manager manager = new Manager(207,"Barbara Johnson", "054-234354", 109_343.54, "US Marketing");
    public Admin admin = new Admin(304,"Bill Munroe", "123-34454", 75_943.23);
    public Director director = new Director(304,"Susan Wheeler", "123-34454", 75_943.23, "Global Marketing", 1000000.00);
    public EmployeeStockPlan esp = new EmployeeStockPlan();

    public static void printEmployee (Employee employee){
        System.out.println("Business.Employee type: " + employee.getClass().getSimpleName());
        System.out.println(employee);
    }

    public static void printEmployee (Employee employee, EmployeeStockPlan employeeStockPlan){
        printEmployee(employee);
        System.out.println("Stock options: " + employeeStockPlan.grantStock(employee));
    }


    @Before
    public void init() {
    }


    @Test
    public void testInnerClass() {
        Employee jane = new Employee("Jane Doe", "Business.Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);
        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());
    }

    @Test
    public void testCurrency() {
        System.out.println(engineer.toString());
        System.out.println(manager.toString());
        System.out.println(director.toString());
        printEmployee(engineer);
        printEmployee(engineer,esp);
        printEmployee(admin,esp);
        printEmployee(manager,esp);
        printEmployee(director,esp);
        assert engineer.getName().equals("Jane Smith");
    }

    @Test
    public void getSsn() {
    }

    @Test
    public void getSalary() {
    }

}