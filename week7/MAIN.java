package week7;


public class MAIN

{
    public static void main(String[] args)
        {
    House h1= new House(); //object
    h1.color = "red";
    h1.doors = 4;
    h1.floors =5;
    
    
    System.out.println(h1.color);
    System.out.println(h1.doors);
    System.out.println(h1.floors);
    
    House h2= new House(); //object
    h2.color = "blue";
    h2.doors = 12;
    h2.floors =7;
    
    System.out.println(h2.color);
    System.out.println(h2.doors);
    System.out.println(h2.floors);
    
    
    
}
}