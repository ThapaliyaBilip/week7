package Week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, "Bilip", 50000);
        CurrentAccount current = new CurrentAccount(2001, "man", 80000);

        System.out.println(savings);
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Savings Interest: " + savings.calculateInterest(0.6));

        System.out.println(current);
        System.out.println("Current Interest: " + current.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest(0.4));
    }
}