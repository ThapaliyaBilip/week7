 package week9;


public class Vehicle
{
    
    protected String brandName;
    protected int VeichelID;
    protected double basePrice;
    protected double tax;
    //constructor
    public Vehicle( String brandName , int VeichelID, double basePrice)
    {
        this.brandName = brandName;
        this.VeichelID = VeichelID;
        this.basePrice = basePrice;
    }
   
    public double calculateTax()
    {
       return 0.10 * basePrice;
    }
}