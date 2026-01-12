package Week10;


public class SavingsAccount extends Account {

    SavingsAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (getBalance() * 0.03);
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}