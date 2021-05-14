
/**
 * Enter as many numbers as you want, and then see how many fell in which range.
 *
 * @author Liam Groah
 * @version 4/29/21
 */
import java.util.Scanner;
public class FrequencyChart
{
    public static void main(String[] args)  {
        int count = 0;
        int n;
        int one = 0;
        int ten = 0;
        int twenty = 0;
        int thirty = 0;
        int forty = 0;
        int fifty = 0;
        int sixty = 0;
        int seventy = 0;
        int eighty = 0;
        int ninety = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("");
        System.out.print("How many numbers? ");
        n = in.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length; i++) {
            System.out.print("Type an integer in the range of 1-100: ");
            nums[i] = in.nextInt();
            if (nums[i] >= 1 && nums[i] <= 10)
            one++;
            else if (nums[i] >= 11 && nums[i] <= 20)
            ten++;
            else if (nums[i] >= 21 && nums[i] <= 30)
            twenty++;
            else if (nums[i] >= 31 && nums[i] <= 40)
            thirty++;
            else if (nums[i] >= 41 && nums[i] <= 50)
            forty++;
            else if (nums[i] >= 51 && nums[i] <= 60)
            fifty++;
            else if (nums[i] >= 61 && nums[i] <= 70)
            sixty++;
            else if (nums[i] >= 71 && nums[i] <= 80)
            seventy++;
            else if (nums[i] >= 81 && nums[i] <= 90)
            eighty++;
            else if (nums[i] >= 91 && nums[i] <= 100)
            ninety++;
            else
            System.out.println("Not valid.");
        }
        System.out.println(" ");
        System.out.print("  1 - 10 | ");
        while (count < one) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 11 - 20 | ");
        count = 0;
        while (count < ten) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 21 - 30 | ");
        count = 0;
        while (count < twenty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 31 - 40 | ");
        count = 0;
        while (count < thirty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 41 - 50 | ");
        count = 0;
        while (count < forty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 51 - 60 | ");
        count = 0;
        while (count < fifty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 61 - 70 | ");
        count = 0;
        while (count < sixty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 71 - 80 | ");
        count = 0;
        while (count < seventy) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 81 - 90 | ");
        count = 0;
        while (count < eighty) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" 91 - 100| ");
        count = 0;
        while (count < ninety) {
        count++;
        System.out.print("*");
        }
        System.out.println(" ");
    }
}
