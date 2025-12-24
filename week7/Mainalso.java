package week7;
public class Mainalso
{
    public static void main (String[] args)
    {
    Student s1= new Student(); //object
    s1.Name = "Bilip";
    s1.RollNo = 4;
    s1.Age =15;
    
    
    System.out.println(s1.Name);
    System.out.println(s1.RollNo);
    System.out.println(s1.Age);
    
    Student s2= new Student(); 
    s2.Name = "Girish";
    s2.RollNo = 2;
    s2.Age =17;
    System.out.println(s2.Name);
    System.out.println(s2.RollNo);
    System.out.println(s2.Age);
    }
}