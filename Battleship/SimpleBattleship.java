
/**
 * Write a description of class SimpleBattleship here.
 *
 * @author Liam Groah
 * @version 5/5/21
 */
import java.util.ArrayList;
public class SimpleBattleship
{
    ArrayList<String>grid = new ArrayList<String>();
    private int number;
    private double rate;
    private double rounds;

    public SimpleBattleship()
    {
        String grid1 = "*";
        grid.add(grid1);
        grid.add(grid1);
        grid.add(grid1);
        grid.add(grid1);
        grid.add(grid1);
        grid.add(grid1);
        grid.add(grid1);
    }
    public ArrayList<String> getGrid()
    {
        return grid;
    }
    public int guess(int index)
    {
        return index;
    }
    public int comGuess()
    {
        number = (int)(Math.random() * 7 + 1);
        return number;
        //this does do duplicates a lot but I'm not sure how to stop that
    }
    public double rating(int r)
    {
        if(r <= 3)
        return 10;
        else {
        rounds = Double.valueOf(r);
        rate = (double)(rounds / 10.0);
        return (int)(10 * rate + 0.5) + 3.0;
        }
    }
}
