package week8;

public class ShoppingCart
{

    
    private String itemName;
    private double itemPrice;
    private int quantity;

    
    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    
    public int getQuantity() {
        return quantity;
    }

    
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    
    public double calculateTotal() {
        return itemPrice * quantity;
    }

    
    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    
    public void displayCart() {
        
        System.out.println("Item Name  : " + itemName);
        System.out.println("Item Price : Rs. " + itemPrice);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total      : Rs. " + calculateTotal());
    }
}