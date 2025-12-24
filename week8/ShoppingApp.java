package week8;


public class ShoppingApp
{
    public static void main(String[] args) {

        
        ShoppingCart cart = new ShoppingCart("Shoes", 2500, 2);

        
        cart.displayCart();

        
        cart.setQuantity(3);

        
        System.out.println("\nAfter updating quantity:");
        cart.displayCart();

        
        double discountedTotal = cart.calculateDiscountedTotal(10);

        System.out.println("\nTotal after 10% festival discount: Rs. " + discountedTotal);
    }
}