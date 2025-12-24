package week8;


public class StudentTest
{
      public static void main(String[] args) {                                                                                                                    
         // Using the new constructor (name, id)                                                                                                                 
        student st1 = new student("bilip", 102,"kalanki",1032432);                                                                                                                
        System.out.println("Initial Student Info:");                                                                                                            
       st1.displayInfo();                                                                                                                                      
                                                                                                                                                               
       st1.setName("Yujit");                                                                                                                                   
       st1.setId(101);                                                                                                                                         
    System.out.println("\nAfter updating name and ID:");                                                                                                    
       System.out.println("Updated ID: " + st1.getId());                                                                
         st1.displayInfo();                                                                                                 
     }                                                                                                                                                           
 }  
