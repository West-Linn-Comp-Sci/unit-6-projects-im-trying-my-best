

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    public static final double MANAGER_WAGE = 9.50;
    private BurgerByte managingBranch;
    private List<Employee> team;

    public Manager(String name, int age) {
        super(name, age);
        super.name = name;
        super.age = age;
        hoursWorked = 0;
        atWork = false;
        team = new ArrayList<>();
    }

    // getters
    public BurgerByte getManagingBranch() { return managingBranch; }
    public List<Employee> getTeam() { return team; }


    // EFFECTS: set this managingBranch to managingBranch
    public void setManagingBranch(BurgerByte managingBranch) {
        this.managingBranch = managingBranch;
    }

    // REQUIRES: c must not be in already in team and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: adds given c to team and this Manager's restaurant
    public void hire(Employee e) {
        managingBranch.addStaff(e);
        team.add(e);
        System.out.println("Welcome aboard, " + e.getName() + "!");
    }

    // REQUIRES: c must be in this team and and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: removes given Cashier from team and this Manager's restaurant
    public void fire(Employee e) {
        managingBranch.removeStaff(e);
        team.remove(e);
        System.out.println("Sorry to let you go, " + e.getName() + ".");
    }
}