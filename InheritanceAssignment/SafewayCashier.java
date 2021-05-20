
/**
 * Write a description of class Safeway here.
 *
 * @author Liam Groah
 * @version 1.0
 */
public class SafewayCashier extends SafewayEmployee
{
    private String nameTag;
    private int amountScanned;
    private double pay;

    public SafewayCashier(String nameTag, int amountScanned, double pay)
    {
        super(nameTag, pay);
        this.nameTag = nameTag;
        this.amountScanned = amountScanned;
        this.nameTag = nameTag;
        this.pay = pay;
    }
    public String askRewards()
    {
        return "Are you a part of our rewards program? Would you like to join?";
    }
    public int getAmount()
    {
        return amountScanned;
    }
    public String cashRegister()
    {
        double cost = (double)(Math.random() * 39.99 + .99);
        cost = (double)cost * amountScanned;
        return "From your " + amountScanned + " items, your total is $" + (int)(100 * cost + 0.50) / 100 + ".";
    }
    public String getName()
    {
        return nameTag;
    }
    public String getWork()
    {
        return "Safeway";
    }
    public double getPay()
    {
        return (int)(100.00 * pay + 0.50) / 100.00;
    }
    public boolean equals(SafewayCashier cash)
    {
        if(cash.getAmount() == (this.getAmount()))
        return true;
        else
        return false;
    }
    @Override
    public String toString()
    {
        return "The " + this.getWork() + " cashier's name tag says " + nameTag + ". They earn $" + this.getPay() + " hourly for their work.";
    }
}
