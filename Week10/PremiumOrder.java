package Week10;


public class PremiumOrder extends Order
{
     PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + 20;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount()-discountAmount;
    }    
}