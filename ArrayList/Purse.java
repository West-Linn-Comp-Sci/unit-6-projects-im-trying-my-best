
/**
 * Write a description of class Purse here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
import java.util.ArrayList;
public class Purse
{
    private ArrayList<Coin>coins;

    public Purse()
    {
        coins = new ArrayList<Coin>();
    }
    public void add(Coin aCoin)
    {
        coins.add(aCoin);
    }
    public double getTotal()
    {
        double total = 0;
        for(int i = 0; i < coins.size(); i++) {
            total += coins.get(i).getValue();
        }
        return total;
    }
    public int count(Coin aCoin)
    {
        int count = 0;
        for(Coin c : coins) {
            if(c == (aCoin))
            count++;
        }
        return count;
    }
    public String findSmallest()
    {
        Coin smallest = coins.get(0);
        for(int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getValue() < smallest.getValue())
            smallest = coins.get(i);
        }
        return smallest.getName();
    }
}
