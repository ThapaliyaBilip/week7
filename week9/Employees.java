package week9;


public class Employees
{
     protected int employeeId; 
     protected String name;
     protected double basicSalary;

//constructor
    public Employees( String name , int employeeId, double basicSalary)
    {
        this.name = name ;
        this.employeeId=employeeId;
        this.basicSalary =basicSalary;
    }


//double calculateBonus() → 10% of basicSalary 
    public double calculateBonus()
    {
        return 0.10 * basicSalary;
    }


  //void displayEmployee() → prints id, name, salary
  public void displayEmployee()
  {
       System.out.println("Max speed of this car:"+ this.name);
        System.out.println("Brand Name of this car:"+this.employeeId);
        System.out.println("Brand Name of this car:"+this.basicSalary);  
    }
}