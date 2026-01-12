package week9;


public class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    
    public Car (  String brandName , int VeichelID, double basePrice,int doors,String fuelType)
    {
         super(brandName,VeichelID,basePrice);
        this.doors = doors; 
        this.fuelType = fuelType; 
    }
     public double calculateFinalPrice()
    {
        return super.basePrice+ super.calculateTax()+0.05 *super.basePrice;
    }
    public void displayCarDetails()
    {
        System.out.println("Max speed of this car:"+ super.VeichelID);
        System.out.println("Brand Name of this car:"+super.brandName);
        System.out.println("Brand Name of this car:"+super.basePrice);       
        System.out.println("No  of doors in this car:"+this.doors); 
        System.out.println("No  of doors in this car:"+this.fuelType);   
    }
}