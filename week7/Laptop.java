package week7;



public class Laptop
{
    String brand;
    double ram;
    double price;

    
    public Laptop(String brand, double ram, double price)
    {
        this.brand = brand;
        this.ram =ram ;
        this.price = price;
    }
     public static void main(String[] args)
    {
        Laptop L1 = new Laptop ("Asus",8,10001.0);
         Laptop L2 = new Laptop("HP", 4, 800.0);
        Laptop L3 = new Laptop("Lenovo", 16, 1500.0);
         System.out.println("Laptops with RAM greater than 8GB:");
        if (L1.ram > 8) {
            System.out.println(L1.brand);
        }
        if (L2.ram > 8) {
            System.out.println(L2.brand);
        }
        if (L3.ram > 8) {
            System.out.println(L3.brand);
        }

        

       

       
    }
   
    }
