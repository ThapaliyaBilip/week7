package week7;
public class MainClass
{
     public static void main(String[] args)
        {
    
        
    Rectangle R1 = new Rectangle();
    R1.length= 100;
    R1.breadth = 20;
    R1.area= R1.length * R1.breadth;
    System.out.println(R1.area);
    
     Rectangle R2 = new Rectangle();
    R2.length= 200;
    R2.breadth = 20;
    R2.area= R2.length * R2.breadth;
    System.out.println(R2.area);
}
}