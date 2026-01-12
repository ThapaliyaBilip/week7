package week9;

public class contractEmployee extends Employees {
    private int workingDays;

    public contractEmployee(String name , int employeeId, double basicSalary, int workingDays) {
        super(name, employeeId, basicSalary);
        this.workingDays = workingDays;
    }

    public double calculateTotalSalary() {
        return basicSalary * workingDays;
    }
}