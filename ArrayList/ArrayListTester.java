
/**
 * Write a description of class ArrayListTester here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
import java.util.ArrayList;
import java.util.*;
public class ArrayListTester
{
    public static void main(String[] args) {
        ArrayLists arr = new ArrayLists();
        System.out.println("removeZeros:");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Before: " + nums);
        arr.removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);
        System.out.println();
        
        ArrayList<String> words = new ArrayList<>(Arrays.asList("the", "only", "thing", "that", "keeps", "me", "wishing", "on", "a", "wishing", "star"));
        System.out.println("countLetters:");
        System.out.println(words);
        System.out.println("Expected: 44 \nActual: " + arr.countLetters(words));
        System.out.println();
        
        System.out.println("keyPosition (keyValue = 4):");
        System.out.println(nums);
        System.out.println("Expected: 1 \nActual: " + arr.findPosition(4, nums));
        System.out.println();

        System.out.println("parseIntoArrayList:");
        System.out.println("Expected: [C, o, o, m, b, s] \nActual: " + arr.parseIntoArrayList("Coombs"));
        System.out.println();

        System.out.println("findMin:");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(16, "Augustine"),
        new Person(18, "Betty"), new Person(17, "James")));
        System.out.println(people);
        System.out.println("Expected: Augustine \nActual: " + arr.findMin(people));
        System.out.println();

        System.out.println("Purse:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.10, "dime"));
        myPurse.add(new Coin(.25, "quarter"));
        System.out.println("# of Nickels: " + myPurse.count(new Coin(.05, "nickel")));
        System.out.println("Smallest Coin: " + myPurse.findSmallest());
        System.out.println("Total of Purse: $" + myPurse.getTotal());
    }
}
