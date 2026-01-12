package week9;

public class SavingAccount extends bankAccount
{
    protected double intrestRate;
    
    public SavingAccount(int accountNumber, String accountHolderName,double Balance, double intrestRate)
    {
        super(accountNumber,accountHolderName,Balance);
        this.intrestRate=intrestRate;
        
    }
    public double CalculateIntrest()
    {
        return super.getBalance()+0.10;
    }
    
    
    
    
}