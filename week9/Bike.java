package week9;



public class Bike extends Vehicle
{
    private int engineCapacity;
    public Bike(  String brandName , int VeichelID, double basePrice,int engineCapacity )
    {
       super(brandName,VeichelID,basePrice);
       this.engineCapacity = engineCapacity;
    }
       public double calculateFinalPrice()
    {
        return super.basePrice+ super.calculateTax();
    }
    public void displayCarDetails()
    {
           System.out.print("Id speed of this Bike:"+ super.VeichelID);
        System.out.println("Brand Name of this Bike:"+super.brandName);
        System.out.println("Brand Name of this Bike:"+super.basePrice);       
        System.out.println("No  of doors in this Bike:"+this.engineCapacity+"cc"); 
    }
}
    