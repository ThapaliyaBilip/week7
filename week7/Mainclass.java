package week7;
public class Mainclass
{
     public static void main(String[] args)
        {
    
    Employee R1 = new Employee();
    R1.id= 2;
    R1.Name = "Bilip";
    R1.Salary= 100000000;
    
    Employee R2 = new Employee();
    R2.id= 1;
    R2.Name = "Yujit";
    R2.Salary= 96000;
    
    Employee R3 = new Employee();
    R3.id= 3;
    R3.Name = "girish";
    R3.Salary= 60000;
    
    
    if (R1.Salary> R2.Salary && R1.Salary > R3.Salary)
    {
        System.out.println(""+R1.Name+" has the highest salary" );
    }
    else if (R2.Salary> R1.Salary && R2.Salary > R3.Salary)
    {
                System.out.println(""+R2.Name+" has the highest salary" );

    }
    else
    {
        System.out.println(""+R3.Name+" has the highest salary" );
    }
    
    
    
    
    
        }
}