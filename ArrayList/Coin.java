
/**
 * Write a description of class Coin here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
public class Coin
{
    private double myValue; 
    private String myName;

    public Coin(double value, String name)
    {
        myValue = value; 
        myName = name;
    }
    public double getValue()
    {
        return myValue;
    }
    public String getName()
    {
        return myName;
    }
    public boolean equals(Coin aCoin)
    {
        if(myValue == aCoin.getValue() && myName == aCoin.getName())
        return true;
        else
        return false;
    }
}
