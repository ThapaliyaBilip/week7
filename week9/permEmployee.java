package week9;


public class permEmployee extends Employees
{

    private double houseRentAllowance;
    private double dearnessAllowance;
    //constructors
    public permEmployee(String name , int employeeId, double basicSalary, double houseRentAllowance, double dearnessAllowance)
    {
    super(name,employeeId,basicSalary);
    this.houseRentAllowance=houseRentAllowance;
    this.dearnessAllowance = dearnessAllowance;
    }
    public double calculateTotalSalary( )
    {
        return super.basicSalary + this.houseRentAllowance + this.dearnessAllowance + super.calculateBonus(); 
    }
    
}