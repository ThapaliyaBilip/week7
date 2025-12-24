package week8;

public class Week8

{
    public void displayInfo()
    {
         System.out.println("welcome to dairy");
        }
        //void return type + parameters
    public void add(int a, int b) //formal parameters
    {
        System.out.println("The sum of two numbers are:"+(a+b));
    }
    
     public void add(double a, double b) //method overloading but data type is different
    {
        System.out.println("The sum of two numbers are:"+(a+b));
    }
    
     public void add( int a, int b ,int c) //methord overloading cause the no of data type is different then above
    {
        System.out.println("The sum of two numbers are:"+(a+b));
    }
    // return type + no parameters
    public int getFixedNumber()
    {
    return 10;
    }
    //return type and parameters
    public int multiply(int a, int b) //formal parameters
    {
        return a*b;
    }
    //static method + 
     public static int square(int x)
     {
         return x*x;
        
     }
}