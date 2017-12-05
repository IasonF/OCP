package Business;

public class EmployeeStockPlan {

    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public EmployeeStockPlan() {
    }

    public Integer grantStock(Employee employee) {
        if (employee instanceof Director)
            return directorShares;
        if (employee instanceof Manager)
            return managerShares;
        else
            return employeeShares;
    }


}
