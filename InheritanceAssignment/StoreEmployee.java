
/**
 * Write a description of class GroceryStore here.
 *
 * @author Liam Groah
 * @version 1.0
 */
public class StoreEmployee
{
    private String nameTag;
    private String worksAt;
    private double pay;
    

    public StoreEmployee(String nameTag, String worksAt, double pay)
    {
        this.nameTag = nameTag;
        this.worksAt = worksAt;
        this.pay = pay;
    }
    public String getName()
    {
        return nameTag;
    }
    public String getWork()
    {
        return worksAt;
    }
    public double getPay()
    {
        return (int)(100.00 * pay + 0.50) / 100.00;
    }
    public String restock(int copies)
    {
        int restock = (int)(Math.random() * 20 + 5);
        return "This item is running low! There are only " + copies + " copies left! Let me restock it with " + restock + " copies.";
    }
    public String offerAssistance()
    {
        return "Welcome to " + worksAt + "! Do you need any help finding what you need?";
    }
    public String toString()
    {
        return "The " + worksAt + " employee's name tag says " + nameTag + ". They earn $" + getPay() + " hourly for their work.";
    }
}
