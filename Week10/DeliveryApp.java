package Week10;


public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery bike = new BikeDelivery(1, "Alex", 8000, 15040);
        CarDelivery car = new CarDelivery(2, "Bilip", 300000, 5000);

        System.out.println(bike);
        System.out.println("Bike Payment with Extra Orders: " + bike.calculatePayment(3));

        System.out.println(car);
        System.out.println("Car Payment with Extra Orders: " + car.calculatePayment(1));
    }
}