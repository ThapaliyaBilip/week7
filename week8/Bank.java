package week8;
public class Bank
{
private long accountNumber;
private long balance;
private String name;

public Bank(String name,int accountNumber,long balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name= name ;
    }
    
    public  void setName(String name)
   {
    this.name=name;
    }
    public String  getName()
    {
        return this.name;
    }
    
    public  void setaccountNumber(long accountNumber)
   {
    this.name=name;
    }
    public String  getaccountNumber()
    {
        return this.name;
    }
    
    public  void accountNumber(long balance)
   {
    this.name=name;
    }
    public String  balance()
    {
        return this.name;
    }
}