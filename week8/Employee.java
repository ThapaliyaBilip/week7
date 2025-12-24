package week8;

public class Employee
{
    private double basicSalary;                                                                                                                                                                                                                                                
     public Employee(double basicSalary) {                                                                                                                       
       this.basicSalary = basicSalary;                                                                                                                         
    }                                                                                                                                                           
                                                                                                                                                               
                                                                                          
    public double GrossSalary() {                                                                                                                      
        double bonus = this.basicSalary * 0.20;                                                                                                                 
         return this.basicSalary + bonus;                                                                                                                        
     }                                                                                                                                                                                                                                                                                                                           
     public double getBasicSalary() {                                                                                                                            
        return this.basicSalary;                                                                                                                                
    }                                                                                                                                                           
}  
    
