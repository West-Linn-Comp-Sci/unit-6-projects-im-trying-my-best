
/**
 * Write a description of class GroceryStore here.
 *
 * @author Liam Groah
 * @version 1.0
 */
public class SafewayEmployee extends StoreEmployee
{
    private String nameTag;
    private double pay;
    
    public SafewayEmployee(String nameTag, double pay)
    {
        super(nameTag, "Safeway", pay);
        this.nameTag = nameTag;
        this.pay = pay;
    }
    public String getName()
    {
        return nameTag;
    }
    @Override
    public String getWork()
    {
        return "Safeway";
    }
    public double getPay()
    {
        return (int)(100.00 * pay + 0.50) / 100.00;
    }
    public String isNew(boolean newEmployee)
    {
        if(newEmployee == true)
        return this.nameTag + " is a new " + this.getWork() + " recruit!";
        else
        return this.nameTag + " is not a new " + this.getWork() + " employee.";
    }
    public boolean equals()
    {
        if(super.getPay() == (this.getPay()))
        return true;
        else
        return false;
    }
    @Override
    public String toString()
    {
        return "The " + this.getWork() + " employee's name tag says " + nameTag + ". They earn $" + this.getPay() + " hourly for their work.";
    }
}
