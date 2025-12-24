package week8;


public class student
{
    
    private String name;
    private int id;
    private String address;
    private long   phoneNumber;
    private static String collegeName = "United"; 
    //constructors
    
    public student(String name, int id,String address, long phoneNumber)
    {
        this.name=name;
        this.id=id;
        this.address=address;
        this.phoneNumber= phoneNumber;
    }
    //setters and getters methords
    public  void setName(String name)
   {
    this.name=name;
    
    }
    public String  getName()
    {
        return this.name;
    }
    
    //setters and getters for id
        public  void setId(int id)
   {
    this.id=id;
    
    }
    public int getId()
    {
        return this.id ;
    }
    
    public void setAdress(String address)
    {
        
    this.address=address;
    }
    public void setAddress(String address) {
           this.address = address;
     }
  

       public long getPhoneNumber() {
           return this.phoneNumber;
    }
   
     public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
       }
 
       public static void setCollegeName(String newCollegeName) {
          collegeName = newCollegeName;
     }
      public void displayInfo() {
         System.out.println("Student ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Address: " + address);
         System.out.println("Phone Number: " + phoneNumber);
         System.out.println("College Name: " + collegeName);
     }


}