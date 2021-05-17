
/**
 * Write a description of class ArrayLists here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
import java.util.ArrayList;
public class ArrayLists
{
    public void removeZeros(ArrayList<Integer>list)
    {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0)
            list.remove(i--);
        }
    }
    public int countLetters(ArrayList<String>list)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
            count += list.get(i).length();
        return count;
    }
    public int findPosition(int keyValue, ArrayList<Integer>list)
    {
        for(int i = 0; i <= list.size(); i++) {
            if(list.get(i) == keyValue)
            return list.get(i + 1);
            }
        return -1;
    }
    public ArrayList parseIntoArrayList(String input)
    {
        ArrayList<String>in = new ArrayList<String>();
        String s;
        for(int i = 0; i < input.length(); i++) {
            s = input.substring(i, i+1);
            in.add(s);
        }
        return in;
    }
    public String findMin(ArrayList<Person>list)
    {
        Person younger = list.get(0);
        for(Person p : list) {
            if(p.getAge() < younger.getAge()) 
            younger = p;
    }
        return younger.getName();
    }
}
