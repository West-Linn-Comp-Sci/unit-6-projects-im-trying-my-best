
/**
 * Write a description of class Employee here.
 *
 * @author Liam Groah
 * @version 1.0
 */
public abstract class Employee
{
    public static final double BASE_WAGE = 10.00;
    String name;
    int age;
    double hoursWorked;
    boolean atWork;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean isAtWork()
    {
        return atWork;
    }
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    public void logHoursWorked(double hours)
    {
        hoursWorked += hours;
    }
    public void startWork(double hours)
    {
        atWork = true;
        logHoursWorked(hours);
    }
    public void leaveWork()
    {
        atWork = false;
    }
    public double computeWage()
    {
        return (hoursWorked * BASE_WAGE);
    }
}
