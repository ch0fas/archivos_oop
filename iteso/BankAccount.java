package iteso;

public class BankAccount
{
    // Attributes
    private int account_number;
    private double account_balance;

    // Setters
    public void setAccNumber(int account_number)
    {
        this.account_number = account_number;
    }

    public void setBalance(double balance)
    {
        if (balance >= 0)
        {
            this.account_balance = balance;
        } else this.account_balance = 0;
    }

    // Getters
    public int getAccNumber()
    {
        return this.account_number;
    }

    public double getBalance()
    {
        return this.account_balance;
    }
}