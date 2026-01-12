package week9;

public class bankAccount
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double Balance;
    

//constructer
public bankAccount(int accountNumber, String accountHolderName,double Balance)
{
    this.accountNumber=accountNumber;
    this.accountHolderName=accountHolderName;
    this.Balance=Balance;
    
}
public void deposit(double amount)
{
    if(amount>0)
    {
        this.Balance += amount;
    }
    else
    {
        System.out.println("you are broke");
    }
     
}
public double getBalance()
{
    return this.Balance;
}

}