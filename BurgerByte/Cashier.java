
public class Cashier extends Employee {

    public static final double CASHIER_WAGE = 6.50;
    private BurgerByte workBranch;
    private boolean isRegisterOpen;

    public Cashier(String name, int age, BurgerByte workBranch) {
        super(name, age);
        super.name = name;
        super.age = age;
        hoursWorked = 0;
        atWork = false;
        this.workBranch = workBranch;
        isRegisterOpen = false;
    }

    // getters
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isRegisterOpen() { return isRegisterOpen; }
}