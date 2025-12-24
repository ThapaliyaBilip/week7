package week7;



public class Mobile
{
    
    String brand;
    double price;

    
    public Mobile(String brand, double price)
    {
        this.brand = brand;
        this.price = price;
    }
      public static void main(String[] args)
    {
        Mobile L1 = new Mobile ("Iphone",19001.0);
        Mobile L2 = new Mobile("Samsung", 8000.0);
        Mobile L3 = new Mobile("Redmi", 15000.0);
         System.out.println("Affordable mobile");
        if (L1.price < 20000) {
            System.out.println(L1.brand);
        }
        if (L2.price < 20000) {
            System.out.println(L2.brand);
        }
        if (L3.price < 20000) {
            System.out.println(L3.brand);
        }

        

       

       
    }
   
    

}