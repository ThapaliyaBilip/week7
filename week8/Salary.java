package week8;
public class Salary
{
    public class EmployeeTest {                                                                                                                                     
     public static void main(String[] args) {                                                                                                                    
                                                                                                                         
         Employee emp = new Employee(50000.0);                                                                                                                   
                                                                                                                                                                                                                                                                                    
        double basic = emp.getBasicSalary();                                                                                                                    
        double gross = emp.GrossSalary();                                                                                                                                                                                                                                             
         System.out.println("Basic Salary: " + basic);                                                                                                           
        System.out.println("Gross Salary (with 20% bonus): " + gross);                                                                                          
     }                                                                                                                                                           
 }      
}