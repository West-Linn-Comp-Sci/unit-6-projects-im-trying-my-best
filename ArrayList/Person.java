
/**
 * Write a description of class Person here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
public class Person
{
    private int myAge;
    private String myName;

    public Person(int myAge, String myName)
    {
        this.myAge = myAge;
        this.myName = myName;
    }
    public int getAge()
    {
        return myAge;
    }
    public String getName()
    {
        return myName;
    }
    public String toString()
    {
        return "Name: " + myName + " Age: " + myAge;
    }
}
