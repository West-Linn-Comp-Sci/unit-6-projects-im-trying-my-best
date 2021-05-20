
/**
 * Write a description of class InheritanceTest here.
 *
 * @author Liam Groah
 * @version 1.0
 */
public class InheritanceTest
{
    public static void main(String[] args)
    {
        StoreEmployee store = new StoreEmployee("Tyler", "Target", 15.8754);
        SafewayEmployee safe = new SafewayEmployee("Emma", 15.8754);
        SafewayCashier safeCash = new SafewayCashier("Lily", 14, 17.99);
        SafewayCashier safeCash1 = new SafewayCashier("Noah", 15, 17.99);
        System.out.println(store);
        System.out.println(safe);
        System.out.println(safeCash);
        System.out.println(store.getName() + ":");
        System.out.println(store.offerAssistance());
        System.out.println(store.restock(2));
        System.out.println(safe.getName() + ":");
        System.out.println(safe.isNew(false));
        System.out.print("Is it true that " + safe.getName() + " and " + store.getName() + " have the same pay? ");
        System.out.println(safe.equals());
        System.out.println(safeCash.getName() + ":");
        System.out.println("Amount of items scanned: " + safeCash.getAmount());
        System.out.println(safeCash.cashRegister());
        System.out.println(safeCash.askRewards());
        System.out.print("Is it true that " + safeCash.getName() + " and " + safeCash1.getName() + " scanned the same amount of items? ");
        System.out.println(safeCash.equals(safeCash1));
    }
}
